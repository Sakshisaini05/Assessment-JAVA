import java.util.Scanner;

public class mergeTwoString {
static String ans="";
	public static void main(String[] args) {
		System.out.println("Enter first string: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println("Enter second string: ");
		String s2=sc.next();
		if(s1.length()>s2.length()) {
				ans+=s2;
				ans+=s1;
				ans+=s2;
			}
		else 
		{
			ans+=s1;
			ans+=s2;
			ans+=s1;
		}
		System.out.println(ans);	
		
	}

}
