package Vista;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PMuros extends JPanel {
	JTextField campo_numero1;
	JLabel Muros;

	public PMuros() {
		setBackground(Color.white);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0), new TitledBorder("MUROS")));
		campo_numero1 = new JTextField(10);
		Muros = new JLabel("CANTIDAD:");
		setLayout(new FlowLayout());

		add(Muros);
		add(campo_numero1);
	}

	public JTextField getCampo_numero1() {
		return campo_numero1;
	}

	public void setCampo_numero1(JTextField campo_numero1) {
		this.campo_numero1 = campo_numero1;
	}

	public JLabel getMuros() {
		return Muros;
	}

	public void setMuros(JLabel muros) {
		Muros = muros;
	}
}
