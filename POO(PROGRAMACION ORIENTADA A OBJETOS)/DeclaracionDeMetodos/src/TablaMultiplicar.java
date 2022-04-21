import java.util.Scanner;

public class TablaMultiplicar {
    private Scanner teclado;
    
    public void cargarValor() {
    	teclado=new Scanner(System.in);
    	int num;
    	do {
    		System.out.println(" ");
    		System.out.println("Ingresa el numero a calcular");
    		num=teclado.nextInt();
    		if(num!=-1) {
    			calcular(num);
    		}
    	}while(num!=-1);
    }
    
    public void calcular(int valor) {
        byte f=1;
    	for(int i=valor;i<=valor*10;i=i+valor) {
    		System.out.println(valor+" X "+f+" = "+i);
    		f++;
    	}
    }
	
	public static void main(String[] args) {
		TablaMultiplicar tabla=new TablaMultiplicar();
		tabla.cargarValor();

	}

}
