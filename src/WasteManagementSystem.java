public class WasteManagementSystem {
    private WasteCollector chain;

    public WasteManagementSystem() {
        this.chain = new OrganicCollector();
        WasteCollector c2 = new RecyclableCollector();
        WasteCollector c3 = new HazardousCollector();
        WasteCollector c4 = new ElectronicCollector();

        chain.setNextCollector(c2);
        c2.setNextCollector(c3);
        c3.setNextCollector(c4);
    }

    public static void main(String[] args) {
        WasteManagementSystem system = new WasteManagementSystem();

        System.out.println("--- Starting Waste Collection Process ---");

        WasteContainer bin1 = new WasteContainer("Organic", 90);
        WasteContainer bin2 = new WasteContainer("Hazardous", 100);
        WasteContainer bin3 = new WasteContainer("Recyclable", 50);
        WasteContainer bin4 = new WasteContainer("Electronic", 40);
        WasteContainer bin5 = new WasteContainer("Glass", 20);

        system.chain.collect(bin1);
        system.chain.collect(bin2);
        system.chain.collect(bin3);
        system.chain.collect(bin4);
        system.chain.collect(bin5);
    }
}