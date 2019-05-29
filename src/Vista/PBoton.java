package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PBoton extends JPanel {
	JButton boton_empezar;
	Icon empezar;

	public PBoton() {
		setBackground(Color.white);
		empezar = new ImageIcon(getClass().getResource("/imagenes/EMPEZAR.png"));
		boton_empezar = new JButton();
		boton_empezar.setIcon(empezar);

		add(boton_empezar);

	}

	public JButton getBoton_empezar() {
		return boton_empezar;
	}

	public void setBoton_empezar(JButton boton_empezar) {
		this.boton_empezar = boton_empezar;
	}

}
