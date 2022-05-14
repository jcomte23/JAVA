import javax.swing.*;
import java.awt.event.*;

public class Ejercicio extends JFrame implements ActionListener{
	private JLabel label1,label2;
	private JTextArea texto1,texto2;
	private JScrollPane scroll1,scroll2;
	private JButton boton;

	public Ejercicio() {
		setLayout(null);
		label1=new JLabel("TEXTO 1");
		label1.setBounds(170, 10, 60, 15);
		add(label1);
		
		texto1=new JTextArea();
		scroll1=new JScrollPane(texto1);
		scroll1.setBounds(50, 30, 280, 140);
		add(scroll1);
		
		
		
		label1=new JLabel("TEXTO 2");
		label1.setBounds(470, 10, 60, 15);
		add(label1);
		
		texto2=new JTextArea();
		scroll2=new JScrollPane(texto2);
		scroll2.setBounds(350, 30, 280, 140);
		add(scroll2);
		
		
		boton=new JButton("verificar");
		boton.setBounds(300, 180, 70, 20);
		add(boton);
		boton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			String parrafo1=texto1.getText();
			String parrafo2=texto2.getText();
			
			if(parrafo1.equalsIgnoreCase(parrafo2)==true) {
				setTitle("Los textos coinciden");
			}else {
				setTitle("Los textos son diferentes");
			}
		}
	}

	public static void main(String[] args) {
		Ejercicio test=new Ejercicio();
		test.setBounds(0, 0, 700, 280);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
