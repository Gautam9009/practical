package inheritance;
class Baseclass {
	int batch = 10;
}
class Subclass1 extends Baseclass{
	int electrical=100;
}
class Subclass2 extends Baseclass{
	int civil=200;
}
class Subclass3 extends Baseclass{
	int mechanical=300;
}
public class HierarchicalinEg3 {
	public static void main(String[] args) {
		Subclass1 batchObj1 = new Subclass1 ();
	    Subclass2 batchObj2 = new Subclass2 ();
	    Subclass3 batchObj3 = new Subclass3 ();
	    System.out.println(" batch* batchnum1 = "+ batchObj1.electrical);
	    System.out.println(" batch* batchnum2 = "+ batchObj2.civil);
	    System.out.println(" batch* batchnum3 = "+ batchObj3.mechanical);
	}

}
