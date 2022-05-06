
public class Ejercicio2 {
	private int valor1;
	private int valor2;

	public Ejercicio2(int num1,int num2) {
		valor1=num1;
		valor2=num2;
	}
	
	public int sumar() {
		int resultado=valor1+valor2;
		return resultado;
	}
	
	public int restar() {
		int resultado=valor1-valor2;
		return resultado;
	}
	
	public int multiplicar() {
		int resultado=valor1*valor2;
		return resultado;
	}
	
	public float dividir() {
		float resultado=valor1/valor2;
		return resultado;
	}
	
	public void imprimirOperaciones() {
		System.out.println("OPERACIONES");
		System.out.println("SUMA= "+sumar());
		System.out.println("RESTA= "+restar());
		System.out.println("MULTIPLICACION= "+multiplicar());
		System.out.println("DIVICION= "+dividir());
	}

	public static void main(String[] args) {
		Ejercicio2 test=new Ejercicio2(3,2);
		test.imprimirOperaciones();
	}

}
