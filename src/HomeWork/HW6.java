package HomeWork;

import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

import java.util.Locale;

public class HW6<i> {

    public static void main(String[] args) {

        /** 1
         *  String sentence = "happy new year TO You DeaR";
         *  //code
         * String sentence = "Happy New Year To You Dear";
         *
         * For hint refer : Loop_Concept, Line #34
         */

        String mySentence = "MY Favorite FruIT iS ManGoE";
        String[] arrSentence = mySentence.split(" ");
        String formatted = " ";
        for (int i = 0; i < arrSentence.length; i++) ;
        {
            formatted += arrSentence[0].substring(0, 1).toUpperCase() + arrSentence[0].substring(1).toLowerCase();


            /** 2
             * create the abbreviation // HNY
             */
            String sentence_1 = "very gOOD MorNING to You dear";
            String abbr = "";

            // code

            System.out.println("Abbreviation for '" + sentence_1 + "' is " +
                    "' " + abbr);
            // Abbreviation for 'very gOOD MorNING to You dear' is : VGMTYD

            String abbr1 = " ";
            String arrSentence1 = " mY Favorite Fruit is MangOE";
            for (int i = 0; i < arrSentence1.length(); i++) {
                abbr1 += arrSentence[i].toUpperCase().charAt(0);
                System.out.println(formatted + "Abbreviation: " + abbr1);


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

                int studentScore = 120;
                int maxScore = 150;
                char grade = 'a';
                String scholarship = " ";

                double percentage = studentScore * 100 / maxScore;
                // We will need to print percentage and grade based on condition

                if (studentScore > 0 && studentScore <= maxScore) {
                    if (percentage >= 91) {
                        grade = 'A';
                    } else if (percentage >= 81) {
                        grade = 'B';
                    } else if (percentage >= 71) {
                        grade = 'C';
                    } else if (percentage >= 61) {
                        grade = 'D';
                    } else if (percentage >= 51) {
                        grade = 'E';
                    } else {
                        grade = 'F';
                    }


                    System.out.println("Invalid Student Score entered: " + studentScore);
                }
                System.out.println("Your percentage is : " + percentage + "and your grade is : " + grade);

                // Now scholarship assigning

                if (grade == 'A') {
                    scholarship = "full";
                } else if (grade == 'B' || grade == 'C') {
                    scholarship = "half";
                } else {
                    scholarship = "No";
                }
                System.out.println("Based on your grade " + grade + ", you get " + scholarship + " scholarship for next year"
                );

            }
        }


        /** 4
         * Create an array and store 5 int-value.
         * Print the average of numbers in array.
         *
         * sum of values / number of values
         *
         * {10,20,30,40,50}
         * (10+20+30+40+50)/5
         */
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        if (numbers.length > 0) {
            for (int i = 0; i < numbers.length; i++) {
                sum = sum + numbers[i];
            }
            sum = sum / numbers.length;
            System.out.println("\nThe sum of values is " + sum);
        } else {
            System.out.println("\nThe number must not be divisible by " + numbers.length);
        }


        /** 5
         * String[] names = {"john", "happy", "peace", "joy", "laugh"};
         */

        String[] names = {"john", "happy", "peACe", "jOy", "laugh", "Marry"};
        String nameToSearch = "zeshan";
        boolean isFound = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i] == nameToSearch) {
                isFound = true;
                System.out.println(names[i] + " is at position " + (i + 1) + " in the array");
            }
        }

        if (!isFound) {
            System.out.println("\n" + nameToSearch + " is not present in the array");
        }

        /** 6
         * int[] numbers = {11,22,33,44,55,98,65};
         * String[] names = {"john", "happy", "peace", "joy", "laugh"};
         * int numberToSearch = 22;
         * Limitation : both array must be of same length
         *
         */

        int[] lengthNumbers = {11, 22, 33, 44, 55, 98, 65};
        String[] lengthNames = {"john", "happy", "peace", "joy", "laugh"};
        int numberToSearch = 22;
        boolean isNumberFound = false;

        if (lengthNames.length == lengthNumbers.length) {
            for (int i = 0; i < lengthNumbers.length; i++) {
                if (lengthNumbers[i] == numberToSearch) {
                    isNumberFound = true;
                    System.out.println("\n" + numberToSearch + " is present at the index " + i + " in numbers array");
                    System.out.println("\n" + lengthNames[i] + " is present at the same index in names array");

                }
            }

        } else {
            System.out.println("\n The arrays are not of the same length");
        }

        if (isNumberFound != true) {
            System.out.println("\n" + numberToSearch + " is not present in the array");
        }
    }

    /**
     * String[] myNames = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
     * print the names from array if the name-length is >=5 and name contains 'o' or 'O'
     */

    String[] myNames = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
    String finalAnswer = " ";

   //for(int i = 0;
   // i<myNames.length; i++)
    {
    //    if (myNames[i].length() >= 5 && myNames[i].toLowerCase().contains("o")) ;
     //   System.out.println("Love");
    }

}




