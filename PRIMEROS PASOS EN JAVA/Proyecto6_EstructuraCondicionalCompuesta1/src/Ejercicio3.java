import java.util.Scanner;

public class Ejercicio3 {
	public static void main (String[] arg) {
		Scanner Teclado=new Scanner(System.in);
		System.out.println("ingresa el numero");
		int num=Teclado.nextInt();
		if(num<=9) {
			System.out.println("el valor solo tiene un digito");
		}else {
			System.out.println("el valor solo tiene mas de un digito");
		}
	}

}
