import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[4];  // arr is name. must be declared with size. all values initalized 0 
		
		arr[0] = 55;
		
		System.out.println(Arrays.toString(arr)); // directly printing arr gives location
		
		arr[2] = 77;
		System.out.println(arr[2]);
		
		for (int i = 0; i < arr.length; i++) {    //array.length is a field, so no ()
			System.out.println(arr[i]);
		}
		
		String[] arr2 = {"name", "other name", "another name", "another other name"};
		
		final int SIZE = 105; // size is constant
		double[] arr3[];
		
		double[] arr4;
		arr4 = new double[2]; // size can be assigned separately
		
		double[] arr5 = {4.5, 6.8, 9.9, 10.7};  // or by assigning elements
		
		// user-assigned size:
		System.out.println("Please enter a number");
		int userNum = scan.nextInt();
		
		boolean arr6[] = new boolean[userNum]; // brackets can be after array name
		System.out.println(arr6.length);
		
		//enhanced for loop aka for each, doesn't show "i" or index position
		
		for (boolean b : arr6) {      // data type : array being looped through
			System.out.println(b);
		}
		
		
		int[] nums = {6, 7, 23, 44, 8};
		System.out.println(sumArray(nums));
		
	}
	
	public static int sumArray(int[] arr) {
		int sum = 0;
		
		for (int temp : arr) {
			sum += temp;
		}
		
		
		return sum;
	}

}
