import java.util.Scanner;

public class alphabeticalorder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Character:");
		char ch=sc.next().charAt(0);
		System.out.println("Enter the second Character:");
		char c=sc.next().charAt(0);
         if(ch>c) {
        	 System.out.print(c);
        	 System.out.print(",");
        	 System.out.print(ch);
        	 
         }
         else {System.out.print(ch);
         System.out.print(",");
         System.out.print(c);
         }
	}

}
