package Vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame implements ActionListener {
	PTamaño pTamaño;
	PBestias pBestias;
	PMuros pMuros;
	PObjetivos pObjetivos;
	PBoton pBoton;
	ActionListener oyente;

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
		String aux1=pTamaño.getCampo_numero1().getText();
		filas=Integer.parseInt(aux1);
		String aux2=pTamaño.getCampo_numero2().getText();
		columnas=Integer.parseInt(aux2);
	}

}
