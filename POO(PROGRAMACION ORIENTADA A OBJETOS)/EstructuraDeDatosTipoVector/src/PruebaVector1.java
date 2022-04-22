import java.util.Scanner;

public class PruebaVector1 {
	private Scanner teclado;
	private int[] sueldos;
	
	public void ingresarSueldosAlSistema() {
		teclado=new Scanner(System.in);
		sueldos=new int[5];
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		for(int i=0;i<5;i++) {
			System.out.print("Ingresa el sueldo # "+(i+1)+"= ");
			sueldos[i]=teclado.nextInt();
		}
	}
	
	public void imprimirSueldosIngresadosPreviamente() {
		System.out.println(" ");
		System.out.println("los sueldos ingresados fueron= ");
		System.out.println(" ");
		for(int f=0;f<5;f++) {
			System.out.println("Sueldo # "+(f+1)+" = "+sueldos[f]);
		}
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}	

	public static void main(String[] args) {
		PruebaVector1 prueba=new PruebaVector1();
		prueba.ingresarSueldosAlSistema();
		prueba.imprimirSueldosIngresadosPreviamente();

	}

}
