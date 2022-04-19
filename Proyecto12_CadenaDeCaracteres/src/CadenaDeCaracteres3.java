import java.util.Scanner;

public class CadenaDeCaracteres3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String apellido1,apellido2;
		System.out.print("ingresa el apellido #1: ");
		apellido1=teclado.next();
		System.out.print("ingresa el apellido #2: ");
		apellido2=teclado.next();
		if(apellido1.equalsIgnoreCase(apellido2)) {
			System.out.print("los apellidos coinciden");
		}else {
			System.out.print("los apellidos son diferentes");
		}

	}

}
