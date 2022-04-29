import java.util.Scanner;

public class Ejercicio2 {
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
	
	public void imprimirDatosDeLaMatriz() {
		System.out.println("MATTRIZ=");
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	
	public void imprimirVertices() {
    	System.out.println("Vértice superior izquierdo:");
        System.out.println(matriz[0][0]);
    	System.out.println("Vértice superior derecho:");        
        System.out.println(matriz[0][matriz[0].length-1]);
    	System.out.println("Vértice inferior izquierdo:");        
        System.out.println(matriz[matriz.length-1][0]);
    	System.out.println("Vértice inferior derecho:");        
        System.out.println(matriz[matriz.length-1][matriz[matriz.length-1].length-1]);
    }    
	
	

	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		Ejercicio2 test=new Ejercicio2();
		test.crearlaMatriz();
		test.ingresarDatosAlaMatriz();
		test.imprimirDatosDeLaMatriz();
		test.imprimirVertices();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");

	}


}
