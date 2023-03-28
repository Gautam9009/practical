package march_28_23_Thread;

public class Sleep_Method extends Thread {
	public static void main(String[] args) {
		try {
			for(int i=0;i<=5;i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}			
		}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
	}
}
