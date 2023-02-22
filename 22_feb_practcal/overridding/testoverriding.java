package overridding;

public class testoverriding {
	void run () {
		System.out.println("running mode on");
	}
}
class overrridding extends testoverriding {
	void run() {
		System.out.println("running mode OFF");
	}
	public static void main(String[] args) {
		overrridding a = new overrridding();
		a.run();
	}	
}
