package arraytasks;

public class EvenOddFinder {
	public static void findEvenOdd(Integer[] array) {
		int even = 0, odd = 0;
		for(int temp: array) {
			if(temp % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Number of even integers: " + even);
		System.out.println("Number of odd integers: " + odd);
	}
}