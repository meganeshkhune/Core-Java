package anudipjava;
import java.util.*;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = sc.nextInt();
		long answer = factorial(number);
		System.out.println("The factorial of "+number+ " is "+answer);
		sc.close(); // Close the Scanner object to prevent resource leak
	}

	static int factorial(int number) {
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;// result= result*i
		}
		return result;
	}
}
