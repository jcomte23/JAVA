public class Pila {
	
    class Nodo {
        int info;
        Nodo sig;
    }
	
    private Nodo raiz;
    
    public Pila () {
        raiz=null;
    }
    
    public void insertar(int x) {
    	Nodo nuevo = new Nodo();
        nuevo.info = x;
        if (raiz==null)
        {
            nuevo.sig = null;
            raiz = nuevo;
        }
        else
        {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
    
    public int extraer ()
    {
        if (raiz!=null)
        {
            int informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    
    
    public void imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la pila.");
        while (reco!=null) {
            System.out.print(reco.info+"-");
            reco=reco.sig;
        }
        System.out.println();
    }
    
    public void contarNodos() {
    	Nodo reco=raiz;
    	System.out.println(" ");
    	if (raiz!=null)
        {
    		int cantidadNodos=0;
    		while (reco!=null) {
    			cantidadNodos++;
                reco=reco.sig;
            }
    		System.out.println("Cantidad de nodos de la pila ="+cantidadNodos);
        }else{
        	System.out.println("La pila esta vacia");
        }
    }
    
    public void PrimerNodo() {
    	Nodo reco=raiz;
    	if (raiz!=null)
        {
    		System.out.print("El primer nodo tiene el valod de "+reco.info);
        }else{
        	System.out.println("La pila esta vacia");
        }
    }
    
    public static void main(String[] ar) {
        Pila pila1=new Pila();
        pila1.insertar(10);
        pila1.insertar(40);
        pila1.insertar(3);
        pila1.imprimir();
        System.out.println("Extraemos de la pila:"+pila1.extraer());
        pila1.imprimir();
        pila1.insertar(487);
        pila1.imprimir();
        pila1.contarNodos();
        pila1.PrimerNodo();
    }
}
