package threads_prac;

public class Sequence {

	private int value = 0;
	
	public synchronized int getValue() {
		value = value +1;
		return value;
	}
}
