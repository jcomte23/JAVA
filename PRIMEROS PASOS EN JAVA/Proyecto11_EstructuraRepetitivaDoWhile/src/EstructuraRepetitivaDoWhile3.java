import java.util.Scanner;

public class EstructuraRepetitivaDoWhile3 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		double peso;
		byte contadorGeneral=0,PiezasPequenas=0,PiezasMedianas=0,PiezasGrandes=0;
		do {
			System.out.println("INGRESE EL PESO DE UNA PIEZA");
			peso=Teclado.nextDouble();
			if(peso!=0) {
				if(peso<=9.8) {
					contadorGeneral++;
					PiezasPequenas++;
					System.out.println(" ");
				}else {
					if(peso<=10.2) {
						contadorGeneral++;
						PiezasMedianas++;
						System.out.println(" ");
					}else {
						contadorGeneral++;
						PiezasGrandes++;
						System.out.println(" ");
					}
				}
			}
			
		}while(peso!=0);
		System.out.println("Se ingresaron "+contadorGeneral+" piezas");
		System.out.println(PiezasPequenas+" piezas son pequenas");
		System.out.println(PiezasMedianas+" piezas son pequenas");
		System.out.println(PiezasGrandes+" piezas son pequenas");

	}

}
