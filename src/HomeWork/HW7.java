package HomeWork;

import java.lang.reflect.Array;

public class HW7 {
    public static void main(String[] args) {


        /**
         * write a method to convert given string into Title case
         *
         * Input sentence = "happy new year To You DeaR"
         * Final answer = " Happy New Year To You Dear"
         */
        String sentence = "happy new year To You DeaR";
        String[] arrSentence = sentence.split(" ");
        String formatted = " ";
        for (String word : arrSentence) {
            formatted += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            if (!word.equalsIgnoreCase(arrSentence[arrSentence.length - 1])) {
                formatted += " ";
            }
        }
        System.out.println("Original String: " + sentence);
        System.out.println("Fixed String: " + formatted);



        /**
         *
         * Write a method to reverse a string
         */

       // public static String reverseString(String testWord){
            String testWord = "I like apples";
            String reverseWord = " ";
            for (int i = testWord.length() - 1; i >= 0; i--) {
                reverseWord += testWord.charAt(i);
            }
            System.out.println("original string: " + testWord);
            System.out.println("Reversed string: " + reverseWord);
            //return reverseWord;


            /**
             *
             * Write a method which will return the result, if given string is a palindrome
             *
             * return type: boolean
             */

           // public static boolean isPalindrome(String){


                boolean isPalindrome1 = true;
                int forWords = 0;
                int backWords = testWord.length() - 1;
                testWord = testWord.trim();
                while (forWords <= backWords) {

                    if (testWord.toUpperCase().charAt(forWords) != testWord.toUpperCase().charAt(backWords)) {

              //          isPalindrome = false;
                        break;
                    }
                    forWords++;
                    backWords--;
                }
            //    if (isPalindrome) {
                    System.out.println(testWord + " IS A PALINDROME.");
              //  } else {
            //        System.out.println(testWord + " IS NOT A PALINDROME.");
                }
              //  return isPalindrome;

            }


            /**
             *
             * Write a method to return average of a given int array.
             *
             * int array = {7, 10, 3, 6, 10}
             * ans: 7.2
             */

            /**
             *
             * write a method to return the maximum value from a given int array.
             *
             * input array: {33, 54, 67, 19, 9, 52}
             * max: 67
             */

       //     public static int maximumValueInArray (int[] UserGivenNumbers_2)
        //{
        //    int maxVal = UserGivenNumbers_2[];
       //     for (int i = 0; i <= UserGivenNumbers_2.length-1; i++){
         //       if (UserGivenNumbers_2[i] > maxVal)
         //           maxVal = UserGivenNumbers_2[i];
              //  }
         //   return maxVal;
          //      System.out.println("IN THE FOLLOWING ARRAY OF NUMBERS :" + Array.toString(numbers));
            //    System.out.println(maxVal + " IS THE LARGEST VALUE!");
                //return maxVal1;

