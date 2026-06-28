//package Inheritence;
//
//public class Single {
//
//	class Teacher {
//		String subject = "Java";
//
//		void displaySubject() {
//			System.out.println("Subject: " + subject);
//		}
//	}
//		class HOD extends Teacher {
//			String department = "CS";
//
//			void displayDepartment() {
//				System.out.println("Department: " + department);
//			}
//		}
//
//		public static void main(String[] args) {
//			HOD h = new HOD();
//			h.displayDepartment();
//			h.displaySubject();
//
//		}
//	}
//











package Inheritence;

public class Single {

	class Teacher {
		String subject = "Java";

		void displaySubject() {
			System.out.println("Subject: " + subject);
		}
	}
		class HOD extends Teacher {
			String department = "CS";

			void displayDepartment() {
				System.out.println("Department: " + department);
			}
		}

		public static void main(String[] args) {
			Single s = new Single();
			HOD h = s.new HOD();
			h.displayDepartment();
			h.displaySubject();

		}
	}

