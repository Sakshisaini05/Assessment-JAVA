import java.util.Scanner;

public class removex {
static String ans,temp;
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		 if(s1.charAt(0)=='x'&& s1.charAt(s1.length()-1)=='x')
		 {
			 System.out.println(s1.substring(1,s1.length()-1));
		 }
		 else {
			 System.out.println(s1);
		 }
          
	}

}
