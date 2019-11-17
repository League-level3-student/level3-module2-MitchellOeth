package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	String[] b = {"apple", "banana", "carrot", "grape", "strawberry"};
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		_00_LinearSearch.linearSearch(b, "grape");
		assertEquals(3, "grape");
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		_01_BinarySearch.binarySearch(a, 1, 9, 5);
		assertEquals(a[4], 5);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		_02_InterpolationSearch.interpolationSearch(a, 5);
		assertEquals(a[4], 5);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		_03_ExponentialSearch.exponentialSearch(a, 5);
		assertEquals(a[4], 5);
	}
}
