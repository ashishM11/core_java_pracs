package threads_prac;

public class ThreadExample3 {
	public static void main(String[] args) throws InterruptedException {
		Sequence seq=new Sequence();
		Worker w1=new Worker(seq);
		Worker w2=new Worker(seq);
		w1.setName("Worker 1");
		w2.setName("Worker 2");
		w1.start();
		w1.join();
		w2.start();
	}
}

class Worker extends Thread {
	Sequence seq = null;

	public Worker(Sequence seq) {
		this.seq = seq;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Sequence Value " + seq.getValue() + " from Thread "+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}