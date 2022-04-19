import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		System.out.println("ingresa el numero");
		int num=Teclado.nextInt();
		if(num<0) {
			System.out.println("el numero "+num+" es NEGATIVO");
		}else {
			if(num==0) {
				System.out.println("el numero "+num+" es NEUTRO");
			}else {
				System.out.println("el numero "+num+" es POSITIVO");
			}
		}

	}

}
