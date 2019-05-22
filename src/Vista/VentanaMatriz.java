package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaMatriz extends JFrame{
	int x = 0;
	int y = 0;
	int t =0;
	Matriz matriz;
	public VentanaMatriz(int tamX, int tamY, Datos datos,int tor){
		x = tamX;
		y = tamY;
		t = tor;
		matriz = new Matriz(x,y,t);
		setResizable(true);
		setLayout(null);
		add(datos).setBounds(0,0,150,Toolkit.getDefaultToolkit().getScreenSize().height);
		add(matriz);
		matriz.setBounds(150,0,Toolkit.getDefaultToolkit().getScreenSize().width-150,Toolkit.getDefaultToolkit().getScreenSize().height-63);
		matriz.updateUI();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(false); 

	}

}