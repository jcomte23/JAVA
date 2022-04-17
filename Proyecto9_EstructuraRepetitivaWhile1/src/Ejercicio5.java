import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int X,personas;
		double altura,promedio,suma;
		suma=0;
		X=1;
		System.out.println("INGRESE EL NUMERO DE PERSONAS A PROCESAR ");
		personas=Teclado.nextInt();
		while(X<=personas) {
			System.out.println("INGRESE LA ALTURA DE LA PERSONA # "+X);
			altura=Teclado.nextDouble();
			suma=suma+altura;
			X++;
		}
		promedio=suma/personas;
		System.out.println(promedio+" es la altura promedio");
		

	}

}
