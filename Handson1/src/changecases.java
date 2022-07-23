import java.util.Scanner;

public class changecases {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character:");
		char c=sc.next().charAt(0);
		
		if (c >= 'a' && c <= 'z')
		{
            char ch = (char) (c - 32);
            System.out.print(c+"->"+ch);
		} 
        else if (c>= 'A' && c<= 'Z')
        {
            char ch = (char)(c + 32);
            System.out.print(c);
            System.out.print("->");
            System.out.print(ch);
        }
		}    
	}

