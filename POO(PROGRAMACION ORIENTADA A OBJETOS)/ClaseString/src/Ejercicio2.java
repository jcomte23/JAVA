import java.util.Scanner;

public class Ejercicio2 {
	private Scanner teclado;
	private String texto;
	
	public Ejercicio2() {
		teclado=new Scanner(System.in);
		System.out.print("Ingresa el texto= ");
		texto=teclado.nextLine();
	}
	
	public void ImprimirPrimeraMitad() {
		System.out.println(" ");
		System.out.println("Primera mitad");
		int largo=texto.length();
		int mitad=largo/2;
        String pedazo=texto.substring(0,mitad);
        System.out.println("La mitad de caracteres de "+texto+" es "+pedazo);
	}
	
	public void ImprimirUltimoCaracter() {
		System.out.println(" ");
		System.out.println("Ultimo Caracter");
		int ultimo=texto.length()-1;
		char caracter=texto.charAt(ultimo);
        System.out.println("El ultimo caracter de "+texto+" es "+caracter);
	}
	
	public void ImprimirFormaInversa() {
		System.out.println(" ");
		System.out.println("Texto inverso");
		for(int i=1;i<=texto.length();i++) {
			int ultimo=texto.length()-i;
			char caracter=texto.charAt(ultimo);
	        System.out.print(caracter);
		}
        System.out.println(" ");		
	}
	
	public void ImprimirFormaNormal() {
		System.out.println(" ");
		System.out.println("Texto normal");
		for(int i=0;i<texto.length();i++) {
			char caracter=texto.charAt(i);
	        System.out.print(caracter+"-");
		}
        System.out.println(" ");	
	}
	
	public void ImprimirVocalesl() {
		System.out.println(" ");
		System.out.println("Vocales");
		int cant=0;
		for(int i=0;i<texto.length();i++) {
			if(texto.charAt(i)=='a' || texto.charAt(i)=='A' ||
			   texto.charAt(i)=='e' || texto.charAt(i)=='E' ||
			   texto.charAt(i)=='i' || texto.charAt(i)=='I' ||
			   texto.charAt(i)=='o' || texto.charAt(i)=='O' ||
			   texto.charAt(i)=='u' || texto.charAt(i)=='U') {
				cant++;
			}
		}
		System.out.println("La cantidad de vocales en el string es ="+cant);	
        System.out.println(" ");	
	}
	
	public void ImprimirReversible() {
        int cant=0;
        for(int f=0;f<texto.length()/2;f++) {
            if (texto.charAt(f)==texto.charAt(texto.length()-1-f)) {
                cant++;
            }            	
        }
        if (cant==texto.length()/2) {
            System.out.println("Es capicúa la cadena "+texto);
        } else {
            System.out.println("No es capicúa la cadena "+texto);        
        }
    }

	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		Ejercicio2 test=new Ejercicio2();
		test.ImprimirPrimeraMitad();
		test.ImprimirUltimoCaracter();
		test.ImprimirFormaInversa();
		test.ImprimirFormaNormal();
		test.ImprimirVocalesl();
		test.ImprimirReversible();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");

	}

}
