package Practice;

public class SortArray {

    public static void main(String[] args) {

        //  Question-1:
        //  Write a method to sort an integer array
        //Example:
        //Given array : [20, 10, 40, 44]
        //Method should return : [10, 20, 40, 44]


        int[] numArray = new int[]{20, 10, 40, 44};
        for (int i = 0; i < numArray.length; i++) {
          //  System.out.println(numArray[i]);
        }
        int temp; //Assending order
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i; j < numArray.length; j++) {
                if (numArray[i] > numArray[j]) {
                    temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;

                }
            }
        }

        for (int a : numArray) {
            System.out.println(a);
        }
    }
}
