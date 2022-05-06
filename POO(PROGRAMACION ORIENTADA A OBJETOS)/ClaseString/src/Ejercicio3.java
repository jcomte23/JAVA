import java.util.Scanner;

public class Ejercicio3 {
	private Scanner teclado;
	private String password;
	
	public Ejercicio3() {
		teclado=new Scanner(System.in);
		System.out.print("Ingresa la contraseña= ");
		password=teclado.nextLine();
	}
	
	public void validarPassword() {
		if(password.equals("123abc")==true) {
			System.out.println("Enorabuena Password corecta");
		}else {
			System.out.println("Error Password incorrecta");
		}
	}

	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		Ejercicio3 test=new Ejercicio3();
		test.validarPassword();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}

}
