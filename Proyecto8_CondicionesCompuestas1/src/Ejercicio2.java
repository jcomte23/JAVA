import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int dia,mes,year;
		System.out.println("ingresa el dia");
		dia=Teclado.nextInt();
		System.out.println("ingresa el mes");
		mes=Teclado.nextInt();
		System.out.println("ingresa el year");
		year=Teclado.nextInt();
		
		if(mes>11 && mes<13) {
			System.out.println("La fecha "+dia+"/"+mes+"/"+year+" esta en navidad");
		}else {
			System.out.println("La fecha "+dia+"/"+mes+"/"+year+" NO esta en navidad");
		}

	}

}
