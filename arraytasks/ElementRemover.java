package arraytasks;

import java.util.Arrays;
import java.util.ArrayList;

public class ElementRemover {
	public static void removeElement(Integer[] array, int toRemove) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		if(list.contains(toRemove)) {
			list.remove((Object)toRemove);
			System.out.println("Element removed: " + list);
		} else
			System.out.println("Element not found");
	}
}