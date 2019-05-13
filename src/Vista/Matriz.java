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
        ImageIcon cesped = new ImageIcon("cesped.jpg");
        btn.setIcon(cesped);
        btn.setIcon(new ImageIcon(new ImageIcon("cesped.jpg").getImage().getScaledInstance(btn.getWidth(),btn.getHeight(),Image.SCALE_DEFAULT)));
        MatrizBotones[contX][contY] = btn;
        add(MatrizBotones[contX][contY]);
      }
    }
  }
}
