package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Matriz extends JPanel implements KeyListener {
  int x;
  int y;
  int contM;
  int contN;
  int contS;
  int contT;
  int constM;
  int constN;
  JButton btn;
  JButton btn2;
  JButton btn3;
  JButton MatrizBotones[][];


  public Matriz(int x, int y) {
    this.x = x;
    this.y = y;
    MatrizBotones = new JButton[x][y];
    setLayout(new GridLayout(x, y));
    int contM = (int) (Math.random() * (x - 1));
    int contN = (int) (Math.random() * (y - 1));
    int contS = (int) (Math.random() * (x - 1));
    int contT = (int) (Math.random() * (y - 1));
    constM = contM;
    constN = contN;

    for (int contX = 0; contX < x; contX++) {
      for (int contY = 0; contY < y; contY++) {
        if (contX == constM && contY == constN) {
          btn2 = new JButton();
          ImageIcon jugador = new ImageIcon(getClass().getResource("/imagenes/messifinal.jpg"));
          Icon icono = new ImageIcon(jugador.getImage().getScaledInstance(btn2.getMaximumSize().width * x,
            btn2.getMaximumSize().height * y, Image.SCALE_DEFAULT));
          btn2.setIcon(icono);
          MatrizBotones[contM][contN] = btn2;
          btn2.addKeyListener(this);
          add(btn2);
        } else if (contX == contS && contY == contT) {
          btn3 = new JButton();
          ImageIcon balon = new ImageIcon(getClass().getResource("/imagenes/balon.png"));
          Icon icono2 = new ImageIcon(balon.getImage().getScaledInstance(btn3.getMaximumSize().width * x,
            btn3.getMaximumSize().height * y, Image.SCALE_DEFAULT));
          btn3.setIcon(icono2);
          MatrizBotones[contS][contT] = btn3;
          btn3.addKeyListener(this);
          add(btn3);
        } else {
          btn = new JButton();

          ImageIcon cesped = new ImageIcon(getClass().getResource("/Imagenes/futbol.jpg"));
          // Icon icono = new
          // ImageIcon(cesped.getImage().getScaledInstance(btn.getWidth(),btn.getHeight(),Image.SCALE_DEFAULT));
          // La linea anterior estaba en el codigo de la calculadora, pero al
          // implementarlo no funciona
          btn.setIcon(cesped);
          MatrizBotones[contX][contY] = btn;
          btn.addKeyListener(this);
          add(btn);
        }
      }
    }
  }

  @Override
  public void keyTyped(KeyEvent e) {
    // TODO Auto-generated method stub
    System.out.println("Typed");
  }

  @Override
  public void keyReleased(KeyEvent e) {
    // TODO Auto-generated method stub
    System.out.println("Released");
  }

  @Override
  public void keyPressed(KeyEvent e) {
    int m = e.getKeyCode();
    System.out.println("If");
    if (m == KeyEvent.VK_UP) {

      System.out.println("arriba");
      MatrizBotones[constM][constN-1] = btn2;
      MatrizBotones[constM][constN] = btn;
      constN--;
      System.out.println("" + contM + ","+ contN);
      System.out.println("" + constM + ","+ constN);

      for (int contX = 0; contX < x; contX++) {
//        System.out.println("For 1");
        for (int contY = 0; contY < y; contY++) {
//          System.out.println("For 2");
          add(MatrizBotones[contX][contY]);
        }
      }
    } else if (m == KeyEvent.VK_DOWN) {
      System.out.println("abajo");
      MatrizBotones[constM][constN +1] = btn2;
      MatrizBotones[constM][constN] = btn;

      constN++;
      System.out.println("" + constM + ","+ constN);
      System.out.println("" + constM + ","+ constN);

      for (int contX = 0; contX < x; contX++) {
//        System.out.println("For 3");
        for (int contY = 0; contY < y; contY++) {
//          System.out.println("For 4");
          add(MatrizBotones[contX][contY]);
        }
      }
    } else if (m == KeyEvent.VK_RIGHT) {
      System.out.println("derecha");
      MatrizBotones[constM +1][constN] = btn2;
      MatrizBotones[constM][constN] = btn;

      constM++;
      System.out.println("" + constM + ","+ constN);
      System.out.println("" + contM + ","+ contN);

      for (int contX = 0; contX < x; contX++) {
//        System.out.println("For 5");
        for (int contY = 0; contY < y; contY++) {
//          System.out.println("For 6");
          add(MatrizBotones[contX][contY]);
        }
      }
    } else if (m == KeyEvent.VK_LEFT) {
      System.out.println("izquierda");
      MatrizBotones[constM - 1][constN] = btn2;
      MatrizBotones[constM][constN] = btn;

      constM--;
      System.out.println("" + constM + ","+ constN);
      System.out.println("" + contM + ","+ contN);

      for (int contX = 0; contX < x; contX++) {
//        System.out.println("For 7");
        for (int contY = 0; contY < y; contY++) {
//          System.out.println("For 8");
          add(MatrizBotones[contX][contY]);
        }
      }
    }
    updateUI();
  }
}
