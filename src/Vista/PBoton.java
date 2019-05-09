package Vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PBoton extends JPanel {
	JButton boton_empezar;

	public PBoton() {
		setBackground(Color.white);
		boton_empezar=new JButton("EMPEZAR");
		
		add(boton_empezar);
	}

	public JButton getBoton_empezar() {
		return boton_empezar;
	}

	public void setBoton_empezar(JButton boton_empezar) {
		this.boton_empezar = boton_empezar;
	}

}
