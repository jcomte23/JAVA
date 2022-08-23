
public class Cola {

	class Nodo{
		int info;
		Nodo sig;
	}
	
	Nodo raiz,fondo;
	
	public Cola() {
		raiz=null;
		fondo=null;
	}
	
	public boolean vacia() {
		if(raiz == null)
			return true;
		else {
			return false;
		}			
	}
	
	public void insertar(int x) {
 		Nodo nuevo;
        nuevo = new Nodo ();
        nuevo.info = x;
        nuevo.sig = null;
        if (vacia ()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
 	}
	
	public int extraer ()
    {
 		if (!vacia ())
        {
            int informacion = raiz.info;
            if (raiz == fondo){
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.sig;
            }
            return informacion;
        } else
            return Integer.MAX_VALUE;
    }
	
	public void imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco!=null) {
            System.out.print(reco.info+"-");
            reco=reco.sig;
        }
        System.out.println();
    }
    
    public int cantidad() {
        int cant=0;
        Nodo reco=raiz;
        while (reco!=null) {
            cant++;
            reco=reco.sig;
        }
        return cant;
    }   
	
	

}
