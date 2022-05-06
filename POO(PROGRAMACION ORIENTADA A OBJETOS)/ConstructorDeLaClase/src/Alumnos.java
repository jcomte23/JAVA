import java.util.Scanner;

public class Alumnos {
	private Scanner teclado;
	private String nombre;
	private int edad;

	public Alumnos() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese el nombre del estudiante = ");
		nombre=teclado.nextLine();
		System.out.print("Ingrese cuantos años tiene el estudiante = ");
		edad=teclado.nextInt();
		System.out.println("");
	}
	
	public void imprimir() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Edad:"+edad);
    }
	
	public void CalcularAdutez() {
		if(edad>=18) {
			System.out.print(nombre+" es MAYOR de edad");
		}else {
			System.out.print(nombre+" es MENOR de edad");
		}
	}

	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		Alumnos test=new Alumnos();
		test.imprimir();
		test.CalcularAdutez();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}

}
