# Trend Market Simulation

## Overview
The Trend Market Simulation is a Java application that simulates a stock market-like environment influenced by internet trends. Users can trade virtual currency based on the performance of various assets, which are affected by real-time data fetched from social media platforms.

## Features
- **Asset Management**: Users can view and manage different assets in the market.
- **Trading Positions**: Users can create and manage trading positions, including buying and selling assets.
- **Market Simulation**: The application simulates market behavior based on trending data, allowing users to see how their trades perform over time.
- **User Interface**: A user-friendly interface built with JavaFX, featuring charts to visualize recent activity and asset performance.

## Project Structure
```
trend-market-sim
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── trendmarket
│   │   │               ├── App.java
│   │   │               ├── model
│   │   │               │   ├── Asset.java
│   │   │               │   ├── Position.java
│   │   │               │   └── Trade.java
│   │   │               ├── service
│   │   │               │   ├── MarketEngine.java
│   │   │               │   ├── TrendFetcher.java
│   │   │               │   └── WalletService.java
│   │   │               ├── ui
│   │   │               │   ├── MainController.java
│   │   │               │   └── ChartController.java
│   │   │               └── util
│   │   │                   └── CsvLoader.java
│   │   └── resources
│   │       ├── fxml
│   │       │   ├── main.fxml
│   │       │   └── chart.fxml
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── trendmarket
│                       ├── MarketEngineTest.java
│                       └── TrendFetcherTest.java
├── pom.xml
├── .gitignore
├── LICENSE
└── README.md
```

## Setup Instructions
1. **Clone the Repository**: 
   ```
   git clone <repository-url>
   cd trend-market-sim
   ```

2. **Build the Project**: 
   Use Maven to build the project:
   ```
   mvn clean install
   ```

3. **Run the Application**: 
   After building, you can run the application using:
   ```
   mvn javafx:run
   ```

## Usage
- Upon launching the application, users can navigate through the interface to view assets, manage their trading positions, and visualize market trends through charts.
- The application fetches trending data to simulate market changes, allowing users to make informed trading decisions.

## Contributing
Contributions are welcome! Please submit a pull request or open an issue for any suggestions or improvements.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.