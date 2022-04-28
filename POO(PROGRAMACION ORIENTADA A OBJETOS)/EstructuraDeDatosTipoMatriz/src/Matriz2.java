import java.util.Scanner;

public class Matriz2 {
	private Scanner teclado;
	private int[][] matriz;
	
	public void cargarDatosAlaMatriz() {
		teclado=new Scanner(System.in);
		matriz=new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("ingresa el valor # "+(j+1)+" de la fila #"+(i+1)+" =");
				matriz[i][j]=teclado.nextInt();
			}
			System.out.println(" ");
		}
	}
	
	public void imprimirDiagonalPrincipal() {
		System.out.println("DIAGONAL=");
        for(int k=0;k<4;k++) {
            System.out.print(matriz[k][k]+" ");
        }
    }
	
	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		Matriz2 test=new Matriz2();
		test.cargarDatosAlaMatriz();
		test.imprimirDiagonalPrincipal();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");

	}

}
