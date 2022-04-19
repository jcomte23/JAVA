import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int i,edad,suma=0;
		float promedioManana=0,promedioTarde=0,promedioNoche=0;
		
		System.out.println("MANANA");
		for(i=1;i<=5;i++) {			
			System.out.println("ingresa la edad del estudiante #: "+i);
			edad=Teclado.nextInt();
			suma=suma+edad;
			promedioManana=suma/5;
			System.out.println("--");
		}
		
		suma=0;
		System.out.println(" ");
		System.out.println("TARDE");
		for(i=1;i<=6;i++) {			
			System.out.println("ingresa la edad del estudiante #: "+i);
			edad=Teclado.nextInt();
			suma=suma+edad;
			promedioTarde=suma/6;
			System.out.println("--");
		}
		
		suma=0;
		System.out.println(" ");
		System.out.println("NOCHE");
		for(i=1;i<=2;i++) {			
			System.out.println("ingresa la edad del estudiante #: "+i);
			edad=Teclado.nextInt();
			suma=suma+edad;
			promedioNoche=suma/2;
			System.out.println("--");
		}
		
		System.out.println("El promedio de edades de la manana es: "+ promedioManana);
		System.out.println("El promedio de edades de la tarde es: "+ promedioTarde);
		System.out.println("El promedio de edades de la noche es: "+ promedioNoche);
		if(promedioManana<promedioTarde && promedioManana<promedioNoche) {
			System.out.println("El promedio ma bajo es: "+ promedioManana+" el cual pertenece a la jornada de la MANANA");
		}else {
			if(promedioTarde<promedioNoche) {
				System.out.println("El promedio ma bajo es: "+ promedioTarde+" el cual pertenece a la jornada de la TARDE");
			}else {
				System.out.println("El promedio ma bajo es: "+ promedioNoche+" el cual pertenece a la jornada de la NOCHE");
			}
		}
		

	}

}
