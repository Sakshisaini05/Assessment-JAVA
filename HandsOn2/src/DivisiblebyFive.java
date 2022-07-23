
public class DivisiblebyFive {
  static int count;
	public static void main(String[] args) {
		for(int i=0;i<1000;i++)
		{
			if(i%2==0&&i%3==0&&i%5==0&&count<5) {
				System.out.println(i);
				count++;
			}
		}
	}

}
