package HomeWork;

import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

public class HW6 {

    public static void main(String[] args) {

        /** 1
         *  String sentence = "happy new year TO You DeaR";
         *  //code
         * String sentence = "Happy New Year To You Dear";
         *
         * For hint refer : Loop_Concept, Line #34
         */

        /** 2
         * create the abbreviation // HNY
         */
        String sentence_1 = "very gOOD MorNING to You dear";
        String abbr = "";

        // code

        System.out.println("Abbreviation for '" + sentence_1 + "' is " +
                "' " + abbr);
        // Abbreviation for 'very gOOD MorNING to You dear' is : VGMTYD


        /** 3
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student;
         *
         * Grade A: 91 - 100
         * Grade B: 81 - 90.00
         * Grade C: 71 - 80.99
         * Grade D: 61 - 70.99
         * Grade E: 51 - 60.99
         * Grade F: less than or equal to 50.99
         *
         * student got A, gets full scholarship for next year
         *
         * student got better than D (i.e, B or C), get half scholarship for next year
         *
         * otherwise no scholarship for next year
         *
         * sample output;
         * Your percentage: xx.yy and your grade is : Z
         * Based on your grade(Z), you get XXXX scholarship for next year
         *
         */


        /** 4
         * Create an array and store 5 int-value.
         * Print the average of numbers in array.
         *
         * sum of values / number of values
         *
         * {10,20,30,40,50}
         * (10+20+30+40+50)/5
         */
        int arr [] = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.println(average(arr,n));


        /** 5
         * int[] numbers = {11,22,33,44,55,98,65};
         * String[] names = {"john", "happy", "peace", "joy", "laugh"};
         *
         * Limitation : both array must be of same length
         *
         * if the numbers-array has 33 in it,
         *   print the index at which 33 is present in number array
         *   And, print the name present at same index in name array.
         *
         *
         */






    }



}
