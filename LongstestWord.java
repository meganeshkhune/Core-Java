package string_topic;
import java.util.*;

public class LongstestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str,word,lword;
		System.out.println("Enter a String");
		str=sc.nextLine();
		word="";
		lword="";
		str=str+" ";//read the last word
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				if(word.length()>lword.length())//compare two words
					lword=word;
				word="";
			}else
				word=word+ch;//join character in word until gets space
			}
		System.out.println("Longest is "+lword+" "+"Length is "+lword.length());
		
		sc.close();
		}
		

	}

