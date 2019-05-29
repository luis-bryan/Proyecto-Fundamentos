package Vista;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class VentanaMatriz extends JFrame {
	int x = 0;
	int y = 0;
	int t =0;
	int l = 0;
	int o = 0;
	int m = 0;
	Matriz matriz;
	Ayudas ay;
	VentanaPrincipal vp;
	public VentanaMatriz(int tamX, int tamY, Datos datos,int tor, int let, int obj, VentanaPrincipal vp, int mur) {
		ay = new Ayudas();
		this.vp = vp;
		x = tamX;
		y = tamY;
		t = tor;
		l = let;
		o = obj;
		m = mur;
		matriz = new Matriz(x,y,t,l,o, this, vp, m);
		setResizable(true);
		setLayout(null);

		add(datos).setBounds(0, 0, 150, Toolkit.getDefaultToolkit().getScreenSize().height);
		add(matriz);
		matriz.setBounds(150, 0, Toolkit.getDefaultToolkit().getScreenSize().width - 320,
				Toolkit.getDefaultToolkit().getScreenSize().height - 63);
		matriz.updateUI();
		add(ay).setBounds(Toolkit.getDefaultToolkit().getScreenSize().width - 180, 0, 400, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(false);


	}
	public Ayudas getAy() {
		return ay;
	}
}