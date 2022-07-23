
public class Calculator {
	static double power;
	public static double powerInt(int num1,int num2) {
			 power=Math.pow(num1,num2);
			return power;
		}
	public static double powerDouble(double num1,int num2)
	{
		power=Math.pow(num1, num2);
		return power;
	}
	public static void put() {
		System.out.println(power);
	}
	

	public static void main(String[] args) {
		Calculator ob=new Calculator();
		ob.powerInt(4,2);
		ob.put();
		ob.powerDouble(5.0,2);
		ob.put();

	}

}
