package anudipjava;
import java.util.*;

public class ArrayNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//arrays to store even and odd numbers
		int arr [] = new int [20];
		int even[];
		int odd[];
		//count the number of even and odd numbers
		int evenCount = 0;
		int oddCount = 0;
		
		// Accept 20 numbers from the user and store them in the array
		System.out.println("Enter 20 Numbers");
		for (int i =0;i<20;i++) {
			arr[i] = sc.nextInt();
			if (arr[i]%2 == 0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}

        // Initialize even and odd arrays with appropriate sizes
		even = new int [evenCount];
		odd = new int [oddCount];

        // Initialize even and odd arrays with appropriate sizes
		int evenIndex = 0;
		int oddIndex = 0;
		for(int i =0;i<20;i++) {
			if(arr[i]%2==0) {
				even[evenIndex++]=arr[i];
			}else {
				odd[oddIndex++]=arr[i];
			}
		}
		  // Print the elements of the even array
		System.out.println("Even numbers:");
        for (int num : even) {
            System.out.print(num + " ");
        }
        // Print the elements of the even array
        System.out.println();
        System.out.println("Odd numbers:");
        for (int num : odd) {
            System.out.print(num + " ");
        }

        sc.close();
	}

}
