package string_topic;
import java.util.*;

public class Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//user to enter the number of strings
		System.out.println("Enter the number of strings:");
		int numStrings = sc.nextInt();
		sc.nextLine();
		 // Create an array to hold the strings
		String[] str = new String[numStrings];
		System.out.println("Ented the Strings: ");
		// the user input to enter each string
		for(int i=0;i<numStrings;i++) {
			System.out.print("String" + (i+1)+":");
			str[i] = sc.nextLine();
			}
		 // Print the original array
		System.out.println("Original array:");
		for(String string : str) {
			System.out.println(string);
		}
		
		Arrays.sort(str);// Sorting the array
		//Print the Sorted array
		System.out.println("\nSorted array:");
		for(String string : str) {
			System.out.println(string);
		}
		sc.close();
		
	}

}
