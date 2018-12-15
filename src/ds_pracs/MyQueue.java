package ds_pracs;

public class MyQueue {

	private String[] queueArr;
	private int queueSize = 0;
	private int totalElements = 0;
	private int front = 0;
	private int rear = 0;

	public MyQueue() {
		super();
		queueSize = 16;
		totalElements = 0;
		front = 0;
		rear = 0;
		queueArr = new String[queueSize];
	}

	public MyQueue(int size) {
		this.queueSize = size;
		totalElements = 0;
		front = 0;
		rear = 0;
		queueArr = new String[this.queueSize];
	}

	public boolean isQueueEmpty() {
		return (totalElements == 0);
	}

	public boolean isQueueFull() {
		return (totalElements == queueSize);
	}

	public boolean enqueue(String item) {
		if (!isQueueFull()) {
			totalElements++;
			queueArr[rear] = item;
			rear++;
			return true;
		} else {
			return false;
		}
	}

	public String dequeue() {
		String item = queueArr[front];
		totalElements--;
		front++;
		return item;
	}

}
