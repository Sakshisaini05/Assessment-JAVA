import java.util.Scanner;

public class reversenumber {
	static int reverse;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
	/*	int number=sc.nextInt();
		
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println( reverse);  */
		 String number=sc.nextLine();
		 String ans="";
		 char ch[]=number.toCharArray();  
		 for(int i=ch.length-1;i>=0;i--) {
			 ans+=ch[i];
			 
		 }
		 System.out.print(ans);
		 

	}

}
