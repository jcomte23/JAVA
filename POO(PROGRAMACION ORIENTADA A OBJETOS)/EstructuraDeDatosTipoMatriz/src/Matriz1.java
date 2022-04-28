import java.util.Scanner;

public class Matriz1 {
	private Scanner teclado;
	private int[][] matriz;
	
	public void cargarDatosAlaMatriz() {
		teclado=new Scanner(System.in);
		matriz=new int[3][5];
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("ingresa el valor # "+(j+1)+" de la fila #"+(i+1)+" =");
				matriz[i][j]=teclado.nextInt();
			}
			System.out.println(" ");
		}
	}
	
	public void imprimirDatosDeLaMatriz() {
		System.out.println("MATTRIZ=");
		for(int i=0;i<3;i++) {
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
		Matriz1 test=new Matriz1();
		test.cargarDatosAlaMatriz();
		test.imprimirDatosDeLaMatriz();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");

	}

}
