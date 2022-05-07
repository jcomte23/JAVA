package cluds;
import java.util.Scanner;

public class Clud {
	private Socio socio1,socio2,socio3;
	private Scanner teclado;
	
	public Clud() {
		teclado=new Scanner(System.in);
		socio1=new Socio(teclado);
		socio2=new Socio(teclado);
		socio3=new Socio(teclado);
	}

	public void imprimirSocioMayor() {
		int soc1=socio1.extraerAntiguedad();
		int soc2=socio2.extraerAntiguedad();
		int soc3=socio3.extraerAntiguedad();
		
		if(soc1>soc2 && soc1>soc3) {
			System.out.println("El socio mayor es=");
			socio1.imprimirSocio();
		}else {
			if(soc2 >soc3) {
				System.out.println("El socio mayor es=");
				socio2.imprimirSocio();
			}else {
				System.out.println("El socio mayor es=");
				socio3.imprimirSocio();
			}
		}
	}

	public static void main(String[] args) {
		Clud test=new Clud();
		test.imprimirSocioMayor();

	}

}
