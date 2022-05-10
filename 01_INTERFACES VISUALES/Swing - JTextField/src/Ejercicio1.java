import javax.swing.*;
import java.awt.event.*;

public class Ejercicio1 extends JFrame implements ActionListener{
	private JLabel label,label2;
	private JTextField usuario,password;
	private JButton boton;

	public Ejercicio1() {
		setLayout(null);
        label=new JLabel("USUARIO");
        label.setBounds(12,10,300,30);
        add(label);
        
        usuario=new JTextField();
        usuario.setBounds(10,30,100,30);
        add(usuario);
        
        label2=new JLabel("PASSWORD");
        label2.setBounds(12,70,300,30);
        add(label2);
        
        password=new JTextField();
        password.setBounds(10,90,100,30);
        add(password);
        
        boton=new JButton("login");
        boton.setBounds(140,56,100,30);
        add(boton);
        boton.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton) {
        	String total;
        	String cad1=usuario.getText();
            String cad2=password.getText();
            if(cad1.equals("juan")==true && cad2.equals("abc123")==true) {
            	setTitle("CORRECTO");
            }else {
            	setTitle("INCORRECTO");
            }
            
        }
    }

	public static void main(String[] args) {
		Ejercicio1 test=new Ejercicio1();
		test.setBounds(400,300,500,200);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
