
import javax.swing.*;
import java.awt.event.*;

public class Formula extends JFrame implements ActionListener{
	private JTextField txtFormula;
    private JButton btnVerificarFormula;

	public Formula() {
		setLayout(null);
		txtFormula=new JTextField("{2*(4-5)-{3*4}-[4-5]}");
		txtFormula.setBounds(10,10,230,30);
        add(txtFormula);
        btnVerificarFormula=new JButton("Verificar fórmula.");
        btnVerificarFormula.setBounds(10,70,180,30);
        add(btnVerificarFormula);
        btnVerificarFormula.addActionListener(this);
	}
	
	public boolean balanceada() {
        pila pila1;  
    	pila1 = new pila ();    
    	String cadena=txtFormula.getText();
    	for (int f = 0 ; f < cadena.length() ; f++)
    	{
    	    if (cadena.charAt(f) == '(' || cadena.charAt(f) == '[' || cadena.charAt(f) == '{') {
    	    	pila1.insertar(cadena.charAt(f));
    	    } else {
    	    	if (cadena.charAt(f)==')') {
    	    	    if (pila1.extraer()!='(') {
    	    	        return false;
    	    	    }
    	     	} else {
    	    	    if (cadena.charAt(f)==']') {
    	    	        if (pila1.extraer()!='[') {
    	    	            return false;
    	    	        }
    	    	    } else {
    	    	        if (cadena.charAt(f)=='}') {
    	    	            if (pila1.extraer()!='{') {
    	    	                return false;
    	    	            }
    	    	        }
    	    	    }
    	        }
   	    }   
        }
    	if (pila1.vacia()) {
    	    return true;
    	} else {
   	    return false;
    	}
    }	
	
	 public void actionPerformed(ActionEvent e) {
	        if (e.getSource()==btnVerificarFormula) {
	           if (balanceada()) {
	               setTitle("Está correctamente balanceada.");
	           } else {
	               setTitle("No está correctamente balanceada.");
	           }
	        }
	 }

	public static void main(String[] args) {
		Formula formula1=new Formula();
        formula1.setBounds(0,0,360,160);
        formula1.setResizable(true);
        formula1.setVisible(true);
        formula1.setLocationRelativeTo(null);
        formula1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
