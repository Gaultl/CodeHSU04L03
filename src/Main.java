public class Main {
    /*
    Use the following methods:
        - .length()
        - .substring(start, end) doesn't include end
        - .substring(start) goes to the end of the string
        - .indexOf(someString)
        -  someString.equals(otherEquals)
     */

    public static void main(String[] args) {
        System.out.println(VowelCount("This is a string."));
        System.out.println("Correct output: 4");
        System.out.println(VowelCount("AEIOU"));
        System.out.println("Correct output: 5");
        System.out.println(VowelCount("A1234E&^*(^$/IOU"));
        System.out.println("Correct output: 5");
        ///////////////////////////////////////////////////////////////////
        System.out.println(VowelRemover("Remove all of the vowels."));
        System.out.println("Correct output: Rmv ll f th vwls.");
        System.out.println(VowelRemover("Is this gonna work?"));
        System.out.println("Correct output: s ths gnn wrk");
        ///////////////////////////////////////////////////////////////////
        System.out.println(ContainsSubstring("Sentence","ten"));
        System.out.println("Correct output: true");
        System.out.println(ContainsSubstring("butterfly","butt"));
        System.out.println("Correct output: true");
        System.out.println(ContainsSubstring("       "," "));
        System.out.println("Correct output: true");
        System.out.println(ContainsSubstring("",""));
        System.out.println("Correct output: true");
        System.out.println(ContainsSubstring("lanyard","yard"));
        System.out.println("Correct output: true");
        ///////////////////////////////////////////////////////////////////
        System.out.println(ReverseString("ABCDEF"));
        System.out.println("Correct output: FEDCBA");
        System.out.println(ReverseString("Hulla Palooza"));
        System.out.println("Correct output: azoolaP alluH");
        ///////////////////////////////////////////////////////////////////
        System.out.println(PalindromeChecker("level"));
        System.out.println("Correct output: true");
        System.out.println(PalindromeChecker("racecars"));
        System.out.println("Correct output: false");
        System.out.println(PalindromeChecker("tacocat"));
        System.out.println("Correct output: true");
        ///////////////////////////////////////////////////////////////////
    }

    /**
     * Count the vowels (a,e,i,o, or u) in the input string regardless of case
     * @param input String
     * @return vowel count int
     */
    public static int VowelCount(String input){
        int length = input.length();
        int vowels = 0;

        String lowerInput = input.toLowerCase();

        for (int i = 0; i < length ; i++){
            String letter = lowerInput.substring(i, i + 1);
            if (letter.equals("a")
                    || letter.equals("e")
                    || letter.equals("i")
                    || letter.equals("o")
                    || letter.equals("u")){
                vowels++;
            }
        }
        return vowels;
    }

    /**
     * Returns a string with all vowels removed regardless of case
     * @param input String
     * @return String with no vowels
     */
    public static String VowelRemover(String input){
        int length = input.length();
        String noVowels = "";

        for (int i = 0; i < length ; i++){
            String letter = input.substring(i, i + 1);
            if (!(letter.toLowerCase().equals("a")
                    || letter.toLowerCase().equals("e")
                    || letter.toLowerCase().equals("i")
                    || letter.toLowerCase().equals("o")
                    || letter.toLowerCase().equals("u"))){
                noVowels = noVowels + letter;
            }
        }
        return noVowels;
    }

    /**
     * Determine if a substring target is contained in a given string
     * @param input - Given string
     * @param target - String being looked for
     * @return true if target found, false otherwise
     */
    public static boolean ContainsSubstring(String input, String target){
        //boolean output = input.contains(target);
        /*if(input.indexOf(target) > 0){
            return true;
        }
        return false;*/
        int length1 = input.length();
        int length2 = target.length();
        for(int i = 0; i <= (length1 - length2); i++){
            String compare = input.substring(i, i+length2);
            if(target.equals(compare)){
                return true;
            }
        }
        return false;
    }

    /**
     * Reverses a given string
     * @param input String
     * @return reversed input String
     */
    public static String ReverseString(String input){
        String output = "";
        int length = input.length();

        for(int i = length - 1; i >= 0; i--){
            String letter = input.substring(i, i + 1);
            output += letter;
        }
        return output;
    }

    /**
     * Determines if a given string is palindrome
     * @param input String
     * @return true if given string is a palindrome, false otherwise
     */
    public static boolean PalindromeChecker(String input){
        return input.equals(ReverseString(input));
    }
}
