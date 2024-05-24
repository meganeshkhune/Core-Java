package string_topic;
import java.util.*;

public class CountSplVolConDig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int vol=0,spl=0,dig=0,word=0;//intial value is 0
		System.out.println("Enter a String");
		str = sc.nextLine();
		str=str+" ";//read the last word
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')//checking vowels
				vol++;
			if(ch>='0'&&ch<='9')//checking digits
				dig++;
			if(ch==' ')//checking words
				word++;
			if(!Character.isLetterOrDigit(ch)&&!Character.isWhitespace(ch))//checking special character
				spl++;
		}
		System.out.println("the number vowels are "+vol);
		System.out.println("the number digits are "+dig);
		System.out.println("the number words are "+word);
		System.out.println("the number special character are "+spl);
		
		sc.close();
	}

}
