package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PBoton extends JPanel {
	JButton boton_empezar;
	Icon empezar;
	JButton boton_instrucciones;
	Icon instrucciones;

	public PBoton() {
		
		setBackground(Color.white);
		empezar = new ImageIcon(getClass().getResource("/imagenes/empezar.png"));
		instrucciones=new ImageIcon(getClass().getResource("/imagenes/INSTRUCCIONES.png"));
		boton_empezar = new JButton("be");
		boton_empezar.setForeground(Color.white);
		boton_empezar.setIcon(empezar);
		boton_instrucciones=new JButton("bi");
		boton_instrucciones.setIcon(instrucciones);
		boton_instrucciones.setForeground(Color.white);
		add(boton_instrucciones).setBackground(Color.white);;
		add(boton_empezar).setBackground(Color.white);

	}

	public Icon getEmpezar() {
		return empezar;
	}

	public void setEmpezar(Icon empezar) {
		this.empezar = empezar;
	}

	public JButton getBoton_instrucciones() {
		return boton_instrucciones;
	}

	public void setBoton_instrucciones(JButton boton_instrucciones) {
		this.boton_instrucciones = boton_instrucciones;
	}

	public Icon getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(Icon instrucciones) {
		this.instrucciones = instrucciones;
	}

	public JButton getBoton_empezar() {
		return boton_empezar;
	}

	public void setBoton_empezar(JButton boton_empezar) {
		this.boton_empezar = boton_empezar;
	}

}
