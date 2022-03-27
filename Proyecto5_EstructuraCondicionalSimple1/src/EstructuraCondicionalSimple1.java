import java.util.Scanner;


public class EstructuraCondicionalSimple1 {
	
	public static void main(String[] ar) {
		Scanner Teclado=new Scanner(System.in);
		float sueldo;
		System.out.println("bienvenido,ingresa el sueldo por favor");
		sueldo=Teclado.nextFloat();
		if(sueldo>3000) {
			System.out.println("esta persona debe abona impuestos");
		}else {
			System.out.println("muchas gracias,eso es todo");
		}
	}

}
