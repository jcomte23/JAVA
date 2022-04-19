import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int lista1=0,num1=0,lista2=0,num2=0,x=1;
		while(x<=4) {
			System.out.println("LISTA 1");
			System.out.println("INGRESE VALOR # "+x);
			num1=Teclado.nextInt();
			lista1=lista1+num1;
			System.out.println("----");
			System.out.println("LISTA 2");
			System.out.println("INGRESE VALOR # "+x);
			num2=Teclado.nextInt();
			lista2=lista2+num2;
			System.out.println("----");
			x++;
		}
		if(lista1>lista2) {
			System.out.println("LISTA 1 gana con un acumulado de "+lista1);
		}else if(lista1==lista2)
			System.out.println("las listas estan iguales con un acumulado de "+lista1);
		else {
			System.out.println("LISTA 2 gana con un acumulado de "+lista2);
		}
	}

}
