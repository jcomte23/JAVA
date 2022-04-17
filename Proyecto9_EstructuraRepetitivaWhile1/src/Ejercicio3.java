import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int X,PIEZAS,correctas,incorrectas;
		double LONGITUD;
		correctas=0;
		incorrectas=0;
		X=1;
		System.out.println("INGRESE EL NUMERO DE PIEZAS A PROCESAR ");
		PIEZAS=Teclado.nextInt();
		while(X<=PIEZAS) {
			System.out.println("INGRESE LA LONGITUD DE LA PIEZA # "+X);
			LONGITUD=Teclado.nextDouble();
			if(LONGITUD>=1.20 && LONGITUD<=1.30) {
				correctas++;
			}else {
				incorrectas++;
			}
			X++;
		}
		System.out.println(correctas+" piezas estas correctas");
		System.out.println(incorrectas+" piezas estas incorrectas");
		
		
		
		
	}

}
