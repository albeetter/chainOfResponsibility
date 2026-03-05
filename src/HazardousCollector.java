public class HazardousCollector implements WasteCollector {
    private WasteCollector next;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.next = nextCollector;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Hazardous")) {
            System.out.println("Hazardous Collector: Handling " + container.getLoadPercentage() + "% full toxic waste bin safely.");
        } else if (next != null) {
            next.collect(container);
        } else {
            System.out.println("Error: No collector found for type: " + container.getType());
        }
    }
}