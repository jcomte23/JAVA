import java.util.Scanner;

public class Matriz3 {
	private Scanner teclado;
	private int[][] matriz;
	
	public void cargarDatosAlaMatriz() {
		teclado=new Scanner(System.in);
		matriz=new int[3][4];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("ingresa el valor # "+(j+1)+" de la fila #"+(i+1)+" =");
				matriz[i][j]=teclado.nextInt();
			}
			System.out.println(" ");
		}
	}
	
	public void imprimirPrimerFila() {
		System.out.println("PRIMERA FILA=");		
		for(int j=0;j<4;j++) {
			System.out.print(matriz[0][j]+" ");
		}
		System.out.println(" ");
	}
	
	public void imprimirUltimaFila() {
		System.out.println("ULTIMA FILA=");		
		for(int j=0;j<4;j++) {
			System.out.print(matriz[2][j]+" ");
		}
		System.out.println(" ");
	}
	
	public void primeraColumna() {
		System.out.println("PRIMERA COLUMNA=");		
		for(int j=0;j<3;j++) {
			System.out.println(matriz[j][0]+" ");
		}
		System.out.println(" ");
	}
		
	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		Matriz3 test=new Matriz3();
		test.cargarDatosAlaMatriz();
		test.imprimirPrimerFila();
		test.imprimirUltimaFila();
		test.primeraColumna();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");

	}

}
