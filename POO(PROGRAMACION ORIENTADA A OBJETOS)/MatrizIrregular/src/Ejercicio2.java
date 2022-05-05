import java.util.Scanner;

public class Ejercicio2 {
	private Scanner teclado;
	private String[] nombresEmpleados;
	private int [][] faltas;
	
	public void cargarDatosAlaMatriz() {
		teclado=new Scanner(System.in);
		nombresEmpleados=new String[3];
		
		int empleados=nombresEmpleados.length;		
		faltas=new int[empleados][];
		
		System.out.print("Ingresa los datos de los empleados");
		System.out.println(" ");
		for(int f=0;f<faltas.length;f++) {
			System.out.print("Como se llama el empleado #"+(f+1)+" =");
			nombresEmpleados[f]=teclado.next();
			System.out.print("Cuantos dias falto empleado "+nombresEmpleados[f]+" =");
			int dias=teclado.nextInt();
			faltas[f]=new int[dias];
			for(int c=0;c<faltas[f].length;c++) {
				System.out.print("ingrese el numero de dia que falto la vez #"+(c+1)+" =");
				faltas[f][c]=teclado.nextInt();
			}
			System.out.println(" ");
		}
	}
	
	public void imprimir() {
		System.out.println("FALTAS=");
		for(int f=0;f<faltas.length;f++) {
			System.out.print(nombresEmpleados[f]+" ");
			for( int c=0;c<faltas[f].length;c++) {
				System.out.print(faltas[f][c]+" ");
			}
			System.out.println(" ");
		}
	}
	
	public void imprimirEmpleadoMenosFaltas() {
		int cantidadfaltas=faltas[0].length;
        String nom=nombresEmpleados[0];
        for(int f=1;f<faltas.length;f++) {
            if (faltas[f].length<cantidadfaltas) {
            	cantidadfaltas=faltas[f].length;
                nom=nombresEmpleados[f];
            }
        }
        System.out.println("El empleado que faltó menos es "+nom+" con "+cantidadfaltas+" faltas.");

	}

	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		Ejercicio2 test=new Ejercicio2();
		test.cargarDatosAlaMatriz();
		test.imprimir();
		test.imprimirEmpleadoMenosFaltas();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");

	}

}
