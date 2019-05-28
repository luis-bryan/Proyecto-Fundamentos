package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

public class Matriz extends JPanel implements KeyListener {
  int x;
  int y;
  int contM;
  int contN;
  int contS;
  int contT;
  int constM;
  int constN;
  int constS;
  int constT;
  int contA;
  int contB;
  int tormentosas;
  int pasos;
  JButton btn;
  JButton btn2;
  JButton btn3;
  JButton btn4;
  JButton MatrizBotones[][];
  int t;
  VentanaMatriz v;
  String[][] m;

  public Matriz(int x, int y, int t, VentanaMatriz v) {
    this.x = x;
    this.y = y;
    this.t = t;
    this.v = v;

    m = new String[x][y];
    pasos = x*y;
    MatrizBotones = new JButton[x][y];
    setLayout(new GridLayout(x, y));
    contM = (int) (Math.random() * (x - 1));
    contN = (int) (Math.random() * (y - 1));
    contS = (int) (Math.random() * (x - 1));
    contT = (int) (Math.random() * (y - 1));
    contA = (int) (Math.random() * (x - 1));
    contB = (int) (Math.random() * (y - 1));
    btn3 = new JButton();
    btn2 = new JButton();
    btn4 = new JButton();
    for (int contY = 0; contY < x; contY++) {
      for (int contX = 0; contX < y; contX++) {
        if (contX == contM && contY == contN && MatrizBotones[contX][contY]==null) {

          ImageIcon jugador = new ImageIcon(getClass().getResource("/imagenes/messifinal.jpg"));
          Icon icono = new ImageIcon(jugador.getImage().getScaledInstance(btn2.getMaximumSize().width * x,
            btn2.getMaximumSize().height * y, Image.SCALE_DEFAULT));
          btn2.setIcon(icono);
          m[contX][contY] = "J";

          MatrizBotones[contX][contY] = btn2;
          btn2.addKeyListener(this);

        } else if(contX == contM && contY == contN && MatrizBotones[contX][contY]!=null){
          do {
            contM = (int) (Math.random() * (x - 1));
            contN = (int) (Math.random() * (y - 1));
          }while (MatrizBotones[contM][contN]==null);
          contX--;
          contY++;
        }
        else if (contX == contS && contY == contT && MatrizBotones[contX][contY]==null) {

          ImageIcon balon = new ImageIcon(getClass().getResource("/imagenes/balon.png"));
          Icon icono2 = new ImageIcon(balon.getImage().getScaledInstance(btn3.getMaximumSize().width * x,
            btn3.getMaximumSize().height * y, Image.SCALE_DEFAULT));
          btn3.setIcon(icono2);
          MatrizBotones[contX][contY] = btn3;
          btn3.addKeyListener(this);
          m[contX][contY] = "B";
        } else if(contX == contS && contY == contT && MatrizBotones[contX][contY]!=null){
          do {
            contS = (int) (Math.random() * (x - 1));
            contT = (int) (Math.random() * (y - 1));
          }while (MatrizBotones[contS][contT]==null);
          contX--;
          contY++;
        }
        else if (contX == contA && contY == contB && MatrizBotones[contX][contY]==null) {
          for (int c = 0; c < t; c++) {
            btn4 = new JButton();

            ImageIcon enemigo = new ImageIcon(getClass().getResource("/imagenes/cristiano.jpg"));
            Icon icono3 = new ImageIcon(enemigo.getImage().getScaledInstance(btn4.getMaximumSize().width * x,
              btn4.getMaximumSize().height * y, Image.SCALE_DEFAULT));
            btn4.setIcon(icono3);
            MatrizBotones[contA][contB] = btn4;
            btn4.addKeyListener(this);
            m[contA][contB] = "C";
            System.out.println("" + contA + " " + contB );
            do {
              contA = (int) (Math.random() * (x - 1));
              contB = (int) (Math.random() * (y - 1));
            }while (MatrizBotones[contA][contB]==null);
          }
          contA = -1;
          contB = -1;
        } else if(MatrizBotones[contX][contY]==null){
          JButton btn = new JButton((""+ contX + " " + contY));

          ImageIcon cesped = new ImageIcon(getClass().getResource("/Imagenes/futbol.jpg"));
          btn.setIcon(cesped);
          MatrizBotones[contX][contY] = btn;
          btn.addKeyListener(this);
          m[contX][contY] = "F";
        }
      }
    }
    System.out.println(Arrays.deepToString(m));
    for (int qy =0; qy<x; qy++){
      for (int qx=0; qx<y; qx++)
      add(MatrizBotones[qx][qy]);
    }
    v.getAy().contador.setText("PASOS RESTANTES: " + pasos);
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
    if (pasos>0) {
      if (m == KeyEvent.VK_UP) {

        JButton aux = MatrizBotones[contM][contN];
        MatrizBotones[contM][contN] = MatrizBotones[contM][contN - 1];
        MatrizBotones[contM][contN - 1] = aux;
        contN--;
        pasos--;

      } else if (m == KeyEvent.VK_DOWN) {
        JButton aux = MatrizBotones[contM][contN];
        MatrizBotones[contM][contN] = MatrizBotones[contM][contN + 1];
        MatrizBotones[contM][contN + 1] = aux;

        contN++;
        pasos--;

      } else if (m == KeyEvent.VK_RIGHT) {
        JButton aux = MatrizBotones[contM][contN];
        MatrizBotones[contM][contN] = MatrizBotones[contM + 1][contN];
        MatrizBotones[contM + 1][contN] = aux;

        contM++;
        pasos--;

      } else if (m == KeyEvent.VK_LEFT) {
        JButton aux = MatrizBotones[contM][contN];
        MatrizBotones[contM][contN] = MatrizBotones[contM - 1][contN];
        MatrizBotones[contM - 1][contN] = aux;

        contM--;
        pasos--;

      }

      for (int qy = 0; qy < x; qy++) {
        for (int qx = 0; qx < y; qx++)
          add(MatrizBotones[qx][qy]);
      }

      updateUI();
      v.getAy().contador.setText("PASOS RESTANTES: " + pasos);
    } else if(pasos==0){
      JOptionPane.showMessageDialog(v, "Pasos Agotados");
    }
  }
}
