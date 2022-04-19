import java.util.Scanner;

public class EstructuraRepetitivaDoWhile1 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int numero;
		do {
			System.out.println("INGRESE UN NUMERO ENTRE 0 Y 999");
			numero=Teclado.nextInt();			
			if(numero>0 && numero<10) {
				System.out.println("el numero tiene 1 digito");
			}else if(numero>=10 && numero<100) {
				System.out.println("el numero tiene 2 digitos");
			}else if(numero>=100 && numero<999) {
				System.out.println("el numero tiene 3 digitos");
			}else if(numero<0 || numero>999){
				System.out.println("el numero esta fuera del rango permitido");
			}
			System.out.println(" ");
		}while(numero!=0);
		System.out.println("FELIZ DIA");

	}

}
