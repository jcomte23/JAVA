import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		int i,x,y,primer=0,segundo=0,tercero=0,cuarto=0;
		for(i=1;i<=10;i++) {
			System.out.println("ingresa el valor X del punto "+i);
			x=Teclado.nextInt();
			System.out.println("ingresa el valor y del punto "+i);
			y=Teclado.nextInt();
			if(x>0 && y>0) {
				primer++;
			}else if(x<0 && y>0) {
				segundo++;
			}else if(x<0 && y<0) {
				tercero++;
			}else if(x>0 && y<0) {
				cuarto++;
			}
			x=0;
			y=0;
		}
		System.out.println(primer+" Puntos estan en el cuadrante I");
		System.out.println(segundo+" Puntos estan en el cuadrante II");
		System.out.println(tercero+" Puntos estan en el cuadrante III");
		System.out.println(cuarto+" Puntos estan en el cuadrante IV");

	}

}
