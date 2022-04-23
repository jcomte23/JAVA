import java.util.Scanner;

public class TamañoVector1 {
	private Scanner teclado;
	private float[] sueldos;
	
	private void ingresarSueldosAlSistema() {
		teclado=new Scanner(System.in);
		int cantidadDeEmpleados;
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		System.out.print("Ingresa el numero de empleados a calcular= ");
		cantidadDeEmpleados=teclado.nextInt();
		System.out.println(" ");
		sueldos=new float[cantidadDeEmpleados];
		for(int i=0;i<sueldos.length;i++) {
			System.out.print("Ingresa el sueldo del empleado # "+(i+1)+" = ");
			sueldos[i]=teclado.nextFloat();
		}
	}
	
	public void calcularGastos() {
		float gastos = 0;
		for(int i=0;i<sueldos.length;i++) {
			gastos+=sueldos[i];
		}
		System.out.println(" ");
		System.out.println("El total de gastos es $ "+gastos);
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
		
	}
	
	public static void main(String[] args) {
		TamañoVector1 test=new TamañoVector1();
		test.ingresarSueldosAlSistema();
		test.calcularGastos();

	}

}
