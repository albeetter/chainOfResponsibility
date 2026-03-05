public class WasteContainer {
    private String type;
    private int loadPercentage;

    public WasteContainer(String type, int loadPercentage) {
        this.type = type;
        this.loadPercentage = loadPercentage;
    }

    public String getType() {
        return type;
    }
    public int getLoadPercentage() {
        return loadPercentage;
    }
}