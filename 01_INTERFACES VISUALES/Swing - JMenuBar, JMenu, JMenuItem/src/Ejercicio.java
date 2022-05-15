import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio extends JFrame implements ActionListener{
	private JMenuBar barraMenu;
	private JMenu menu;
	private JMenuItem alterar,finalizar;
	private JLabel lbancho,lbalto;
	private JTextField ancho,alto;
	

	public Ejercicio() {
		setLayout(null);
		barraMenu=new JMenuBar();
		setJMenuBar(barraMenu);
		menu=new JMenu("Opciones");
		barraMenu.add(menu);
		
		alterar=new JMenuItem("Alterar Tamaño");
		alterar.addActionListener(this);
		menu.add(alterar);
		
		lbancho=new JLabel("ANCHO");
		lbancho.setBounds(12,10,300,30);
        add(lbancho);
        
        ancho=new JTextField();
        ancho.setBounds(10,30,100,30);
        add(ancho);
        
        lbalto=new JLabel("ALTO");
        lbalto.setBounds(12,70,300,30);
        add(lbalto);
        
        alto=new JTextField();
        alto.setBounds(10,90,100,30);
        add(alto);
		
		finalizar=new JMenuItem("Exit");
		finalizar.addActionListener(this);
		menu.add(finalizar);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==alterar) {
			String cad1=ancho.getText();
			String cad2=alto.getText();
			setTitle("menu alterado= "+cad1+" X "+cad2);
			int ancho=Integer.parseInt(cad1);
			int alto=Integer.parseInt(cad2);
			setSize(ancho,alto);
		}else {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Ejercicio test=new Ejercicio();
		test.setBounds(10,20,300,200);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
