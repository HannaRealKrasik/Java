package Employe;

public class MonthUtils extends Month {

    public MonthUtils(String nameMonth, int kolvoDays, int kolvoRabDays) {
        super(nameMonth, kolvoDays, kolvoRabDays);
    }
   static Month p1 = new Month("Jun", 31, 21);
   static Month p2 = new Month("Feb", 30, 20);
  static   Month p3 = new Month("Mar", 31, 21);
   static Month p4 = new Month("Apr", 29, 19);
  static   Month p5 = new Month("May", 28, 18);
  static   Month p6 = new Month("Jun", 31, 21);
   static Month p7 = new Month("Jul", 30, 20);
   static Month p8 = new Month("Aug", 29, 19);
  static   Month p9 = new Month("Sep", 30, 20);
  static   Month p10 = new Month("Oct", 31, 21);
  static   Month p11 = new Month("Nov", 30, 20);
   static Month p12 = new Month("Dec", 31, 21);

   static Month [] month = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12};
}
