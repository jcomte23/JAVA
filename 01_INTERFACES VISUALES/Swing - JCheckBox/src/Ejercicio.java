import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Ejercicio extends JFrame implements ActionListener{
	private JCheckBox check1,check2,check3;
	private JButton boton1;
	public Ejercicio() {
		setLayout(null);
		check1=new JCheckBox("Safari");
		check1.setBounds(10,10,150,30);
		add(check1);
		
		check2=new JCheckBox("Chrome");
		check2.setBounds(10,50,150,30);
		add(check2);
		
		check3=new JCheckBox("Brave");
		check3.setBounds(10,90,150,30);
		add(check3);
		
		boton1=new JButton("Confirmar");
        boton1.setBounds(10,140,100,30);
        add(boton1);
        boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			String cad=" ";
			if(check1.isSelected()==true) {
				cad=cad+"Safari-";
			}
			if(check2.isSelected()==true) {
				cad=cad+"Chrome-";
			}
			if(check3.isSelected()==true) {
				cad=cad+"Brave-";
			}
			setTitle(cad);
		}
	}

	public static void main(String[] args) {
		Ejercicio test=new Ejercicio();
		test.setBounds(0,0,350,230);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
