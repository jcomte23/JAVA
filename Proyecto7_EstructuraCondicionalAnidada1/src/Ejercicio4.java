import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		float cantidadPreguntas;
		float cantidadCorrectas;
		float promedio;		
		System.out.println("ingresa la cantidad de preguntas del test");
		cantidadPreguntas=Teclado.nextFloat();
		System.out.println("ingresa la cantidad de preguntas correctas");
		cantidadCorrectas=Teclado.nextFloat();
		promedio=(cantidadCorrectas/cantidadPreguntas)*100;
		System.out.println(promedio);
		if(promedio>=90) {
			System.out.println("Nivel máximo");
		}else {
			if(promedio>=75) {
				System.out.println("Nivel medio");
			}else {
				if(promedio>=50) {
					System.out.println("Nivel Regular");
				}else {
					System.out.println("Fuera de Nivel");
				}
			}			
		}
	}

}
