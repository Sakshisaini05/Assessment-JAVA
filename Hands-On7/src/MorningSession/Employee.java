package MorningSession;

public class Employee {
int eno;
String ename;
double sal;
public Employee(String name,int id,double sal) {
	this.eno=id;
	this.ename=name;
	this.sal=sal;
//	System.out.println("id: "+id+" name: "+name+" Salary: "+sal);
}
public String toString(){
	return "Employee Data:"
			+ "Employee Id: "+eno+" name: "+ename+" Salary: "+sal;
}

}
