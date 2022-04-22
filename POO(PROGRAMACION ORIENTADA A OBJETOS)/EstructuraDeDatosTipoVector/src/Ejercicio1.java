import java.util.Scanner;

public class Ejercicio1 {
	private Scanner teclado;
	private int[] numeros;
	
	public void cargaDeNumerosAlSistema() {
		teclado=new Scanner(System.in);
		numeros=new int[8];
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		for(int i=0;i<8;i++) {
			System.out.print("Ingresa el valor del numero # "+(i+1)+" = ");
			numeros[i]=teclado.nextInt();
		}
	}
	
	public void calcularNumerosIngresadosPreviamente() {
		System.out.println(" ");
		int acumuladoGeneral=0;
		int acumuladoDeNumerosMayoresA36=0;
		int cantidadDeNumerosMayoresA50=0;
		for(int i=0;i<8;i++) {
			acumuladoGeneral+=numeros[i];
			if(numeros[i]>36) {
				acumuladoDeNumerosMayoresA36+=numeros[i];
			}
			if(numeros[i]>50) {
				cantidadDeNumerosMayoresA50++;
			}
		}
		System.out.println("el acumulado general es "+acumuladoGeneral);
		System.out.println("el acumulado de numeros mayores a 36 es "+acumuladoDeNumerosMayoresA36);
		System.out.println(cantidadDeNumerosMayoresA50+" numeros son mayores a 50");
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}
	
	public static void main(String[] args) {
		Ejercicio1 test=new Ejercicio1();
		test.cargaDeNumerosAlSistema();
		test.calcularNumerosIngresadosPreviamente();
	}

}
