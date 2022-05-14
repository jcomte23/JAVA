import javax.swing.*;
import java.awt.event.*;

public class FormularioTextArea extends JFrame{
	private JTextField correo;
    private JLabel labelCorreo,labelAsunto;
    private JTextArea Asunto;
    private JScrollPane scrollpanel;

	public FormularioTextArea() {
		setLayout(null);
		labelCorreo=new JLabel("Correo");
		labelCorreo.setBounds(10, 10, 80, 15);
		add(labelCorreo);
		
		correo=new JTextField();
		correo.setBounds(50, 10, 200, 15);
		add(correo);
		
		labelCorreo=new JLabel("Asunto");
		labelCorreo.setBounds(10, 35, 80, 15);
		add(labelCorreo);
		
		Asunto=new JTextArea();
		scrollpanel=new JScrollPane(Asunto);
		scrollpanel.setBounds(10, 50, 235, 130);
		add(scrollpanel);
		
	}

	public static void main(String[] args) {
		FormularioTextArea test=new FormularioTextArea();
		test.setBounds(0, 0, 350, 400);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}
