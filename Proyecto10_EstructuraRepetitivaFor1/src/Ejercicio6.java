import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int i,n,superiores=0;
		double base,altura,superficie;
		System.out.println("ingresa triangulos vas a calcular:");
		n=Teclado.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println("//////////");
			System.out.println("ingresa la base del triangulo # "+i);
			base=Teclado.nextDouble();
			System.out.println("ingresa la altura del triangulo # "+i);
			altura=Teclado.nextDouble();
			superficie=(base*altura)/2;
			System.out.println("la superficie del triangulo #"+i+" es ="+superficie);
			System.out.println(" ");
			if(superficie>12) {
				superiores++;
			}
		}
		System.out.println(superiores+" triagulos tienen una superficie mayor a 12");
	}

}
