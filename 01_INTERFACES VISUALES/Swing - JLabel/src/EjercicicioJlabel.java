import javax.swing.*;

public class EjercicicioJlabel extends JFrame{
	private JLabel label;
	private JLabel label2;

	public EjercicicioJlabel() {
		setLayout(null);
        label=new JLabel("Sistema de facturacion");
        label.setBounds(10,20,300,30);
        add(label);
        label2=new JLabel("version 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
	}

	public static void main(String[] args) {
		EjercicicioJlabel test1=new EjercicicioJlabel();
		test1.setBounds(400,300,500,200);
		test1.setVisible(true);
		test1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
