package SearchingAlgo;

public class LinearSearch {
	public void preformSearch(int[] numbers, int searchNum) {
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==searchNum) {
				System.out.println("Number found at "+i+" position in array");
				break;
			}
		}
			
	}

}
