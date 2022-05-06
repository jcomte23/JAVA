import java.util.Scanner;

public class Ejercicio1 {
	private Scanner teclado;
	private String nombre;
	private float sueldo;

	public Ejercicio1() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese el nombre del empleado = ");
		nombre=teclado.nextLine();
		System.out.print("Cual es el salario de "+nombre+" = $");
		sueldo=teclado.nextFloat();
		System.out.println("");
	}
	
	public void imprimir() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Sueldo:"+sueldo);
    }
	
	public void CalcularImpuestos() {
		if(sueldo>3000) {
			System.out.println(nombre+" debe pagar impuestos");
		}else {
			System.out.println(nombre+" NO debe pagar impuestos");
		}
	}

	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		Ejercicio1 test=new Ejercicio1();
		test.imprimir();
		test.CalcularImpuestos();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");

	}

}
