import java.util.Scanner;

public class Ejercicio4 {
	private Scanner teclado;
	private String [] nombres;
	private String [] correos;
	private int personas;

	public Ejercicio4() {
		teclado=new Scanner(System.in);
		System.out.println("Ingresa la informacion");
		personas=3;
		nombres=new String[personas];
		correos=new String[personas];
		for(int i=0;i<personas;i++) {
			System.out.println("Persona "+(i+1));
			System.out.print("Nombre Completo= ");
			nombres[i]=teclado.nextLine();
			System.out.print("E-mail= ");
			correos[i]=teclado.nextLine();
			System.out.println("");
		}
	}
	
	public void ImprimirDatos() {
		System.out.println("Datos ingresados");
		for(int i=0;i<personas;i++) {			
			System.out.println("Persona "+(i+1));
			System.out.println("Nombre Completo= "+nombres[i]);
			System.out.println("E-mail= "+correos[i]);
			System.out.println("");
		}
	}
	
	public void correosRechazados() {
		System.out.println("Correo rechazados");
		for(int i=0;i<personas;i++) {
			String caracter="@";
			int posi=correos[i].indexOf(caracter);
	        if (posi==-1) {
	            System.out.println("* "+correos[i]);
	        } 
		}
	}
	
	public void busquedaDatos() {
		String aux;
        System.out.print("Ingrese el nombre de la persona:");
        aux=teclado.nextLine();
        boolean existe=false;
        for(int f=0;f<nombres.length;f++) {
            if (aux.equals(nombres[f])) {
                System.out.println("Mail de la persona:"+correos[f]);
                existe=true;
            }
        }
        if (existe==false) {
            System.out.println("No existe una persona con ese nombre.");
        }
	}

	public static void main(String[] args) {
		Ejercicio4 test=new Ejercicio4();
		test.ImprimirDatos();
		test.correosRechazados();
		test.busquedaDatos();
	}

}
