import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("ingresa el primer numero");
		num1=Teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		num2=Teclado.nextInt();
		System.out.println("ingresa el tercer numero");
		num3=Teclado.nextInt();
		
		if (num1<num2 && num1<num3) {
            System.out.print(num1);
        } else {
            if (num2<num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }
        System.out.print("-");
        if (num1>num2 && num1>num3) {
            System.out.print(num1);
        } else {
            if (num2>num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }
	}

}
