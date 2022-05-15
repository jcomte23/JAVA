import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioMenu2 extends JFrame implements ActionListener{
	private JMenuBar mb;
	private JMenu menu1,menuTamano,menuColor;
	private JMenuItem grande,mediano,color1,color2,color3;
	
	public FormularioMenu2() {
		setLayout(null);
		mb=new JMenuBar();
		setJMenuBar(mb);
		menu1=new JMenu("opciones");
		mb.add(menu1);
		
		menuTamano=new JMenu("Tamaño de la ventana");
        menu1.add(menuTamano);
        grande=new JMenuItem("Grande");
        grande.addActionListener(this);
        menuTamano.add(grande);
        mediano=new JMenuItem("Mediano");
        mediano.addActionListener(this);
        menuTamano.add(mediano);
        
        
        menuColor=new JMenu("Color de fondo");
        menu1.add(menuColor);
        color1=new JMenuItem("Rojo");
        color1.addActionListener(this);
        menuColor.add(color1);
        color2=new JMenuItem("Verde");
        color2.addActionListener(this);
        menuColor.add(color2);
        color3=new JMenuItem("Azul");
        color3.addActionListener(this);
        menuColor.add(color3);
	}
	
	public void actionPerformed(ActionEvent e) {
		Container plano=this.getContentPane();
		
		if(e.getSource()==grande) {
			setTitle("grande");
			setSize(1024,768);
		}else if(e.getSource()==mediano) {
			setTitle("mediano");
			setSize(640,480);
		}
		
		if(e.getSource()==color1) {
			plano.setBackground(new Color(255,0,0));
		}else if(e.getSource()==color2) {
			plano.setBackground(new Color(0,255,0));
		}else if(e.getSource()==color3) {
			plano.setBackground(new Color(0,0,255));
		}
	}

	public static void main(String[] args) {
		FormularioMenu2 test=new FormularioMenu2();
		test.setBounds(10,20,300,200);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
