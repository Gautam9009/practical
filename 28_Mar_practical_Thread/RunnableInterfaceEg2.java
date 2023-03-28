package march_28_23_Thread;

public class RunnableInterfaceEg2 implements Runnable {
	public void run() {
		System.out.println("Thread running");
	}
	public static void main(String[] args) {
		// creating object of runnableInterfaceEg2
		Runnable ri = new RunnableInterfaceEg2();
		// creating object of thread class using thread (runnable ref var, string name)
		Thread t = new Thread (ri,"Gautam");
		t.start();
		String s = t.getName();
		System.out.println(s);		
	}
}
