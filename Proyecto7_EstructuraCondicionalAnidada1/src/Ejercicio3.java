import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		System.out.println("ingresa el numero de maximo 3 digitos");
		int num=Teclado.nextInt();
		if(num>999) {
			System.out.println("ERROR,el numero "+num+" SUPERA EL RANGO");
		}else {
			if(num<10) {
				System.out.println("el numero "+num+" TIENE 1 CIFRA");
			}else {
				if(num<99) {
					System.out.println("el numero "+num+" TIENE 2 CIFRAS");
				}else {
					System.out.println("el numero "+num+" TIENE 3 CIFRAS");
				}
				
			}
		}


	}

}
