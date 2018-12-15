package sortingAlgo;

public class MergeSort {

	int[] tempArr;
	int length = 0;

	public int[] performSort(int[] numbers) {
		this.length = numbers.length;
		this.tempArr = new int[this.length];
		return sort(numbers);
	}

	private int[] sort(int[] numbers) {
		int lowerIndex = 0;
		int higerIdex = (numbers.length - 1);
		divideArray(lowerIndex, higerIdex, numbers);
		return numbers;
	}

	private void divideArray(int lowerIndex, int higerIndex, int[] numbers) {
		if (lowerIndex < higerIndex) {
			int middleIndex = (lowerIndex + (higerIndex - lowerIndex)) / 2;
			// this will sort left side of the Array.
			divideArray(lowerIndex, middleIndex, numbers);
			// this will sort right hand side of the Array.
			divideArray(middleIndex + 1, higerIndex, numbers);
			mergeArray(lowerIndex, middleIndex, higerIndex, numbers);
		}
	}

	private int[] mergeArray(int lowerIndex, int higerIndex, int middleIndex, int[] numbers) {
		for(int i=lowerIndex;i<higerIndex;i++) {
			tempArr[i]=numbers[i];
		}
		int tempLowerIndex = lowerIndex;
		int counter = lowerIndex;
		int tempMiddleIndex = middleIndex + 1;
		
		while(tempLowerIndex < middleIndex && tempMiddleIndex <= higerIndex) {
			if(tempArr[tempLowerIndex] <= tempArr[tempMiddleIndex]) {
				numbers[counter] = tempArr[tempLowerIndex];
				tempLowerIndex++;
			}else {
				numbers[counter] = tempArr[tempMiddleIndex];
				tempLowerIndex++;
			}
			counter++;
		}
		
		return numbers;
	}

	public void sortingInfo(int[] numbers) {
		for (int num : performSort(numbers)) {
			System.out.print("\t" + num);
		}
		System.out.println();
	}

}
