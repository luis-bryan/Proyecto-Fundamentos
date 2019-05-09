package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaMatriz extends JFrame{
  int x = 0;
  int y = 0;
  int tamX = 0;
  int  tamY = 0;
  Datos datos;
  Matriz matriz;
  public VentanaMatriz(){
    x = 20;
    y = 20;
    Datos datos = new Datos();
    matriz = new Matriz(x,y);

    setSize(800, 600);
    setResizable(true);
    setLayout(new GridLayout(1,2));
    add(datos);
    add(matriz);
//    actionListener(this);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);

  }

//  public void actionListener(ActionListener Oyente){
//    panel3.getBoton().addActionListener(Oyente);
//  }

//  @Override
//  public void actionPerformed(ActionEvent e) {
//    String aux1 = panel1.getCampo_numero().getText();
//    double n1 = Double.parseDouble(aux1);
//    String aux2 = panel2.getCampo_numero().getText();
//    double n2 = Double.parseDouble(aux2);
//
//    double suma = n1 + n2;
//
//    panel3.getCampo_numero().setText(""+ suma);
//  }
}
