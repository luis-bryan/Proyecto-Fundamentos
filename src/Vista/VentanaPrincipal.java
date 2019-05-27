package Vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame implements ActionListener {
	PTamaño pTamaño;
	PObstaculos pBestias;
	PObjetivos pObjetivos;
	PBoton pBoton;
	ActionListener oyente;
	PBoton pBoton2;
	ImageIcon bos; 

	public VentanaPrincipal() {
		setTitle("MENU BOSQUECILLO");
		setSize(800, 200);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(5, 1));

		 bos=new ImageIcon(getClass().getResource("/imagenes/PRINCIPAL.png"));
		    JLabel q = new JLabel(bos);
		    q.setBounds(0,0, 150, 100);
		    add(q);

		pTamaño = new PTamaño();
		
		pBestias = new PObstaculos();

		pObjetivos = new PObjetivos();

		pBoton = new PBoton();

		add(pTamaño);
		add(pObjetivos);
		add(pBestias);
		add(pBoton);

		actionListener(this);
		setLocation(450, 0);
		setVisible(true);
	}

	private void actionListener(VentanaPrincipal escuchador) {
		pBoton.getBoton_empezar().addActionListener(escuchador);
	}

	public void actionPerformed(ActionEvent e) {
		int filas = 0;
		int columnas = 0;

		int objetivos = 0;
		int tormentosas = 0;
		int letales = 0;
		int muros = 0;
<<<<<<< HEAD
try {
		String auxf = pTamaño.getCampo_numero1().getText();
		filas=Integer.parseInt(auxf);
		String auxc = pTamaño.getCampo_numero2().getText();
		columnas=Integer.parseInt(auxc);
		String auxo = pObjetivos.getCampo_numero1().getText();
		objetivos = Integer.parseInt(auxo);
		String auxt = pBestias.getCampo_numero1().getText();
		tormentosas = Integer.parseInt(auxt);
		String auxl = pBestias.getCampo_numero2().getText();
		letales = Integer.parseInt(auxl);
		String auxm = pMuros.getCampo_numero1().getText();
		muros = Integer.parseInt(auxm);
}catch(java.lang.NumberFormatException ex) {
	JOptionPane.showMessageDialog(null, ".:DIGITE NUEVAMENTE LOS DATOS:.","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
}finally {

		Datos datos = new Datos(filas, columnas, objetivos, tormentosas, letales, muros);

		if(filas <=20 && filas>=5 && columnas<=20 && columnas>=5) {
			int auxiliar =(filas*columnas)/4;
			int auxiliar2 = (filas*columnas)/8;
			if(tormentosas<=(filas*columnas)/4) {
				if(letales<=(filas*columnas)/8) {
					VentanaMatriz ventanaMatriz = new VentanaMatriz(filas, columnas, datos, tormentosas,letales);
					setVisible(false);
					ventanaMatriz.pack();
					ventanaMatriz.setSize(500,500);
					ventanaMatriz.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "El numero de letales permitido es: "+ auxiliar2,"ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
				}
			}else {
				JOptionPane.showMessageDialog(null, "El numero de tormentosas permitido es: "+ auxiliar,"ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
=======
		try {
			String auxf = pTamaño.getCampo_numero1().getText();
			filas = Integer.parseInt(auxf);
			String auxc = pTamaño.getCampo_numero2().getText();
			columnas = Integer.parseInt(auxc);
			String auxo = pObjetivos.getCampo_numero1().getText();
			objetivos = Integer.parseInt(auxo);
			String auxt = pBestias.getCampo_numero1().getText();
			tormentosas = Integer.parseInt(auxt);
			String auxl = pBestias.getCampo_numero2().getText();
			letales = Integer.parseInt(auxl);
			String aux3 = pBestias.getCampo_numero3().getText();
			muros = Integer.parseInt(auxl);
			
		} catch (java.lang.NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, ".:DIGITE NUEVAMENTE LOS DATOS:.", "ADVERTENCIA",
					JOptionPane.WARNING_MESSAGE);
		} finally {

			Datos datos = new Datos(filas, columnas, objetivos, tormentosas, letales, muros);

			if (filas <= 20 && filas >= 5 && columnas <= 20 && columnas >= 5) {
				int auxiliar = (filas * columnas) / 4;
				if (tormentosas < (filas * columnas) / 4) {
					VentanaMatriz ventanaMatriz = new VentanaMatriz(filas, columnas, datos, tormentosas);
					setVisible(false);
					ventanaMatriz.pack();
					ventanaMatriz.setSize(500, 500);
					ventanaMatriz.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "El numero de tormentosas permitido es: " + auxiliar,
							"ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
				}
			} else if (filas <= 20 || filas >= 5) {
				JOptionPane.showMessageDialog(null, "El numero " + filas + " no es permitido en el campo de juego",
						"ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
			} else if (columnas <= 20 || columnas >= 5) {
				JOptionPane.showMessageDialog(null, "El numero " + columnas + " no es permitido en el campo de juego",
						"ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
>>>>>>> 4ba71d77c9f56388be907d7d054776fec2f7adce
			}

		}
	}
}
