import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int i,num,multiplos3=0,multiplos5=0;
		for(i=1;i<=4;i++){
			System.out.println("INGRESA EL NUMERO #: "+i);
			num=Teclado.nextInt();
			if(num%3==0 && num%5==0) {
				multiplos3++;
				multiplos5++;
			}else if(num%3==0){
				multiplos3++;
			}else {
				multiplos5++;
			}
		}
		System.out.println("Multiplos de 3: "+multiplos3);
		System.out.println("REPROVADOS: "+multiplos5);
	}

}
