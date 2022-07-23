import java.util.Scanner;

public class searchinarray {
static int flag;
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of array: ");
		 int size=sc.nextInt();
		   System.out.println("Enter the number in array:");
		   
		   int arr[]=new int[size];
		   for(int i=0;i<size;i++) {
		   arr[i]=sc.nextInt();}
		   System.out.println("Enter the element you Want to search: ");
		   int x=sc.nextInt();
		   
		   for(int i=0;i<size;i++)
		   {
			   if(arr[i]==x)
				   {System.out.println(i);
				   flag=1;
				   break;
				   }
		   }
		   if(flag==0)
			   System.out.println("-1");
		  

	}

}
