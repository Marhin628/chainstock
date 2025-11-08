public class Trade {
    private Position position;
    private String tradeType; // "buy" or "sell"
    private long timestamp;

    public Trade(Position position, String tradeType) {
        this.position = position;
        this.tradeType = tradeType;
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

    public long getTimestamp() {
        return timestamp;
    }

    public void executeTrade() {
        // Logic to execute the trade
        // This could involve updating the user's wallet, logging the trade, etc.
        logTrade();
    }

    private void logTrade() {
        // Logic to log the trade details
        System.out.println("Trade executed: " + tradeType + " " + position.getQuantity() + " of " + position.getAsset().getName() + " at " + position.getEntryPrice() + " on " + timestamp);
    }
}