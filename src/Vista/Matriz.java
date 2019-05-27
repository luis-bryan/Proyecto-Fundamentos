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
	int contC;
	int contD;
	
	JButton btn;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	final JButton MatrizBotones[][];
	int t;
	String[][] m;
	int l;

	public Matriz(int x, int y, int t, int l) {
		this.x = x;
		this.y = y;
		this.t = t;
		this.l = l;
	  m = new String[x][y];

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
	  btn3 = new JButton();
	  btn2 = new JButton();
	  btn4 = new JButton();
	  for (int contY = 0; contY < x; contY++) {
		  for (int contX = 0; contX < y; contX++) {
			  if (contX == contM && contY == contN && (MatrizBotones[contX][contY]==null||MatrizBotones[contX][contY]==btn ||MatrizBotones[contX][contY]!= btn4||MatrizBotones [contX][contY]!=btn5||MatrizBotones[contM][contN]!= btn3)) {
				  
				  ImageIcon jugador = new ImageIcon(getClass().getResource("/imagenes/messifinal.jpg"));
				  Icon icono = new ImageIcon(jugador.getImage().getScaledInstance(btn2.getMaximumSize().width * (x+x),
						  btn2.getMaximumSize().height * (y+y), Image.SCALE_DEFAULT));
				  btn2.setIcon(icono);
				  m[contX][contY] = "J";

				  MatrizBotones[contX][contY] = btn2;
				  btn2.addKeyListener(this);
				  

			  } 
        else if (contX == contS && contY == contT && (MatrizBotones[contX][contY]==null||MatrizBotones[contX][contY]==btn ||MatrizBotones[contX][contY]!= btn2|| MatrizBotones [contX][contY]!=btn4||MatrizBotones [contX][contY]!=btn5)) {
        	
        	ImageIcon balon = new ImageIcon(getClass().getResource("/imagenes/balon.png"));
        	Icon icono2 = new ImageIcon(balon.getImage().getScaledInstance(btn3.getMaximumSize().width * (x+x),
        			btn3.getMaximumSize().height * (y+y), Image.SCALE_DEFAULT));
        	btn3.setIcon(icono2);
        	MatrizBotones[contX][contY] = btn3;
        	btn3.addKeyListener(this);
        	//m[contX][contY] = "B";
        	
        } else if(contX == contS && contY == contT && MatrizBotones[contX][contY]!=null){
        	do {
        		contS = (int) (Math.random() * (x-1) );
        		contT = (int) (Math.random() * (y-1) );
        	}while (MatrizBotones[contS][contT]==null);
        	contX--;
        	contY++;
        }
        else if (contX == contA && contY == contB && (MatrizBotones[contX][contY]==null||MatrizBotones[contX][contY]==btn ||MatrizBotones[contX][contY]!= btn2||MatrizBotones [contX][contY]!=btn3||MatrizBotones [contX][contY]!=btn5)) {
     
        	for (int c = 0; c < t ; c++) {
        		if(MatrizBotones[contA][contB]== btn || MatrizBotones[contA][contB]== null ||MatrizBotones[contA][contB]!= btn2||MatrizBotones[contA][contB]!= btn5||MatrizBotones[contA][contB]!= btn3||MatrizBotones[contA][contB]!= btn4) {
        		btn4 = new JButton();

        		ImageIcon enemigo = new ImageIcon(getClass().getResource("/imagenes/cristiano.jpg"));
        		Icon icono3 = new ImageIcon(enemigo.getImage().getScaledInstance(btn4.getMaximumSize().width * (x+x),
        				btn4.getMaximumSize().height * (y+y), Image.SCALE_DEFAULT));
        		btn4.setIcon(icono3);
        		MatrizBotones[contA][contB] = btn4;
        		btn4.addKeyListener(this);
        		//m[contA][contB] = "C";
        		System.out.println("" + contA + " " + contB );
        		do {
        			contA = (int) (Math.random() * x );
        			contB = (int) (Math.random() * y );
        		}while (MatrizBotones[contA][contB]==null && MatrizBotones[contA][contB]==btn);
        		}
        	}
        	contA = -1;
        	contB = -1;
        	
        } else if(contX==contC &&contY==contD && (MatrizBotones[contX][contY]==null||MatrizBotones[contX][contY]==btn||MatrizBotones[contX][contY]!=btn2 ||MatrizBotones[contX][contY]!= btn4||MatrizBotones [contX][contY]!=btn3)){
     
        	for (int c = 0; c < l; c++) {
        		if(MatrizBotones[contC][contD]== btn || MatrizBotones[contC][contD]== null ||MatrizBotones[contC][contD]!= btn2||MatrizBotones[contC][contD]!= btn4||MatrizBotones[contC][contD]!= btn3||MatrizBotones[contC][contD]!= btn5) {
        		btn5 = new JButton();

        		ImageIcon enemigo2 = new ImageIcon(getClass().getResource("/imagenes/letal.png"));
        		Icon icono5 = new ImageIcon(enemigo2.getImage().getScaledInstance(btn5.getMaximumSize().width *(x+x)	,
        				btn5.getMaximumSize().height * (y+y), Image.SCALE_DEFAULT));
        		btn5.setIcon(icono5);
        		MatrizBotones[contC][contD] = btn5;
        		btn5.addKeyListener(this);
        		//m[contC][contD] = "l";

        		System.out.println("" + contC + " " + contD );
        		do {
        			contC = (int) (Math.random() * x );
        			contD = (int) (Math.random() * y );
        		}while (MatrizBotones[contC][contD]==null&& MatrizBotones[contC][contD]==btn);
        		}
        	}
        	contC = -1;
        	contD = -1;
        		
        	
        	
      
      
        	
        }else if(MatrizBotones[contX][contY]==null &&(MatrizBotones[contX][contY]==null||MatrizBotones[contX][contY]!=btn2 ||MatrizBotones[contX][contY]!= btn4||MatrizBotones [contX][contY]!=btn3)){
        	if(MatrizBotones[contX][contY]== null ||MatrizBotones[contX][contY]!= btn2||MatrizBotones[contX][contY]!= btn4||MatrizBotones[contX][contY]!= btn3) {
          JButton btn = new JButton();

          ImageIcon cesped = new ImageIcon(getClass().getResource("/Imagenes/futbol.jpg"));
          btn.setIcon(cesped);
          MatrizBotones[contX][contY] = btn;
          btn.addKeyListener(this);
          //m[contX][contY] = "F";
        	
        }
        }
        }
      
    }
    System.out.println(Arrays.deepToString(m));
    for (int qy =0; qy<x; qy++){
      for (int qx=0; qx<y; qx++)
      add(MatrizBotones[qx][qy]);
    }
  }

  public void keyTyped(KeyEvent e) {
	  //System.out.println("Typed");
  }


  public void keyReleased(KeyEvent e) {
	  //System.out.println("Released");
  }

  public void keyPressed(KeyEvent e) {
	  int m = e.getKeyCode();
	  //System.out.println("If");
	  if (m == KeyEvent.VK_UP) {

		  JButton aux = MatrizBotones[contM][contN];
		  MatrizBotones[contM][contN] = MatrizBotones[contM][contN - 1];
		  MatrizBotones[contM][contN - 1] = aux;
		  contN--;
		  //      System.out.println("" + contM + ","+ contN);
		  //System.out.println("" + contM + "," + contN);

	  } else if (m == KeyEvent.VK_DOWN) {
		  JButton aux = MatrizBotones[contM][contN];
		  MatrizBotones[contM][contN] = MatrizBotones[contM][contN+1];
		  MatrizBotones[contM][contN+1] = aux;

		  contN++;
		  //      System.out.println("" + contM + ","+ contN);
		  //System.out.println("" + contM + "," + contN);

	  } else if (m == KeyEvent.VK_RIGHT) {
		  JButton aux = MatrizBotones[contM][contN];
		  MatrizBotones[contM][contN] = MatrizBotones[contM + 1][contN];
		  MatrizBotones[contM + 1][contN] = aux;

		  contM++;
		  //System.out.println("" + contM + "," + contN);
		  //      System.out.println("" + contM + ","+ contN);

	  } else if (m == KeyEvent.VK_LEFT) {
		  JButton aux = MatrizBotones[contM][contN];
		  MatrizBotones[contM][contN] = MatrizBotones[contM - 1][contN];
		  MatrizBotones[contM - 1][contN] = aux;

		  contM--;
		  //System.out.println("" + contM + "," + contN);
		  //      System.out.println("" + contM + ","+ contN);

	  }
	  for (int qy =0; qy<x; qy++){
		  for (int qx=0; qx<y; qx++)
			  add(MatrizBotones[qx][qy]);
	  }

	  updateUI();
  }
}
