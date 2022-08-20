package Clases;

public class Cola {
	private Nodo inicioCola, finalCola;//instanciamos al primer nodo y al ultimo nodo;
	String cola="";//variable de apoyo para saber cual es el contenido de nuestra cola;
	
	public Cola(){
		inicioCola=null;
		finalCola=null;
	}
	
	//metodo para saber si la cola esta vacia
	public boolean ColaVacia() {
		if(inicioCola==null) {
			return true;
		}else {
			return false;
		}
	}
	
	//metodo para insertar datos a la cola
	public void Insertar(int informacion) {
		Nodo nuevo_nodo =new Nodo();
		nuevo_nodo.informacion=informacion;
		nuevo_nodo.siguiente=null;
		
		if(ColaVacia()==true) {
			inicioCola=nuevo_nodo;
			finalCola=nuevo_nodo;
		}else {
			finalCola.siguiente=nuevo_nodo;
			finalCola=nuevo_nodo;
		}
	}
	
	//metodo para extraer datos de la cola
	public int Extraer() {
		if(ColaVacia()==false) {
			int informacion=inicioCola.informacion;
			if(inicioCola==finalCola) {//validar si solo queda 1 elemento en la cola
				inicioCola=null;
				finalCola=null;
			}else {
				inicioCola=inicioCola.siguiente;
			}
			return informacion;
		}else {
			return Integer.MAX_VALUE;
		}
	}
	
	//metodo para extraer datos de la cola
	public void MostrarContenido() {
		Nodo recorrido=inicioCola;
		String ColaInvertida="";
		while(recorrido!=null) {
			cola+=recorrido.informacion+" ";
			recorrido=recorrido.siguiente;
		}
		
		String cadena[]= cola.split(" ");
		
		for(int i=cadena.length-1;i>=0;i--) {
			ColaInvertida+=" ";
		}
		
	}
}
