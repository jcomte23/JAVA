import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class FormularioJCheckBox2 extends JFrame implements ChangeListener,ActionListener{
	private JCheckBox check;
	private JLabel label;
	private JButton Button;

	public FormularioJCheckBox2() {
		setLayout(null);
		label=new JLabel("Esta de acuedo con las normas del servicio?");
		label.setBounds(10,10,400,30);
		add(label);
		
		check=new JCheckBox("Acepto");
		check.setBounds(10,50,100,30);
		check.addChangeListener(this);
		add(check);
		
		Button=new JButton("Continuar");
		Button.setBounds(10,100,100,30);
		add(Button);
		Button.addActionListener(this);
		Button.setEnabled(false);
		
	}
	
	public void stateChanged(ChangeEvent e) {
		
		if(check.isSelected()==true) {
			Button.setEnabled(true);
		}else {
			Button.setEnabled(false);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Button) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		FormularioJCheckBox2 test=new FormularioJCheckBox2();
		test.setBounds(0,0,350,200);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
