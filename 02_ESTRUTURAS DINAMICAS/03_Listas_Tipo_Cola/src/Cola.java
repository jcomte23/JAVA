import javax.swing.*;
import java.awt.event.*;

public class Cola extends JFrame implements ActionListener{

	class Nodo{
		int info;
		Nodo sig;
	}
		
	private JLabel lblNum,lblCola;
	private JTextField txtNum;
	private JTextArea txtArea;
	private JScrollPane scrollArea;
	private JButton btnAgregar,btnRestar,btnCerrar;
	private Nodo raiz,fondo;
	String texto= "";

 	public Cola() {
		raiz=null;
		fondo=null;
		//carga de la interfaz visual
		setLayout(null);
		lblNum=new JLabel("Ingrese el numero:");
		lblNum.setBounds(10,20,300,30);
        add(lblNum);

        txtNum=new JTextField();
        txtNum.setBounds(140,20,150,30);
        add(txtNum);
        
        btnAgregar=new JButton("sumar");
        btnAgregar.setBounds(10,50,100,30);
        add(btnAgregar);
        btnAgregar.addActionListener(this);
        
        btnRestar=new JButton("restar");
        btnRestar.setBounds(100,50,100,30);
        add(btnRestar);
        btnRestar.addActionListener(this);
        
        btnCerrar=new JButton("Close");
        btnCerrar.setBounds(320,20,100,30);
        add(btnCerrar);
        btnCerrar.addActionListener(this);
        
        lblCola=new JLabel("PILA");
        lblCola.setBounds(10,80,300,30);
        add(lblCola);
        
        txtArea=new JTextArea();
        scrollArea=new JScrollPane(txtArea);   
        scrollArea.setBounds(10,110,400,300);
        add(scrollArea);
	}
 	
 	boolean vacia (){
        if (raiz == null)
            return true;
        else
            return false;
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
 		txtArea.setText(" ");
 		Nodo Reco=raiz;
 		texto="";
 		while(Reco!=null) { 		
 			texto+=Reco.info+"\n";
 			txtArea.setText(texto);
 			Reco=Reco.sig;
 		}
 	}
	
	
	public void actionPerformed(ActionEvent e) {		
        if (e.getSource()==btnAgregar) {
        	String temp=txtNum.getText();
        	int x=Integer.parseInt(temp);
        	txtNum.setText("");
        	insertar(x);
        	setTitle("insertado: "+x);
        	imprimir();
        }
        if (e.getSource()==btnRestar) {
        	extraer();
        	imprimir();
        }
        if (e.getSource()==btnCerrar) {
        	System.exit(0);
        }
    }

	public static void main(String[] args) {
		Cola interfaz=new Cola();
		interfaz.setBounds(0,0,800,800);
        interfaz.setResizable(true);
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
