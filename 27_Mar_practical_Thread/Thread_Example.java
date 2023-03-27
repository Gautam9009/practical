package march_27_Thread;
// creating thread by extending thread class
class Thread_Example extends Thread {
	public void run() {
		System.out.println("I am Thread....Therad is running");
	}
	public static void main(String[] args) {
		Thread_Example t = new Thread_Example();
		t.start();  // move the thread to the active state
		t.setName("GAUTAM");
		String s = t.getName();
		System.out.println(s);
	}
}
