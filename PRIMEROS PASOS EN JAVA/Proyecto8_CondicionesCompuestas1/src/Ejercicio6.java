import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		float sueldo;
		int years;
		System.out.println("ingresa el sueldo actual");
		sueldo=Teclado.nextFloat();
		System.out.println("ingresa los years que lleva contrado");
		years=Teclado.nextInt();
		
		if(sueldo<500 && years>=10) {
			double incremento=sueldo*0.20;
			double NuevoSalario=sueldo+incremento;
			System.out.println("su nuevo sueldo es de "+NuevoSalario);
		}else if(sueldo<500 && years<10) {
			double incremento=sueldo*0.05;
			double NuevoSalario=sueldo+incremento;
			System.out.println("su nuevo sueldo es de "+NuevoSalario);
		}else if(sueldo>=500) {
			System.out.println("su sueldo seguira siendo "+sueldo);
		}

	}

}
