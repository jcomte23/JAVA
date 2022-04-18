import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		double numero,acumulador=0,saldo;
		byte acreedor=0,deudor=0,nulo=0;
		do {
			System.out.println("INGRESE EL NUMERO DE CUENTA");
			numero=Teclado.nextDouble();
			if(numero>0) {
				System.out.println("INGRESE EL SALDO");
				saldo=Teclado.nextDouble();
				if(saldo>0) {
					acumulador+=saldo;
					System.out.println("Cuenta ="+numero+" Estado = Acreedor");
				}else if(saldo==0) {
					System.out.println("Cuenta ="+numero+" Estado = Nulo");
				}else {
					System.out.println("Cuenta ="+numero+" Estado = Deudor");
				}
			}
			System.out.println(" ");
		}while(numero>0);
		System.out.println("Saldo acreedores ="+acumulador);
	}

}
