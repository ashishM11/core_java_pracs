package sortingAlgo;

public class BubbleSort {
	public int[] performSort(int[] numbers) {
		for(int outer=0;outer<(numbers.length-1);outer++) {
			for(int inner=0;inner<(numbers.length-1);inner++) {
				if(numbers[inner]>numbers[inner+1]) {
					int temp = numbers[inner];
					numbers[inner]=numbers[inner+1];
					numbers[inner+1]=temp;
				}
			}
		}
		return numbers;
	}

	public void sortingInfo(int[] numbers) {
		for (int num : performSort(numbers)) {
			System.out.print("\t" + num);
		}
	}
}
