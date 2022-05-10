import javax.swing.*;
import java.awt.event.*;

public class OperacionSuma extends JFrame implements ActionListener{
	private JLabel label,label2;
	private JTextField num1,num2;
	private JButton boton;

	public OperacionSuma() {
		setLayout(null);
        label=new JLabel("num 1");
        label.setBounds(12,10,300,30);
        add(label);
        
        num1=new JTextField();
        num1.setBounds(10,30,100,30);
        add(num1);
        
        label=new JLabel("num 2");
        label.setBounds(12,70,300,30);
        add(label);
        
        num2=new JTextField();
        num2.setBounds(10,90,100,30);
        add(num2);
        
        boton=new JButton("Sumar");
        boton.setBounds(140,56,100,30);
        add(boton);
        boton.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton) {
        	String cad1=num1.getText();
            String cad2=num2.getText();
            int x1=Integer.parseInt(cad1);
            int x2=Integer.parseInt(cad2);
            int suma=x1+x2;
            String total=String.valueOf(suma);
            setTitle(total);
        }
    }

	public static void main(String[] args) {
		OperacionSuma ejecutarSuma=new OperacionSuma();
		ejecutarSuma.setBounds(400,300,500,200);
		ejecutarSuma.setVisible(true);
		ejecutarSuma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
