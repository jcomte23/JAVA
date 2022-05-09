package ejercicio1;

import java.util.Scanner;

public class Persona {
	protected Scanner teclado;
	protected String nombre;
	protected int edad;

	public Persona() {
		teclado=new Scanner(System.in);
	}
	
	public void cargarDatos() {
		System.out.print("ingrese el nombre por favor: ");
		nombre=teclado.next();
		System.out.print("ingrese la edad por favor: ");
		edad=teclado.nextInt();
	}
	
	public void imprimirDatos() {
		System.out.println();
		System.out.println("nombre: "+nombre);
		System.out.println("edad: "+edad);
	}


}
