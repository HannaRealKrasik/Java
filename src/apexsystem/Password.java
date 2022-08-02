package apexsystem;

import java.util.Scanner;

public class Password {
    static boolean s = false;
    public static Scanner scanner = new Scanner(System.in);
    public static boolean myPass(String pass) {
        if (pass.length() <= 8)
        return false;
        for(int i = 0; i < pass.length(); i++)
            if(!Character.isUpperCase(pass.charAt(i)))
                return false;

pass.
    }boolean

    public static void main(String[] args) {


    do{
       s = false;
        System.out.println("Enter your password");
       String password = scanner.toString();

    }while (s);



}
}
