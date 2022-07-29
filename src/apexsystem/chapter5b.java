package apexsystem;

import java.util.Scanner;

public class chapter5b {
   static Scanner scanner = new Scanner(System.in);
    static double tax = 15;
    static int chargeOver = 25;
    public static void main(String[] args) {
        double p = putPlan();
        double o = putOverMin();
        scanner.close();
        System.out.println("Phone Bill Statement");
        System.out.println("Overage: " +getOverage(o));
        System.out.println("Tax: " +getTax(p,o));
        System.out.println("Total: " +getTotalFoPay(p,o));
    }
    public static double putPlan(){
        System.out.println("Enter base cost of the plan:");
       double myPlan = scanner.nextDouble();
       return myPlan;
    }
    public static double putOverMin(){
        System.out.println("Enter overage minutes:");
        double overMin = scanner.nextDouble();
       return overMin;
    }
    public static double getOverage(double overMin){
        return overMin*chargeOver/100.0;
    }
    public static double getTax(double plan, double overMin){
        return (plan+getOverage(overMin))*tax/100.0;
    }
    public static double getTotalFoPay(double plan, double overMin){
        return plan+getOverage(overMin)+getTax(plan,overMin);
    }
}
