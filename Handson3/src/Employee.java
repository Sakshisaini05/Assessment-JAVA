
 class Employee extends Person{
	public static double annualSalary;
	public static int YOJ;
	String Insurance_no;
	public  Employee(double s,int d,String no,String name) {
		super(name);
		this.annualSalary=s;
		this.YOJ=d;
		this.Insurance_no=no;
	}
	
	public static double getAnnualSalary() {
		return annualSalary;
	}
	public static void setAnnualSalary(double annualSalary) {
		Employee.annualSalary = annualSalary;
	}
	public static int getYOJ() {
		return YOJ;
	}
	public static void setYOJ(int yOJ) {
		YOJ = yOJ;
	}
	public String getInsurance_no() {
		return Insurance_no;
	}
	public void setInsurance_no(String insurance_no) {
		Insurance_no = insurance_no;
	}
	


}
