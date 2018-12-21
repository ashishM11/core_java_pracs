package threads_prac;

public class ThreadExample2 {

	public static void main(String[] args) {
		System.out.println("Starting Thread Example here");
		Task t1=new Task();
		t1.setName("Tread A");
		t1.start();
		
		Task t2=new Task();
		t2.setName("Tread B");
		t2.start();
		System.out.println("Ending Thread Example here");
	}

}

class Task extends Thread{
	
	@Override
	public void run(){
		super.run();
		for(int i=0;i<=50;i++) {
			System.out.println("Number :"+i+" Thread Name : "+Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
