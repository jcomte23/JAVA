import java.util.Scanner;

public class Cuadrado {
	private Scanner teclado;
	private int lado,perimetro,superficie;
	
	public void inicializar() {
		teclado=new Scanner(System.in);
		System.out.println("Ingresa la longitud del lado");
		lado=teclado.nextInt();
	}
	
	public void calcularPerimetro() {
		perimetro=lado*4;
	}
	
	public void calcularSuperficie() {
		superficie=lado*lado;
	}
	
	public void Imprimir() {
		System.out.println("El perimetro del cuadrado es= "+perimetro);
		System.out.println("La superficie del cuadrado es= "+superficie);
	}
	
	public void fin() {
		Cuadrado cuadrado1=new Cuadrado();
		cuadrado1.inicializar();
		cuadrado1.calcularPerimetro();
		cuadrado1.calcularSuperficie();
		cuadrado1.Imprimir();
	}
	
	public static void main(String[] args) {
		Cuadrado cuadrado1=new Cuadrado();
		cuadrado1.fin();
	}

}
