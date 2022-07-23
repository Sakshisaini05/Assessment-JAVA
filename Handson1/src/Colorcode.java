import java.util.Scanner;

public class Colorcode {

	public static void main(String[] args) {
		//R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character:");
		char c=sc.next().charAt(0);
		switch(c) {
		case 'R':System.out.println("R->Red");
		         break;
		case 'B':System.out.println("B->Blue");
		         break;
		case 'G':System.out.println("G->Green");
		         break;
		case 'O':System.out.println("O->Orange");
		         break;
		case 'Y':System.out.println("Y>Yellow");
		         break;
		case 'W':System.out.println("W->White");
		        break;
		 default: System.out.println("Invalid Code");
		}

	}

}
