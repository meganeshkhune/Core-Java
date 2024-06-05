package collection;
import java.util.ArrayList;

public class ArrayVsCollection {

	public static void main(String[] args) {
		String[] arr = {"w","e","l","c","o","m","e"};
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
		System.out.println();
		//arraylist of strings
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("w");
		arraylist.add("e");
		arraylist.add("l");
		arraylist.add("c");
		arraylist.add("o");
		arraylist.add("m");
		arraylist.add("e");
		System.out.println(arraylist);

	}

}
