package collection;

import java.util.ArrayList;

public class ArrayListStudent {

	public static void main(String[] args) {
		ArrayList<Student> std = new ArrayList<Student>();
		Student s1= new Student(1,"G",12,'C');
		Student s2= new Student(2,"A",16,'B');
		Student s3= new Student(3,"N",12,'C');
		Student s4= new Student(4,"E",20,'A');
		Student s5= new Student(5,"S",18,'A');
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
		std.add(s5);
		for(Student s: std) {
			System.out.println(s);
		}
		

	}

}
