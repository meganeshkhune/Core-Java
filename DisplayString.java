package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> str=new ArrayList<String>();
		System.out.println("Enter 10 string");
		for(int i =0;i<10;i++) {
			System.out.print("String "+(i+1)+":");
			String string =sc.nextLine();
			str.add(string);
		}
		System.out.print("The strings are: ");
		for(String s: str) {
			System.out.println("String "+s);
			
		}
		
		

	}

}
