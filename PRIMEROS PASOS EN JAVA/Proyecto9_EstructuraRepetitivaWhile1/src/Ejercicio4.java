import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int X,mayores,menores;
		double notas;
		mayores=0;
		menores=0;
		X=1;
		while(X<=10) {
			System.out.println("INGRESE NOTA # "+X);
			notas=Teclado.nextDouble();
			if(notas>=7) {
			    mayores++;
			}else {
				menores++;
			}
			X++;
		}
		System.out.println(mayores+" notas son mayores a 7");
		System.out.println(menores+" notas son menores a 7");
	}

}
