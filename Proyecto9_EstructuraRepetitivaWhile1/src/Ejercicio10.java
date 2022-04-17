import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int X,PIEZAS,pares,impares;
		double num;
		pares=0;
		impares=0;
		X=1;
		System.out.println("INGRESE CUANTOS NUMEROS VAS A PROCESAR ");
		PIEZAS=Teclado.nextInt();
		while(X<=PIEZAS) {
			System.out.println("INGRESE NUMERO # "+X);
			num=Teclado.nextDouble();
			if(num%2==0) {
				pares++;
			}else {
				impares++;
			}
			X++;
		}
		System.out.println(pares+" numeros son pares");
		System.out.println(impares+" numeros son impares");

	}

}
