import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		
		// parallel arrays: associated lists of different data types -- same length, matching indices
		String[] names = {"Alex", "Brandon", "Michelle"};
		int[] jerseyNums = {22, 81, 1};
		
		for (int i = 0; i < names.length; i++ ) {
			//System.out.println("Name: " + names[i] + ", Jersey #" + jerseyNums[i]);
		}
		
		
		
		int[] arr = {6, 54, 3, 22, 1};
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr)); // void method, sorts by value
		
		
		// fill is an overloaded method
		Arrays.fill(arr, 100);  // fills whole array with new value
		//System.out.println(Arrays.toString(arr)); 
		
		Arrays.fill(arr, 1, 3, 202); // fills a range in the array (2nd index value not inclusive)
		System.out.println(Arrays.toString(arr)); 
		
		int[] arr2 = {100, 202, 202, 100, 100};
		System.out.println(Arrays.equals(arr, arr2)); // returns boolean
		
		int[] arr4 = {3, 4, 5, 6};
		int[] arr5 = arr4; // since reference type, these are now two names for the same location
		System.out.println("Array 4: " + Arrays.toString(arr4));
		System.out.println("Array 5: " + Arrays.toString(arr5));
		arr5[2] = 160;
		System.out.println("Array 4: " + Arrays.toString(arr4));	// a change made to one
		System.out.println("Array 5: " + Arrays.toString(arr5)); // changes both, NOT a copy
		
		int[] arr6 = Arrays.copyOf(arr4, arr4.length); // makes a copy 
		System.out.println("Array 6: " + Arrays.toString(arr6));
		arr6[2] = 147;
		System.out.println("Array 6: " + Arrays.toString(arr6));
		
	}
	

}
