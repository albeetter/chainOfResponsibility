public class RecyclableCollector implements WasteCollector {
    private WasteCollector next;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.next = nextCollector;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Recyclable")) {
            System.out.println("Recyclable Collector: Processing " + container.getLoadPercentage() + "% full recycling bin.");
        } else if (next != null) {
            next.collect(container);
        }
    }
}