package apexsystem.phoneBill;

public class CalculateBill {
    private int chargeOver = 25;
    private double plan;
    private double alodeMin;
    private int id;
    private double usedMin;

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

    public int getChargeOver() {
        return chargeOver;
    }

    public double getPlan() {
        return plan;
    }

    public double getAlodeMin() {
        return alodeMin;
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

    public double getOverage() {
        if(usedMin <= alodeMin)
            return 0;
        double overMin = usedMin - alodeMin;
        return overMin * chargeOver  / 100.0;
    }
    public  double getTax() {
        return (plan + getOverage()) * 15 / 100.0;
    }

    public double getTotalFoPay() {
        return plan + getOverage() + getTax();
    }

}
