package lab_30_5_24;
import java.util.Scanner;

public class WordCountInSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter the word: ");
        String word = scanner.nextLine().trim();

        // Prompt the user to enter a sentence
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine().trim();

        // Count the number of times the word appears in the sentence
        int count = countOccurrences(word, sentence);
        System.out.println("The word \"" + word + "\" appears " + count + " times in the sentence.");

        scanner.close();
    }

    public static int countOccurrences(String word, String sentence) {
        if (word == null || word.isEmpty() || sentence == null || sentence.isEmpty()) {
            return 0;
        }

        String[] words = sentence.split("\\s+");
        int count = 0;
        
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        
        return count;
    }
}
