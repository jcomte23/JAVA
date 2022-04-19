import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int i,res,num;
		System.out.println("ingrese la tabla que deseas imprimir");
		num=Teclado.nextInt();
		for(i=1;i<=12;i++) {
			res=num*i;
			System.out.println(num+" X "+i+" = "+res);
		}

	}

}
