import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formula extends JFrame implements ActionListener{
	private JTextField texto;
	private JButton boton;

	public Formula() {
		setLayout(null);
		texto=new JTextField("(2+[3-12]*{8/3})");
		texto.setBounds(10,10,230,30);
		add(texto);
		
		boton=new JButton("Verficar Formula.");
		boton.setBounds(10,70,180,30);
		add(boton);
		boton.addActionListener(this);
	}
	
	public boolean balanceada() {
		Pila pila1=new Pila();
		String cadena=texto.getText();
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{' ) {
				pila1.insertar(cadena.charAt(i));
			}else {
				if(cadena.charAt(i)==')') {
					if(pila1.extraer()!='(') {
						return false;
					}	
				} else {
    	    	    if (cadena.charAt(i)==']') {
    	    	        if (pila1.extraer()!='[') {
    	    	            return false;
    	    	        }
    	    	    } else {
    	    	        if (cadena.charAt(i)=='}') {
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
		if(e.getSource()==boton) {
			if (balanceada()) {
	               setTitle("Está correctamente balanceada.");
	               
	           } else {
	               setTitle("No está correctamente balanceada.");
	           }
		}
	}

	public static void main(String[] args) {
		Formula test=new Formula();
		test.setBounds(0,0,360,160);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
