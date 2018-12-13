package ds_pracs;

public class RunCustomizeDS {

	public static void main(String[] args) {
		MyStack stackObj=new MyStack();
		stackObj.push(2);
		stackObj.push(20);
		stackObj.push(200);
		stackObj.push(2000);
		
		System.out.println(stackObj.pop());
		System.out.println(stackObj.pop());
		System.out.println(stackObj.pop());
	}

}
