import java.util.Scanner;

public class SuperficieCuadrado {
	public static void main (String[] ar) {
		Scanner keyboard=new Scanner(System.in);
		float side;
		float superficie;
		System.out.print("enter the distance of one side");
		side=keyboard.nextInt();
		superficie=side*side;
		System.out.print("the area of a square is= "+superficie);		
	}

}
