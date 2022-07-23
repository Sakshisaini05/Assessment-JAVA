package EveningSession;

public class Teacher extends Person {
	 public static double salary;
	   public static String  subject;
		public Teacher(double n,String d){
			
			super(name,DOB);
			this.salary=n;
			this.subject=d;

		}
		public static double getSalary() {
			return salary;
		}
		public static void setSalary(double salary) {
			Teacher.salary = salary;
		}
		public static String getSubject() {
			return subject;
		}
		public static void setSubject(String subject) {
			Teacher.subject = subject;
		}
	

}
