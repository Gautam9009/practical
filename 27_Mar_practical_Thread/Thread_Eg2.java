package march_27_Thread;
// directly we use thread class without extends
// with & without set name we can name the thread 
public class Thread_Eg2 {
	public void run() {
		System.out.println("Pinki");
	}
	public static void main(String[] args) {
		// creating an object of the thread class using the thread constructor
		Thread t = new Thread("Gautam");
		Thread t1 = new Thread();
//		Thread_Eg2 obj = new Thread_Eg2();
//		obj.run();
		t.start();
		t1.start();
		t1.setName("ANUDIP");
		System.out.println("Thread 0: "+t.getName());
		System.out.println("Thread 1: "+t.getName());
	}
}
