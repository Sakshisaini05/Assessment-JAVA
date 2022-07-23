import java.util.Scanner;

public class primeornot {
static int flag;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		
		if(number==0||number==1)
			System.out.println("Not a prime Number");
		else 
		{
			 for (int i = 2; i < number/2; i++)
			 {     if (number % i == 0)
		              flag=1;
			          break;}
		  
		}
		if(flag==1)
			System.out.println("It is not a prime number");
		else {
			System.out.println("It is prime number");
		}

	}

}
