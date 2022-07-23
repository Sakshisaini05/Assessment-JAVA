package EveningSession2;

 class Fruit {
    String name;
    String taste;
    String size;
    Fruit(String n,String t,String size){
    	this.name=n;
    	this.taste=t;
    	this.size=size;
    }
    void eat() {
    	
    	System.out.println("Taste of "+name+" is "+taste+" of "+size+" size.");
    }
  
	public static void main(String[] args) {
		Orange f=new Orange("Orange","Sweet","Big");
		f.eat();
		Apple a=new Apple("APple","Sour","Small");
		a.eat();
		
	}

}
class Apple extends Fruit{
	Apple(String n,String taste,String size){
		super(n,taste,size);
	}
   
 
	void eat(String n,String taste,String size)
	{ super.eat();
		System.out.println("Taste of "+name+" is "+taste+" of "+size+" size.");
	}
}
 class Orange extends Fruit{
	 public Orange(String n,String taste,String size){
		 super(n,taste,size);
	  }
	   
		void eat()
		{super.eat();
			System.out.println("Taste of "+name+" is "+taste+" of "+size+" size.");
		}
	}
