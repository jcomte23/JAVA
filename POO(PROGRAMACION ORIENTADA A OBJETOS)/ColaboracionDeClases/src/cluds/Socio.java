package cluds;
import java.util.Scanner;

public class Socio {
	private String nombreSocio;
	private int AntiguedadMembresia;

	public Socio(Scanner teclado) {
		System.out.print("Ingrese el nombre del socio:");
		nombreSocio=teclado.next();
		System.out.print("Ingrese la antiguedad:");
		AntiguedadMembresia=teclado.nextInt();
	}
	
	public void imprimirSocio() {
		System.out.println("Socio ="+nombreSocio);
		System.out.println("Tiene una antiguedad de "+AntiguedadMembresia+" años");
	}
	
	public int extraerAntiguedad() {
		return AntiguedadMembresia;
	}
}
