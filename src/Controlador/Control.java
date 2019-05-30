package Controlador;

import Vista.Sonidos;
import Vista.VentanaPrincipal;

public class Control {
  VentanaPrincipal ventanaPrincipal;
  Sonidos sonido;

  public Control() {
    sonido = new Sonidos();
    ventanaPrincipal = new VentanaPrincipal();
    ventanaPrincipal.pack();
    while (true) {
      /**Se reproduce la musica*/
      sonido.reproducir();
    }
  }

}
