package sortingAlgo;

public class QuickSort {

	public int[] performSort(int[] numbers) {
		return  quickSortRecursion(numbers,0,(numbers.length-1));
	}
	
	private static int partitionSort(int[] numbers,int lowerBound,int higerBound) {
		int pivotValue = numbers[(lowerBound+higerBound)/2];
		while(lowerBound <= higerBound ) {
			while(numbers[lowerBound] < pivotValue) {
				lowerBound++;
			}
			
			while(numbers[higerBound] > pivotValue) {
				higerBound--;
			}
			if(lowerBound <= higerBound) {
				int temp=numbers[lowerBound];
				numbers[lowerBound] = numbers[higerBound];
				numbers[higerBound] = temp;
				
				lowerBound++;
				higerBound--;
			}
		}
		return lowerBound;
	}
	
	private static int[] quickSortRecursion(int[] numbers,int lowerBound, int higherBound) {
		int pivot = partitionSort(numbers,lowerBound,higherBound);
		if(lowerBound < (pivot-1)) {
			quickSortRecursion(numbers, lowerBound, (pivot-1));
		}else if(pivot < higherBound){
			quickSortRecursion(numbers,pivot, higherBound);
		}
		return numbers;
	}
	
	public void sortingInfo(int[] numbers) {
		System.out.println("***************** QUICK SORT ALGO OUTPUT ***************** \n");
		for(int num:performSort(numbers)) {
			System.out.print(num+"\t");
		}
	}
	
}
