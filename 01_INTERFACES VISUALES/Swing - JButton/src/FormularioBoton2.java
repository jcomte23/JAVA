import javax.swing.*;
import java.awt.event.*;

public class FormularioBoton2 extends JFrame implements ActionListener {
	JButton boton;
	JButton opcion1,opcion2,opcion3;

	public FormularioBoton2() {
		setLayout(null);
		boton=new JButton("Finalizar");
		boton.setBounds(300,250,100,30);
        add(boton);
        boton.addActionListener(this);
        
        opcion1=new JButton("1");
        opcion1.setBounds(50,200,100,30);
        add(opcion1);
        opcion1.addActionListener(this);
        
        opcion2=new JButton("2");
        opcion2.setBounds(150,200,100,30);
        add(opcion2);
        opcion2.addActionListener(this);
        
        opcion3=new JButton("3");
        opcion3.setBounds(250,200,100,30);
        add(opcion3);
        opcion3.addActionListener(this);
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
        
        if (e.getSource()==opcion3) {
            String cad=opcion3.getText();
            setTitle(cad);
        }
    }

	public static void main(String[] args) {
		FormularioBoton2 test=new FormularioBoton2();
		test.setBounds(0,0,450,350);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
