package string_topic;
import java.util.*;

public class SubStringLength {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.print("Enter the Start index: ");
		int startIndex = sc.nextInt();
		System.out.print("Enter the end index: ");
		int endIndex = sc.nextInt();
		if(startIndex<0||endIndex>str.length()||startIndex>=endIndex) {
			System.out.println("Invalid Input");
		}else {
			String substring = str.substring(startIndex, endIndex);
			int length = substring.length();
			
			
		System.out.println("The substring is: \"" + substring + "\"");
        System.out.println("The length of the substring is: " + length);
    }

    sc.close();

}
}