package apexsystem.phoneBill;

public class CalculateBill {

    public CalculateBill() {
        id = 0;
        plan = 82.45;
        alodeMin = 90;
       usedMin = 90;
    }

    public CalculateBill(double plan, double alodeMin, int id, double usedMin) {
        this.plan = plan;
        this.alodeMin = alodeMin;
        this.id = id;
        this.usedMin = usedMin;
    }

    private double tax = 15;
    private int chargeOver;
    private double plan;
    private double alodeMin;
    private int id;
    private double usedMin;

    public void setUsedMin(double usedMin) {
        this.usedMin = usedMin;
    }

    public double getUsedMin() {
        return usedMin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getTax() {
        return tax;
    }

    public int getChargeOver() {
        return chargeOver;
    }

    public double getPlan() {
        return plan;
    }

    public double getAlodeMin() {
        return alodeMin;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setChargeOver(int chargeOver) {
        this.chargeOver = chargeOver;
    }

    public void setPlan(double plan) {
        this.plan = plan;
    }

    public void setAlodeMin(double alodeMin) {
        this.alodeMin = alodeMin;
    }

    public static double getOverage(double overMin) {
        return overMin * chargeOver / 100.0;
    }

    public static double getTax(double plan, double overMin) {
        return (plan + getOverage(overMin)) * tax / 100.0;
    }

    public static double getTotalFoPay(double plan, double overMin) {
        return plan + getOverage(overMin) + getTax(plan, overMin);
    }

}
