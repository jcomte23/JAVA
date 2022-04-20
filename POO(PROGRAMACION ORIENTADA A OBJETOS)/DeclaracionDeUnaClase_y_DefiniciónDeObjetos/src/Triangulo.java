import java.util.Scanner;

public class Triangulo {
	private Scanner teclado;
	private float lado1,lado2,lado3;
	
	public void inicializar() {
		teclado=new Scanner(System.in);
		System.out.println("Bienvenido");
		System.out.println(" ");
		System.out.print("ingresa la longitud del lado 1: ");
		lado1=teclado.nextFloat();
		System.out.print("ingresa la longitud del lado 2: ");
		lado2=teclado.nextFloat();
		System.out.print("ingresa la longitud del lado 3: ");
		lado3=teclado.nextFloat();
	}
	
	public void imprimirLadoMayor() {
		if(lado1>lado2 && lado1>lado3) {
			System.out.println("el lado 1 es las largo con una longitud de: "+lado1);
		}else {
			if(lado2>lado3) {
				System.out.println("el lado 2 es las largo con una longitud de: "+lado2);
			}else {
				System.out.println("el lado 3 es las largo con una longitud de: "+lado3);
			}
		}
	}
	
	public void calcularTipoDeTriagulo() {
		if(lado1==lado2 && lado1==lado3) {
			System.out.print("Este es un triangulo EQUILATERO");
		}else {
			System.out.print("Este NO es un triangulo  EQUILATERO");
		}
	}
	
	

	public static void main(String[] args) {
		Triangulo triangulo1;
		triangulo1=new Triangulo();
		triangulo1.inicializar();
		triangulo1.imprimirLadoMayor();
		triangulo1.calcularTipoDeTriagulo();
	}

}
