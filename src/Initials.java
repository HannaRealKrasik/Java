import java.util.Locale;

/*Write a function to convert a name into initials.
This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

*/
public class Initials {

    public static String Init(String name) {
        StringBuilder initials = new StringBuilder();
         name =   name.toUpperCase();
        initials.append(name.charAt(0))
                .append(".")
                .append(name.indexOf(" ") + 1);
        return initials.toString();
    }
    public static void main (String args[]){
        System.out.println(Init("Sam harris"));
    }
}