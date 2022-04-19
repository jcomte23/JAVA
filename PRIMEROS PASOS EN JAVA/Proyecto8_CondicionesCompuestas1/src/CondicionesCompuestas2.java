import java.util.Scanner;

public class CondicionesCompuestas2 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int dia,mes,year;
		System.out.println("ingresa el dia");
		dia=Teclado.nextInt();
		System.out.println("ingresa el mes");
		mes=Teclado.nextInt();
		System.out.println("ingresa el year");
		year=Teclado.nextInt();
		
		if(mes>1 && mes<3) {
			System.out.println("La fecha "+dia+"/"+mes+"/"+year+" pertenece al primer trimestre");
		}else {
			System.out.println("La fecha "+dia+"/"+mes+"/"+year+" NO pertenece al primer trimestre");
		}

	}

}
