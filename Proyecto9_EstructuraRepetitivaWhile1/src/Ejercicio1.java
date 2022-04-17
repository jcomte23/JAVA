import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int num,x;
		System.out.println("INGRESE EL NUMERO HASTA DONDE VAS A LLEGAR");
		x=1;
		num=Teclado.nextInt();
		while(x<=num) {
			System.out.println(x);
			System.out.println("-");
			x++;
		}

	}

}
