package Employee_Managment;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	 int empId;
	 String empName="";
	 String email=""; 
	 String gender=""; 
	 float salary;
	public Employee(int empId, String empName, String email, String gender, float salary){
		super();
	this.empId=empId;
	this.empName=empName;
	this.email=email;
	this.gender=gender;
	this.salary=salary;
	
	}
	
	 public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String toString() {
		return ("Employee Id: "+empId+" Employee Name: "+empName+" Email id: "+email+" Gender "+gender+"  Salary: "+salary);
	}

	public void GetEmployeeDetails() {
			// TODO Auto-generated method stub
		 System.out.println("Employee Id: "+empId+" Employee Name: "+empName+" Email id: "+email+" Gender "+gender+"  Salary: "+salary);
	 }
}
class EmployeeDB {
	public static ArrayList<Employee>list=new ArrayList<>();
	public boolean addEmployee(Employee e) {
		System.out.println("Employee is added");
		return list.add(e);
	}
	public boolean deleteEmployee(int empId) {
		boolean ans=false;
		Iterator<Employee>it=list.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			if(e.getEmpId()==empId)
			{
				it.remove();
				System.out.println("Employee details removed");
				ans=true;
			}
		}
		return ans;
	}
	public String showPaySlip(int empId) {
		String ans="This "+empId+" does not exist";
         Iterator<Employee> it=list.iterator();	
		while(it.hasNext()) {
			Employee e=it.next();
			if(e.getEmpId()==empId)
			{
				ans=e.toString();
			}
		}
		return ans;
	}
}
public  class testEmployee {

	public static void main(String[] args) {
		Employee ob1=new Employee(12,"Sakshi","sakshisaini@gmail.com","Female",50000.0f);
		Employee ob2=new Employee(13,"Harsh","harshsharma@gmail.com","Male",54000.0f);
		Employee ob3=new Employee(14,"Aryan","aryankumar@gmail.com","Male",50400.0f);
		Employee ob4=new Employee(15,"Vishal","vishalkumar@gmail.com","Male",90000.0f);
		
	
		ob1. GetEmployeeDetails(); 
		ob2. GetEmployeeDetails(); 
		ob3. GetEmployeeDetails(); 
		ob4. GetEmployeeDetails(); 
		EmployeeDB empDB=new EmployeeDB();
		empDB.addEmployee(ob1);  
		empDB.addEmployee(ob2);  //(15,"Vishal","vishalkumar@gmail.com","Male",90000.0f);
		empDB.addEmployee(ob3);  
		empDB.addEmployee(ob4);  
		boolean flag=empDB.deleteEmployee(13);
		if(flag) {
			System.out.println("Employee details are getting removed......... ");
			empDB.deleteEmployee(13);
		}
		else
		{
			System.out.println("Employee details does not exist");
			System.out.println();
		}
		System.out.println("After removing: ");
		Iterator<Employee>it=EmployeeDB.list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		 flag= empDB.deleteEmployee(78);
		if(flag) {
			System.out.println("Employee details are getting removed......... ");
			 empDB.deleteEmployee(78);
		}
		else
		{
			System.out.println("Employee details does not exist");
			System.out.println();
		}
		
		
		while(it.hasNext())
		{System.out.println("After removing: ");
			System.out.println(it.next());
		}
		
       String ans= empDB.showPaySlip(14);
      System.out.println(ans);
      System.out.println();
	}

}

