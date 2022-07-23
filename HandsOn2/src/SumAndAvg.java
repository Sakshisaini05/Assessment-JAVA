
public class SumAndAvg {
 static int sum,avg;
	public static void main(String[] args) {
		
		   int []arr= {10,20,30,40};
		   for(int i=0;i<arr.length;i++)
		   {
			sum+=arr[i];
			
		   }
		   System.out.println("Sum of array: "+sum);
		   avg=sum/arr.length;
          System.out.println("Avg of array: "+avg);

	}

}
