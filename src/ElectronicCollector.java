public class ElectronicCollector implements WasteCollector {
    private WasteCollector next;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.next = nextCollector;
    }

    @Override
    public void collect(WasteContainer container) {

        if (container.getType().equalsIgnoreCase("Electronic")) {
            System.out.println("Electronic Collector: Safely recycling " + container.getLoadPercentage() + "% full e-waste bin.");
        } else if (next != null) {
            next.collect(container);
        } else {
            System.out.println("Error: No collector found for type: " + container.getType());
        }

    }
}