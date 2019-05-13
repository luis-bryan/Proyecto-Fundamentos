package Vista;

import javax.swing.*;
import java.awt.*;

public class Datos extends JPanel {
  JLabel aux;

  public Datos(int filas, int columnas, int objetivos, int tormentosas, int letales, int muros) {
    setBackground(Color.RED);
    setPreferredSize(new Dimension(100, 600));
    setLayout(new GridLayout(7,1));
    setMinimumSize(new Dimension(500,600));

    aux = new JLabel("Filas: " + filas);
    add(aux);
    aux = new JLabel("Columnas: " + columnas);
    setBackground(Color.RED);
    setPreferredSize(new Dimension(100, 600));
    add(aux);
    aux = new JLabel("Objetivos: " + objetivos);
    setBackground(Color.RED);
    setPreferredSize(new Dimension(100, 600));
    add(aux);
    aux = new JLabel("Bestias Tormentosas: " + tormentosas);
    setBackground(Color.RED);
    setPreferredSize(new Dimension(100, 600));
    add(aux);
    aux = new JLabel("Bestias Letales: " + letales);
    setBackground(Color.RED);
    setPreferredSize(new Dimension(100, 600));
    add(aux);
    aux = new JLabel("Muros: " + muros);
    setBackground(Color.RED);
    setPreferredSize(new Dimension(100, 600));
    add(aux);
    setBounds(0,0,400,600);
  }
}
