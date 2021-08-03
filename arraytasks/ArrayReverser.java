package arraytasks;

import java.util.Arrays;

public class ArrayReverser {
	public static void reverseArray(Integer[] array) {
		int start = 0, end = array.length-1;
		while(start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}		
		System.out.println("Reverse Array: " + Arrays.asList(array));
	}
}