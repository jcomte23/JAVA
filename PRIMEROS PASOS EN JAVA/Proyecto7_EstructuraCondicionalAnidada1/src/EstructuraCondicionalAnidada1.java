import java.util.Scanner;

public class EstructuraCondicionalAnidada1 {
	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		System.out.println("ingresa la primer nota");
		float nota1=Teclado.nextFloat();
		System.out.println("ingresa la segunda nota");
		float nota2=Teclado.nextFloat();
		System.out.println("ingresa el tercera nota");
		float nota3=Teclado.nextFloat();
		float sumaNotas=nota1+nota2+nota3;
		float promedio=sumaNotas/3;
		if(promedio<=4) {
			System.out.println("Reprobado");
		}else if(promedio>=4 && promedio<7){
			System.out.println("Regular");
		}else if(promedio>=7) {
			System.out.println("Promocionado");
		}

	}

}