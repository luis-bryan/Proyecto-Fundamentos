package Vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PObjetivos extends JPanel {
	JTextField campo_numero1;
	JLabel Objetivos;

	public PObjetivos() {
		setBackground(Color.white);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0), new TitledBorder("OBJETIVOS")));
		campo_numero1 = new JTextField(10);
		Objetivos = new JLabel("CANTIDAD:");
		setLayout(new FlowLayout());

		add(Objetivos);
		add(campo_numero1);

	}

	public JTextField getCampo_numero1() {
		return campo_numero1;
	}

	public void setCampo_numero1(JTextField campo_numero1) {
		this.campo_numero1 = campo_numero1;
	}

	public JLabel getObjetivos() {
		return Objetivos;
	}

	public void setObjetivos(JLabel objetivos) {
		Objetivos = objetivos;
	}

}
