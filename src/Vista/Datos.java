package Vista;

import javax.swing.*;
import java.awt.*;

public class Datos extends JPanel {
  JLabel aux;
  ImageIcon bos; 

  public Datos(int filas, int columnas, int objetivos, int tormentosas, int letales, int muros) {
    setBackground(Color.white);
    setLayout(null);
    bos=new ImageIcon(getClass().getResource("/Imagenes/cristiano.jpg"));
    JLabel q = new JLabel(bos);
    q.setBounds(0,0,getWidth(),getHeight());
    add(q);
    aux = new JLabel("<html> Filas: <br>" + filas + "</html>");
    add(aux).setBounds(10,100,150,30);
    aux = new JLabel("<html>Columnas:<br> " + columnas+"</html>");
    add(aux).setBounds(10,200,150,30);
    aux = new JLabel("<html>Objetivos: <br>" + objetivos+"</html>");
    add(aux).setBounds(10,300,150,30);
    aux = new JLabel("<html>Bestias Tormentosas: <br>" + tormentosas+"</html>");
    add(aux).setBounds(10,400,200,30);
    aux = new JLabel("<html>Bestias Letales: <br>" + letales+"</html>");
    add(aux).setBounds(10,500,150,30);
    aux = new JLabel("<html>Muros:<br> " + muros+"</html>");
    add(aux).setBounds(10,600,150,30);
  }
}