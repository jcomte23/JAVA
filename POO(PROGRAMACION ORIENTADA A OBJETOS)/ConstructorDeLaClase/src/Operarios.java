import java.util.Scanner;

public class Operarios {
	private Scanner teclado;
	private float[] sueldos;
	
	public Operarios() {
		teclado=new Scanner(System.in);
		sueldos=new float[2];
		for(int i=0;i<sueldos.length;i++) {
			System.out.print("Ingrese el sueldo del empleado #"+(i+1)+" = $");
			sueldos[i]=teclado.nextFloat();
		}
	}
	
	public void imprimirSueldos() {
		System.out.println();
		System.out.println("Sueldos=");
		for(int i=0;i<sueldos.length;i++) {
			System.out.println("empleado #"+(i+1)+" = $"+sueldos[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		Operarios test=new Operarios();
		test.imprimirSueldos();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}

}
