package SearchingAlgo;

public class BinarySearch {

	/*
	 * 1. Binary Search is the process of searching an element from sorted array by repeatedly dividing
	 * the search interval in half.
	 * 
	 * 2. Binary Search is faster than the Linear Search.
	 * 
	 * 3. Although Binary Search is very optimized way of searching a particular element 
	 * but the array must be sorted on which you want to perform the search process.
	 * 
	 * 4. If array is not sorted in Advance then we have to perform sorting first and then only
	 * we can perform binary search on that.
	 * 
	 */

	public void preformSearch(int[] numbers,int searchNum) {
		
		int lowerIndex = 0;
		int higerindex = (numbers.length-1);
		int middleIndex = (lowerIndex+higerindex)/2;
		
		while(lowerIndex<=higerindex) {
			if(numbers[middleIndex]==searchNum) {
				System.out.println("Item found at "+ middleIndex +" index.");
				break;
			}else if(numbers[middleIndex]<searchNum) {
				lowerIndex =middleIndex+1;
			}else {
				higerindex =middleIndex - 1;
			}
			middleIndex = (lowerIndex+higerindex)/2;
		}
		
	}

}
