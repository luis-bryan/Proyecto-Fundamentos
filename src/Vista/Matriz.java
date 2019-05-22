package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Matriz extends JPanel implements KeyListener{
	int x;
	int y;
	int contM;
	int contN;
	int contS;
	int contT;
	int tormentosas;
	JButton MatrizBotones[][];
	int t;
	
	
	public Matriz(int x, int y, int t) {
		this.x = x;
		this.y = y;
		this.t = t;
		y = y-1;

		MatrizBotones= new JButton[x][y];
		setLayout(new GridLayout(x, y));
		int contM = (int) (Math.random() * (x - 1));
		int contN = (int) (Math.random() * (y - 1));
		int contS = (int) (Math.random() * (x - 1));
		int contT = (int) (Math.random() * (y - 1));
	int contA = (int) (Math.random() * (x));
		int contB = (int) (Math.random() * (y));
		JButton btn3 = new JButton();
		JButton btn2 = new JButton();
		JButton btn4 = new JButton();
		for (int contX = 0; contX < x; contX++) {
			for (int contY = 0; contY < y; contY++) {
				if (contX == contM && contY == contN) {

					ImageIcon jugador = new ImageIcon(getClass().getResource("/imagenes/messifinal.jpg"));
					Icon icono = new ImageIcon(jugador.getImage().getScaledInstance(btn2.getMaximumSize().width * x,
							btn2.getMaximumSize().height * y, Image.SCALE_DEFAULT));
					btn2.setIcon(icono);
					MatrizBotones[contM][contN] = btn2;
					add(btn2);
				
					for(int k=0;k < t ;k++) {
						btn4 = new JButton();
						contA = (int) (Math.random() * (x));
						contB = (int) (Math.random() * (y));
						ImageIcon enemigo = new ImageIcon(getClass().getResource("/imagenes/cristiano.jpg"));
						Icon icono3 = new ImageIcon(enemigo.getImage().getScaledInstance(btn4.getMaximumSize().width * x,
								btn4.getMaximumSize().height * y, Image.SCALE_DEFAULT));
					btn4.setIcon(icono3);
					MatrizBotones[contA][contB]  = btn4 ;
					add(btn4);
					
					}
				}else if(contX == contS && contY == contT) {

					ImageIcon balon = new ImageIcon(getClass().getResource("/imagenes/balon.png"));
					Icon icono2 = new ImageIcon(balon.getImage().getScaledInstance(btn3.getMaximumSize().width * x,
							btn3.getMaximumSize().height * y, Image.SCALE_DEFAULT));
					btn3.setIcon(icono2);
					MatrizBotones[contS][contT] = btn3;
					add(btn3);
				}else {
					JButton btn = new JButton();

					ImageIcon cesped = new ImageIcon(getClass().getResource("/Imagenes/futbol.jpg"));
					btn.setIcon(cesped);
					MatrizBotones[contX][contY] = btn;
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
