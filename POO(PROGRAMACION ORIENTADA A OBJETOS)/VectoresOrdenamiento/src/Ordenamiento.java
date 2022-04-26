import java.util.Scanner;

public class Ordenamiento {
	
	private Scanner teclado;
	private int [] sueldos;
	
	public void ingresarDatosAlVector() {
		teclado=new Scanner(System.in);
		int cantidadDePersonas;
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		System.out.print("Ingresa el numero de personas a calcular= ");
		cantidadDePersonas=teclado.nextInt();
		System.out.println(" ");
		sueldos=new int[cantidadDePersonas];
		for(int i=0;i<sueldos.length;i++) {		
			System.out.print("Ingresa el sueldo de la persona # "+(i+1)+" = ");
			sueldos[i]=teclado.nextInt();
			System.out.println(" ");
		}
	}
	
	public void ordenarSueldos() {
		for(int k=0;k<(sueldos.length-1);k++) {
			for(int i=0;i<(sueldos.length-1)-k;i++) {
				if(sueldos[i]>sueldos[i+1]) {
					int aux=sueldos[i];
					sueldos[i]=sueldos[i+1];
					sueldos[i+1]=aux;
				}
			}
		}
		
	}
	
	public void imprimirSueldos() {
		for(int i=0;i<(sueldos.length);i++) {
			System.out.println(sueldos[i]);
		}
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}

	public static void main(String[] args) {
		Ordenamiento test =new Ordenamiento();
		test.ingresarDatosAlVector();
		test.ordenarSueldos();
		test.imprimirSueldos();
	}

}
