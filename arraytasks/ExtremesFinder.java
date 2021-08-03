package arraytasks;

import java.util.Arrays;

public class ExtremesFinder {
	public static void findMaxMin(Integer[] array) {
		Arrays.sort(array);
		System.out.println("Minimum: " + array[0]);
		System.out.println("Maximum: " + array[array.length-1]);
	}
}