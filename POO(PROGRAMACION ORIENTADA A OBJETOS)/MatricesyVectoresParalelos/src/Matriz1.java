import java.util.Scanner;

public class Matriz1 {
	private Scanner teclado;
	private int cantidadEmpleados;
	private int cantidadMeses;
	private String[] nombresEmpleados;
	private float[][] sueldos;
	private float[] sueldostot;
	
	public void ingresarEmpleadosAlSistema() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese cuantos empleados vas a ingresar=");
		cantidadEmpleados=teclado.nextInt();
		System.out.print("Ingrese cuantos meses vas a calcular=");
		cantidadMeses=teclado.nextInt();
		teclado.nextLine();
		nombresEmpleados=new String[cantidadEmpleados];
		sueldos=new float[cantidadEmpleados][cantidadMeses];
		
		System.out.println(" ");
		System.out.println("Ingrese el nombre del empleado");
		for(int i=0;i<nombresEmpleados.length;i++) {
			System.out.print("Empleado #"+(i+1)+" =");
			nombresEmpleados[i]=teclado.nextLine();
		}
		System.out.println(" ");
	}	
	
	public void ingresarSueldosDeEmpleados() {
		System.out.println("Ingreso de sueldo de empleados");
		for(int i=0;i<cantidadEmpleados;i++) {
			int mes=cantidadMeses;
			System.out.println("Empleado "+nombresEmpleados[i]+" =");
			for(int f=0;f<sueldos[i].length;f++) {
				System.out.print("sueldo de hace "+mes+" meses =");
				sueldos[i][f]=teclado.nextFloat();
				mes=mes-1;
			}
			System.out.println(" ");
		}
	}
	
	public void sumarSueldos() {
		sueldostot=new float[cantidadEmpleados];
		float valorTotal=0;
		for(int i=0;i<cantidadEmpleados;i++) {
			float suma=0;
			for(int f=0;f<sueldos[i].length;f++) {
				suma=suma+sueldos[i][f];
			}
			sueldostot[i]=suma;
			valorTotal=valorTotal+sueldostot[i];
		}
		System.out.println("La empresa debe pagar $"+valorTotal);
	}
	
	public void gastoTotal() {
		sueldostot=new float[cantidadEmpleados];
		float valorTotal=0;
		for(int i=0;i<cantidadEmpleados;i++) {
			valorTotal=valorTotal+sueldostot[i];
		}
		
	}
	
	public void imprimirSueldosTotales() {
		System.out.println("SUELDOS TOTALES=");
		for(int i=0;i<cantidadEmpleados;i++) {
			System.out.println("Empleado "+nombresEmpleados[i]+" = $"+sueldostot[i]);
		}
		System.out.println(" ");
		
	}
	
	public void calcularSueldoMayor() {
		float mayor;
        int pos;
        mayor=sueldostot[0];
        pos=0;
        for(int f=0;f<cantidadEmpleados;f++) {
            if (sueldostot[f]>mayor) {
                mayor=sueldostot[f];
                pos=f;
            }
        }
        System.out.println("El empleado con sueldo mayor es "+nombresEmpleados[pos]);
        System.out.println("Tiene un sueldo:"+mayor);
	}
	

	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		Matriz1 test=new Matriz1();
		test.ingresarEmpleadosAlSistema();
		test.ingresarSueldosDeEmpleados();
		test.sumarSueldos();
		test.imprimirSueldosTotales();
		test.calcularSueldoMayor();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");

	}

}
