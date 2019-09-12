package practice01;

public class PracticeArraysTests {
	public static void main(String[] args) {
	// Create an object to hold an array
	int[] anArray = new int[5];
	
	anArray[0] = 1;
	anArray[1] = 2;
	anArray[2] = 3;
	anArray[3] = 4;
	anArray[4] = 5;
	
	int minValue = PracticeArrays.findMinimumValueInArray(anArray);
	System.out.println(minValue);

	// Create Practice Arrays
	Test n = new Test(5);

	}
	
}