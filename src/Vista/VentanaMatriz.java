package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaMatriz extends JFrame{
	int x = 0;
	int y = 0;
	int t =0;
	int l = 0;
	Matriz matriz;
<<<<<<< HEAD
	public VentanaMatriz(int tamX, int tamY, Datos datos,int tor, int let){
=======
	public VentanaMatriz(int tamX, int tamY, Datos datos,int tor) {
		Ayudas ay = new Ayudas();
>>>>>>> 38c6b98340c75caf1c4e18bbbe2664fe30879c06
		x = tamX;
		y = tamY;
		t = tor;
		l = let;
		matriz = new Matriz(x,y,t,l);
		setResizable(true);
		setLayout(null);
	    setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
		add(datos).setBounds(0,0,150,Toolkit.getDefaultToolkit().getScreenSize().height);
		add(matriz);
		matriz.setBounds(150,0,Toolkit.getDefaultToolkit().getScreenSize().width-320,Toolkit.getDefaultToolkit().getScreenSize().height-63);
		matriz.updateUI();
		add(ay).setBounds(Toolkit.getDefaultToolkit().getScreenSize().width-180,0,400,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(false); 
	}
}