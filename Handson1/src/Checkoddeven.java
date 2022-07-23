import java.util.Scanner;

public class Checkoddeven {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number:");
	   int i=sc.nextInt();
	   if(i%2==0)
		   System.out.println("Even number");
	   else 
		   System.out.println("Odd Number");
	}

}
