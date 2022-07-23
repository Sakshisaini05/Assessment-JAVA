import java.util.Scanner;

public class sumofalldigits {
 static	int sum;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		String number=sc.nextLine();
		
		
		for(int i=0;i<number.length();i++) {
			 sum = sum + number.charAt(i) - 48;
		}
		System.out.println(sum);
	}

}
