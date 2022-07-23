import java.util.Scanner;

public class Checkcharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character:");
		char c=sc.next().charAt(0);
		if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		{
			System.out.println(c + " is a alphabet");
		}
		else if(Character.isDigit(c)) {
			System.out.println(c + " is a digit");
		}
		else {
			System.out.println(c + " is a special Character");
		}
	}
}
