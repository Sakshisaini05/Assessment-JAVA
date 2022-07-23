
public class Divison {
     static void  divisonmethod(int a,int b){
    	 int ans=a/b;
    	 System.out.print("Divison of "+a+" and "+b+" is "+ans);
    	 
     }
	public static void main(String[] args) {
		  try

		  {
			  int b ;
			  b=Integer.parseInt(args[0]);
              divisonmethod(100,b);
		   

		   

		  }

		  catch(ArithmeticException ae)

		  {

		   System.out.println(" ArithmeticException");

		  }


	}

}
