import java.util.Scanner;

public class Ejercicio1 {
	private Scanner teclado;
	private int [][] matriz;
	private int cantidadFilas,cantidadColumnas;
	
	public void crearlaMatriz() {
		teclado=new Scanner(System.in);
		System.out.print("Ingresa el numero de filas de la matriz= ");
		cantidadFilas=teclado.nextInt();
		System.out.print("Ingresa el numero de columnas de la matriz= ");
		cantidadColumnas=teclado.nextInt();
		System.out.println(" ");
	}
	
	public void ingresarDatosAlaMatriz() {
		teclado=new Scanner(System.in);
		matriz=new int[cantidadFilas][cantidadColumnas];
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print("ingresa el valor # "+(j+1)+" de la fila #"+(i+1)+" =");
				matriz[i][j]=teclado.nextInt();
			}
			System.out.println(" ");
		}
	}
	
	public void intercarmbioDefilas() {
		for(int i=0;i<matriz[0].length;i++) {
			int aux;
			aux=matriz[0][i];
			matriz[0][i]=matriz[1][i];
			matriz[1][i]=aux;
		}
	}
	
	public void imprimirDatosDeLaMatriz() {
		System.out.println("MATTRIZ=");
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
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
		test.crearlaMatriz();
		test.ingresarDatosAlaMatriz();
		test.intercarmbioDefilas();
		test.imprimirDatosDeLaMatriz();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");

	}

}
