import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of array: ");
		 int size=sc.nextInt();
		   System.out.println("Enter the number in array:");
		   
		   int arr[]=new int[size];
		   for(int i=0;i<size;i++) {
		   arr[i]=sc.nextInt();}
		   for(int i=0;i<size;i++)
		   {
			   System.out.print((char)arr[i]+" ");

		   }
	}

}
