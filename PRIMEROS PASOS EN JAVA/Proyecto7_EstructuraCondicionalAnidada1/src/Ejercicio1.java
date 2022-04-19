import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		System.out.println("ingresa el primer numero");
		int num1=Teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int num2=Teclado.nextInt();
		System.out.println("ingresa el tercer numero");
		int num3=Teclado.nextInt();
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1);
			}else {
				System.out.println(num3);
			}
		}else {
			if(num2>num3) {
				System.out.println(num2);
			}else {
				System.out.println(num3);
			}
		}

	}

}
