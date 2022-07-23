import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		

		 int a=Integer.parseInt(str);
       
		  try

		  {

		   System.out.println("Square of"+" "+a +"  is "+a*a);
          System.out.println("The work has been done successfully");
		   
		  }

		  catch(ArithmeticException ae)

		  {

		   System.out.println("Entered input is not a valid format for an integer.");

		  }

		  

		  }
	}


