import java.util.Scanner;

public class Concatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		StringBuffer str1=new StringBuffer();
		String[] str2=s1.split(",");
		str1.append(str2[0]);
		
	}

}
