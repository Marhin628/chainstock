import java.util.Random;

public class positions {
    private final int startingShares;
    private final double startingValue;
    private final String name;

    private static final Random RAND = new Random();

    // UB North campus–inspired names (influence only)
    private static final String[] UB_NORTH_INSPIRED_NAMES = {
        "NorthQuad Holdings",
        "Ellicott Exchange",
        "Buffalo North Energy",
        "Campus Crest Labs",
        "North Hall Ventures",
        "University Plaza Trust",
        "Lakeside Research",
        "Amherst Avenue Systems",
        "Commons Trading Co.",
        "Student Union Capital"
    };

    /**
     * Construct a positions instance
     * @param name human-friendly name
     * @param startingShares integer number of shares (should be between 1000 and 20000)
     * @param startingValue starting price per share in dollars (1.00 - 150.00)
     */
    public positions(String name, int startingShares, double startingValue) {
        this.name = name;
        this.startingShares = startingShares;
        this.startingValue = startingValue;
    }

    public int getStartingShares() {
        return startingShares;
    }

    public double getStartingValue() {
        return startingValue;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("positions{name='%s', startingShares=%d, startingValue=$%.2f}",
                name, startingShares, startingValue);
    }

    /**
     * Create a random positions instance using the allowed ranges.
     * Shares: 1000 - 20000 (inclusive). Value: 1.00 - 150.00 (inclusive).
     */
    public static positions randomPosition() {
        int shares = 1000 + RAND.nextInt(20000 - 1000 + 1);
        double value = 1.0 + RAND.nextDouble() * (150.0 - 1.0);
        // round to 2 decimals
        value = Math.round(value * 100.0) / 100.0;
        String name = UB_NORTH_INSPIRED_NAMES[RAND.nextInt(UB_NORTH_INSPIRED_NAMES.length)];
        return new positions(name, shares, value);
    }

    /**
     * Create a positions instance with a specific seed for reproducible results.
     */
    public static positions randomPosition(long seed) {
        Random r = new Random(seed);
        int shares = 1000 + r.nextInt(20000 - 1000 + 1);
        double value = 1.0 + r.nextDouble() * (150.0 - 1.0);
        value = Math.round(value * 100.0) / 100.0;
        String name = UB_NORTH_INSPIRED_NAMES[r.nextInt(UB_NORTH_INSPIRED_NAMES.length)];
        return new positions(name, shares, value);
    }
}
