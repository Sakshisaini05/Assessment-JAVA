import java.util.Scanner;

public class Removeaestric {
static String ans="";
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
        for(int i=0;i<s1.length()-1;i++) {
        	if(s1.charAt(i)=='*')
        	{
        		ans+=ans.substring(0,i-1);
        	}
        	else
        	{
        		ans+=s1.charAt(i);
        	}
        }
        System.out.println(ans);
	}

}
