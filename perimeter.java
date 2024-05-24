package Basicjava;
import java.util.*;

public class perimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Asking which shape want
		System.out.println("Enter the Shape(1=Square, 2=Rectangle, 3=circle)");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: //For Square
			System.out.println("Enter the side length of Square");
			double side = sc.nextDouble();
			double squareperimeter = side*4;
			System.out.println("Perimeter of square is "+ squareperimeter);
			break;
		case 2: //For Rectangle
			System.out.println("Enter the Length and Width of the Rectangle ");
			double length = sc.nextDouble();
			double width = sc.nextDouble();
			double rectangleperimeter = 2*(length*width);
			System.out.println("Perimeter of Rectangle "+ rectangleperimeter);
			break;
		case 3: //For Circle
			System.out.println("Enter the radius of the circle ");
			double circleradius = sc.nextDouble();
			double pivalue = 3.14;
			double circleperimeter = 2*pivalue*circleradius;
			System.out.println("Perimeter of Circle " +circleperimeter);
			break;
		default:
			System.out.println("Inavlid choice");
		}
		
			
		sc.close();			
			
		
		}

	}


