import java.util.Scanner;

public class Ejercicio1 {
	private Scanner teclado;
	private int[] elementos;
	
	private void ingresarElementosAlSistema() {
		teclado=new Scanner(System.in);
		int cantidadDeElementos;
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		System.out.print("Ingresa la cantidad de elementos a calcular= ");
		cantidadDeElementos=teclado.nextInt();
		System.out.println(" ");
		elementos=new int[cantidadDeElementos];
		for(int i=0;i<elementos.length;i++) {
			System.out.print("Ingresa el valor # "+(i+1)+" = ");
			elementos[i]=teclado.nextInt();
		}
	}
	
	public void calcularSumaDeElementosIngresados() {
		float sumaElementos = 0;
		for(int i=0;i<elementos.length;i++) {
			sumaElementos+=elementos[i];
		}
		System.out.println(" ");
		System.out.println("La suma general equivale a $ "+sumaElementos);
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
		
	}

	public static void main(String[] args) {
		Ejercicio1 test=new Ejercicio1();
		test.ingresarElementosAlSistema();
		test.calcularSumaDeElementosIngresados();
	}

}
