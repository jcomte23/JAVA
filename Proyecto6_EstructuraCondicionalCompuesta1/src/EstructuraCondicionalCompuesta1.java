import java.util.Scanner;

public class EstructuraCondicionalCompuesta1 {
	
	public static void main(String [] ar) {
		Scanner Teclado=new Scanner(System.in);
		System.out.println("ingresa el primer numero");
		int num1=Teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int num2=Teclado.nextInt();
		if (num1>num2) {
			System.out.println(num1+" es el numero mayor");
		}else {
			System.out.println(num2+" es el numero mayor");
		}
	}
}
