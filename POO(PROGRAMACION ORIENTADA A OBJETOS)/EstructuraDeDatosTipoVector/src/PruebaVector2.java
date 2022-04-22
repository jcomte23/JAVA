import java.util.Scanner;

public class PruebaVector2 {
	private Scanner teclado;
	private float[] alturasDePersonas;
	private float sumaAlturas;
	
	public void ingresoDeAlturasAlSistema() {
		teclado=new Scanner(System.in);
		alturasDePersonas=new float[5];
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		for(int i=0;i<5;i++) {
			System.out.print("Ingresa la altura de la persona # "+(i+1)+"= ");
			alturasDePersonas[i]=teclado.nextFloat();
			sumaAlturas+=alturasDePersonas[i];
		}
	}
	
	public float obtenerPromedioDeAlturas() {
		float promedio;
		promedio=sumaAlturas/5;
		return promedio;
	}
	
	public void conteoDePersonasAltasYbajas() {
		int personasAltas = 0;
		int personasBajas = 0;
		for(int i=0;i<5;i++) {
			if(alturasDePersonas[i] >= obtenerPromedioDeAlturas()) {				
				personasAltas++;
			}else {
				personasBajas++;
			}
		}
		System.out.println(" ");
		System.out.println(obtenerPromedioDeAlturas()+" es el promedio general");
		System.out.println(personasAltas+" personas son altas");
		System.out.println(personasBajas+" personas son bajas");
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}

	public static void main(String[] args) {
		PruebaVector2 test=new PruebaVector2();
		test.ingresoDeAlturasAlSistema();
		test.conteoDePersonasAltasYbajas();
	}

}
