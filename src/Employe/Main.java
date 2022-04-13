package Employe;

public class Main  {
    public static void main(String [] args) {

        Employee q1 = new Employee("Hanna", 27, 'G', 2);

        for (int i = 0; i < MonthUtils.month.length; i++) {
            System.out.print(q1.getSalary(MonthUtils.month)[i] + " ");
        }
        System.out.println();
        Manager m1 = new Manager("Mark", 30, 'M', 1000, 2);
        for (int i = 0; i < MonthUtils.month.length; i++) {
            System.out.print(m1.getSalary(MonthUtils.month)[i] + " ");
        }
    }
}
