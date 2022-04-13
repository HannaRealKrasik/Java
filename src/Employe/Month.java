package Employe;

public class Month {
    private String nameMonth;
    private int kolvoDays;
   private int kolvoRabDays;

    public String getNameMonth() {
        return nameMonth;
    }

    public int getKolvoDays() {
        return kolvoDays;
    }

    public int getKolvoRabDays() {
        return kolvoRabDays;
    }

    public void setNameMonth(String nameMonth) {
        this.nameMonth = nameMonth;
    }

    public void setKolvoDays(int kolvoDays) {
        this.kolvoDays = kolvoDays;
    }

    public void setKolvoRabDays(int kolvoRabDays) {
        this.kolvoRabDays = kolvoRabDays;
    }
   public Month(String nameMonth,int kolvoDays,int kolvoRabDays){
        this.nameMonth = nameMonth;
        this.kolvoDays = kolvoDays;
        this.kolvoRabDays = kolvoRabDays;
   }
}
