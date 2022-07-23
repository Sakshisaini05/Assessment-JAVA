
 class Animal {
	int a;
	void eat(int x)
	{
		a=x;
		System.out.println(a+" "+"Eat in animal class ");
	}
	void sleep(int x) {
		a=x;
		System.out.println(a+" "+"Sleep in animal class");
	}
	
}
 class Bird extends Animal{
	void eat(int x)
	{
		System.out.println(a+" "+"Eat in Bird class ");
	}
	void sleep(int x) {
		a=x;
		System.out.println(a+" "+"Sleep in Bird class");
	}
	void fly() {
		System.out.println("fly in bird class");
	}
	}
public class Inheritance {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat(4);
		a.sleep(6);
		Bird b=new Bird();
		b.eat(6);
		b.sleep(7);
		b.fly();

	}

}
