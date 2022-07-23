
class Box{
	
	int width,height,depth;
	Box(int w,int h,int d){
		width=w;
		height=h;
		depth=d;
	}
	 void putDetails()
	 {
		 int v=width*height*depth;
	 System.out.println("Volume: "+v);
	 }
}
	public class Volume {
	public static void main(String[] args) {
	Box ob=new Box(1,2,3);
	ob.putDetails();
	
	}

}
