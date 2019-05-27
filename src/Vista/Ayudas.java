package Vista;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ayudas extends JPanel {
	JLabel contador;
	JButton ayuda;
	JButton reintentar;
	JButton instrucciones;
	Icon reintentarimag;
	Icon ayudai;
	Icon bonus;

	public Ayudas() {
		setBackground(Color.white);
		setLayout(null);

		contador = new JLabel("PASOS RESTANTES:");
		add(contador).setBounds(30, 30, 150, 30);
		reintentarimag = new ImageIcon(getClass().getResource("/imagenes/rei.png"));
		ayudai=new ImageIcon(getClass().getResource("/imagenes/ayuda.png"));
		bonus=new ImageIcon(getClass().getResource("/imagenes/bonus.png"));
		ayuda = new JButton();
		ayuda.setIcon(ayudai);
		ayuda.setBackground(Color.white);
		add(ayuda).setBounds(20, 100, 150, 100);
		reintentar = new JButton();
		reintentar.setIcon(reintentarimag);
		reintentar.setBackground(Color.white);
		add(reintentar).setBounds(20, 300, 150,100);
		instrucciones = new JButton();
		instrucciones.setIcon(bonus);
		instrucciones.setBackground(Color.white);
		add(instrucciones).setBounds(20, 500, 150, 100);

	}

}
