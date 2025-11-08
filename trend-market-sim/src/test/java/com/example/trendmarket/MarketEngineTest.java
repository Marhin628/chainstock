import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.trendmarket.model.Asset;
import com.example.trendmarket.model.Position;
import com.example.trendmarket.service.MarketEngine;

public class MarketEngineTest {

    private MarketEngine marketEngine;
    private Asset asset;
    private Position position;

    @BeforeEach
    public void setUp() {
        marketEngine = new MarketEngine();
        asset = new Asset("1", "Test Asset", 100.0);
        position = new Position(asset, 10, 90.0);
    }

    @Test
    public void testUpdateAssetValue() {
        marketEngine.updateAssetValue(asset, 120.0);
        assertEquals(120.0, asset.getCurrentValue());
    }

    @Test
    public void testCalculatePositionValue() {
        double currentValue = marketEngine.calculatePositionValue(position);
        assertEquals(1200.0, currentValue);
    }

    @Test
    public void testProfitLossCalculation() {
        double profitLoss = marketEngine.calculateProfitLoss(position);
        assertEquals(300.0, profitLoss);
    }

    @Test
    public void testAddPosition() {
        marketEngine.addPosition(position);
        assertTrue(marketEngine.getPositions().contains(position));
    }

    @Test
    public void testRemovePosition() {
        marketEngine.addPosition(position);
        marketEngine.removePosition(position);
        assertFalse(marketEngine.getPositions().contains(position));
    }
}