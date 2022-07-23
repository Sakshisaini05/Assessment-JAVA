package EveningSession;

public class Student extends Person {
	 public static int id;
	   
		public Student(int id){
			super(name,DOB);
			this.id=id;

		}

		public static int getId() {
			return id;
		}

		public static void setId(int id) {
			Student.id = id;
		}
		
}
