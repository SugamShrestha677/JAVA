package Encapsulation;

public class Student {
	private int marks;
	public void setMarks(int marks) {
		if (marks >= 0 && marks <=100) {
			this.marks = marks;
		} 
		else {
			System.out.println("Invalid Marks");
		}
	}
	
	public int getMarks() {
		return marks;
	}
	
	

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setMarks(170);
		System.out.println("Marks: "+ s1.getMarks());

	}

}
