import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int i,num,negativos=0,neutro=0,positivos=0,multiplos15=0,pares=0;
		for(i=1;i<=10;i++) {
			System.out.println("ingresa el numero:");
			num=Teclado.nextInt();
			if(num<0) {
				negativos++;
			}else if(num==0) {
				neutro++;
			}else {
				positivos++;
			}
			
			if(num%15==0) {
				multiplos15++;
			}else if(num%2==0) {
				pares=pares+num;
			}
		}
		
		System.out.println("NEGATIVOS:"+negativos);
		System.out.println("NEUTROS:"+neutro);
		System.out.println("POSITIVOS:"+positivos);
		System.out.println(multiplos15+" numeros son multiplos de 15");
		System.out.println(pares+" es el valor acumulado de los pares");
		

	}

}
