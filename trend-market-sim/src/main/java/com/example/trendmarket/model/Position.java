public class Position {
    private Asset asset;
    private int quantity;
    private double entryPrice;

    public Position(Asset asset, int quantity, double entryPrice) {
        this.asset = asset;
        this.quantity = quantity;
        this.entryPrice = entryPrice;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(double entryPrice) {
        this.entryPrice = entryPrice;
    }

    public double calculateCurrentValue() {
        return asset.getCurrentValue() * quantity;
    }

    public double calculateProfitLoss() {
        return (asset.getCurrentValue() - entryPrice) * quantity;
    }
}