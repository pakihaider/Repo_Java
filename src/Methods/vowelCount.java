package Methods;

import java.util.Locale;

public class vowelCount {
    public static void main(String[] args) {
        String sentence = "this is a school or engineering";

        vowelCount("I am hungry and I need some food now");
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.toLowerCase().charAt(i);
            for (char vowel : vowels) {
                if (vowel == ch) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static int vowelCount(String userString) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < userString.length(); i++) {
            char ch = userString.toLowerCase().charAt(i);
            for (char vowel : vowels) {
                if (vowel == ch) {
                    count++;


                }
            }
        }
        return count;
    }
}

