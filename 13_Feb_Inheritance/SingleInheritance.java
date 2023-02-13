package inheritance;

	class SIParent {
		void show(){
			System.out.println("Show the Details");
		}
		}
		class SIChild extends SIParent {
			void display() {
				System.out.println("Display the Result");
			}
		}
		public class SingleInheritance {
			public static void main(String[] args) {
				SIChild child = new SIChild();
				child.display();
				child.show();
			}
		}

