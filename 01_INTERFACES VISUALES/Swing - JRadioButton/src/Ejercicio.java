import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Ejercicio extends JFrame implements ChangeListener,ActionListener{
	private JLabel label,label2;
	private String Operacion;
	private JTextField num1,num2;
	private JRadioButton radio1,radio2;
	private ButtonGroup bg;
	private JButton boton;

	public Ejercicio() {
		setLayout(null);
        label=new JLabel("num 1");
        label.setBounds(12,10,300,30);
        add(label);
        
        num1=new JTextField();
        num1.setBounds(10,30,100,30);
        add(num1);
        
        label2=new JLabel("num 2");
        label2.setBounds(12,70,300,30);
        add(label2);
        
        num2=new JTextField();
        num2.setBounds(10,90,100,30);
        add(num2);
        
        bg=new ButtonGroup();
        radio1=new JRadioButton("Sumar");
        radio1.setBounds(140,30,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        bg.add(radio1);
        
        radio2=new JRadioButton("Restar");
        radio2.setBounds(240,30,100,30);
        radio2.addChangeListener(this);
        add(radio2);
        bg.add(radio2);
        
        
        boton=new JButton("Ejecutar");
        boton.setBounds(140,56,100,30);
        add(boton);
        boton.addActionListener(this);
	}
	
	public void stateChanged(ChangeEvent e) {
		if(radio1.isSelected()==true) {
			Operacion="Sumar";
		}
		if(radio2.isSelected()==true) {
			Operacion="Restar";
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			String cad1=num1.getText();
            String cad2=num2.getText();
            int x1=Integer.parseInt(cad1);
            int x2=Integer.parseInt(cad2);
            if(Operacion.equals("Sumar")) {
            	int suma=x1+x2;
                String total=String.valueOf(suma);
                setTitle(total);
            }
            if(Operacion.equals("Restar")) {
            	int suma=x1-x2;
                String total=String.valueOf(suma);
                setTitle(total);
            }            
		}
	}

	public static void main(String[] args) {
		Ejercicio test=new Ejercicio();
		test.setBounds(400,300,500,200);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
