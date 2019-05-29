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
	Matriz matriz;
	Ayudas ayudas;
	VentanaPrincipal vp;
	
	public VentanaMatriz(int tamX, int tamY, Datos datos, int tor, int let, int obj, VentanaPrincipal vp) {
		ayudas = new Ayudas();
		this.vp = vp;
		x = tamX;
		y = tamY;
		t = tor;
		l = let;
		o = obj;
		matriz = new Matriz(x, y, t, l, o, this, vp);
		setResizable(false);

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

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "ins") {
			JOptionPane.showMessageDialog(null, "HOLA");
		}
	}
	public Ayudas getAyudas() {
		return ayudas;
	}
}