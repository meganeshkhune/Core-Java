package anudipjava;
import java.util.*;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// initial value of variable will 0
		int sumTwoDigit = 0;
		int sumThreeDigit=0;
		
		// taking 10 Numbers
		System.out.println("Enter 10 integer numbers");
		for(int i =0; i<10;i++) { 
			int number = sc.nextInt();
			
			// checking number is 2 digit or 3 digit numbers
			
			if (number>9 && number<=99) {
				sumTwoDigit += number;
			}else if(number>99 && number<=999){
				sumThreeDigit += number;
			}
		}
		//printing sum of 2 and 3 digit numbers
		System.out.println("the sum of 2 digit number is "+sumTwoDigit);
		System.out.println("the sum of 3 digit number is "+sumThreeDigit);
		sc.close();
	}

}
