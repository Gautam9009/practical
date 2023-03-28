package march_28_23_Thread;

public class Runmethod extends Thread {
	public void run() {
		System.out.println("Thread Activated");
	}
	public static void main(String[] args) {
		Runmethod r1 = new Runmethod();
		r1.run();
		r1.setName("Gautam");
		String s = r1.getName();
		System.out.println(s);
	}
}
