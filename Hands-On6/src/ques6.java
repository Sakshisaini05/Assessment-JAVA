import java.util.Scanner;

public class ques6 {

	public static void main(String[] args)throws ValuesOutOfRangeException, NegativeValueException{
		try {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the name of 1st student: ");
			String name1=sc.nextLine();
			System.out.println("Enter the name of 2nd student: ");
			String name2=sc.nextLine();
			
			System.out.println("Enter the marks of first subject: ");
			int a1=sc.nextInt();
			System.out.println("Enter the marks of second subject: "); 
			int b1=sc.nextInt();
			System.out.println("Enter the marks of third subject: ");
			int c1=sc.nextInt();
			
			
				if(a1<0||b1<0||c1<0) {
					throw  new NegativeValueException();}
				if(a1>100||b1>100||c1>100)
					{throw new ValuesOutOfRangeException();}
				
				
				System.out.println("Enter the marks of first subject: ");
				int a2=sc.nextInt();
				System.out.println("Enter the marks of second subject: "); 
				int b2=sc.nextInt();
				System.out.println("Enter the marks of third subject: ");
				int c2=sc.nextInt();
				
				
					if(a2<0||b2<0||c2<0) {
						throw  new NegativeValueException();}
					if(a2>100||b2>100||c2>100)
						{throw new ValuesOutOfRangeException();}
			double avg1=(double)((a1+b1+c1)/3);
			double avg2=(double)((a2+b2+c2)/3);
			System.out.println("Average marks of 1st student is: "+avg1);
			System.out.println("Average marks of 2nd student is: "+avg2);
			sc.close();
				
		}
		  catch(ArithmeticException ae)

		  {

		   System.out.println(" ArithmeticException");

		  }

	}

}
