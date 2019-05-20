package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Matriz extends JPanel implements KeyListener  {
	JButton MatrizBotones[][];
	int contM;
	int contN;
	JButton btn2;
	int x;
	int y;
	
	
	public Matriz(int x, int y) {
    MatrizBotones = new JButton[x][y];
    this.x = x;
    this.y = y;
    setLayout(new GridLayout(x, y));
    contM = (int) (Math.random() * x);
    contN = (int) (Math.random() * y);
    for (int contX = 0; contX < x; contX++) {
      for (int contY = 0; contY < y; contY++) {
        if (contX == contM && contY == contN) {
          btn2 = new JButton();
          ImageIcon jugador = new ImageIcon(getClass().getResource("/Imagenes/messi1.png"));
          Icon icono = new ImageIcon(jugador.getImage().getScaledInstance(btn2.getMaximumSize().width*x, btn2.getMaximumSize().height*y, Image.SCALE_DEFAULT));
          btn2.setIcon(icono);
          MatrizBotones[contM][contN] = btn2;
          btn2.setBounds(x, y, 150, 150);
          add(btn2);
        } else {
          JButton btn = new JButton();
          btn.setSize(x, y);

          ImageIcon cesped = new ImageIcon(getClass().getResource("/Imagenes/futbol.jpg"));
          Icon icono = new ImageIcon(cesped.getImage().getScaledInstance(btn.getMaximumSize().width*x,btn.getMaximumSize().height*y,Image.SCALE_DEFAULT));
          // La linea anterior estaba en el codigo de la calculadora, pero al implementarlo no funciona
          btn.setIcon(icono);
          MatrizBotones[contX][contY] = btn;
          add(MatrizBotones[contX][contY]);
        }
      }
    }
    addKeyListener(this);
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
		int m= e.getKeyCode();
		System.out.println("If");
		if (m == KeyEvent.VK_UP) {

			MatrizBotones[contM][contN-1]= new JButton();
		    for (int contX = 0; contX < x; contX++) {
		        System.out.println("For 1");
		    	for (int contY = 0; contY < y; contY++) {
		        	System.out.println("For 2");
		    		add(MatrizBotones[contX][contY]);
		        }
		    }
		        }
			updateUI();

		}
		
	}
