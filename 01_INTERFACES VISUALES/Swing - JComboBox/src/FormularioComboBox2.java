import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioComboBox2 extends JFrame implements ActionListener{
	private JLabel label1,label2,label3;
	private JComboBox<String> combo1,combo2,combo3;
	private JButton boton1;
	

	public FormularioComboBox2() {
		setLayout(null);
		label1=new JLabel("Rojo=");
		label1.setBounds(10,10,100,30);
		add(label1);
		combo1=new JComboBox<String>();
		combo1.setBounds(120,10,80,30);
		for(int f=0;f<=255;f++) {
            combo1.addItem(String.valueOf(f));
        }
		add(combo1);
		
		
		label2=new JLabel("Verde=");
		label2.setBounds(10,50,100,30);
		add(label2);
		combo2=new JComboBox<String>();
		combo2.setBounds(120,50,80,30);
		for(int f=0;f<=255;f++) {
            combo2.addItem(String.valueOf(f));
        }
		add(combo2);
		
		
		label3=new JLabel("azul=");
		label3.setBounds(10,90,100,30);
		add(label3);
		combo3=new JComboBox<String>();
		combo3.setBounds(120,90,80,30);
		for(int f=0;f<=255;f++) {
            combo3.addItem(String.valueOf(f));
        }
		add(combo3);
		
		
		boton1=new JButton("Fijar Color");
		boton1.setBounds(10,130,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	

	public static void main(String[] args) {
		FormularioComboBox2 test=new FormularioComboBox2();
		test.setBounds(0,0,400,300);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			String cad1=combo1.getSelectedItem().toString();
			String cad2=combo2.getSelectedItem().toString();
			String cad3=combo3.getSelectedItem().toString();
			int rojo=Integer.parseInt(cad1);
			int verde=Integer.parseInt(cad2);
			int azul=Integer.parseInt(cad3);
			Color color1=new Color(rojo,verde,azul);
            boton1.setBackground(color1);
            boton1.setOpaque(true);
            boton1.setBorderPainted(false);
		}
	}

}
