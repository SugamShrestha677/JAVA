package Inheritence;

class Person{
	String college = "PCPS";
}

class Student extends Person{
	void showStudent() {
		System.out.println("I am student of: " +college );
	}
}

class Teacher extends Person{
	void showTeacher() {
		System.out.println("I am a teacher of: " +college);
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		Student s = new Student();
		s.showStudent();
		Teacher t = new Teacher();
		t.showTeacher();
		
	}

}
