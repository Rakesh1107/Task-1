package arraytasks;

import java.util.Arrays;

public class EvenOddSeparator {

	public static void separateArray(Integer[] array) {
		Integer[] resultArray = new Integer[array.length];

		int start = 0, end = array.length-1;

		for (Integer integer : array) {
			if (integer % 2 == 0) {
				resultArray[start] = integer;
				start++;
			} else {
				resultArray[end] = integer;
				end--;
			}
		}

		System.out.println("Even Odd Separated Array: " + Arrays.asList(resultArray));
	}
}