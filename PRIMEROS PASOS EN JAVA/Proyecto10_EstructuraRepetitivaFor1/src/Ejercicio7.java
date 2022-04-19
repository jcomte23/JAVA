import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int i,suma=0,num;
		for(i=1;i<=10;i++) {
			System.out.println("ingresa el numero # "+i);
			num=Teclado.nextInt();
			if(i>5) {
				suma=suma+num;
			}
		}
		System.out.println("la suma de los ultimos 5 numeros es: "+suma);

	}

}
