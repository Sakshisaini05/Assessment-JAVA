import java.util.Scanner;

public class PalindromeorNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		String number=sc.nextLine();
		String ans= "";
		 char ch[]=number.toCharArray();  
		   for(int i=ch.length-1;i>=0;i--){  
		        ans+=ch[i];  
		    }  
		if(ans.equals(number))
		{
			System.out.println("It is a palindrome");
		}
		
		else 
		{
			System.out.println("It  is not a palindrome");
		}
	}

}
