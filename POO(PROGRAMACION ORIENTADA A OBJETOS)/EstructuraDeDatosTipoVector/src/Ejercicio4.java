import java.util.Scanner;

public class Ejercicio4 {
	private Scanner teclado;
	private int[] vector;
	
	public void cargarValoresAlVector() {
		teclado=new Scanner(System.in);
		vector=new int[5];
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		for(int i=0;i<5;i++) {
			System.out.print("Ingresa el valor # "+(i+1)+" del vector= ");
			vector[i]=teclado.nextInt();
		}
		System.out.println(" ");
	}
	
	public void verificarOrdenado() {
        int orden=1;
        for(int i=0;i<4;i++) {
            if (vector[i+1]<vector[i]) {
                orden=0;
            }
        }
        if (orden==1) {
            System.out.println("Esta ordenado de menor a mayor");
        } else {
            System.out.println("No esta ordenado de menor a mayor");
        }
        System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
    }
	
	public static void main(String[] args) {
		Ejercicio4 test=new Ejercicio4();
		test.cargarValoresAlVector();
		test.verificarOrdenado();

	}

}
