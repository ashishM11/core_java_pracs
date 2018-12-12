package threads_prac;

public class ThreadExample1 implements Runnable {

	public static void main(String[] args) {
		Thread t1 =new Thread(new ThreadExample1());
		t1.setPriority(10);
		t1.setName("My 1st Thread");
		t1.start();
	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}
	}

}
