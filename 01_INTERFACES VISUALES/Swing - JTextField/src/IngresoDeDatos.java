
import javax.swing.*;
import java.awt.event.*;

public class IngresoDeDatos extends JFrame implements ActionListener{
	private JLabel label;
	private JTextField campoDeIngreso;
	private JButton boton;

	public IngresoDeDatos() {
		setLayout(null);
        label=new JLabel("Usuario=");
        label.setBounds(150,10,300,30);
        add(label);
        
        campoDeIngreso=new JTextField();
        campoDeIngreso.setBounds(210,10,200,30);
        add(campoDeIngreso);
        
        boton=new JButton("Aceptar");
        boton.setBounds(140,40,100,30);
        add(boton);
        boton.addActionListener(this);
    }
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton) {
            String cad=campoDeIngreso.getText();
            setTitle(cad);
        }
    }

	public static void main(String[] args) {
		IngresoDeDatos test1=new IngresoDeDatos();
		test1.setBounds(400,300,500,200);
		test1.setVisible(true);
		test1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
