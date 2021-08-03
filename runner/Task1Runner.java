package runner;

import arraytasks.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task1Runner {
	public static void main(String[] args) throws IOException {
		while(true) {
			BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter program number to execute: ");
			System.out.println("---------------------------------");

			int option = Integer.parseInt(inputReader.readLine());
			if(option == 0) {
				System.out.println("Closing Application");
				break;
			}

			else if(option == 7) {

				System.out.println("a. Integer Array\nb. String Array");
				char option2 = inputReader.readLine().charAt(0);

				System.out.println("Enter the length of array 1: ");
				int length1 = Integer.parseInt(inputReader.readLine());

				System.out.println("Enter the length of array 2: ");
				int length2 = Integer.parseInt(inputReader.readLine());

				if(option2 == 'a') {
					Integer[] array1 = new Integer[length1];
					Integer[] array2 = new Integer[length2];

					System.out.println("Enter the elements of array 1 as space-seperated integers: ");
					String input1 = inputReader.readLine();
					String[] inputs1 = input1.split(" ");

					for(int i = 0; i < length1; i++)
						array1[i] = Integer.parseInt(inputs1[i]);

					System.out.println("Enter the elements of array 2 as space-seperated integers: ");
					String input2 = inputReader.readLine();
					String[] inputs2 = input2.split(" ");

					for(int i = 0; i < length2; i++)
						array2[i] = Integer.parseInt(inputs2[i]);

					CommonValueFinder.findCommonValues(array1, array2);
				} 
				else if(option2 == 'b') {
					String[] arr1 = new String[length1];
					String[] arr2 = new String[length2];
					System.out.println("Enter the elements of array 1 ");
					for(int i = 0; i < length1; i++)
						arr1[i] = inputReader.readLine();
					System.out.println("Enter the elements of array 2: ");
					for(int i = 0; i < length2; i++)
						arr2[i] = inputReader.readLine();
					CommonValueFinder.findCommonValues(arr1, arr2);
				}
			} 
			else {
				System.out.println("Enter the length of array: ");
				int length = Integer.parseInt(inputReader.readLine());
				Integer[] array = new Integer[length];
				System.out.println("Enter the elements as space-seperated integers: ");
				String input = inputReader.readLine();
				String[] inputs = input.split(" ");
				for(int i = 0; i < length; i++)
					array[i] = Integer.parseInt(inputs[i]);
				int value, index;
				switch(option) {
					case 1:
						System.out.println("Enter the element to find index for: ");
						value = Integer.parseInt(inputReader.readLine());
						IndexFinder.findIndex(array, value);
						break;
					case 2:
						ArraySum.calculateSum(array);
						break;
					case 3:
						System.out.println("Enter the element to remove from array: ");
						value = Integer.parseInt(inputReader.readLine());
						ElementRemover.removeElement(array, value);
						break;
					case 4:
						System.out.println("Enter the index to insert at: ");
						index = Integer.parseInt(inputReader.readLine());
						System.out.println("Enter the value to insert: ");
						value = Integer.parseInt(inputReader.readLine());
						ElementAdder.addElement(array, index, value);
						break;
					case 5:
						System.out.println("Enter the element to check if present in array: ");
						value = Integer.parseInt(inputReader.readLine());
						ArrayChecker.checkArray(array, value);
						break;
					case 6:
						ExtremesFinder.findMaxMin(array);
						break;
					case 8:
						DuplicateRemover.removeDuplicates(array);
						break;
					case 9:
						EvenOddFinder.findEvenOdd(array);
						break;
					case 10:
						AverageFinder.calculateAverage(array);
						break;
					case 11:
						System.out.println("Enter the target value: ");
						int target = Integer.parseInt(inputReader.readLine());
						TargetSum.findElements(array, target);
						break;
					case 12:
						ArrayReverser.reverseArray(array);
						break;
					case 13:
						EvenOddSeparator.separateArray(array);
						break;
					case 14:
						ArraySorter.sortArray(array);
						break;
					case 15:
						LeadersFinder.findLeaders(array);
						break;
					default:
						System.out.println("Enter options in the range 1-15! ");
						break;
				} // end of switch
			} // end of else
			System.out.println("---------------------------------");
			System.out.println("Enter 0 to exit! or ");
		} // end of loop
	} // end of main
}
