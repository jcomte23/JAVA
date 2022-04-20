import java.util.Scanner;

public class Operaciones {
	private Scanner teclado;
	private float num1,num2,suma,resta,multiplicacion,division;

	public void ingresoDatos() {
		teclado=new Scanner(System.in);
		System.out.print("Ingresa el primer valor= ");
		num1=teclado.nextFloat();
		System.out.print("Ingresa el segundo valor= ");
		num2=teclado.nextFloat();
	}
	
	public void sumarValores() {
		suma=num1+num2;
	}
	
	public void restarValores() {
		resta=num1-num2;
	}
	
	public void multiplicaionValores() {
		multiplicacion=num1*num2;
	}
	
	public void divisionValores() {
		division=num1/num2;
	}
	
	public void imprimirResultados() {
		System.out.println("La suma de los valores es= "+suma);
		System.out.println("La resta de los valores es= "+resta);
		System.out.println("La multiplicacion de los valores es= "+multiplicacion);
		System.out.println("La division de los valores es= "+division);
	}
	
	
	public static void main(String[] args) {
		Operaciones operacion=new Operaciones();
		operacion.ingresoDatos();
		operacion.sumarValores();
		operacion.restarValores();
		operacion.multiplicaionValores();
		operacion.divisionValores();
		operacion.imprimirResultados();

	}

}
