import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("ingresa el primer numero");
		num1=Teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		num2=Teclado.nextInt();
		System.out.println("ingresa el tercer numero");
		num3=Teclado.nextInt();
		
		if(num1<10 || num2<10 || num3<10) {
			System.out.println("Almenos 1 de los numeros es menores de 10");
		}

	}

}
