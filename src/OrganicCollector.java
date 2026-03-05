public class OrganicCollector implements WasteCollector {
    private WasteCollector next;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.next = nextCollector;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Organic")) {
            System.out.println("Organic Collector: Processing " + container.getLoadPercentage() + "% full organic bin.");
        } else if (next != null) {
            next.collect(container);
        }
    }
}