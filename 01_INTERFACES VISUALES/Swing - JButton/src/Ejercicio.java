import javax.swing.*;
import java.awt.event.*;

public class Ejercicio extends JFrame implements ActionListener {
	JButton boton;
	JButton opcion1,opcion2;

	public Ejercicio() {
		setLayout(null);
		boton=new JButton("Finalizar");
		boton.setBounds(300,250,100,30);
        add(boton);
        boton.addActionListener(this);
        
        opcion1=new JButton("Varon");
        opcion1.setBounds(130,200,100,30);
        add(opcion1);
        opcion1.addActionListener(this);
        
        opcion2=new JButton("Mujer");
        opcion2.setBounds(230,200,100,30);
        add(opcion2);
        opcion2.addActionListener(this);
        
	}
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton) {
            System.exit(0);
        }
        
        if (e.getSource()==opcion1) {
            String cad=opcion1.getText();
            setTitle(cad);
        }
        
        if (e.getSource()==opcion2) {
            String cad=opcion2.getText();
            setTitle(cad);
        }
    }

	public static void main(String[] args) {
		Ejercicio test=new Ejercicio();
		test.setBounds(0,0,450,350);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
