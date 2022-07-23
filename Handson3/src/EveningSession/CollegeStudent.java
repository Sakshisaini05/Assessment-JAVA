package EveningSession;

public class CollegeStudent extends Student {
public static String collegename;
public static int year;
	public CollegeStudent(int id,String c,int yr) {
		super(id);
		this.collegename=c;
		this.year=yr;
	}
	public static void main(String[] args) {
		CollegeStudent ob=new CollegeStudent(13,"Chandigarh University",4);
		Person p=new Person("Sakshi","30Jan2001");
		 System.out.println("Person name:  "+ob.name);
		 System.out.println("Person DOB: "+ob.DOB);
		 Teacher t=new Teacher(200000.02,"English");
		 System.out.println("Teacher Salary: "+t.salary);
		 System.out.println("Teacher Subject: "+t.subject);
		  System.out.println("Student Id is: "+ob.id);
		  System.out.println("College Name is: "+ob.collegename);
		  System.out.println("College Year is: "+ob.year);
	}


}
