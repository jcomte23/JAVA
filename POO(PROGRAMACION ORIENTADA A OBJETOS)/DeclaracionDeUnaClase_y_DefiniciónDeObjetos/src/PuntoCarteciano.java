import java.util.Scanner;

public class PuntoCarteciano {
	private Scanner Teclado;
	private int x,y;
	
	public void inicializar() {
		Teclado=new Scanner(System.in);
		System.out.println("ingresa el valor X del punto ");
		x=Teclado.nextInt();
		System.out.println("ingresa el valor y del punto ");
		y=Teclado.nextInt();
	}
	
	public void calcularPlano() {
		if(x>0 && y>0) {
			System.out.println("El Punto estan en el cuadrante I");
		}else if(x<0 && y>0) {
			System.out.println("El Punto estan en el cuadrante II");
		}else if(x<0 && y<0) {
			System.out.println("El Punto estan en el cuadrante III");
		}else if(x>0 && y<0) {
			System.out.println("El Punto estan en el cuadrante IV");
		}
	}
	
	public static void main(String[] ar) {
		PuntoCarteciano punto1;
		punto1=new PuntoCarteciano();
		punto1.inicializar();
		punto1.calcularPlano();		
	}
	
	
	
	
	
	
	

}
