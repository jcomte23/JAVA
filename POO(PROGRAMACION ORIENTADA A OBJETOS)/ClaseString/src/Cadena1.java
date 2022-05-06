import java.util.Scanner;

public class Cadena1 {
	private Scanner teclado;
	private String text1;
	private String text2;

	public void cargarStrings() {
		teclado=new Scanner(System.in);
		System.out.print("Ingresa el primer texto=");
		text1=teclado.nextLine();
		System.out.print("Ingresa el segundo texto=");
		text2=teclado.nextLine();
	}
	
	public void MetodoEquals() {
		System.out.println(" ");
		System.out.println("Metodo equals(compara textos)");
		if(text1.equals(text2)==true) {
			System.out.println("Los 2 textos son iguales");
		}else {
			System.out.println("Los textos no coinciden");
		}
	}
	
	public void MetodoEqualsIgnoreCase(){
		System.out.println(" ");
		System.out.println("Metodo equals(compara textos IGNORANDO mayusculas o minusculas)");
		if(text1.equalsIgnoreCase(text2)==true) {
			System.out.println("Los 2 textos son iguales");
		}else {
			System.out.println("Los textos no coinciden");
		}
	}
	
	public void MetodoCompareTo(){
		System.out.println(" ");
		System.out.println("Metodo compareTo(compara textos de acuerdo a las letras en el alfabeto)");
		if (text1.compareTo(text2)==0) {
            System.out.println(text1+" es exactamente igual a "+text2);
        } else {
            if (text1.compareTo(text2)>0) {
                System.out.println(text1+ " es mayor alfabéticamente que "+text2);
            } else {
                System.out.println(text2+ " es mayor alfabéticamente que "+text1);            
            }
        }  
	}
	
	public void MetodoCharAt() {
		System.out.println(" ");
		System.out.println("Metodo charAt(retorna un letra del string)");
		char carac1=text1.charAt(0);
        System.out.println("El primer caracter de "+text1+" es "+carac1);
	}
	
	public void MetodoLength() {
		System.out.println(" ");
		System.out.println("Metodo Length(retorna la cantidad de letras del string)");
		int largo=text1.length();
        System.out.println("El largo del String "+text1+" es "+largo);
	}
	
	public void MetodoSubstring() {
		System.out.println(" ");
		System.out.println("Metodo substring(retorna UNA PARTE del string)");
		String pedazo=text1.substring(0,3);
        System.out.println("Los primeros tres caracteres de "+text1+" son "+pedazo);
	}
	
	public void MetodoIndexOf() {		
		System.out.println(" ");
		System.out.println("Metodo indexOf(verifica si un texto esta dentro de otro e indica la posicion)");
		int posi=text1.indexOf(text2);
        if (posi==-1) {
            System.out.println(text2+" no está contenido en "+text1);
        } else {
            System.out.println(text2+" está contenido en "+text1+" a partir de la posición "+posi);
        }
	}
	
	public void MetodoToUpperCase() {
		System.out.println(" ");
		System.out.println("Metodo toUpperCase(convierte todo el string en MAYUSCULAS)");
		System.out.println(text1+ " convertido a mayúsculas es "+text1.toUpperCase());
	}
	
	public void MetodoToLowerCase() {
		System.out.println(" ");
		System.out.println("Metodo toLowerCase(convierte todo el string en MINUSCULAS)");
        System.out.println(text1+ " convertido a minúsculas es "+text1.toLowerCase()); 
	}

	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		Cadena1 test=new Cadena1();
		test.cargarStrings();
		test.MetodoEquals();
		test.MetodoEqualsIgnoreCase();
		test.MetodoCompareTo();
		test.MetodoCharAt();
		test.MetodoLength();
		test.MetodoSubstring();
		test.MetodoIndexOf();
		test.MetodoToUpperCase();
		test.MetodoToLowerCase();
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");

	}

}
