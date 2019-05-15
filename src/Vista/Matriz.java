package Vista;

import javax.swing.*;
import java.awt.*;

public class Matriz extends JPanel{
  public Matriz(int x,int y){
    JButton MatrizBotones[][] = new JButton[x][y];
    setLayout(new GridLayout(x,y));
    int contM = (int)(Math.random()*x);
    int contN = (int)(Math.random()*y);
    for (int contX = 0; contX< x; contX++){
      for (int contY = 0; contY < y; contY++){
    	  if(contX==contM && contY==contN) {
    	        JButton btn2 = new JButton();
    	        ImageIcon jugador = new ImageIcon(getClass().getResource("/imagenes/messi1.png"));
    	        btn2.setIcon(jugador);
    	        MatrizBotones[contM][contN] = btn2;
    	        add(btn2);
    	        }
    	  else {
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

}
