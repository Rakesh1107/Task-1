package arraytasks;

import java.util.Arrays;

public class AverageFinder {
	public static void calculateAverage(Integer[] array) {
		float length = array.length;
		float sum = 0;
		Arrays.sort(array);

		for(int temp: array)
			sum+=temp;

		sum = sum - (array[0] + array[(int)length-1]);
		System.out.println("Average: " + sum/length);
	}
}