package sortingAlgo;

public class SelectionSort {

	private int[] performSort(int[] numbers) {
		for(int outer=0;outer < numbers.length;outer++) {
			int minPosition = outer; 
			for(int inner=outer;inner< numbers.length;inner++) {
				if(numbers[inner]<numbers[minPosition]) {
					minPosition=inner;
				}
			}
			int temp = numbers[minPosition];
			numbers[minPosition]=numbers[outer];
			numbers[outer]=temp;
		}
		return numbers;
	}
	
	public void sortingInfo(int[] numbers) {
		for(int num:performSort(numbers)) {
			System.out.print("\t"+num);
		}
	}
	
}
