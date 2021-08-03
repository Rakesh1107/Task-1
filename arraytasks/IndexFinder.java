package arraytasks;

public class IndexFinder {
	public static void findIndex(Integer[] array, int value) {
		int index = -1;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				index = i;
				break;
			}
		}
		if(index != -1) System.out.println("Element found at index " + index);
		else System.out.println("Element not found");
	}
}