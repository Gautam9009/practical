package march_28_23_Thread;

public class ThreadTest1 extends Thread {
	public void run() {		
		System.out.println("ACBACBACBACBACABCABCABCABCABCB");
	}
	public static void main(String[] args) {
		ThreadTest1 t = new ThreadTest1();
		t.start();
	}
}
