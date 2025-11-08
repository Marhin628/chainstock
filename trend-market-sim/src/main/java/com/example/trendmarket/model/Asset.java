public class Asset {
    private String id;
    private String name;
    private double currentValue;

    public Asset(String id, String name, double currentValue) {
        this.id = id;
        this.name = name;
        this.currentValue = currentValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }
}