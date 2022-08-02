package apexsystem.phoneBill;

public class Main {
    public static void main(String[] args) {
        CalculateBill calculateBill1 = new CalculateBill();
        CalculateBill calculateBill2 = new CalculateBill(82.42, 60, 345678, 72);
        CalculateBill calculateBill3 = new CalculateBill(82.42, 60, 345678, 60);


        System.out.println(calculateBill1.getTotalFoPay());
        System.out.println(calculateBill2.getTotalFoPay());
        System.out.println(calculateBill3.getTotalFoPay());
    }
}
