package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PBoton extends JPanel {
	JButton boton_empezar;

	public PBoton() {
		setBackground(Color.white);
		setForeground(Color.red);
		boton_empezar=new JButton("EMPEZAR");
		boton_empezar.setForeground(Color.blue);	
		boton_empezar.setFont(new Font("cooper black",Font.BOLD,30));
		boton_empezar.setBackground(Color.green);
		
		
		add(boton_empezar);
	}

	public JButton getBoton_empezar() {
		return boton_empezar;
	}

	public void setBoton_empezar(JButton boton_empezar) {
		this.boton_empezar = boton_empezar;
	}

}
