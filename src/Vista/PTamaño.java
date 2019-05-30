package Vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PTamaño extends JPanel {
	JTextField campo_numero1;
	JLabel Filas;
	

	public PTamaño() {
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0), new TitledBorder("TAMAÑO")));
		setBackground(Color.white);
		campo_numero1 = new JTextField(10);
		Filas = new JLabel("TAMAÑO:");
		setLayout(new FlowLayout());
 
		add(Filas);
		add(campo_numero1);

	}

	public JTextField getCampo_numero1() {
		return campo_numero1;
	}

	public void setCampo_numero1(JTextField campo_numero1) {
		this.campo_numero1 = campo_numero1;
	}

	
	public JLabel getFilas() {
		return Filas;
	}

	public void setFilas(JLabel filas) {
		Filas = filas;
	}

}