import java.util.Scanner;

public class Ejercicio1 {
	private Scanner teclado;
	private int [][] mat;
	
	public void cargarDatosAlaMatriz() {
		teclado=new Scanner(System.in);
		int filas=5;		
		mat=new int[filas][];
		for(int f=0;f<mat.length;f++) {
			int elementos=(f+1);
			mat[f]=new int[elementos];
			System.out.print("Fila # "+(f+1));
			System.out.println(" ");
			for(int c=0;c<mat[f].length;c++) {
				System.out.print("ingrese el componente #"+(c+1)+" =");
				mat[f][c]=teclado.nextInt();
			}
			System.out.println(" ");
		}
	}
	
	public void imprimir() {
		System.out.println("MATTRIZ=");
		for(int f=0;f<mat.length;f++) {
			for( int c=0;c<mat[f].length;c++) {
				System.out.print(mat[f][c]+" ");
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
		test.imprimir();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");

	}

}
