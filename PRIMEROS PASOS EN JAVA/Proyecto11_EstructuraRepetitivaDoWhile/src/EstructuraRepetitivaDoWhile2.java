import java.util.Scanner;

public class EstructuraRepetitivaDoWhile2 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		double numero,acumulador=0,promedio;
		byte contador=0;
		do {
			System.out.println("INGRESE UN NUMERO");
			numero=Teclado.nextDouble();
			if(numero!=0) {
				acumulador+=numero;
				contador++;
				System.out.println(" ");
			}
		}while(numero!=0);
		if(contador>0) {
			promedio=acumulador/contador;
			System.out.println("El promedio de los numeros ingresados es "+promedio);
			System.out.println("FELIZ DIA");
		}else {
			System.out.println("No se ingresaron valores");
			System.out.println("FELIZ DIA");
		}		
	}
}
