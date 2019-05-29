package Vista;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ayudas extends JPanel {
	JLabel contador;
	JButton ayuda;
	JButton reintentar;
	JButton instrucciones;
	Icon reintentarimag;
	Icon ayudai;
	Icon bonus;

	public Ayudas() {
		setBackground(Color.white);
		setLayout(null);

		contador = new JLabel("PASOS RESTANTES:");
		add(contador).setBounds(30, 30, 150, 30);
		reintentarimag = new ImageIcon(getClass().getResource("/imagenes/rei.png"));
		ayudai = new ImageIcon(getClass().getResource("/imagenes/ayuda.png"));
		bonus = new ImageIcon(getClass().getResource("/imagenes/bonus.png"));
		ayuda = new JButton("a");
		ayuda.setForeground(Color.white);
		ayuda.setIcon(bonus);
		ayuda.setBackground(Color.white);
		add(ayuda).setBounds(20, 100, 150, 100);
		reintentar = new JButton("r");
		reintentar.setForeground(Color.white);
		reintentar.setIcon(reintentarimag);
		reintentar.setBackground(Color.white);
		add(reintentar).setBounds(20, 300, 150, 100);
		instrucciones = new JButton("i");
		instrucciones.setForeground(Color.white);
		instrucciones.setIcon(ayudai);
		instrucciones.setBackground(Color.white);
		add(instrucciones).setBounds(20, 500, 150, 100);

	}

	public JLabel getContador() {
		return contador;
	}

	public void setContador(JLabel contador) {
		this.contador = contador;
	}

	public JButton getAyuda() {
		return ayuda;
	}

	public void setAyuda(JButton ayuda) {
		this.ayuda = ayuda;
	}

	public JButton getReintentar() {
		return reintentar;
	}

	public void setReintentar(JButton reintentar) {
		this.reintentar = reintentar;
	}

	public JButton getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(JButton instrucciones) {
		this.instrucciones = instrucciones;
	}

	public Icon getReintentarimag() {
		return reintentarimag;
	}

	public void setReintentarimag(Icon reintentarimag) {
		this.reintentarimag = reintentarimag;
	}

	public Icon getAyudai() {
		return ayudai;
	}

	public void setAyudai(Icon ayudai) {
		this.ayudai = ayudai;
	}

	public Icon getBonus() {
		return bonus;
	}

	public void setBonus(Icon bonus) {
		this.bonus = bonus;
	}

}
