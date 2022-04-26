package Employe;

public class Main  {
    public static void main(String [] args) {

        Employee q1 = new Employee("Hanna", 27, 'G', 1);
            System.out.println(q1.getSalary(MonthUtils.month));

        Manager m1 = new Manager("Mark", 30, 'M', 1000, 1);
            System.out.print(m1.getSalary(MonthUtils.month));
    }
}
