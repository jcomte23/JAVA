import java.util.Scanner;

public class VectoresParalelos1 {
	private Scanner teclado;
	private String[] nombres;
	private int [] edades;
	
	public void ingresarDatosAlosVectores() {
		teclado=new Scanner(System.in);
		int cantidadDePersonas;
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		System.out.print("Ingresa el numero de personas a calcular= ");
		cantidadDePersonas=teclado.nextInt();
		System.out.println(" ");
		nombres=new String[cantidadDePersonas];
		edades=new int[cantidadDePersonas];
		for(int i=0;i<nombres.length;i++) {
			System.out.print("Ingresa el nombre de la persona # "+(i+1)+" = ");
			teclado.nextLine();
			nombres[i]=teclado.nextLine();			
			System.out.print("Ingresa el la edad de la persona # "+(i+1)+" = ");
			edades[i]=teclado.nextInt();
			System.out.println(" ");
		}
	}
	
	public void imprimirPersonasMayoresDeEdad() {
		for(int i=0;i<edades.length;i++) {
			if(edades[i]>=18) {
				System.out.println(nombres[i]+" es mayor de edad por que tiene "+edades[i]+" años");
			}
		}
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}
	
	public static void main(String[] args) {
		VectoresParalelos1 test=new VectoresParalelos1();
		test.ingresarDatosAlosVectores();
		test.imprimirPersonasMayoresDeEdad();

	}

}
