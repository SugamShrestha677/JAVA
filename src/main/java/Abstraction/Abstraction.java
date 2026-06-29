package Abstraction;


abstract class Person{
	abstract void work();
}

class Student extends Person{
	void work() {
		System.out.println("Student Studies");
	}
}

class Teacher extends Person{
	void work() {
		System.out.println("Teacher teaches");
	}
}


public class Abstraction {

	public static void main(String[] args) {
		Person p1 = new Teacher();
		Person p2 = new Student();
		p1.work();
		p2.work();
		
	}

}
