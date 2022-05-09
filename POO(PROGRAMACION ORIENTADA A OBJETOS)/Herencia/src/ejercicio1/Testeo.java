package ejercicio1;

public class Testeo {
	public static void main(String[] arg) {
		Persona persona1=new Persona();
		persona1.cargarDatos();
		persona1.imprimirDatos();
		
		Empleado empleado1=new Empleado();
		empleado1.cargarDatos();
		empleado1.cargarSueldo();
		empleado1.imprimirDatos();
		empleado1.imprimirSueldo();
	}


}
