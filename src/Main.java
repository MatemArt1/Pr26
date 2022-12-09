public class Main {
    /*
    String subpattern recognition I.
    In this kata you need to build a function to return either true/True or false/False
    if a string can be seen as the repetition of a simpler/shorter subpattern or not.

For example:

hasSubpattern("a") == false; //no repeated pattern
hasSubpattern("aaaa") == true; //created repeating "a"
hasSubpattern("abcd") == false; //no repeated pattern
hasSubpattern("abababab") == true; //created repeating "ab"
hasSubpattern("ababababa") == false; //cannot be entirely reproduced repeating a pattern
Strings will never be empty and can be composed of any character
(just consider upper- and lowercase letters as different entities) and can be pretty long
(keep an eye on performances!).

If you liked it, go for the next kata of the series!
     */

    public static boolean hasSubpattern(String str) {
        //your code here
        for (int l = 1; l < str.length(); l++)
        {
            if (str.length()%l != 0) continue;
            String s = str.substring(0, l-1);
            boolean b = true;
            for (int k = 0; 2*l - 1 + k < str.length(); k = k + l)
            {
                String s_k = str.substring(l + k, 2*l - 1 + k);
                if (s_k != s)
                {
                    b = false;
                    continue;
                }
            }
            if (b) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}