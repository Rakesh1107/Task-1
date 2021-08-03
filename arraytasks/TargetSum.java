package arraytasks;

public class TargetSum {
	public static void findElements(Integer[] array, int target) {
		boolean found = false;
		for(int i = 0; i < array.length-1; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] + array[j] == target) {
					System.out.println("The values are at index " + i + ", " + j);
					found = true;
					break;
				}
			}
		}
		if(!found) System.out.println("No such pairs possible");
	}
}