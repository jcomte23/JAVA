import javax.swing.*;
import java.awt.event.*;

public class Ejercicio extends JFrame implements ActionListener{
	private JTextField nombre;
    private JLabel labelNombre,labelPais;
    private JComboBox<String> paises;
	private JButton boton;
	

	public Ejercicio() {
		setLayout(null);
		labelNombre=new JLabel("Nombre");
		labelNombre.setBounds(10,10,100,30);
		add(labelNombre);
		
		nombre=new JTextField();
		nombre.setBounds(120,10,120,30);
		add(nombre);
		
		labelPais=new JLabel("Pais");
		labelPais.setBounds(10,50,100,30);
		add(labelPais);
		
		paises=new JComboBox<String>();
		paises.setBounds(120,50,100,30);
		add(paises);
		paises.addItem("colombia");
		paises.addItem("chile");
		paises.addItem("uruguay");
		paises.addItem("peru");
		paises.addItem("canada");
		
		boton=new JButton("SAVE");
		boton.setBounds(10,100,100,30);
		add(boton);
		boton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			String name=nombre.getText();
			String country=(String)paises.getSelectedItem();
			setTitle(name+" es de "+country);
		}
	}

	public static void main(String[] args) {
		Ejercicio test=new Ejercicio();
		test.setBounds(10,20,300,200);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
