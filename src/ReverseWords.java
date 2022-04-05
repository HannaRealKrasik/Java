/*Complete the function that accepts a string parameter,
 and reverses each word in the string. All spaces in the string should be retained.

"This is an example!" ==> "sihT si na !elpmaxe"
      "double  spaces"      ==> "elbuod  secaps"
 */

public class ReverseWords {
    public static String reverseWords(final String original) {
        StringBuilder done = new StringBuilder();
        String [] s = original.split(" ");
        for (int i = 0 ; i < s.length; i ++) {
            String w = s[i];
            StringBuilder words = new StringBuilder(w);
            words.reverse();
            done.append(words + " ");
        }
        if(s.length == 0){
            return original;
        }
        done.deleteCharAt(done.length() - 1);

        return done.toString();
    }

    public static void main(String[] args) {

        System.out.println(reverseWords("      "));
    }
}
