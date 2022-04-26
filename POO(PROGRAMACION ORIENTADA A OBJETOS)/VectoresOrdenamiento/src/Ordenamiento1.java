import java.util.Scanner;

public class Ordenamiento1 {
	private Scanner teclado;
	private String [] paises;
	
	public void ingresarDatosAlVector() {
		teclado=new Scanner(System.in);
		int cantidadDePaises;
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		System.out.print("Ingresa el numero de paises a ordenar= ");
		cantidadDePaises=teclado.nextInt();
		teclado.nextLine();
		System.out.println(" ");
		paises=new String[cantidadDePaises];
		for(int i=0;i<paises.length;i++) {
			System.out.print("Ingresa el pais # "+(i+1)+" = ");
			paises[i]=teclado.nextLine();
		}
	}
	
	public void ordenarPaises() {
		for(int k=0;k<(paises.length);k++) {
			for(int i=0;i<(paises.length-1)-k;i++) {
				if(paises[i].compareTo(paises[i+1])>0) {
					String aux=paises[i];
					paises[i]=paises[i+1];
					paises[i+1]=aux;
				}
			}
		}
	}
	
	public void imprimirPaises() {
		for(int i=0;i<(paises.length);i++) {
			System.out.println(paises[i]);
		}
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}

	public static void main(String[] args) {
		Ordenamiento1 test = new Ordenamiento1();
		test.ingresarDatosAlVector();
		test.ordenarPaises();
		test.imprimirPaises();
	}

}
