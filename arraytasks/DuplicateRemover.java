package arraytasks;

import java.util.ArrayList;

public class DuplicateRemover {
	public static void removeDuplicates(Integer[] array) {
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		for(int temp: array) {
			if(!list.contains(temp)) 
				list.add(temp);
			else 
				count++;
		}
		if(count == 0) System.out.println("No duplicate values found: " + list);
		else System.out.println("Duplicate values removed: " + list);
	}
}