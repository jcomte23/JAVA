import java.util.Scanner;

public class Persona {
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	public void inicializar() {
		teclado=new Scanner(System.in);
		System.out.println("BIENVENIDO");
		System.out.print("ingresa el nombre de la persona: ");
		nombre=teclado.nextLine();
		System.out.print("ingresa la edad de la persona: ");
		edad=teclado.nextInt();
	}
	
	public void imprimir() {
		System.out.println(" ");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
	}
	
	public void calcularMayoriaDeEdad() {
		if(edad>=18) {
			System.out.print("");
			System.out.print(nombre+" es mayor de edad");
		}else {
			System.out.print("");
			System.out.print(nombre+" es menor de edad");
		}
	}
	
	public static void main(String[] ar) {
		Persona persona1;
		persona1=new Persona();
		persona1.inicializar();
		persona1.imprimir();
		persona1.calcularMayoriaDeEdad();
	}

}
