package HomeWork;

import java.util.Locale;

public class HW3 {
    public static void main(String[] args) {

        // Question - 1
        String sentence_1 = "Hello World, How are you?";
        int result_1 = 0;
        /**
         * Assign result_1 as 100 if length of sentence_1 is 10 or greater
         * else assign result_1 as 15
         *
         * Use: Ternary Operator
         */

        result_1 = (sentence_1.length() >= 10) ? 100 : 15;
        System.out.println("result_1 = " + result_1);

         // Question - 2
        String sentence_2 = " We all ARe GOod ProgrAMmer";
        String sentence_2_Uppercase = sentence_2.toUpperCase();
        String sentence_2_Uppercase_R = "r".toUpperCase();

        /**
         * replace all 'R/r' with 'F'
         */
        System.out.println(sentence_2.replaceAll("R" , "F"));

        //Question - 3

        String Sentence_3 = "ABC Networks";
        String result_3 = "";
        /**
         * 1. Display/print length of your sentence_3
         * 2. does sentence_3 starts with "a" (ignore cases)
         * 3. does sentence_3 ends with "K" (ignore cases)
         * 4. Assign result_3 as "Media" if sentence_3 starts with 'a' (ignore cases)
         *    else assign "Entertainment"
         *    Print the result_3 in console,
         *
         */
        System.out.println(Sentence_3.length());
        //boolean ignorecase_A = Sentence_3.equalsIgnoreCase(Sentence_3);
        //boolean startswith_A = ingnorecase_A;

        System.out.println("Does Sentence_3 start with 'a' ? " + Sentence_3.toLowerCase(Locale.ROOT).startsWith("a"));
        System.out.println("Does Sentence_3 ends with 'k' ? " + Sentence_3.toUpperCase().endsWith("K"));
        String answerResult_3 = result_3.toLowerCase().startsWith("a") ? "Media" : "Entertainment";

        System.out.println("is it media or entertainment? " + result_3);


    }

}
