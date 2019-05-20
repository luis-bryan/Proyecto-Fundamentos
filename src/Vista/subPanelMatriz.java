package Vista;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class subPanelMatriz extends JPanel{
	Matriz matriz;
	public subPanelMatriz(int x, int y) {
		setLayout(new GridLayout());
		matriz = new Matriz(x,y);
		add(matriz);
	}
	public Matriz getMatriz() {
		return matriz;
	}
	public void setMatriz(Matriz matriz) {
		this.matriz = matriz;
	} 
	
}
