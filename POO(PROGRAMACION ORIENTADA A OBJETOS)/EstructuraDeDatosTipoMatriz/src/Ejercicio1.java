import java.util.Scanner;

public class Ejercicio1 {
	private Scanner teclado;
	private int[][] matriz;
	
	public void cargarDatosAlaMatriz() {
		teclado=new Scanner(System.in);
		matriz=new int[2][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("ingresa el valor # "+(j+1)+" de la columna #"+(i+1)+" =");
				matriz[j][i]=teclado.nextInt();
			}
			System.out.println(" ");
		}
	}
	
	public void imprimirDatosDeLaMatriz() {
		System.out.println("MATTRIZ=");
		for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	

	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		Ejercicio1 test=new Ejercicio1();
		test.cargarDatosAlaMatriz();
		test.imprimirDatosDeLaMatriz();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");

	}
}
