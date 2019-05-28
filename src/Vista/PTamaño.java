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
	JTextField campo_numero2;
	JLabel Filas;
	JLabel Columnas;

	public PTamaño() {
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0), new TitledBorder("TAMAÑO")));
		campo_numero1 = new JTextField(10);
		campo_numero2 = new JTextField(10);
		Filas = new JLabel("FILAS:");
		Columnas = new JLabel("COLUMNAS:");
		setLayout(new FlowLayout());
 
		add(Filas);
		add(campo_numero1);
		add(Columnas);
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

	public JLabel getFilas() {
		return Filas;
	}

	public void setFilas(JLabel filas) {
		Filas = filas;
	}

	public JLabel getColumnas() {
		return Columnas;
	}

	public void setColumnas(JLabel columnas) {
		Columnas = columnas;
	}
}