import javax.swing.*;
import java.awt.event.*;

public class FormularioTextArea2 extends JFrame implements ActionListener{
	private JLabel labelTitulo;
	private JTextArea texto;
	private JScrollPane scroll;
	private JButton boton;

	public FormularioTextArea2() {
		setLayout(null);
		labelTitulo=new JLabel("CARTA");
		labelTitulo.setBounds(10, 10, 80, 15);
		add(labelTitulo);
		
		texto=new JTextArea();
		scroll=new JScrollPane(texto);
		scroll.setBounds(10,30,300,200);
		add(scroll);
		
		boton=new JButton("verificar");
		boton.setBounds(10,260,100,30);
		add(boton);
		boton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			String textoIngresado=texto.getText();
			if(textoIngresado.toLowerCase().indexOf("argentina")!=-1) {
				setTitle("Si contiene el texto \"argentina\"");
			}else {
				setTitle("No contiene el texto \"argentina\"");  
			}
		}
	}

	public static void main(String[] args) {
		FormularioTextArea2 test=new FormularioTextArea2();
		test.setBounds(0,0,400,380);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
