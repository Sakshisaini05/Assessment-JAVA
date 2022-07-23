import java.util.Scanner;

public class CopiesOfFirstTwoChar {
static String s2;
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char[] ch=s1.toCharArray();
		s2=s1.substring(0,2);
		String ans="";
	   for(int i=0;i<s1.length();i++) {
		   ans+=s2;
	   }
	   System.out.println(ans);
	}

}
