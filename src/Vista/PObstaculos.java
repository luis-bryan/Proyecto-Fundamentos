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

public class PObstaculos extends JPanel {
	JTextField campo_numero1;
	JTextField campo_numero2;
	JTextField campo_numero3;
	JLabel BestiasL;
	JLabel BestiasT;
	JLabel Muros;

	public PObstaculos() {

		setBackground(Color.white);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0), new TitledBorder("OBSTACULOS")));

		campo_numero1 = new JTextField(10);
		campo_numero2 = new JTextField(10);
		campo_numero3= new JTextField(10);
		BestiasL = new JLabel("BESTIAS TORMENTOSAS:");
		BestiasT = new JLabel("BESTIAS LETALES:");
		Muros=new JLabel("MUROS");
		setLayout(new FlowLayout());

		add(BestiasL);
		add(campo_numero1);
		add(BestiasT);
		add(campo_numero2);
		add(Muros);
		add(campo_numero3);

	}

	public JTextField getCampo_numero3() {
		return campo_numero3;
	}

	public void setCampo_numero3(JTextField campo_numero3) {
		this.campo_numero3 = campo_numero3;
	}

	public JLabel getMuros() {
		return Muros;
	}

	public void setMuros(JLabel muros) {
		Muros = muros;
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
