package Vista;

import javax.swing.*;
import java.awt.*;

public class Datos extends JPanel {
	JLabel Filas;
	public Datos(int filas, int columnas){
	Filas = new JLabel("Filas: " + filas);
    setBackground(Color.RED);
    setPreferredSize(new Dimension(100,600));
    add(Filas);

    //setBounds(0,0,100,600);
  }
}
