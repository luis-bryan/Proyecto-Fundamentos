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
    setResizable(false);
    setLayout(null);
    add(datos).setBounds(0,0,150,Toolkit.getDefaultToolkit().getScreenSize().height);
    add(matriz);
    matriz.setBounds(150,0,Toolkit.getDefaultToolkit().getScreenSize().width-150,Toolkit.getDefaultToolkit().getScreenSize().height-63);
    setMinimumSize(Toolkit.getDefaultToolkit().getScreenSize());
    matriz.updateUI();
    setLocation(0,0);
    setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(false); 
    pack();
  }

}