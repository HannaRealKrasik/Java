package apexsystem;

import java.util.Scanner;

public class chapter1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        int number = scanner.nextInt();
        String abj = scanner.next();

        System.out.println("On a " +abj+ " " +season+ " day, I drink minimum of " +number+ " cups of coffe.");
    }
}
