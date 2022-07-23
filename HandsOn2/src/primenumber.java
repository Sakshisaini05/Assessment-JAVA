
public class primenumber {
static int flag;
	public static void main(String[] args) {
		for(int i=10;i<99;i++)
	{
			for (int j = 2; j < i/2; j++)
			 {     if (i % j == 0) {
				 {flag=1;
				 break;}
			
			 }
			 }
			if(flag==0)
				System.out.println(i);
			flag=0;
		              }
		
	}
	}

