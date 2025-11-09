public class Trade {
    private Position position;
    private String tradeType; // "buy" or "sell"
    private int quantity;
    private double pricePerUnit;
    private long timestamp;

    public Trade(Position position, String tradeType, int quantity, double pricePerUnit) {
        this.position = position;
        this.tradeType = tradeType;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.timestamp = System.currentTimeMillis();
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
    public int getQuantity(){return quantity;}

    public long getTimestamp() {
        return timestamp;
    }

    public void executeTrade(Portfolio portfolio) {
        if(tradeType.equals("buy")){
            portfolio.buy(position.getAsset(), quantity, pricePerUnit);
        }else if(tradeType.equals("sell")){
            portfolio.sell(position.getAsset(), quantity, pricePerUnit);
        }
        
        else
        {System.out.println("invalid trade type");
        return;}

        logTrade();
    }

    private void logTrade() {
        System.out.println(
            "[" + tradeType.toUpperCase() + "] " +
            quantity + " of " + position.getAsset().getName() +
            " at $" + String.format("%.2f", pricePerUnit) +
            " each (Time: " + timestamp + ")"
        );
    }
}
