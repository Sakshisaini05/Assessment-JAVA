import java.util.Scanner;

public class Half {
 static String s2="";
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		if(s1.length()%2==0)
		{
			for(int i=0;i<s1.length()/2;i++)
			{
				s2+=s1.charAt(i);
			}
			System.out.println(s2);
			
		}
		else 
		{
			System.out.println("NULL");
		}

	}

}
