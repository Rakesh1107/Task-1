package arraytasks;

import java.util.Arrays;

public class ArraySorter {
	public static void sortArray(Integer[] array) {
		boolean sorted;
		for(int i = 0; i < array.length-1; i++) {
			sorted = true;
			for(int j = 0; j < array.length-1-i; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					sorted = false;
				}
			}
			if(sorted) break;
		}
		System.out.println("Sorted Array: " + Arrays.asList(array));
	}
}
