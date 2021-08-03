package arraytasks;

public class ArraySum {
	public static void calculateSum(Integer[] array) {
		int sum = 0;

		for(int temp: array)
			sum+=temp;

		System.out.println("Sum of array elements: " + sum);
	}
}