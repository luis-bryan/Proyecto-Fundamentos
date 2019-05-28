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
	int contA;
	int contB;
	int contC;
	int contD;
	int contP;
	int contQ;
	
	JButton btn;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	final JButton MatrizBotones[][];
	char arreglochar[][];
	int t;
	int l;
	int o;

	public Matriz(int x, int y, int t, int l, int o) {
		this.x = x;
		this.y = y;
		this.t = t;
		this.l = l;
		this.o = o;
	  arreglochar = new char[x][y];
	  MatrizBotones = new JButton[x][y];
	  setLayout(new GridLayout(x, y));
	  contM = (int) (Math.random() * (x - 1));
	  contN = (int) (Math.random() * (y - 1));
	  contS = (int) (Math.random() * (x - 1));
	  contT = (int) (Math.random() * (y - 1));
	  contA = (int) (Math.random() * x );
	  contB = (int) (Math.random() * y);
	  contC = (int) (Math.random() * x );
	  contD = (int) (Math.random() * y );
	  contP = (int) (Math.random() * x );
	  contQ = (int) (Math.random() * y );
	  btn3 = new JButton();
	  btn2 = new JButton();
	  for (int contY = 0; contY < x; contY++) {
		  for (int contX = 0; contX < y; contX++) {
			  arreglochar[contX][contY]=0;
		  }
		  }
	  for (int contY = 0; contY < x; contY++) {
		  for (int contX = 0; contX < y; contX++) {
			  if (contX == contM && contY == contN && (arreglochar[contM][contN]=='C'|| arreglochar[contM][contN]==0)) {
				  ImageIcon jugador = new ImageIcon(getClass().getResource("/imagenes/messifinal.jpg"));
				  Icon icono = new ImageIcon(jugador.getImage().getScaledInstance(btn2.getMaximumSize().width * (x+x),
						  btn2.getMaximumSize().height * (y+y), Image.SCALE_DEFAULT));
				  btn2.setIcon(icono);

				  MatrizBotones[contM][contN] = btn2;
				  btn2.addKeyListener(this);
				  arreglochar[contM][contN] = 'J';
						  

			  } 
        else if (contX == contS && contY == contT &&(arreglochar[contS][contT]=='C'|| arreglochar[contS][contT]==0)) {
        	
        	ImageIcon balon = new ImageIcon(getClass().getResource("/imagenes/balon.png"));
        	Icon icono2 = new ImageIcon(balon.getImage().getScaledInstance(btn3.getMaximumSize().width * (x+x),
        			btn3.getMaximumSize().height * (y+y), Image.SCALE_DEFAULT));
        	btn3.setIcon(icono2);
        	MatrizBotones[contS][contT] = btn3;
        	btn3.addKeyListener(this);
        	arreglochar[contS][contT] = 'B';
        	
        } else if (contX == contA && contY == contB &&(arreglochar[contA][contB]=='C'|| arreglochar[contA][contB]==0)) {
     
        	for (int c = 0; c < t ; c++) {
        		if(arreglochar[contA][contB]=='C'|| arreglochar[contA][contB]==0 ) {
        		btn4 = new JButton();

        		ImageIcon enemigo = new ImageIcon(getClass().getResource("/imagenes/cristiano.jpg"));
        		Icon icono3 = new ImageIcon(enemigo.getImage().getScaledInstance(btn4.getMaximumSize().width * (x+x),
        				btn4.getMaximumSize().height * (y+y), Image.SCALE_DEFAULT));
        		btn4.setIcon(icono3);
        		MatrizBotones[contA][contB] = btn4;
        		arreglochar[contA][contB] = 'T';
        		btn4.addKeyListener(this);
        		do {
        			contA = (int) (Math.random() * x );
        			contB = (int) (Math.random() * y );
        		}while (MatrizBotones[contA][contB]==null);
        		}else {
        			contA = (int) (Math.random() * x );
        			contB = (int) (Math.random() * y );
        			c= c-1;
        		}
        		
        	}
        	contA = -1;
        	contB = -1;
        	
        } else if(contX==contC &&contY==contD && (arreglochar[contC][contD]=='C'|| arreglochar[contC][contD]==0)){

        	for (int c = 0; c < l; c++) {
        		if(arreglochar[contC][contD]=='C'|| arreglochar[contC][contD]==0) {
        			btn6 = new JButton();

            		ImageIcon objetivo = new ImageIcon(getClass().getResource("/imagenes/letal.png"));
            		Icon copa = new ImageIcon(objetivo.getImage().getScaledInstance(btn6.getMaximumSize().width *(x+x)	,
            				btn6.getMaximumSize().height * (y+y), Image.SCALE_DEFAULT));
            		btn6.setIcon(copa);
            		MatrizBotones[contC][contD] = btn6;
            		arreglochar[contC][contD] = 'L';
            		btn6.addKeyListener(this);   
        		do {
        			contC = (int) (Math.random() * x );
        			contD = (int) (Math.random() * y );
        		}while (MatrizBotones[contC][contD]==null);
        		}else {
        			contC = (int) (Math.random() * x );
        			contD = (int) (Math.random() * y );
        			c= c-1;
        		}
        	}
        	contC = -1;
        	contD = -1;
        	
        }else if(contX==contP && contY==contQ && (arreglochar[contP][contQ]=='C'|| arreglochar[contP][contQ]==0)) {
        	for (int a = 0; a < o; a++) {
        		if(arreglochar[contP][contQ]=='C'|| arreglochar[contP][contQ]==0) {
        			btn5 = new JButton();

            		ImageIcon enemigo2 = new ImageIcon(getClass().getResource("/imagenes/copa.jpg"));
            		Icon icono5 = new ImageIcon(enemigo2.getImage().getScaledInstance(btn5.getMaximumSize().width *(x+x)	,
            				btn5.getMaximumSize().height * (y+y), Image.SCALE_DEFAULT));
            		btn5.setIcon(icono5);
            		MatrizBotones[contP][contQ] = btn5;
            		arreglochar[contP][contQ] = 'O';
            		btn5.addKeyListener(this);
        		
        		do {
        			contP = (int) (Math.random() * x );
        			contQ = (int) (Math.random() * y );
        		}while (MatrizBotones[contP][contQ]==null);
        		}else {
        			contP = (int) (Math.random() * x );
        			contQ = (int) (Math.random() * y );
        			a= a-1;
        		}
        	}
        	contP = -1;
        	contQ = -1;
        	
        }else if(MatrizBotones[contX][contY]==null && (arreglochar[contX][contY]=='C'|| arreglochar[contX][contY]==0)){
          btn = new JButton();

          ImageIcon cesped = new ImageIcon(getClass().getResource("/Imagenes/futbol.jpg"));
          btn.setIcon(cesped);
          MatrizBotones[contX][contY] = btn;
          arreglochar[contX][contY] = 'C';
          btn.addKeyListener(this);

        }
		  }
	  }
	  for (int contY = 0; contY < x; contY++) {
		  for (int contX = 0; contX < y; contX++) {
			  System.out.println("["+contX+","+contY+"] ["+arreglochar[contX][contY]+"]");
		  }
		  System.out.println();
		  }  

	  

	  for (int qy =0; qy<x; qy++){
		  for (int qx=0; qx<y; qx++)
			  add(MatrizBotones[qx][qy]);
	  }
	}

	public void keyTyped(KeyEvent e) {
		
	}


	public void keyReleased(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
		int m = e.getKeyCode();
		if (m == KeyEvent.VK_UP) {
			JButton aux = MatrizBotones[contM][contN];
			if(arreglochar[contM][contN-1]=='C') {
			MatrizBotones[contM][contN] = MatrizBotones[contM][contN - 1];
			MatrizBotones[contM][contN - 1] = aux;
			arreglochar[contM][contN]='C';
			arreglochar[contM][contN-1]='J';
			contN--;
			}else if(arreglochar[contM][contN-1]=='B') {
				if(arreglochar[contM][contN-2]=='C') {
					JButton auxCesp = MatrizBotones[contM][contN-2];
					JButton auxBalon = MatrizBotones[contM][contN-1];
					
					MatrizBotones[contM][contN-2]=auxBalon;
					MatrizBotones[contM][contN-1]=aux;
					MatrizBotones[contM][contN]=auxCesp;
					
					arreglochar[contM][contN-2]='B';
					arreglochar[contM][contN-1]='J';
					arreglochar[contM][contN]='C';
				}
				
			}
		

		} else if (m == KeyEvent.VK_DOWN) {
			JButton aux = MatrizBotones[contM][contN];
			if(arreglochar[contM][contN+1]=='C') {
			MatrizBotones[contM][contN] = MatrizBotones[contM][contN+1];
			MatrizBotones[contM][contN+1] = aux;
			arreglochar[contM][contN]='C';
			arreglochar[contM][contN+1]='J';

			contN++;
			}
			

		} else if (m == KeyEvent.VK_RIGHT) {
			JButton aux = MatrizBotones[contM][contN];
			if(arreglochar[contM+1][contN]=='C') {
			MatrizBotones[contM][contN] = MatrizBotones[contM + 1][contN];
			MatrizBotones[contM + 1][contN] = aux;
			arreglochar[contM][contN]='C';
			arreglochar[contM+1][contN]='J';

			contM++;
			}
			

		} else if (m == KeyEvent.VK_LEFT) {
			JButton aux = MatrizBotones[contM][contN];
			if(arreglochar[contM-1][contN]=='C') {
			MatrizBotones[contM][contN] = MatrizBotones[contM - 1][contN];
			MatrizBotones[contM - 1][contN] = aux;
			arreglochar[contM][contN]='C';
			arreglochar[contM-1][contN]='J';
			contM--;
			}

		}
		for (int qy =0; qy<x; qy++){
			for (int qx=0; qx<y; qx++)
				add(MatrizBotones[qx][qy]);
		}

		updateUI();
	}
}
