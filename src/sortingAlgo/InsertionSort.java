package sortingAlgo;

public class InsertionSort {

	public int[] performSort(int[] numbers) {
		for(int outer=1;outer<numbers.length;outer++) {
			for(int inner=outer; inner > 0;inner--) {
				if(numbers[inner]<numbers[inner-1]) {
					int temp = numbers[inner];
					numbers[inner]=numbers[inner-1];
					numbers[inner-1]=temp;
					continue;
				}
			}
		}
		return numbers;
	}
	
	public void sortingInfo(int[] numbers) {
		for(int num:performSort(numbers)) {
			System.out.print("\t"+num);
		}
	}

}
