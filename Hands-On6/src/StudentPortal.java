import java.util.Scanner;

public class StudentPortal {


static void registerUser(String username,String userCountry) throws InvalidCountryException {

	if(userCountry.contentEquals("India")) 
	{System.out.println("User registration done successfully");
	}
	else 	
	{
		throw new InvalidCountryException();
	}
	

}
	public static void main(String[] args)throws InvalidCountryException {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the country name: ");
			String country=sc.nextLine();
			System.out.println("Enter the name: ");
			String name=sc.nextLine();
			registerUser(name,country);
	}

}
