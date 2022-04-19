import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int X,Y;
		System.out.println("ingresa la coordenada x");
		X=Teclado.nextInt();
		System.out.println("ingresa la coordenada y");
		Y=Teclado.nextInt();
		
		if(X>0 && Y>0) {
			System.out.println("las coordenadas ingresadas ubican el punto ("+X+","+Y+") OSEA EN EL CUADRANTE # 2");
		}else if(X>0 && Y<0) {
			System.out.println("las coordenadas ingresadas ubican el punto ("+X+","+Y+") OSEA EN EL CUADRANTE # 4");
		}else if(X<0 && Y<0) {
			System.out.println("las coordenadas ingresadas ubican el punto ("+X+","+Y+") OSEA EN EL CUADRANTE # 3");
		}else if(X<0 && Y>0) {
			System.out.println("las coordenadas ingresadas ubican el punto ("+X+","+Y+") OSEA EN EL CUADRANTE # 1");
		}
	}

}
