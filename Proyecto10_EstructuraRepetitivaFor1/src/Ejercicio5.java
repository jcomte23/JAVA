import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int i,n,num,mayores=0,menores=0;
		System.out.println("INGRESA LA CANTIDAD DE NUMEROS A CALCULAR");
		n=Teclado.nextInt();
		for(i=1;i<=n;i++){
			System.out.println("INGRESA EL NUMERO #: "+i);
			num=Teclado.nextInt();
			if(num>=1000) {
				mayores++;
			}else {
				menores++;
			}
		}
		System.out.println("MAYORES A 1000: "+mayores);
		System.out.println("MENORES: "+menores);
	}

}
