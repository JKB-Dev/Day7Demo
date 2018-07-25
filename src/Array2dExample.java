
public class Array2dExample {

	public static void main(String[] args) {

		int[][] arr = new int[3][3]; // only row count required to initialize

		int[][] arr2 = { { 3, 3, 3, 4 }, { 6, 5, 5, 7 }, { 7, 8, 8, 9 }, { 4, 3, 2, 2 } }; // can enter them like this
																							// for visual clarity
		// System.out.println(arr2[2][2]);

		for (int i = 0; i < arr2.length; i++) { // length is ROW length, rows first
			for (int j = 0; j < arr2[i].length; j++) { // arr2[i] gives column length
				System.out.println(i + "," + j + ": " + arr2[i][j]);
			}
		}
		
		// nested enhanced for loop

		int sum = 0;
		// enhanced for loop
		for (int[] row : arr2) { // loops through rows (they are arrays of columns)
			for (int columns : row) { // loops through columns (arrays of integers)
				sum += columns;
			}
		}
		System.out.println(sum);
		
		// jagged array example
		int[][] arr3 = new int[3][]; // creates array with 3 rows, unknown columns
		arr3[0] = new int[35];	// creates first row of 35 columns
		arr3[1] = new int[2];	// creates second row
		arr3[2] = new int[4];	// third row
		arr3[0][14] = 144;
		System.out.println(arr3[0][14]);
		
		
		
		
	}
}
