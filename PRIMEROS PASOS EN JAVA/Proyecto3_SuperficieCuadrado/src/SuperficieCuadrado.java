import java.util.Scanner;

public class SuperficieCuadrado {
	public static void main(String[] ar) {
		float Lado;
		float Superficie;
		Scanner teclado=new Scanner(System.in);
		System.out.println("ingrese el tamaño de un lado");
		Lado=teclado.nextFloat();
		Superficie=Lado*Lado;
		System.out.println("la superficie del cuadrado es:"+Superficie);
		
		
	}

}
