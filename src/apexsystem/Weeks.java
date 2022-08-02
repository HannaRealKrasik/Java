package apexsystem;

import java.util.Scanner;

public class Weeks {
    public static String  [] weeks = {"Mon","Tue","Wen","Tho","Fri","Sat","Sun"};
   public static Scanner scanner = new Scanner(System.in);

    public static void numberOfWeek(){
        System.out.println("Write number of week");
        int number = scanner.nextInt();
        if (number > 7)
            System.out.println("wrong number");
        else
            System.out.println("Week is " +weeks[number-1]);
    }

    public static void main(String[] args) {
        numberOfWeek();
    }

}
