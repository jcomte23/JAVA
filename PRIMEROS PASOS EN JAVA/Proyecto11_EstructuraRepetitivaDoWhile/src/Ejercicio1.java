import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int numero,acumulador=0;
		do {
			System.out.println("INGRESE UN NUMERO DIFERENTE A 9999");
			numero=Teclado.nextInt();
			if(numero!=9999) {
				acumulador+=numero;
			}
			System.out.println(" ");
		}while(numero!=9999);
		if(acumulador<0) {
			System.out.println("El acumulado de "+acumulador+" es negativo");
		}else {
			if(acumulador==0) {
				System.out.println("El acumulado "+acumulador+" es neutro");
			}else {
				System.out.println("El acumulado "+acumulador+" es positivo");
			}
		}
		System.out.println("FELIZ DIA");

	}

}
