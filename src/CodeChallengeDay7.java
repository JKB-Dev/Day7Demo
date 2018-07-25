import java.util.Arrays;

/*

 * Given an array of ints length 3, 

 * figure out which is larger, 

 * the first or last element in the array, 

 * and set all the other elements to be that value. 

 * Return the changed array.

 */

public class CodeChallengeDay7 {


	public static void main(String[] args) {

		int[] arr = {98,43,22};

		
		if(arr[0] > arr[arr.length -1] ) {
			arr[1] = arr[0];
			arr[2] = arr[0];
		}
		else {
			arr[0] = arr [2];
			arr[1] = arr [2];
			
		}
		System.out.println(Arrays.toString(arr));
		
	}



	// your method should start here, 

	// and should be returning an int[]

}

//Message Input