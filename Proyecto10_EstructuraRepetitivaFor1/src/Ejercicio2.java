import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int i,nota,aprovados=0,reprovados=0;
		for(i=1;i<=10;i++){
			System.out.println("INGRESA LA NOTA #: "+i);
			nota=Teclado.nextInt();
			if(nota>=7) {
				aprovados++;
			}else {
				reprovados++;
			}
		}
		System.out.println("APROVADOS: "+aprovados);
		System.out.println("REPROVADOS: "+reprovados);

	}

}
