import javax.swing.*;
import javax.swing.event.*;

public class FormularioJRadioButton extends JFrame implements ChangeListener{
	private JRadioButton boton1,boton2,boton3;
	private ButtonGroup bg;

	public FormularioJRadioButton() {
		setLayout(null);
		bg=new ButtonGroup();
		boton1=new JRadioButton("640*480");
		boton1.setBounds(10,20,100,30);
		boton1.addChangeListener(this);
		add(boton1);
		bg.add(boton1);
		
		boton2=new JRadioButton("800*600");
		boton2.setBounds(10,70,100,30);
		boton2.addChangeListener(this);
		add(boton2);
		bg.add(boton2);
		
		boton3=new JRadioButton("1024*768");
		boton3.setBounds(10,120,100,30);
		boton3.addChangeListener(this);
		add(boton3);
		bg.add(boton3);
	}
	
	public void stateChanged(ChangeEvent e) {
		if(boton1.isSelected()==true) {
			setTitle("pequeño");
			setSize(640,480);
		}
		if(boton2.isSelected()==true) {
			setTitle("mediano");
			setSize(800,600);
		}
		if(boton3.isSelected()==true) {
			setTitle("grande");
			setSize(1024,768);
		}
	}

	public static void main(String[] args) {
		FormularioJRadioButton test=new FormularioJRadioButton();
		test.setBounds(0,0,350,230);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
