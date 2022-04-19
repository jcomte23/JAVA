import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int X,personas;
		double sueldo=0,normal=0,superior=0,suma;
		suma=0;
		X=1;
		System.out.println("INGRESE EL NUMERO DE EMPLEADOS A PROCESAR ");
		personas=Teclado.nextInt();
		while(X<=personas) {
			System.out.println("INGRESE LA SUELDO DE LA PERSONA # "+X);
			sueldo=Teclado.nextDouble();
			if(sueldo>=100 && sueldo <=300) {
				normal++;
			}else {
				superior++;
			}
			suma=suma+sueldo;
			X++;
		}
		System.out.println(normal+" empleado ganas un suedo entre 100 y 300 euros");
		System.out.println(superior+" empleado ganas un suedo mayor a 300 euros");
		System.out.println("la empresa debe pagar "+suma+" a los "+ personas+" empleados");

	}

}
