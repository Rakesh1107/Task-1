package arraytasks;

import java.util.Arrays;
import java.util.HashSet;

public class CommonValueFinder {
	public static void findCommonValues(Integer[] array1, Integer[] array2) {
		HashSet<Integer> set = new HashSet<>(Arrays.asList(array2));
		String result = "";
		for(int temp: array1) {
			if(set.contains(temp)) {
				result += (temp + ", ");
				set.remove(temp);
			}
		}
		if(result.length() == 0) System.out.println("No common values found");
		else System.out.println("Common values are: " + result);
	}

	public static void findCommonValues(String[] array1, String[] array2) {
		HashSet<String> set = new HashSet<>(Arrays.asList(array2));
		String result = "";
		for(String temp: array1) {
			if(set.contains(temp)) {
				result += (temp + ", ");
				set.remove(temp);
			}
		}
		if(result.length() == 0) System.out.println("No common values found");
		else System.out.println("Common values are: " + result);
	}


}
