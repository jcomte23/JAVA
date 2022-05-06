public class TablaMultiplicar {
	private int table;
	private int terminos;

	public TablaMultiplicar(int tabla,int cantidadResultados) {
		table=tabla;
		terminos=cantidadResultados;
	}
	
	public TablaMultiplicar(int tabla) {
		table=tabla;
		terminos=10;
	}
	
	public void imprimir() {
		System.out.println("tabla de multiplicar del "+table);
		for(int i=1;i<=terminos;i++) {
			int resp=table*i;
			System.out.println(table+" X "+terminos+" = "+resp);
		}
	}
	

	public static void main(String[] args) {
		TablaMultiplicar tabla1=new TablaMultiplicar(3);
		tabla1.imprimir();
		TablaMultiplicar tabla2=new TablaMultiplicar(3,20);
		tabla2.imprimir();
	}

}
