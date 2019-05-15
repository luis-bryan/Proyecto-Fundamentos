package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaMatriz extends JFrame{
  int x = 0;
  int y = 0;
  JPanel contenedor;
  Matriz matriz;
  public VentanaMatriz(int tamX, int tamY, Datos datos){
    x = tamX;
    y = tamY;
    matriz = new Matriz(x,y);
    setTitle("JUEGO");
    setResizable(true);
    setLayout(new BorderLayout());
    add(datos, BorderLayout.WEST);
    add(matriz, BorderLayout.CENTER);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(false);

  }

}
