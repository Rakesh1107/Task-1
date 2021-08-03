package arraytasks;

import java.util.Arrays;
import java.util.ArrayList;

public class ElementAdder {
	public static void addElement(Integer[] array, int index, int value) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		list.add(index, value);
		System.out.println(value + " added at index " + index + ": " + list);
	}
}