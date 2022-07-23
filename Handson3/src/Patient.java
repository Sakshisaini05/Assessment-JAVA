
public class Patient {
	static String Pname;
	static double result;
	public static void BMI(String name,double height,double weight)
	{
		Pname=name;
		 result=weight/height;
	}
	static void putdetails() {
		
		System.out.println(Pname+" "+"BMI is: "+result);
	}
	public static void main(String[] args) {
		Patient p=new Patient();
		p.BMI("Ram", 6, 67);
		p.putdetails();

	}

}
