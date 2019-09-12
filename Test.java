package practice01;

public class Test {
	private double[] values;
	
	public Test(int len) {
		values = new values[len];
	}
	/**
	* Find the minimum value in the array
	* @param minArray the array to find the minimum value in
	* @return minimumValue the minimum value found
	*/
	public static int findMinimumValueInArray(int[] arr) {
		// Set minimum value to the first value in the array
		int minimumValue = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i] < minimumValue) {
			minimumValue = arr[i];
			}
		
			
		}
	return minimumValue;
	}
}