package HomeWork;

public class HW5 {

    public static void main(String[] args){

        // Question -1

        int studentScore = 150;
        int maxScore = 170;
        double thePercentage = ((150 * 100) / 170);
        //System.out.println(thePercentage);

        /**
         * A: 100 - 91
         * B: 90.00 - 81
         * C: 80.99 - 71
         * D: 70.99 - 61
         * E: 60.99 - 51
         * F: 50.99 or below
         */

        if (thePercentage >= 91 && thePercentage <= 100) {
            System.out.println("Your Percentage: " + thePercentage + " " + "and your Grade is :A");
        } else if (thePercentage >= 81 && thePercentage <= 90.99) {
            System.out.println("Your Percentage: " + thePercentage + " " + "and your Grade is: B");
        } else if (thePercentage >= 71 && thePercentage <= 80.99) {
            System.out.println("Your Percentage: " + thePercentage + " " + "and your Grade is: C");
        } else if (thePercentage >= 61 && thePercentage <= 70.99) {
            System.out.println("Your Percentage: " + thePercentage + " " + "and your Grade is: D");
        } else if (thePercentage >= 51 && thePercentage <= 60.99) {
            System.out.println("Your Percentage: " + thePercentage + " " + "and your Grade is: E");
        } else if (thePercentage <= 50.99) {
            System.out.println("Your Percentage: " + thePercentage + " " + "and your Grade is:F");
        }


    // Question -2

    int num = 30;
    /**
     * If number is divisible by 3 print divisible by three.
     * If it's divisible by 5 print divisible by five.
     * If it's divisible by both print divisible by both.
     */

    //if (num % 3 ==0) {System.out.println("divisible by 3");}
// else if (num % 5 ==0) {System.out.println("divisible by 5");}
// else if (num % 5 ==0 && num % 3 ==0 ) {System.out.println("divisible by both");}
// else if (num % 3 !=0 && num % 5 !=0 ) {System.out.println(num);}


		if (num % 3 ==0)

    {
        System.out.println("divisible by 3");
    }
		else if (num % 5 ==0)

    {
        System.out.println("divisible by 5");
    }
		else if(num % 5==0 && num % 3==0)

    {
        System.out.println("divisible by both");
    }
		else if(num % 3 != 0 && num % 5 !=0)

    {
        System.out.println(num);
    }

}

}