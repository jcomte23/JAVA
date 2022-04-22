import java.util.Scanner;

public class Ejercicio2 {
	private Scanner teclado;
	private int[] vector1;
	private int[] vector2;
	private int[] vector3;
	
	public void cargaDeValoresNumericosAlosVectores() {
		teclado=new Scanner(System.in);
		vector1=new int[4];
		vector2=new int[4];
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		for(int i=0;i<4;i++) {
			System.out.print("Ingresa el valor # "+(i+1)+" del vector 1 = ");
			vector1[i]=teclado.nextInt();
		}
		System.out.println(" ");
		for(int i=0;i<4;i++) {
			System.out.print("Ingresa el valor # "+(i+1)+" del vector 2 = ");
			vector2[i]=teclado.nextInt();
		}
	}
	
	public void sumarLosVectores() {
		vector3=new int[4];
		for(int i=0;i<4;i++) {
			vector3[i]=vector1[i]+vector2[i];
		}
	}
	
	public void imprimirResultados() {
		System.out.println(" ");
		for(int i=0;i<4;i++) {
			System.out.println(vector1[i]+" + "+vector2[i]+" = "+vector3[i]);
		}
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}

	public static void main(String[] args) {
		Ejercicio2 test=new Ejercicio2();
		test.cargaDeValoresNumericosAlosVectores();
		test.sumarLosVectores();
		test.imprimirResultados();
	}

}
