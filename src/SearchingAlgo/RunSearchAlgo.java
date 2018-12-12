package SearchingAlgo;

import java.util.Scanner;

import sortingAlgo.SelectionSort;

public class RunSearchAlgo {
	static int searchNum = 0;
	static int[] numbers = { 2, 3, 900, 565, 6, 7, 8, 9, 9, 23, 34, 0, -1, 455, 11, 567, 33, 67, 8, 99, 9, 9, -910, 56,
			856, 7, 7, 777, 987, 1100 };

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new SelectionSort().sortingInfo(numbers);
		Long startTime, endTime;
		System.out.println("Enter a Search Number from Array : ");
		searchNum = new Scanner(System.in).nextInt();

		System.out.println("***************** Start Binary Search ******************");
		startTime = System.currentTimeMillis();
		System.out.println("Logged Binary Search start time :" + startTime);
		new BinarySearch().preformSearch(new SelectionSort().performSort(numbers), searchNum);
		endTime = System.currentTimeMillis();
		System.out.println("Logged Binary Search end time :" + endTime);
		System.out.println("Total Time taken By Binary Search =>" + (endTime - startTime));
		System.out.println("***************** End Binary Search ******************");

	}

}
