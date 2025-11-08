package com.example.trendmarket.ui;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class ChartController {

    @FXML
    private LineChart<String, Number> lineChart;

    public void initialize() {
        // Initialize the chart with default data
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Asset Value Over Time");
        lineChart.getData().add(series);
    }

    public void updateChart(String time, double value) {
        XYChart.Series<String, Number> series = lineChart.getData().get(0);
        series.getData().add(new XYChart.Data<>(time, value));
    }
}