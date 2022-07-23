
public class MathOperation {

	public static void main(String[] args) {
	
	
		int arr[]=new int[args.length];
		
		int sum=0,avg=0;
		 try

		  {
			 for(int i=0;i<args.length;i++) {
				 arr[i]= Integer.parseInt(args[i]);
				 sum+=arr[i];
			 }
			 avg=sum/args.length;		 
			
		  System.out.println(	"The average is : "+avg);
		 
		  }
		 catch(ArithmeticException ae)

		  {

		  System.out.println("arithmetic exception");

		  }
		 
		  catch(NumberFormatException e)

		  {

		   System.out.println("NumberFormatException");

		  }
		  catch(ArrayIndexOutOfBoundsException aioe)

		  {

		   System.out.println(aioe.toString());

		  }

		

	}

}
