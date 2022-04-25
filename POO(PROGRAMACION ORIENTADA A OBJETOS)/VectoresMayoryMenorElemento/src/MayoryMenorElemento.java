import java.util.Scanner;

public class MayoryMenorElemento {
	private Scanner teclado;
	private String[] nombres;
	private float[] sueldos;
	
	public void cargarDatosAlSistema() {
		teclado=new Scanner(System.in);
		
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		
		nombres=new String[5];
		sueldos=new float[5];
		for(int i=0;i<nombres.length;i++) {
			System.out.print("Ingresa el nombre del operador # "+(i+1)+" = ");
			nombres[i]=teclado.nextLine();			
			System.out.print("Ingresa el sueldo del operador # "+(i+1)+" = ");
			sueldos[i]=teclado.nextFloat();
			teclado.nextLine();
			System.out.println(" ");
		}
	}
	
	public void calcularPersonaConMayorSueldo() {
		float mayor;
        int pos;
        mayor=sueldos[0];
        pos=0;
        for(int f=1;f<nombres.length;f++) {
            if (sueldos[f]>mayor) {
                mayor=sueldos[f];
                pos=f;
            }
        }
        System.out.println("El empleado con sueldo mayor es "+nombres[pos]);
        System.out.println("Tiene un sueldo:"+mayor);
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}

	public static void main(String[] args) {
		MayoryMenorElemento test= new MayoryMenorElemento();
		test.cargarDatosAlSistema();
		test.calcularPersonaConMayorSueldo();

	}

}
