package Vista;

import javax.swing.*;
import java.awt.*;

public class Datos extends JPanel {
  JLabel aux;

  public Datos(int filas, int columnas, int objetivos, int tormentosas, int letales, int muros) {
    setBackground(Color.WHITE);
    setLayout(new GridLayout(7,1));

    aux = new JLabel("Filas: \n" + filas);
    add(aux);
    aux = new JLabel("\nColumnas: \t" + columnas);
    add(aux);
    aux = new JLabel("Objetivos: " + objetivos);
    add(aux);
    aux = new JLabel("Bestias Tormentosas: " + tormentosas);
    add(aux);
    aux = new JLabel("Bestias Letales: " + letales);
    add(aux);
    aux = new JLabel("Muros: " + muros);
    add(aux);
  }
}
