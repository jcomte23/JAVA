import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioMenu extends JFrame implements ActionListener{
	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem mi1,mi2,mi3;
	
	public FormularioMenu() {
		setLayout(null);
		mb=new JMenuBar();
		setJMenuBar(mb);
		menu1=new JMenu("Opciones");
		mb.add(menu1);
		mi1=new JMenuItem("Rojo");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2=new JMenuItem("Verde");
        mi2.addActionListener(this);
        menu1.add(mi2);
        mi3=new JMenuItem("Azul");
        mi3.addActionListener(this);
        menu1.add(mi3);
	}
	
	public void actionPerformed(ActionEvent e) {
		Container bloke=this.getContentPane();
		if(e.getSource()==mi1) {
			bloke.setBackground(new Color(255,0,0));
		}else if(e.getSource()==mi2) {
			bloke.setBackground(new Color(0,255,0));
		}else {
			bloke.setBackground(new Color(0,0,255));
		}
	}

	public static void main(String[] args) {
		FormularioMenu formulario1=new FormularioMenu();
        formulario1.setBounds(10,20,300,200);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
