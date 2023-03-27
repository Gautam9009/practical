package march_27_Thread;

public class Thread_Eg3 extends Thread {
	public void run() {
		for (int i = 0; i<5; i++) {
			try {
				Thread.sleep(1800);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Thread_Eg3 t = new Thread_Eg3();
		Thread_Eg3 t1 = new Thread_Eg3();
		Thread_Eg3 t2 = new Thread_Eg3();
//		t.run();
//		t1.run();
//		t2.run();
//	}
//}
	t.start();
	try {
		t.join();
	}
	catch (InterruptedException e) {
		System.out.println(e);
	}
	try {
		t1.join();
	}
	catch (InterruptedException e) {
		System.out.println(e);
	}
	t2.start();  
}
}

