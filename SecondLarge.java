package Basicjava;
import java.util.*;


public class SecondLarge {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter three numbers:");
	        double num1 = scanner.nextDouble();
	        double num2 = scanner.nextDouble();
	        double num3 = scanner.nextDouble();

	        double secondLargest = findSecondLargest(num1, num2, num3);
	        
	        System.out.println("The second largest number is: " + secondLargest);

	        scanner.close();
	    }

	    public static double findSecondLargest(double a, double b, double c) {
	        if ((a >= b && a <= c) || (a <= b && a >= c)) {
	            return a;
	        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
	            return b;
	        } else {
	            return c;
	        }
	    }
	}


