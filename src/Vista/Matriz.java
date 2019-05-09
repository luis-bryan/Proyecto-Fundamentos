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
        MatrizBotones[contX][contY] = btn;
        add(MatrizBotones[contX][contY]);
      }
    }
  }
}
