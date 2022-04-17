import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int i,num,suma=0;
		double promedio;
		for(i=1;i<=10;i++){
			System.out.println("INGRESA EL NUMERO #: "+i);
			num=Teclado.nextInt();
			suma=suma+num;
		}
		promedio=suma/10;
		System.out.println("La suma de los numeros es : "+suma);
		System.out.println("El promedio de los numeros es : "+promedio);
	}

}
