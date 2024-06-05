package lab_30_5_24;
import java.util.*;

public class PigLatin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// the user to enter a word
		System.out.println("Enter a Word");
		String word = sc.nextLine().trim();
		// Convert the word to Pig Latin and print the result
		String pigLatinWord = convertToPigLatinWord(word);
		System.out.println("Pig Latin: " +pigLatinWord);
		sc.close();
	}
	public static String convertToPigLatinWord(String word) {
		if (word == null || word.isEmpty()) {
			return word;
		}
		 // Convert the word to lowercase
		word = word.toLowerCase();
		// Check if the word starts with a vowel
		if(startsWithVowel(word)) {
			return word;
		}
		// Find the index of the first vowel in the word
		int vowelIndex = findFirstVowelIndex(word);
		// If no vowel is found, return the original word
		if (vowelIndex == -1) {
			return word;
		}
		String pigLatinWord = word.substring(vowelIndex)+word.substring(0, vowelIndex)+"ay";
		return pigLatinWord;
	}
	public static boolean startsWithVowel(String word) {
		char firstChar = word.charAt(0);
		return isVowel(firstChar);
	}
	private static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
	public static int findFirstVowelIndex(String word) {
		for(int i = 0; i<word.length();i++) {
			if(isVowel(word.charAt(i))) {
				return i;
			}
		}
		return -1;
	}
	}
