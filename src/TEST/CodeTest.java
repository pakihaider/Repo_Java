package TEST;

public class CodeTest<speedLimit> {
    public static void main(String[] args) {



    /**
     * Question 1:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points to be charged against
     * the license for over speeding.
     *
     *    1. Speed Limit = 70
     *    2. Every 5 miles over the speed limit will add 1 point
     *    3. If user speed is such that system shows 12 points for a speed
     *      then print, license is suspended
     *
     *  Example:
     *      user speed = 74 ; 0 points
     *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
     *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
     *      user speed = 178 ; 21 points (License suspended).
     *      user speed = 70 ; Thank you for driving within the speed limit.
     *
     */
    /**
     * 0 point: 70-74 (
     * 1 point: 75-79
     * 2 points: 80-84
     * 3 points: 85-89
     * 4 points: 90-94
     * 21 points: 175=>
     *
     *
     *
     */

        int speedLimit1 = 95;
        trafficPointsBySpeed(82);



        if (speedLimit1 >= 70 && speedLimit1 < 75) {
        System.out.println("Points on your driver license: " + " " + "0 Point");
     } else if (speedLimit1 >= 75 && speedLimit1 < 80) {
        System.out.println("Points on your driver license: " + " " + "1 Point");
      } else if (speedLimit1 >= 80 && speedLimit1 < 85) {
        System.out.println("Points on your driver license: " + " " + "2 Points");
    }   else if (speedLimit1 >= 85 && speedLimit1 < 90) {
        System.out.println("Points on your driver license: " + " " + "3 Points");
     } else if (speedLimit1 >= 170) {
        System.out.println("Points on your driver license: " + " " + "21 Points" + " and " + " " + "License suspended");
       } else if (speedLimit1 < 70) {
        System.out.println("Thank you for driving within the speed limit.");
      }


}
        public static void trafficPointsBySpeed (int speedLimit) {
            int speedLimit1 = 90;


            if (speedLimit >= 70 && speedLimit < 75) {
                System.out.println("Points on your driver license: " + " " + "0 Point");
            } else if (speedLimit >= 75 && speedLimit < 80) {
                System.out.println("Points on your driver license: " + " " + "1 Point");
            } else if (speedLimit >= 80 && speedLimit < 85) {
                System.out.println("Points on your driver license: " + " " + "2 Points");
            }   else if (speedLimit >= 85 && speedLimit < 90) {
                System.out.println("Points on your driver license: " + " " + "3 Points");
            } else if (speedLimit >= 170) {
                System.out.println("Points on your driver license: " + " " + "21 Points" + " and " + " " + "License suspended");
            } else if (speedLimit < 70) {
                System.out.println("Thank you for driving within the speed limit.");
            }



    }

    /** Question 2:
            * Create a method to return an int-array
     * after removing a given int-value from a given int array.
            *
            * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
            * Returned array: {32, 14, 98, 56, 148, 78}
     *
             * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
            * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */

    public static int[] findNum(int search, int[] num){

        int count = 0;
        for (int n : num){
            if (n == search){
                count++;
            }
        }
        int[] oldArr = new int[num.length - count];
        int j = 0;
        for (int i = 0; i < num.length && j < num.length - count; i++){
            if (search != num[i]){
                oldArr[j] = num[i];
                j++;
            }

        }

        return oldArr;

        int[] testNums = {1, 26, 6, 23, 7, 12, 8, 13, 1, 7, 12, 6, 23};
        for (int i =  0; i < testNums.length; i++){//Print original
            System.out.println(Arrays.toString(findNum(testNums[i], testNums)));
            System.out.println("ABCDE");
    }



       /** Question 3:
     * Create a method to return missing smallest positive integer (greater than 0) from given int-array.
                *
     * Example:
     *  For array : {3, 5, 1, 4, 2, 7}
     *  Method should return : 6
                *
     *  For array : {2, 5, -1, 0, 6}
     *  Method should return : 1
                *
     *  For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     *  Method should return : 4
                *
     *  For array : {-2, -5, -1, -10, -6}
     *  Method should return : 1
                *
     */

        public static int findSmallestMissing(Integer[] arr)
        {
            // use a range constructor to initialize the set from array elements
            Set<Integer> distinct = new HashSet<>();
            Collections.addAll(distinct, arr);

            // return first smallest missing positive number from the set
            int index = 1;
            while (true)
            {
                if (!distinct.contains(index)) {
                    return index;
                }
                index++;
            }

            public static int smolPositive (int [] num){
            int smolPositive = num[0];
            for (int n : num){
                if (smolPositive >= n && n >= 0){
                    smolPositive = n;
                }
            }
            if (smolPositive < 0){
                smolPositive = 0;
            }
            return smolPositive;
        }

        }

