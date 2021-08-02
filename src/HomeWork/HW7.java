package HomeWork;

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
        for (String word: arrSentence) {
            formatted += word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            if (!word.equalsIgnoreCase(arrSentence[arrSentence.length-1])){
                formatted += " ";
            }
        }
        System.out.println("Original String: " + sentence);
        System.out.println("Fixed String: " + formatted);
        return formatted;





        /**
         *
         * Write a method to reverse a string
         */

        public static String reverseString(String testWord){
            String testWord = "I like apples";
            String reverseWord = " ";
            for (int i = testWord.length() - 1; i >= 0; i--) {
                reverseWord += testWord.charAt(i);
            }
            System.out.println("original string: " + testWord);
            System.out.println("Reversed string: " + reverseWord);
            return reverseWord;


            /**
             *
             * Write a method which will return the result, if given string is a palindrome
             *
             * return type: boolean
             */

            public static boolean isPalindrome (String testWord1){

            String testWord1 = "level";
            boolean isPalindrome = true;
            int forWords = 0;
            int backWords = testWord1.length() - 1;
            testWord = testWord1.trim();
            while (forWords <= backWords) {

                if (testWord1.toUpperCase().charAt(forWords) != testWord1.toUpperCase().charAt(backWords)) {

                    isPalindrome = false;
                    break;
                }
                forWords++;
                backWords--;
            }
            if (isPalindrome) {
                System.out.println(testWord1 + " IS A PALINDROME.");
            } else {
                System.out.println(testWord1 + " IS NOT A PALINDROME.");
            }
            return isPalindrome;

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

            public static int maxVal(int[] numbers){
                int maxVal = 13; //Initializing the number. Usually you put it as 0 but 13 my fav
                for(int i = 1; i < numbers.length; i++){ //Start at the second index to avoid any errors when comparing(If I start at 0, then what is numbers[0-1]?)
                    if (numbers[i]>= numbers[i-1]){
                        maxVal = numbers[i];
                    }
                }
                System.out.println("IN THE FOLLOWING ARRAY OF NUMBERS :"+Arrays.toString(numbers));
                System.out.println(maxVal+" IS THE LARGEST VALUE!");
                return maxVal;
    }
}

