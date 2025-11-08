package com.example.trendmarket.service;

import com.example.trendmarket.model.Asset;
import com.example.trendmarket.model.Position;
import com.example.trendmarket.model.Trade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MarketEngine {
    private List<Asset> assets;
    private List<Position> positions;
    private Random random;

    public MarketEngine() {
        this.assets = new ArrayList<>();
        this.positions = new ArrayList<>();
        this.random = new Random();
    }

    public void addAsset(Asset asset) {
        assets.add(asset);
    }

    public void updateAssetValues() {
        for (Asset asset : assets) {
            double change = (random.nextDouble() - 0.5) * 0.1; // Simulate a price change of +/- 10%
            asset.setCurrentValue(asset.getCurrentValue() * (1 + change));
        }
    }

    public void executeTrade(Trade trade) {
        Position position = trade.getPosition();
        if (trade.getTradeType().equals("buy")) {
            positions.add(position);
        } else if (trade.getTradeType().equals("sell")) {
            positions.remove(position);
        }
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public List<Position> getPositions() {
        return positions;
    }
}