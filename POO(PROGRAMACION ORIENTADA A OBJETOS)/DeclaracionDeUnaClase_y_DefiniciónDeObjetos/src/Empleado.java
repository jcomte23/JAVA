import java.util.Scanner;

public class Empleado {
	private Scanner teclado;
	private String nombre;
	private float sueldo;
	
	public void inicializar() {
		teclado=new Scanner(System.in);
		System.out.println("INGRESA EL NOMBRE DEL EMPLEADO");
		nombre=teclado.nextLine();
		System.out.println("INGRESA EL SUELDO DEL EMPLEADO");
		sueldo=teclado.nextFloat();
	}
	
	public void imprimirDatos() {
		System.out.println("Nombre= "+nombre);
		System.out.println("Sueldo= "+sueldo);
	}
	
	public void calcularImpuesto() {
		if(sueldo>3000) {
			System.out.println("El empleado debe pagar impuestos");
		}
	}

	public static void main(String[] args) {
		Empleado empleado1=new Empleado();
		empleado1.inicializar();
		empleado1.imprimirDatos();
		empleado1.calcularImpuesto();
	}

}
