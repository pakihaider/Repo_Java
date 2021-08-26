package HomeWork;

import java.util.ArrayList;

public class HW11 {

            // Due date: Aug 25 '21

            /**
             * Question 1:
             * Create a method that would return the common values between two given arrays
             *
             * ["happy", "King" , "HAPPY", "PEACE"]
             * ["king", "Peace", "happiness", "connection", "learn"]
             *
             * ["king", "peace"]
             *
             * ["happy", "Kingdom" , "HAPPY", "PEACeful"]
             * ["king", "Peace", "happiness", "connection", "learn"]
             *
             * []
             */
            String[] userArray = {"happy", "King" , "HAPPY", "PEACE"};
            String[] userAnotherArray = {"king", "Peace", "happiness", "connection", "learn"};
            System.out.println ("\nThe common values between two given arrays are " + findCommonValues(userArray, userAnotherArray));

            public static ArrayList<String> findCommonValues(String userArray[], String userAnotherArray[]) {
                ArrayList<String> commonValues = new ArrayList<String>();

                for (int i = 0; i < userArray.length; i++) {
                    for (int j = 0; j < userAnotherArray.length; j++) {
                        if (userArray[i].equalsIgnoreCase(userAnotherArray[j])) {
                            commonValues.add(userArray[i]);
                        }
                    }
                }
                return commonValues;
            }



            /**
             * Question 2:
             * Create a method that would return the values occurring more than 1 times in given array
             *  String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
             *  ["happy", "joy" , "laugh"]
             *
             *
             *  String[] words = {"happy", "peace", "laugh", "joy"};
             *  []
             */

            String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
            System.out.println("\nThe values occurring more than 1 times in given array are " + repeatingValues(words));

            public static boolean isDuplicate(List<String> userArray, String userString) {
                boolean isDuplicate = false;

                for (int j = 0; j < userArray.size(); j++) {
                    if (userArray.get(j).equalsIgnoreCase(userString)) {
                        isDuplicate = true;
                    }
                }
                return isDuplicate;
            }

            public static ArrayList<String> repeatingValues(String userArray[]) {
                ArrayList<String> repeatingValues = new ArrayList<>();
                int foundCount = 0;

                for (int i = 0; i < userArray.length; i++) {
                    foundCount = 0;
                    for (int j = i + 1; j < userArray.length; j++) {
                        if (userArray[i].equalsIgnoreCase(userArray[j])) {
                            foundCount++;
                        }
                    }
                    if (foundCount > 0 && !isDuplicate(repeatingValues, userArray[i])) {
                        repeatingValues.add(userArray[i]);
                    }
                }
                return repeatingValues;
            }


            /**
             * Question 3:
             * Create a method that can print the count of given value in the given array
             * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
             * String word = "happy"
             *
             * output: 'happy' occurs N times in array.
             *
             * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
             * String word = "PEace"
             *
             * output: 'peace' occur only one time in array
             *
             * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
             * String word = "Helpful"
             *
             * output: 'Helpful' is not present in array
             */


            String[] newArray = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
            String wordToCount = "grow";

    void currentValueCount(newArray, wordToCount) {

    }

    public static void currentValueCount(String userArray[], String userString) {
                int count = 0;

                for (int i = 0; i < userArray.length; i++) {
                    if (userArray[i].equalsIgnoreCase(userString)) {
                        count++;
                    }
                }
                if (count == 1) {
                    System.out.println("\n" + userString + " occurs only " + count + " time in the given array");
                } else if (count > 1) {
                    System.out.println("\n" + userString + " occurs " + count + " times in the given  array");
                } else {
                    System.out.println("\n" + userString + " is not present in the given array");
                }
            }



        }



