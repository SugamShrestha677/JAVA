package Interface;

interface CollegeRules{
	void attendClass();
	void submitAssignment();
}

class Student implements CollegeRules{
	public void attendClass() {
		System.out.println("Student attends class");
	}
	public void submitAssignment() {
		System.out.println("Student submits Assignment");
	}
}

public class Interface {

	public static void main(String[] args) {
		Student s = new Student();
		s.attendClass();
		s.submitAssignment();
		

	}

}
