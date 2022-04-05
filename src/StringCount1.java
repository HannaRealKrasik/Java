/* Complete the method/function so that it converts dash/underscore
delimited words into camel casing. The first word within the output should
be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"*/
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StringCount1 {
    public static void main(String[] args) {
         String s = "The_Stealth_Warrior";
         List<Character> m1 = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            m1.add(ch);
        }
         for (int i = 0; i < m1.size(); i ++)
           if ( m1.get(i) == '-' ||  m1.get(i) == '_'){
           Character r =  m1.get(i+1).charValue();
                r = Character.toUpperCase(r);
                m1.set((i+1), r);
             m1.remove(i);
           }
        StringBuilder sb = new StringBuilder();
        for (Character chr : m1) {
            sb.append(chr);
        }
            System.out.print(sb.toString());
    }
    }












