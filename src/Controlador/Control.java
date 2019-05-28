package Controlador;

import javax.swing.Timer;

import Vista.Sonidos;
import Vista.VentanaPrincipal;

public class Control {
	VentanaPrincipal ventanaPrincipal;

	public Control() {
		ventanaPrincipal = new VentanaPrincipal();
		ventanaPrincipal.pack();
		while(true) {
			Sonidos.reproducir();
		}
	}
	
}
