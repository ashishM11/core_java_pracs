package sortingAlgo;

import java.util.Scanner;

public class RunSortingApp {

	static int[] numbers = { 34, 6, 7, 23, 89, 0, 12, 34, -1, 6 };

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Choose Sorting Algorithm type:");
		String[] sortingAlgo = { "Bubble", "Selection", "Insertion", "Quick", "Merge" };
		int num = 1;
		for (String algo : sortingAlgo) {
			System.out.println(num + ". " + algo + " Sort Algorithm");
			num = num + 1;
		}
		System.out.println("-------- Enter Number for Sorting Algo ----------\n");
		switch (new Scanner(System.in).nextInt()) {
		case 1:

			break;
		case 2:
			new SelectionSort().sortingInfo(numbers);
			break;
		case 3:
			new InsertionSort().sortingInfo(numbers);
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			break;
		}
	}

}
