import java.util.Scanner;

public class MatrizIrregular1 {
	private Scanner teclado;
	private int [][] mat;
	
	public void cargarDatosAlaMatriz() {
		teclado=new Scanner(System.in);
		System.out.print("Ingresa cuantas filas va a tener la matriz =");
		int filas=teclado.nextInt();		
		mat=new int[filas][];
		System.out.println(" ");
		for(int f=0;f<mat.length;f++) {
			System.out.print("cuantos elementos va a tener la fila "+(f+1)+" =");
			int elementos=teclado.nextInt();
			mat[f]=new int[elementos];
			for(int c=0;c<mat[f].length;c++) {
				System.out.print("ingrese el componente =");
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
		MatrizIrregular1 test=new MatrizIrregular1();
		test.cargarDatosAlaMatriz();
		test.imprimir();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}

}
