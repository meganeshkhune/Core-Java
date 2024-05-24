package string_topic;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Taking input from User
		System.out.println("Enter a String ");
		String str = sc.next();
		String str1= "";
		str = str+" ";//read the last word
		for(int i=0;i<str.length();i++)
		{
			char e= str.charAt(i);//checking each character
			str1=e+str1;
		}
		if(str.equals(str1))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}
}
