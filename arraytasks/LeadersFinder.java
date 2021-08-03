package arraytasks;

public class LeadersFinder {
	public static void findLeaders(Integer[] array) {

		for(int i = 0; i < array.length-1; i++) {
			boolean leader = true;

			for(int j = i; j < array.length; j++) {
				if(array[i] < array[j]) {
					leader = false;
					break;
				}
			}

			if(leader) System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}