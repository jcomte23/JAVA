import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		System.out.println("ingresa el primer numero");
		int num1=Teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int num2=Teclado.nextInt();
		if (num1>num2) {
			int suma=num1+num2;
			int diferencia=num1-num2;
			System.out.println("la suma de los numeros es: "+suma);
			System.out.println("la diferencia de los numeros es: "+diferencia);
		}else {
			int producto=num1*num2;
			float division=num1/num2;
			System.out.println("el producto de los numeros es: "+producto);
			System.out.println("la division de los numeros es: "+division);
		}

	}

}
