package lab_30_5_24;
import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine().trim();

        // Reverse the sentence
        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed sentence: " + reversedSentence);

        scanner.close();
    }

    public static String reverseWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        // Split the sentence into words using one or more spaces as the delimiter
        String[] words = sentence.split("\\s+");

        // Reverse the array of words
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }
}

