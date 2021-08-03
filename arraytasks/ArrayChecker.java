package arraytasks;

public class ArrayChecker {
	public static void checkArray(Integer[] array, int value) {
		boolean found = false;
		for(int temp: array) {
			if(temp == value) {
				found = true;
				break;
			}
		}
		if(found) 
			System.out.println("Value present in the array");
		else 
			System.out.println("Value not present in the array");
	}
}