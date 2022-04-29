import java.util.Scanner;

public class Matriz2 {
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
	
	public void imprimirMayorElemento() {
		System.out.print("Mayor elemento de la matriz=");
		int mayor=matriz[0][0];
		int posicionFila=0;
		int posicionColumna=0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(matriz[i][j]>mayor) {					
					mayor=matriz[i][j];
					posicionFila=i;
					posicionColumna=j;
				}
			}
		}
		System.out.println(mayor);
		System.out.println("posicion= fila "+(posicionFila+1)+" columna "+(posicionColumna+1));
	}
	
	

	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		Matriz2 test=new Matriz2();
		test.crearlaMatriz();
		test.ingresarDatosAlaMatriz();
		test.imprimirMayorElemento();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");

	}
}
