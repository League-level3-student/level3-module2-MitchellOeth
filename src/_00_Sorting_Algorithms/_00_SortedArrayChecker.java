package _00_Sorting_Algorithms;

import java.util.function.BooleanSupplier;

public class _00_SortedArrayChecker {

	
	
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	public static boolean intArraySorted(int[] unsorted) {
		for (int i = unsorted[0]; i < unsorted.length - 1; i++) {
			if (unsorted[i] <= unsorted[i + 1]) {
				
			} else {
				return false;
			}
		}
		return true;
	}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	public static boolean doubleArraySorted(double[] sorted) {
		for (double i = sorted[0]; i < sorted.length-1; i++) {
			if (sorted[(int) i] <= sorted[(int)i + 1]) {
			
			}else {
			return false;
			}
		} return true;
		
		
	}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	public static boolean charArraySorted(char[] unsorted) {	
		for (char i = unsorted[0]; i < unsorted.length - 1;) {
			if (unsorted[i] > unsorted[i + 1]) {
								return false;
			} else {
				i++;
			}
		}
		return true;
	}

	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the  method)
	public static boolean stringArraySorted(String[] sorted) {
		for (int i = 0; i < sorted.length; i++) {
			if(sorted[i].compareTo(sorted[i+1])>0) {
				return false;
			}
		}
		return true;
	}

	
}
