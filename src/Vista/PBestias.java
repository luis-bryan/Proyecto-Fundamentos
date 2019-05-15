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

public class PBestias extends JPanel {
	JTextField campo_numero1;
	JTextField campo_numero2;
	JLabel BestiasL;
	JLabel BestiasT;

	public PBestias() {

		setBackground(Color.white);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0), new TitledBorder("BESTIAS")));

		campo_numero1 = new JTextField(10);
		campo_numero2 = new JTextField(10);
		BestiasL = new JLabel("TORMENTOSAS:");
		BestiasT = new JLabel("LETALES:");
		setLayout(new FlowLayout());

		add(BestiasL);
		add(campo_numero1);
		add(BestiasT);
		add(campo_numero2);

	}

	public JTextField getCampo_numero1() {
		return campo_numero1;
	}

	public void setCampo_numero1(JTextField campo_numero1) {
		this.campo_numero1 = campo_numero1;
	}

	public JTextField getCampo_numero2() {
		return campo_numero2;
	}

	public void setCampo_numero2(JTextField campo_numero2) {
		this.campo_numero2 = campo_numero2;
	}

	public JLabel getBestiasL() {
		return BestiasL;
	}

	public void setBestiasL(JLabel bestiasL) {
		BestiasL = bestiasL;
	}

	public JLabel getBestiasT() {
		return BestiasT;
	}

	public void setBestiasT(JLabel bestiasT) {
		BestiasT = bestiasT;
	}
}
