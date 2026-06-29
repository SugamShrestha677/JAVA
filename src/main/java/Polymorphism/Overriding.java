package Polymorphism;

class Person{
	void display() {
		System.out.println("This is a Person");
	}
}
class Student extends Person{
	@Override
	void display() {
		System.out.println("This is a student");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		p.display();
		s.display();
	}
}
