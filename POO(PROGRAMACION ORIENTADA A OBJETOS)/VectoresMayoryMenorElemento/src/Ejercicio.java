import java.util.Scanner;

public class Ejercicio {
	private Scanner teclado;
	private int[] elementos;
	
	public void cargarDatosAlSistema() {
		teclado=new Scanner(System.in);
		int cantidadDeElementos;
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		System.out.print("Ingresa el numero de personas a calcular= ");
		cantidadDeElementos=teclado.nextInt();
		System.out.println(" ");
		elementos=new int[cantidadDeElementos];
		for(int i=0;i<elementos.length;i++) {
			System.out.print("Ingresa el nombre del operador # "+(i+1)+" = ");
			elementos[i]=teclado.nextInt();
		}
	}
	
	public void calcularElelementoMenor() {
		int menor;
        int pos;
        menor=elementos[0];
        pos=0;
        int cantidad=0;
        for(int f=1;f<elementos.length;f++) {
            if (elementos[f]<menor) {
                menor=elementos[f];
                pos=f;
            }
        }
             
        for(int f=1;f<elementos.length;f++) {
            if (elementos[f]==menor) {
            	cantidad++;
            }
        }        
        System.out.println("El menor es "+elementos[pos]);
        System.out.print("El dato "+menor+" se repite "+cantidad+" veses");
        System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}

	public static void main(String[] args) {
		Ejercicio test= new Ejercicio();
		test.cargarDatosAlSistema();
		test.calcularElelementoMenor();

	}


}
