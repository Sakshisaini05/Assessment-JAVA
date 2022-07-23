import java.util.Scanner;

public class checknumber {
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number:");

   int i=sc.nextInt();
   if(i>0)
   {
	   System.out.println("Positive number");
	}
   else if(i<0)
   {
	   System.out.println("Negative Number");
   }
   else
   {
	   System.out.println("Zero");
   }
	   
}
}
