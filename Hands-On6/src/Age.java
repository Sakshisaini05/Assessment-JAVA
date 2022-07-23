import java.util.Scanner;

public class Age {

	public static void main(String[] args) throws ErrorMessage{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the name of a person: ");
       String name=sc.nextLine();
       System.out.println("Enter the age of a person: ");
       int age=sc.nextInt();
       if(age>=18&age<=60)
       {
    	   System.out.println("No error");
       }
       else {
    	   throw new ErrorMessage();
       }

	}

}
