import java.util.Scanner;

public class StringPalindromeOrNot {
	static String ans;
	public static void main(String[] args) {	
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		
		 char ch[]=s1.toCharArray();  
		   for(int i=ch.length-1;i>=0;i--){  
		        ans+=ch[i];  
		    }  
		if(ans.equals(s1))
		{
			System.out.println("It is a palindrome");
		}
		
		else 
		{
			System.out.println("It  is not a palindrome");
		}
	}

}
