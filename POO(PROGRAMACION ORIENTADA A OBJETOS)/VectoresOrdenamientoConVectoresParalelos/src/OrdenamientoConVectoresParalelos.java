import java.util.Scanner;

public class OrdenamientoConVectoresParalelos {
	private Scanner teclado;
	private String[] nombres;
	private float [] notas;
	
	public void ingresarDatosAlosVectores() {
		teclado=new Scanner(System.in);
		int cantidadDePersonas;
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		System.out.print("Ingresa el numero de alumnos a calcular= ");
		cantidadDePersonas=teclado.nextInt();
		System.out.println(" ");
		nombres=new String[cantidadDePersonas];
		notas=new float[cantidadDePersonas];
		for(int i=0;i<nombres.length;i++) {
			System.out.print("Ingresa el nombre del alumno # "+(i+1)+" = ");
			teclado.nextLine();
			nombres[i]=teclado.nextLine();			
			System.out.print("Ingresa el la nota del alumno # "+(i+1)+" = ");
			notas[i]=teclado.nextInt();
			System.out.println(" ");
		}
	}
	
	public void ordenarAlumnos() {
		for(int i=0;i<(notas.length-1);i++) {
			for(int j=0;j<(notas.length-1)-i;j++) {
				if(notas[j]<notas[j+1]) {
					float auxnota=notas[j];
					notas[j]=notas[j+1];
					notas[j+1]=auxnota;
					
					String auxNombre=nombres[j];
					nombres[j]=nombres[j+1];
					nombres[j+1]=auxNombre;
				}
			}
		}
	}
	
	public void imprimirAlumnos() {
		System.out.println(" ");
		System.out.println("Lista de alumnos ordenados de mayor a menor");
		System.out.println(" ");
		System.out.println("ALUMNOS / NOTAS");
		for(int i=0;i<(notas.length);i++) {
			System.out.println(nombres[i]+" - "+notas[i]);
		}
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}

	public static void main(String[] args) {
		OrdenamientoConVectoresParalelos test=new OrdenamientoConVectoresParalelos();
		test.ingresarDatosAlosVectores();
		test.ordenarAlumnos();
		test.imprimirAlumnos();

	}

}
