import java.util.Scanner;

public class MayorMenor {
	private Scanner teclado;
	
	
	public void cargarValores() {
		int num1,num2,num3,numeroMayor,numeroMenor;
		teclado=new Scanner(System.in);
		System.out.print("Ingrese primer valor:");
        num1=teclado.nextInt();
        System.out.print("Ingrese segundo valor:");
        num2=teclado.nextInt();
        System.out.print("Ingrese tercer valor:");
        num3=teclado.nextInt();
        numeroMayor=calcularMayor(num1,num2,num3);
        numeroMenor=calcularMenor(num1,num2,num3);
        System.out.println("El valor mayor de los tres es:"+numeroMayor);
        System.out.println("El valor menor de los tres es:"+numeroMenor);
	}
	
	public int calcularMayor(int valor1,int valor2, int valor3) {
		int resultado;
		if(valor1>valor2 && valor1>valor3) {
			resultado=valor1;
		}else {
			if(valor2>valor3) {
				resultado=valor2;
			}else {
				resultado=valor3;
			}
		}
		return resultado;
	}
	
	public int calcularMenor(int valor1,int valor2, int valor3) {
		int resultado;
		if(valor1<valor2 && valor1<valor3) {
			resultado=valor1;
		}else {
			if(valor2<valor3) {
				resultado=valor2;
			}else {
				resultado=valor3;
			}
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		MayorMenor calculo1=new MayorMenor();
		calculo1.cargarValores();

	}

}
