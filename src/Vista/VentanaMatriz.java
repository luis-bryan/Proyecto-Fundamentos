package Vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaMatriz extends JFrame implements ActionListener {
	int x = 0;
	int y = 0;
	int t = 0;
	int l = 0;
	int o = 0;
	int m = 0;
	Matriz matriz;
	Ayudas ayudas;
	VentanaPrincipal vp;
public VentanaMatriz(int tamX, Datos datos,int tor, int let, int obj, VentanaPrincipal vp, int mur) {
		ayudas = new Ayudas();
		this.vp = vp;
		x = tamX;
		t = tor;
		l = let;
		o = obj;
		m = mur;
		matriz = new Matriz(x,t,l,o, this, vp, m);
		setResizable(true);

		setLayout(null);
		actionListener(this);

		add(datos).setBounds(0, 0, 150, Toolkit.getDefaultToolkit().getScreenSize().height);
		add(matriz);
		matriz.setBounds(150, 0, Toolkit.getDefaultToolkit().getScreenSize().width - 320,
				Toolkit.getDefaultToolkit().getScreenSize().height - 63);
		matriz.updateUI();
		add(ayudas).setBounds(Toolkit.getDefaultToolkit().getScreenSize().width - 180, 0, 400, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private void actionListener(VentanaMatriz e) {
		ayudas.getInstrucciones().addActionListener(e);
		ayudas.getReintentar().addActionListener(e);
		ayudas.getAyuda().addActionListener(e);
		ayudas.getInstrucciones().addKeyListener(matriz);
		ayudas.getReintentar().addKeyListener(matriz);
		ayudas.getAyuda().addKeyListener(matriz);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "i") {
			int input = JOptionPane.showOptionDialog(null,
					".: RECUERDA QUE AL VER LAS INSTRUCCIONES SE TE RESTARAN 5 PASOS DE LOS RESTANTES :.\n"
							+ "                                                 ¿DESEAR VER LAS INSTRUCCIONES?",
					"IMPORTANTE", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
			if (input == JOptionPane.YES_OPTION) {
				int restarpasos = matriz.getPasos();
				matriz.setPasos(restarpasos - 5);
				JOptionPane.showOptionDialog(null,
						"INSTRUCCIONES:\n\n\t1.EL BALON DEBERA PASAR POR TODAS LAS COPAS PARA COMPLETAR EL JUEGO\n\t2.PARA EMPUJAR EL BALON MESSI DEBERA ESTAR EN UNA POSICION CONTIGUA AL BALON\n\t 3.SÍ MESSI SE ENCUENTA CON CRISTIANO SE LE RESTARAN 5 PASOS A LOS RESTANTES\n\t4.SI MESSI SE ENCUENTRA CON SERGIO RAMOS PERDERA AUTOMATICAMENTE EL JUEGO\n\t5.EL MAXIMO DE MOVIMIENTOS PERMITIDO ES EL PRODUCTO ENTRE LAS FILAS Y COLUMNAS LAS CUALES SON DETERMINADAS POR TI\n\t6.EL VALOR MAXIMO DE LAS DIMENSIONES ES DE 20 X 20 Y EL MINIMO ES DE 5 X 5\n\t7. SI EN EL RECORRIDO MESSI PASA POR EN MEDIO DE DOS CARLOS SANCHEZ OBTENDRA UNA PENALIZACION EQUIVALENTE A LA SUMA DE LAS \n\tCOORDENADAS DE LA POSICIÓN EN DONDE SE ENCUENTRE LA CUAL SERA RESTADA DE LOS PASOS RESTANTES.\n\t ",
						"INSTRUCCIONES", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

			}

		} else if (e.getActionCommand() == "r") {
			setVisible(false);
			vp.setVisible(true);

		} else if (e.getActionCommand() == "a") {
			int input = JOptionPane.showOptionDialog(null,
					".: SI DESAEAS UTILIZAR EL BONUS TE DAREMOS 10 PASOS MAS, PERO TE AÑADIREMOS UN MURO :.\n"
							+ "                                                 ¿DESEAR ACEPTAR ESTA CONDICIÓN?",
					"IMPORTANTE", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
			if (input == JOptionPane.YES_OPTION) {
				int sumarpasosbonus = matriz.getPasos();
				matriz.setPasos(sumarpasosbonus + 10);
				matriz.cambiarPos();

			}

		}

	}

	public Ayudas getAyudas() {
		return ayudas;
	}
}