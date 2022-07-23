import java.util.Scanner;

public class RemoveFirstAndLast {

	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=s1.substring(1,s1.length()-1);
		System.out.println(s2);

	}

}
