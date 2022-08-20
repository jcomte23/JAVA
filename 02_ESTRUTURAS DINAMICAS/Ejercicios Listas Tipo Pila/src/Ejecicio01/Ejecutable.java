package Ejecicio01;

import javax.swing.*;

public class Ejecutable extends JFrame {
	private JLabel titulo,lbtexto;
	private JTextField txttexto;
	
	public Ejecutable() {
		setLayout(null);
		titulo=new JLabel("listas Tipo PILA.");
		titulo.setBounds(10,10,300,30);
        add(titulo);
        lbtexto=new JLabel("ingresa el numero =");
        lbtexto.setBounds(10,40,300,30);
        add(lbtexto);
        txttexto=new JTextField();
        txttexto.setBounds(137,40,50,30);
        add(txttexto);
	}

	public static void main(String[] args) {
		Ejecutable programa=new Ejecutable();
		programa.setBounds(450,200,400,300);
		programa.setResizable(false);
		programa.setVisible(true);
		programa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
