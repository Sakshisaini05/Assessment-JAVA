import java.util.Random;
import java.util.Scanner;

abstract class Compartment{
	public abstract String notice();
}
 class FirstClass extends Compartment{

	@Override
	public String notice() {
		String st="First Comaprtment";
		return st;
	}
	
}
 class Ladies extends Compartment{

	@Override
	public String notice() {
		String st="Ladies Comaprtment";
		return st;
	}
	
}
 class General extends Compartment{

	@Override
	public String notice() {
		String st="General Comaprtment";
		return st;
	}
	
}
 class Luggage extends Compartment{

	@Override
	public String notice() {
		String st="Luggage Comaprtment";
		return st;
	}
	
}

public class TestCompartment {

	public static void main(String[] args) {
	
Compartment[] c=new Compartment[10];
Scanner sc=new Scanner(System.in);

	 int n=0;

	 for(int i=0;i<10;i++) {

	 System.out.println("Enter a random Number 1-4: ");

	 n=sc.nextInt();

	 if(n==1) {

	  c[i]=new FirstClass();

	  System.out.println(c[i].notice());

	 }

	 else if(n==2) {

	  c[i]=new Ladies();

	  System.out.println(c[i].notice());

	 }

	 else if(n==3) {

	  c[i]=new General();

	  System.out.println(c[i].notice());

	 }

	 else if(n==4) {

	  c[i]=new Luggage();

	  System.out.println(c[i].notice());

	 }

	 else {

	  System.out.println("invalid");

	 }

	 }
	}

	}

