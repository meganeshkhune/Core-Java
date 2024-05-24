package anudipjava;
import java.util.*;

public class Buzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No: ");//user entering the number
		int number = sc.nextInt();
		if (number%7==0 && number%10==7) {  //checking number is divisible by 7 and ends with 7
			System.out.print(number + " is a Buzz number: ");
		}else {
			System.out.print(number + " is not Buzz number ");
		}
		sc.close();
	}

}
