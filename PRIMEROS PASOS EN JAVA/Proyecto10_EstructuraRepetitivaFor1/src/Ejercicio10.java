import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int i,n,tri=1,equilátero=0,isósceles=0,escaleno=0;
		double lado1,lado2,lado3;
		System.out.println("ingresa cuantos triangulos vas a calcular:");
		n=Teclado.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println("//////////");
			System.out.println("ingresa la lado"+tri+" del triangulo # "+i);
			lado1=Teclado.nextDouble();
			tri++;
			System.out.println("ingresa la lado"+tri+" del triangulo # "+i);
			lado2=Teclado.nextDouble();
			tri++;
			System.out.println("ingresa la lado"+tri+" del triangulo # "+i);
			lado3=Teclado.nextDouble();
			tri=1;
			if(lado1==lado2 && lado1==lado3) {
				equilátero++;
			}else if(lado1==lado2 && lado1!=lado3) {
				isósceles++;
			}else {
				escaleno++;
			}
		}		
		System.out.println(equilátero+" triagulos son equilateros");
		System.out.println(isósceles+" triagulos son isósceles");
		System.out.println(escaleno+" triagulos son escaleno");
		if(equilátero<isósceles && equilátero<escaleno) {
			System.out.println("hay menos triangulos equilateros");
		}else {
			if(isósceles<escaleno) {
				System.out.println("hay menos triangulos isoceles");
			}else {
				System.out.println("hay menos triangulos escalenos");
			}
		}
		

	}

}
