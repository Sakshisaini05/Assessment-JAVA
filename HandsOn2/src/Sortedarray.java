import java.util.Scanner;

public class Sortedarray {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of array: ");
		 int size=sc.nextInt();
		   System.out.println("Enter the number in array:");
		   
		   int arr[]=new int[size];
		   for(int i=0;i<size;i++) {
		   arr[i]=sc.nextInt();}
		   for(int i=0;i<size-1;i++) {
			   for(int j=i+1;j<size;j++) {
				   if(arr[j]<arr[i])
				   {
					   int temp=arr[j];
					   arr[j]=arr[i];
					   arr[i]=temp;
				   }
			   }
		   }
		   System.out.print("Sorted array:   ");
		   for(int i=0;i<size;i++)
	{
		System.out.print(arr[i]+" ");
	}
	}
}
