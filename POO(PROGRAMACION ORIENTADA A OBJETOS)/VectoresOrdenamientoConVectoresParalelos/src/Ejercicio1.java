import java.util.Scanner;

public class Ejercicio1 {
	private Scanner teclado;
	private String[] paises;
	private int [] poblacion;
	
	public void ingresarDatosAlosVectores() {
		teclado=new Scanner(System.in);
		int cantidadDePaises;
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		System.out.print("Ingresa el numero de alumnos a calcular= ");
		cantidadDePaises=teclado.nextInt();
		System.out.println(" ");
		paises=new String[cantidadDePaises];
		poblacion=new int[cantidadDePaises];
		for(int i=0;i<paises.length;i++) {
			System.out.print("Ingresa el nombre del pais # "+(i+1)+" = ");
			teclado.nextLine();
			paises[i]=teclado.nextLine();			
			System.out.print("Ingresa la poblacion del pais # "+(i+1)+" = ");
			poblacion[i]=teclado.nextInt();
			System.out.println(" ");
		}
	}
	
	public void ordenarPaisesAlfabeticamente() {
		for(int i=0;i<(paises.length);i++) {
			for(int j=0;j<(paises.length-1)-i;j++) {
				if(paises[j].compareTo(paises[j+1])>0) {
					String aux=paises[j];
					paises[j]=paises[j+1];
					paises[j+1]=aux;
					
					int auxPoblacion=poblacion[j];
					poblacion[j]=poblacion[j+1];
					poblacion[j+1]=auxPoblacion;
				}
			}
		}
	}
	
	public void imprimirPaisesAlfabeticamente() {
		System.out.println(" ");
		System.out.println("Lista de paises ordenados segun su nombre");
		System.out.println(" ");
		System.out.println("Paises / Poblacion");
		for(int i=0;i<(paises.length);i++) {
			System.out.println(paises[i]+" - "+poblacion[i]);
		}
	}
	
	public void ordenarPaises() {
		for(int i=0;i<(poblacion.length-1);i++) {
			for(int j=0;j<(poblacion.length-1)-i;j++) {
				if(poblacion[j]<poblacion[j+1]) {
					int auxPoblacion=poblacion[j];
					poblacion[j]=poblacion[j+1];
					poblacion[j+1]=auxPoblacion;
					
					String auxNombre=paises[j];
					paises[j]=paises[j+1];
					paises[j+1]=auxNombre;
				}
			}
		}
	}
	
	public void imprimirPaises() {
		System.out.println(" ");
		System.out.println("Lista de paises ordenados segun su poblacion");
		System.out.println(" ");
		System.out.println("Paises / Poblacion");
		for(int i=0;i<(poblacion.length);i++) {
			System.out.println(paises[i]+" - "+poblacion[i]);
		}
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}

	public static void main(String[] args) {
		Ejercicio1 test=new Ejercicio1();
		test.ingresarDatosAlosVectores();
		test.ordenarPaisesAlfabeticamente();
		test.imprimirPaisesAlfabeticamente();
		test.ordenarPaises();
		test.imprimirPaises();
	}

}
