import java.util.Arrays;
import java.util.Scanner;

public class largestandsmallest {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of array: ");
		 int size=sc.nextInt();
		   System.out.println("Enter the number in array:");
		   
		   int arr[]=new int[size];
		   for(int i=0;i<size;i++) {
		   arr[i]=sc.nextInt();}
		   Arrays.sort(arr);
		   System.out.println("Largest 2 elements are: "+arr[size-1]+" "+arr[size-2]);
		   System.out.println("Samllest 2 elements are: "+arr[0]+" "+arr[1]);

	}

}
