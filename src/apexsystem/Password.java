package apexsystem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static Scanner scanner = new Scanner(System.in);
    static char ch;
   static Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
    public static String myPass(String oldPass, String newPass) {
        for (int i = 0; i < newPass.length(); i++)
            ch = newPass.charAt(i);
            if (Character.isUpperCase(ch))
                System.out.println();
             else   return "should to be upperCase";
            if(oldPass.equals(newPass))
            return "New password can't be as the old password";
            if (newPass.length() < 8)
            return "Password can't be less then 8 characters";
        Matcher p = special.matcher(newPass);
        if (p.find())
            System.out.println();
        else   return "should to be specialCharacter";
        return "Password changed";
    }

    public static void main(String[] args) {
        String s;

        do {
            System.out.println("Enter your old password");
            String oldPassword = scanner.next();
            System.out.println("Enter your new password");
            String newPassword = scanner.next();
          //  myPass(oldPassword,newPassword);
            s = myPass(oldPassword,newPassword);
            System.out.println(s);
        } while  (s != "Password changed");
    }

}