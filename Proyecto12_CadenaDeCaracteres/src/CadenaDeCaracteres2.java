import java.util.Scanner;

public class CadenaDeCaracteres2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String nombre1,nombre2;
		int edad1,edad2;
		System.out.print("Ingrese el nombre:");
        nombre1=teclado.nextLine();
        System.out.print("Ingrese edad:");
        edad1=teclado.nextInt();
        System.out.print("Ingrese el nombre:");
        teclado.nextLine();
        nombre2=teclado.nextLine();
        System.out.print("Ingrese edad:");
        edad2=teclado.nextInt();
        System.out.print("La persona de mayor edad es:");
        if (edad1>edad2) {
            System.out.print(nombre1);
        } else {
            System.out.print(nombre2);
        }

	}

}
