package march_28_23_Thread;

public class Sleep_Method_Eg extends Thread {
	public void run() {
		for(int i = 0; i <=5; i++) {
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Sleep_Method_Eg t = new Sleep_Method_Eg();
		Sleep_Method_Eg t2 = new Sleep_Method_Eg();
		t.start();
		t2.start();
	}

}
