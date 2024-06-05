package collection;

import java.util.HashSet;

public class HashsetImpl {

	public static void main(String[] args) {
		HashSet<String> set1=new HashSet<String>();
		set1.add("Banana");
		set1.add("Orange");
		set1.add("Mango");
		set1.add("Apple");
		System.out.println("Set items are "+set1);
		int size = set1.size();
		System.out.println("Size is "+size);
		boolean b = set1.contains("Apple");
		System.out.println("Set contain apple "+b);
		boolean b1 = set1.remove("Orange");
		System.out.println(set1);
		System.out.println(set1.size());

	}

}
