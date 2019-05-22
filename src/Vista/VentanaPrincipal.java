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
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame implements ActionListener {
	PTamaño pTamaño;
	PBestias pBestias;
	PMuros pMuros;
	PObjetivos pObjetivos;
	PBoton pBoton;
	ActionListener oyente;
	PBoton pBoton2;
	

	
	public VentanaPrincipal() {
		setTitle("MENU BOSQUECILLO");
		setSize(500, 500);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(5, 1));
		

		
		
		// PANEL TAMAÑO
		pTamaño = new PTamaño();
		// PANEL MUROS
		pMuros = new PMuros();
		// PANEL BESTIAS
		pBestias = new PBestias();
		// PANEL OBJETIVOS
		pObjetivos = new PObjetivos();
		// PANEL BOTON
		pBoton = new PBoton();

		add(pTamaño);
		add(pObjetivos);
		add(pBestias);
		add(pMuros);
		add(pBoton);

		actionListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void actionListener(VentanaPrincipal escuchador) {
		pBoton.getBoton_empezar().addActionListener(escuchador);
	}
	public void actionPerformed(ActionEvent e) {
		int filas=0;
		int columnas=0;

		int objetivos = 0;
		int tormentosas = 0;
		int letales = 0;
		int muros = 0;
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
			VentanaMatriz ventanaMatriz = new VentanaMatriz(filas, columnas, datos);
			setVisible(false);
			ventanaMatriz.pack();
			ventanaMatriz.setSize(500,500);
			ventanaMatriz.setVisible(true);
		}else if(filas<=20 || filas >=5){
			JOptionPane.showMessageDialog(null, "El numero "+filas +" no es permitido en el campo de juego","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
		}else if(columnas<=20 || columnas>=5) {
			JOptionPane.showMessageDialog(null, "El numero "+columnas +" no es permitido en el campo de juego","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);	
		}
		
	}
	}
}
