package HomeWork;

public class HW4 {
    public static void main(String[] args) {

        //Question -1
        /**
         *  String threeWordSentence = "hApPy nEW yeAr";
         */
        String threeWordSentence_1 = "hapPy nEW yeAr";
         System.out.println("Before code : " + threeWordSentence_1);

         // Now convert the sentence to lowercase
        String threewordsentencetolowercase = threeWordSentence_1.toLowerCase();
        System.out.println(threewordsentencetolowercase);

        //extract words in the sentence
        String[] threeWordSentenceSplit =threewordsentencetolowercase.split(" ");
        //System.out.println(Arrays.toString(threeWordSentenceSplit));

        //change first letter of each word to upper case
        String firstWord = threeWordSentenceSplit[0].substring(0,1).toUpperCase() + threeWordSentenceSplit[0].substring(1);
        String secondWord = threeWordSentenceSplit[1].substring(0,1).toUpperCase() + threeWordSentenceSplit[1].substring(1);
        String thirdWord = threeWordSentenceSplit[2].substring(0,1).toUpperCase() + threeWordSentenceSplit[2].substring(1);

        //combine final sentence
        threeWordSentence_1 = firstWord + " " + secondWord + " " + thirdWord;

        System.out.println("After code : " + threeWordSentence_1);





        //Question 2
        String threeWordsSentence_2 = "very gOOD MorNING";
        String abbr = "";

        // covert the sentence to lowercase
        threeWordsSentence_2 = threeWordsSentence_2.toLowerCase();
        //System.out.println(threeWordsSentence_2);

        //extract words in the sentence
        String[] threeWordSentence_2Split = threeWordsSentence_2.split(" ");
        //System.out.println(Arrays.toString(threeWordSentence_2Split));

        //change first letter of each word to upper case
        String firstLetter = threeWordSentence_2Split[0].substring(0,1).toUpperCase();
        String secondLetter = threeWordSentence_2Split[1].substring(0,1).toUpperCase();
        String thirdLetter = threeWordSentence_2Split[2].substring(0,1).toUpperCase();

        //create abbreviation
        abbr = firstLetter + secondLetter + thirdLetter;

        System.out.println("\nAbbreviation for 'very gOOD MorNING' is : " + abbr);





        //Question 3
        String sentence_3 = "We all are here to learn programming and testing";

        //extract words in the sentence and get total number of words
        String[] sentence_3Split = sentence_3.split(" ");
        int numberOfWordsInSentence = sentence_3Split.length;

        System.out.println("\nTotal number of words in the sentence is " + numberOfWordsInSentence);

}

