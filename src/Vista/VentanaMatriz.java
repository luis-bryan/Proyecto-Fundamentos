package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaMatriz extends JFrame{
  int x = 0;
  int y = 0;

  Datos datos;
  Matriz matriz;
  public VentanaMatriz(int tamX, int tamY){
    x = tamX;
    y = tamY;
    Datos datos = new Datos(x,y);
    matriz = new Matriz(x,y);
    setSize(800, 600);
    setResizable(true);
    setLayout(new BorderLayout());
    add(datos, BorderLayout.WEST);
    add(matriz, BorderLayout.CENTER);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(false);

  }

}
