package problem3;

public class Taxi {

    private boolean airConditioned;
    private final int totalKms;
    private final boolean peakTime;
    public static final double PEAK_TIME_MULTIPLIER = 1.2;
    public static final double NORMAL_MULTIPLIER = 1.0;
    public static final int DISTANCE_FOR_20_RUP_RATE_AC = 10;
    public static final int RATE_FOR_CAR_WITH_AC = 20;
    public static final int RATE_AFTER_10KMS_AC = 17;
    public static final int DISTANCE_FOR_15R_RATE = 10;
    public static final int RATE_FOR_NON_AC_10KMS = 15;
    public static final int NO_DISTANCE = 0;
    public static final int FIXED_CHARGE = 50;

    public Taxi(boolean airConditioned, int totalKms, boolean peakTime) {
        this.airConditioned = airConditioned;
        this.totalKms = totalKms;
        this.peakTime = peakTime;
    }

    public double getTotal() {
        double totalCost = 0;
        totalCost += FIXED_CHARGE;
        double peakTimeMultiple = peakTime ? PEAK_TIME_MULTIPLIER : NORMAL_MULTIPLIER;
        if (airConditioned) {
            totalCost += Math.min(DISTANCE_FOR_20_RUP_RATE_AC, totalKms) * RATE_FOR_CAR_WITH_AC * peakTimeMultiple;
            totalCost += Math.max(NO_DISTANCE, totalKms - DISTANCE_FOR_20_RUP_RATE_AC) * RATE_AFTER_10KMS_AC * peakTimeMultiple;
        } else {
            totalCost += Math.min(DISTANCE_FOR_15R_RATE, totalKms) * RATE_FOR_NON_AC_10KMS * peakTimeMultiple;
            totalCost += Math.max(NO_DISTANCE, totalKms - DISTANCE_FOR_15R_RATE) * 12 * peakTimeMultiple;
        }
        return totalCost;
    }
}