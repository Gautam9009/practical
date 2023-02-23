package overridding;

class Exam {  // parent class
	int marks() {  // marks is a method of parent
		return 0;
	}
}
class comp extends Exam {  // child class 1 computer
	int marks() {  // same name method as per parent
		return 80;
	}
}
class math extends Exam {  // child class 2 computer
	int marks() {
		return 70;
	}
}
class science extends Exam {  // child class 3 computer
	int marks() {
		return 60;
	}
}
class eng extends Exam {  // child class 4 computer
	int marks() {
		return 90;
	}
}
public class overriddingEg1 {
	public static void main(String[] args) {
		Exam exam;
		exam = new comp();
		System.out.println(exam.marks());
		exam = new math();
		System.out.println(exam.marks());
		exam = new science();
		System.out.println(exam.marks());
		exam = new eng();
		System.out.println(exam.marks());
	}
}
