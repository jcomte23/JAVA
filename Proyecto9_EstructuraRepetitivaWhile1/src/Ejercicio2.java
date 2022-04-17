import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int num,x,acum,limit;
		double promedio;
		acum=0;
		x=1;
		limit=4;
		while(x<=limit) {
			System.out.println("INGRESE EL NUMERO # "+x);
			num=Teclado.nextInt();
			acum=acum+num;
			x++;
		}
		promedio=acum/limit;
		System.out.println("La suma de los valores es="+acum);
		System.out.println("el promedio general es="+promedio);
	}

}
