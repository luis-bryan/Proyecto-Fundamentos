package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Matriz extends JPanel implements KeyListener {
	int x;
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
	int cont1;
	int cont2;
	VentanaMatriz v;
	JButton btn;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton MatrizBotones[][];
	char arreglochar[][];
	int t;
	int l;
	int o;
	int pasos;
	int m;
	VentanaPrincipal vp;
	int juego_ganar;

	public Matriz(int x, int t, int l, int o, VentanaMatriz v, VentanaPrincipal vp, int m) {
		this.x = x;
		this.t = t;
		this.l = l;
		this.o = o;
		this.v = v;
		this.vp = vp;
		pasos = x * x;
		this.m = m;
		juego_ganar = 0;

		arreglochar = new char[x][x];
		MatrizBotones = new JButton[x][x];
		setLayout(new GridLayout(x, x));
		contM = (int) (Math.random() * (x - 1));
		contN = (int) (Math.random() * (x - 1));
		contS = (int) (Math.random() * (x - 1));
		contT = (int) (Math.random() * (x - 1));
		contA = (int) (Math.random() * x);
		contB = (int) (Math.random() * x);
		contC = (int) (Math.random() * x);
		contD = (int) (Math.random() * x);
		contP = (int) (Math.random() * x);
		contQ = (int) (Math.random() * x);
		cont1 = (int) (Math.random() * x);
		cont2 = (int) (Math.random() * x);

		btn3 = new JButton();
		btn2 = new JButton();
		for (int contY = 0; contY < x; contY++) {
			for (int contX = 0; contX < x; contX++) {
				arreglochar[contX][contY] = 0;
			}
		}
		for (int contY = 0; contY < x; contY++) {
			for (int contX = 0; contX < x; contX++) {
				if (contX == contM && contY == contN && (arreglochar[contM][contN] == 'C' || arreglochar[contM][contN] == 0)) {
					ImageIcon jugador = new ImageIcon(getClass().getResource("/imagenes/messifinal.jpg"));
					Icon icono = new ImageIcon(jugador.getImage().getScaledInstance(btn2.getMaximumSize().width * (x + x),
							btn2.getMaximumSize().height * (x + x), Image.SCALE_DEFAULT));
					btn2.setIcon(icono);

					MatrizBotones[contM][contN] = btn2;
					btn2.addKeyListener(this);
					arreglochar[contM][contN] = 'J';


				} else if (contX == contS && contY == contT && (arreglochar[contS][contT] == 'C' || arreglochar[contS][contT] == 0)) {

					ImageIcon balon = new ImageIcon(getClass().getResource("/imagenes/balon.png"));
					Icon icono2 = new ImageIcon(balon.getImage().getScaledInstance(btn3.getMaximumSize().width * (x + x),
							btn3.getMaximumSize().height * (x + x), Image.SCALE_DEFAULT));
					btn3.setIcon(icono2);
					MatrizBotones[contS][contT] = btn3;
					btn3.addKeyListener(this);
					arreglochar[contS][contT] = 'B';

				} else if (contX == contA && contY == contB && (arreglochar[contA][contB] == 'C' || arreglochar[contA][contB] == 0)) {

					for (int c = 0; c < t; c++) {
						if (arreglochar[contA][contB] == 'C' || arreglochar[contA][contB] == 0) {
							btn4 = new JButton();

							ImageIcon enemigo = new ImageIcon(getClass().getResource("/imagenes/cristiano.jpg"));
							Icon icono3 = new ImageIcon(enemigo.getImage().getScaledInstance(btn4.getMaximumSize().width * (x + x),
									btn4.getMaximumSize().height * (x + x), Image.SCALE_DEFAULT));
							btn4.setIcon(icono3);
							MatrizBotones[contA][contB] = btn4;
							arreglochar[contA][contB] = 'T';
							btn4.addKeyListener(this);
							do {
								contA = (int) (Math.random() * x);
								contB = (int) (Math.random() * x);
							} while (MatrizBotones[contA][contB] == null);
						} else {
							contA = (int) (Math.random() * x);
							contB = (int) (Math.random() * x);
							c = c - 1;
						}

					}
					contA = -1;
					contB = -1;

				} else if (contX == contC && contY == contD && (arreglochar[contC][contD] == 'C' || arreglochar[contC][contD] == 0)) {

					for (int c = 0; c < o; c++) {
						if (arreglochar[contC][contD] == 'C' || arreglochar[contC][contD] == 0) {
							btn6 = new JButton();

							ImageIcon objetivo = new ImageIcon(getClass().getResource("/imagenes/copa.jpg"));
							Icon copa = new ImageIcon(objetivo.getImage().getScaledInstance(btn6.getMaximumSize().width * (x + x),
									btn6.getMaximumSize().height * (x + x), Image.SCALE_DEFAULT));
							btn6.setIcon(copa);
							MatrizBotones[contC][contD] = btn6;
							arreglochar[contC][contD] = 'O';
							btn6.addKeyListener(this);
							do {
								contC = (int) (Math.random() * x);
								contD = (int) (Math.random() * x);
							} while (MatrizBotones[contC][contD] == null);
						} else {
							contC = (int) (Math.random() * x);
							contD = (int) (Math.random() * x);
							c = c - 1;
						}
					}
					contC = -1;
					contD = -1;

				} else if (contX == contP && contY == contQ && (arreglochar[contP][contQ] == 'C' || arreglochar[contP][contQ] == 0)) {
					for (int a = 0; a < l; a++) {
						if (arreglochar[contP][contQ] == 'C' || arreglochar[contP][contQ] == 0) {
							btn5 = new JButton();

							ImageIcon enemigo2 = new ImageIcon(getClass().getResource("/imagenes/letal.png"));
							Icon icono5 = new ImageIcon(enemigo2.getImage().getScaledInstance(btn5.getMaximumSize().width * (x + x),
									btn5.getMaximumSize().height * (x + x), Image.SCALE_DEFAULT));
							btn5.setIcon(icono5);
							MatrizBotones[contP][contQ] = btn5;
							arreglochar[contP][contQ] = 'L';
							btn5.addKeyListener(this);

							do {
								contP = (int) (Math.random() * x);
								contQ = (int) (Math.random() * x);
							} while (MatrizBotones[contP][contQ] == null);
						} else {
							contP = (int) (Math.random() * x);
							contQ = (int) (Math.random() * x);
							a = a - 1;
						}
					}
					contP = -1;
					contQ = -1;

				}else if (contX == cont1&& contY == cont2 && (arreglochar[cont1][cont2] == 'C' || arreglochar[cont1][cont2] == 0)) {
					for (int f = 0; f < m; f++) {
						if (arreglochar[cont1][cont2] == 'C' || arreglochar[cont1][cont2] == 0) {
							btn7 = new JButton();

							ImageIcon muro = new ImageIcon(getClass().getResource("/imagenes/muro.jpg"));
							Icon icono7 = new ImageIcon(muro.getImage().getScaledInstance(btn7.getMaximumSize().width * (x + x),
									btn7.getMaximumSize().height * (x + x), Image.SCALE_DEFAULT));
							btn7.setIcon(icono7);
							MatrizBotones[cont1][cont2] = btn7;
							arreglochar[cont1][cont2] = 'M';
							btn7.addKeyListener(this);

							do {
								cont1 = (int) (Math.random() * x);
								cont2 = (int) (Math.random() * x);
							} while (MatrizBotones[cont1][cont2] == null);
						} else {
							cont1 = (int) (Math.random() * x);
							cont2 = (int) (Math.random() * x);
							f = f - 1;
						}
					}
					cont1 = -1;
					cont2 = -1; 
				}else if (MatrizBotones[contX][contY] == null && (arreglochar[contX][contY] == 'C' || arreglochar[contX][contY] == 0)) {
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
			for (int contX = 0; contX < x; contX++) {
				System.out.println("[" + contX + "," + contY + "] [" + arreglochar[contX][contY] + "]");
			}
			System.out.println();
		}


		for (int qy = 0; qy < x; qy++) {
			for (int qx = 0; qx < x; qx++) {
				add(MatrizBotones[qx][qy]);
			}
		}
	}
	public void cambiarPos() {
		boolean aux = true;
		for (int contY = 0 ; contY < x && aux ==true; contY++) {
			for (int contX = 0; contX < x && aux ==true; contX++) {
				if(arreglochar[contX][contY]=='C') {
					MatrizBotones[contX][contY]= btn7;
					arreglochar[contX][contY]='M';
					aux = false;

				}	
			}
		}
	}
	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {
		int m = e.getKeyCode();
		if (pasos > 0) {
			if (m == KeyEvent.VK_UP) {
				JButton aux = MatrizBotones[contM][contN];
				if (arreglochar[contM][contN - 1] == 'C') {
					MatrizBotones[contM][contN] = MatrizBotones[contM][contN - 1];
					MatrizBotones[contM][contN - 1] = aux;
					arreglochar[contM][contN] = 'C';
					arreglochar[contM][contN - 1] = 'J';
					contN--;
					pasos--;
				} else if (arreglochar[contM][contN - 1] == 'B') {
					if (arreglochar[contM][0] == 'B') {
						MatrizBotones[contM][contN] = MatrizBotones[contM][contN - 1];
						MatrizBotones[contM][contN - 1] = aux;
						arreglochar[contM][contN] = 'B';
						arreglochar[contM][contN - 1] = 'J';
						contN--;
						pasos--;

					} else if (arreglochar[contM][contN-2] == 'O') {
						JButton auxBalon = MatrizBotones[contM][contN - 1];
						JButton auxCesped = MatrizBotones[contM][contN-2];
						MatrizBotones[contM][contN - 2] = auxBalon;
						MatrizBotones[contM][contN - 1] = aux;
						MatrizBotones[contM][contN] = auxCesped;
						arreglochar[contM][contN - 2] = 'B';
						arreglochar[contM][contN - 1] = 'J';
						arreglochar[contM][contN] = 'C';
						juego_ganar++;
						contN--;
						pasos--;
					} else if (arreglochar[contM][contN - 2] == 'C') {
						JButton auxBalon = MatrizBotones[contM][contN - 1];
						JButton auxCesped = MatrizBotones[contM][contN - 2];
						MatrizBotones[contM][contN - 2] = auxBalon;
						MatrizBotones[contM][contN - 1] = aux;
						MatrizBotones[contM][contN] = auxCesped;
						arreglochar[contM][contN - 2] = 'B';
						arreglochar[contM][contN - 1] = 'J';
						arreglochar[contM][contN] = 'M';
						contN--;
						pasos--;
					}else if(arreglochar[contM][contN - 2] == 'M') {
						MatrizBotones[contM][contN] = MatrizBotones[contM][contN - 1];
						MatrizBotones[contM][contN - 1] = aux;
						arreglochar[contM][contN] = 'B';
						arreglochar[contM][contN - 1] = 'J';
						contN--;
						pasos--;
					}

				}
				/*TODO:-Movimientos de las bestias
				 * Quitar vida si toca a cristiano
				 * Pierde juego si toca a Ramos
				 */


			} else if (m == KeyEvent.VK_DOWN) {
				JButton aux = MatrizBotones[contM][contN];
				if (arreglochar[contM][contN + 1] == 'C') {
					MatrizBotones[contM][contN] = MatrizBotones[contM][contN + 1];
					MatrizBotones[contM][contN + 1] = aux;
					arreglochar[contM][contN] = 'C';
					arreglochar[contM][contN + 1] = 'J';
					contN++;
					pasos--;
				} else if (arreglochar[contM][contN + 1] == 'B') {
					if (arreglochar[contM][arreglochar.length - 1] == 'B') {
						MatrizBotones[contM][contN] = MatrizBotones[contM][contN + 1];
						MatrizBotones[contM][contN + 1] = aux;
						arreglochar[contM][contN] = 'B';
						arreglochar[contM][contN + 1] = 'J';
						contN++;
						pasos--;
					}else if (arreglochar[contM][contN+2] == 'O') {
						JButton auxBalon = MatrizBotones[contM][contN + 1];
						JButton auxCesped = MatrizBotones[contM][contN+2];
						MatrizBotones[contM][contN + 2] = auxBalon;
						MatrizBotones[contM][contN + 1] = aux;
						MatrizBotones[contM][contN] = auxCesped;
						arreglochar[contM][contN + 2] = 'B';
						arreglochar[contM][contN + 1] = 'J';
						arreglochar[contM][contN] = 'M';
						juego_ganar++;
						contN++;
						pasos--;
					} else if (arreglochar[contM][contN + 2] == 'C') {
						JButton auxCesp = MatrizBotones[contM][contN + 2];
						JButton auxBalon = MatrizBotones[contM][contN + 1];
						MatrizBotones[contM][contN + 2] = auxBalon;
						MatrizBotones[contM][contN + 1] = aux;
						MatrizBotones[contM][contN] = auxCesp;
						arreglochar[contM][contN + 2] = 'B';
						arreglochar[contM][contN + 1] = 'J';
						arreglochar[contM][contN] = 'C';
						contN++;
						pasos--;
					}else if(arreglochar[contM][contN + 2] == 'M') {
						MatrizBotones[contM][contN] = MatrizBotones[contM][contN + 1];
						MatrizBotones[contM][contN + 1] = aux;
						arreglochar[contM][contN] = 'B';
						arreglochar[contM][contN + 1] = 'J';
						contN++;
						pasos--;
					}

				}

			} else if (m == KeyEvent.VK_RIGHT) {
				JButton aux = MatrizBotones[contM][contN];
				if (arreglochar[contM + 1][contN] == 'C') {
					MatrizBotones[contM][contN] = MatrizBotones[contM + 1][contN];
					MatrizBotones[contM + 1][contN] = aux;
					arreglochar[contM][contN] = 'C';
					arreglochar[contM + 1][contN] = 'J';
					contM++;
					pasos--;
				} else if (arreglochar[contM + 1][contN] == 'B') {
					if (arreglochar[arreglochar.length - 1][contN] == 'B') {
						MatrizBotones[contM][contN] = MatrizBotones[contM + 1][contN];
						MatrizBotones[contM + 1][contN] = aux;
						arreglochar[contM][contN] = 'B';
						arreglochar[contM + 1][contN] = 'J';
						contM++;
						pasos--;
					}else if (arreglochar[contM+2][contN] == 'O') {
						JButton auxBalon = MatrizBotones[contM+1][contN];
						JButton auxCesped = MatrizBotones[contM+2][contN];
						MatrizBotones[contM+2][contN] = auxBalon;
						MatrizBotones[contM+1][contN - 1] = aux;
						MatrizBotones[contM][contN] = auxCesped;
						arreglochar[contM+2][contN] = 'B';
						arreglochar[contM+1][contN] = 'J';
						arreglochar[contM][contN] = 'M';
						juego_ganar++;
						contM++;
						pasos--;
					} else if (arreglochar[contM + 2][contN] == 'C') {
						JButton auxCesp = MatrizBotones[contM + 2][contN];
						JButton auxBalon = MatrizBotones[contM + 1][contN];
						MatrizBotones[contM + 2][contN] = auxBalon;
						MatrizBotones[contM + 1][contN] = aux;
						MatrizBotones[contM][contN] = auxCesp;
						arreglochar[contM + 2][contN] = 'B';
						arreglochar[contM + 1][contN] = 'J';
						arreglochar[contM][contN] = 'C';
						contM++;
						pasos--;
					}else if(arreglochar[contM+2][contN] =='M') {
						MatrizBotones[contM][contN] = MatrizBotones[contM + 1][contN];
						MatrizBotones[contM + 1][contN] = aux;
						arreglochar[contM][contN] ='B';
						arreglochar[contM + 1][contN] ='J';
						contM++;
						pasos--;
					}

				}

			} else if (m == KeyEvent.VK_LEFT) {
				JButton aux = MatrizBotones[contM][contN];
				if (arreglochar[contM - 1][contN] == 'C') {
					MatrizBotones[contM][contN] = MatrizBotones[contM - 1][contN];
					MatrizBotones[contM - 1][contN] = aux;
					arreglochar[contM][contN] = 'C';
					arreglochar[contM - 1][contN] = 'J';
					contM--;
					pasos--;
				} else if (arreglochar[contM - 1][contN] == 'B') {
					if (arreglochar[0][contN] == 'B') {
						MatrizBotones[contM][contN] = MatrizBotones[contM - 1][contN];
						MatrizBotones[contM - 1][contN] = aux;
						arreglochar[contM][contN] = 'B';
						arreglochar[contM - 1][contN] = 'J';
						contM--;
						pasos--;
					}else if (arreglochar[contM-2][contN] == 'O') {
						JButton auxBalon = MatrizBotones[contM-1][contN];
						JButton auxCesped = MatrizBotones[contM-2][contN];
						MatrizBotones[contM-2][contN] = auxBalon;
						MatrizBotones[contM-1][contN] = aux;
						MatrizBotones[contM][contN] = auxCesped;
						arreglochar[contM-2][contN] = 'B';
						arreglochar[contM-1][contN] = 'J';
						arreglochar[contM][contN] = 'M';
						juego_ganar++;
						contM--;
						pasos--;
					} else if (arreglochar[contM - 2][contN] == 'C') {
						JButton auxCesp = MatrizBotones[contM - 2][contN];
						JButton auxBalon = MatrizBotones[contM - 1][contN];
						MatrizBotones[contM - 2][contN] = auxBalon;
						MatrizBotones[contM - 1][contN] = aux;
						MatrizBotones[contM][contN] = auxCesp;
						arreglochar[contM - 2][contN] = 'B';
						arreglochar[contM - 1][contN] = 'J';
						arreglochar[contM][contN] = 'C';
						contM--;
						pasos--;
					}else if(arreglochar[contM-2][contN ] == 'M') {
						MatrizBotones[contM][contN] = MatrizBotones[contM - 1][contN];
						MatrizBotones[contM - 1][contN] = aux;
						arreglochar[contM][contN] = 'B';
						arreglochar[contM - 1][contN] = 'J';
						contM--;
						pasos--;
					}
				}
			}
			for (int qy = 0; qy < x; qy++) {
				for (int qx = 0; qx < x; qx++)
					add(MatrizBotones[qx][qy]);
			}
			updateUI();
			v.getAyudas().contador.setText("PASOS RESTANTES: " + pasos);
			if(juego_ganar ==o) {
				JOptionPane.showMessageDialog(null, "GANASTE");
				setVisible(false);
				vp.setVisible(true);
			}
		} else if (pasos == 0) {
			int input = JOptionPane.showOptionDialog(v, "Pasos Agotados", "PASOS AGOTADOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			if (input == JOptionPane.OK_OPTION) {
				v.setVisible(false);
				vp.setVisible(true);
			}
		}
	}

	public void keyReleased(KeyEvent e) {

	}
}


