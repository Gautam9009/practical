package inheritance;
class AggregationEg {
	int Square(int r) {
		return r*r;
	}
}
public class Circle {
	AggregationEg ag;
	double pi = 3.14;
	double area(int radius) {
		ag = new AggregationEg();
		int psquare = ag.Square(radius);
		return pi*psquare;
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		double result = c.area(5);
		System.out.println("Area: "+result);
	}
}
