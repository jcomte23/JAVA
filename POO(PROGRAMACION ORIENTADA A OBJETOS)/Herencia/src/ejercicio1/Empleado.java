package ejercicio1;

public class Empleado extends Persona{
	protected int sueldo;
	
	public void cargarSueldo() {
		System.out.print("ingrese el suedo por favor: $");
		sueldo=teclado.nextInt();
	}
	
	public void imprimirSueldo() {
		System.out.print("sueldo: "+sueldo);
	}

}
