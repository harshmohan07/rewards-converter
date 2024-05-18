public class RewardValue {
    private final double cashValue;
    private final int milesValue;

    public RewardValue(double cv) {
        cashValue = cv;
        milesValue = (int)(cashValue/0.0035);
    }

    public RewardValue(int mv) {
        milesValue = mv;
        cashValue = mv*0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

}
