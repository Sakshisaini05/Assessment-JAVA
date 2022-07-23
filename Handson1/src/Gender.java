import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the gender:");
		String gender=sc.nextLine();
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		if(age>=1 && age<=58 && gender.equals("Female"))
		{
			System.out.println("The percentage of interest is 8.2%");
		}
		else if(age>=59 && age<=100 && gender.equals("Female"))
		{
           System.out.println("The percentage of interest is 9.2%");
		}
		else if(age>=1 &&age<=58 && gender.equals("Male")) {
			System.out.println("The percentage of interest is 8.4%");
		}
		else if(age>=59 && age<=100 && gender.equals("Male"))
		{
			System.out.println("The percentage of interest is 10.5%");
		}
	}

}
