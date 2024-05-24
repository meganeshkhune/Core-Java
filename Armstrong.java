package Basicjava;
import java.util.*;

public class Armstrong {
	public static void main(String[] args) {
		int number = 153;
		int temp = number;
		int remainder, sum = 0;
		while(number>0) {
		remainder = number%10;//
		number = number/10;
		sum = sum + remainder*remainder*remainder ;
		}
		if(temp==sum)
			System.out.println("An no. is Armstrong");
		else
			System.out.println("An no. is not Armstrong");
				
		}
	}

