package Vista;

import javax.swing.*;
import java.awt.*;

public class Matriz extends JPanel{
  public Matriz(int x,int y){
    JButton MatrizBotones[][] = new JButton[x][y];
    setLayout(new GridLayout(x,y));
    for (int contX = 0; contX< x; contX++){
      for (int contY = 0; contY < y; contY++){
        JButton btn = new JButton();
        btn.setSize(x,y);
        ImageIcon cesped = new ImageIcon(getClass().getResource("/Imagenes/futbol.jpg"));
        // Icon icono = new ImageIcon(cesped.getImage().getScaledInstance(btn.getWidth(),btn.getHeight(),Image.SCALE_DEFAULT));
        // La linea anterior estaba en el codigo de la calculadora, pero al implementarlo no funciona
        btn.setIcon(cesped);
        MatrizBotones[contX][contY] = btn;
        add(MatrizBotones[contX][contY]);
      }
    }
  }
}
