import java.util.Scanner;

public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,20,30,4};
 
		System.out.println("Enter the index of the array element you want to access");
         int number;
		  try

		  {
			number=  Integer.parseInt(args[0]);
		  System.out.println(	"The array element at index: "+number+" is "+arr[number]);
		  System.out.println("The array element successfully accessed");
		  }

		 
		  catch(ArrayIndexOutOfBoundsException aioe)

		  {

		   System.out.println(aioe.toString());

		  }

		  catch(Exception e)

		  {

		   e.printStackTrace();

		  }

		  

	}
}


