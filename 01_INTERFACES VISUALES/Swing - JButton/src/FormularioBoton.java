import javax.swing.*;
import java.awt.event.*;

public class FormularioBoton extends JFrame implements ActionListener {
	JButton boton;

	public FormularioBoton() {
		setLayout(null);
		boton=new JButton("Finalizar");
		boton.setBounds(300,250,100,30);
        add(boton);
        boton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton) {
            System.exit(0);
        }
    }

	public static void main(String[] args) {
		FormularioBoton test=new FormularioBoton();
		test.setBounds(0,0,450,350);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
