import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of array: ");
		 int size=sc.nextInt();
		   System.out.println("Enter the number:");
		   
		   int arr[]=new int[size];
		   for(int i=0;i<size;i++) {
		   arr[i]=sc.nextInt();}
		   Arrays.sort(arr);
		   System.out.println("Minimum element is: "+arr[0]);
		   System.out.println("Maximum element is :"+arr[size-1]);

	}

}
