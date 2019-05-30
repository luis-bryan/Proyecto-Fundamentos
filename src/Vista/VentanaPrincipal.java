package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
  private PTamaño pTamaño;
  private PObstaculos pBestias;
  private PObjetivos pObjetivos;
  private PBoton pBoton;
  private ImageIcon bos;

  public VentanaPrincipal() {
    //Se crea la ventana Principal
    setTitle("MENU BOSQUECILLO");//Titulo
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new GridLayout(5, 1)); //Layout
    bos = new ImageIcon(getClass().getResource("/imagenes/PRINCIPAL.png"));//Imagen
    JLabel q = new JLabel(bos);// Contenedor de imagen
    add(q);

    pTamaño = new PTamaño(); /**Panel Tamaño*/

    pBestias = new PObstaculos(); /**Panel Obstaculos(Mounstruos - Muros)*/

    pObjetivos = new PObjetivos();/** Panel Objetivos*/

    pBoton = new PBoton(); /**Panel Botones*/

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
    pBoton.getBoton_instrucciones().addActionListener(escuchador);
    /**
     * Se agregan los actionListener
     */

  }

  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals("be")) {
      /**
      * Si el boton presionado es Empezar
      */
      int filas = 0;
      int columnas = 0;
      int objetivos = 0;
      int tormentosas = 0;
      int letales = 0;
      int muros = 0;
      try {
        //Se reciben los datos del usuario
        String auxf = pTamaño.getCampo_numero1().getText();
        filas = Integer.parseInt(auxf);
        String auxo = pObjetivos.getCampo_numero1().getText();
        objetivos = Integer.parseInt(auxo);
        String auxt = pBestias.getCampo_numero1().getText();
        tormentosas = Integer.parseInt(auxt);
        String auxl = pBestias.getCampo_numero2().getText();
        letales = Integer.parseInt(auxl);
        String auxm = pBestias.getCampo_numero3().getText();
        muros = Integer.parseInt(auxm);
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, ".:DIGITE NUEVAMENTE LOS DATOS:.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        /**
         *  Se comprueba que los valores no tengan letras o espacios
         */
      }

      Datos datos = new Datos(filas, objetivos, tormentosas, letales, muros);
      /**
       * Se validan los datos
       */
      if (filas <= 20 && filas >= 5) {
        int auxiliar = (filas * filas) / 8;
        int auxiliar2 = (filas * filas) / 16;
        int auxiliar3 = (filas * filas) / 5;
        if (tormentosas <= auxiliar) {
          if (letales <= auxiliar2) {
            if (objetivos >= 2 && objetivos <= 5) {
              if (muros <= auxiliar3) {
                VentanaMatriz ventanaMatriz = new VentanaMatriz(filas, datos, tormentosas, letales, objetivos, this, muros);
                setVisible(false);
                ventanaMatriz.pack();
                ventanaMatriz.setVisible(true);
                ventanaMatriz.setExtendedState(MAXIMIZED_BOTH);
                //Si algun dato es incoherente se le informa al usuario
              } else {
                JOptionPane.showMessageDialog(null, "El numero de muros permitido es: " + auxiliar3, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
              }

            } else {
              JOptionPane.showMessageDialog(null, "Numero de Objetivos invalido", "ADVERTENCIA",
                JOptionPane.WARNING_MESSAGE);
            }
          } else {
            JOptionPane.showMessageDialog(null, "El numero de letales permitido es: " + auxiliar2,
              "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

          }
        } else {
          JOptionPane.showMessageDialog(null, "El numero de tormentosas permitido es: " + auxiliar,
            "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
      } else if (filas <= 5) {
        JOptionPane.showMessageDialog(null, "El tamaño permitido es minimo 5", "ADVERTENCIA",
          JOptionPane.WARNING_MESSAGE);
      } else if (filas >= 20) {
        JOptionPane.showMessageDialog(null, "El tamaño permitido es maximo 20", "ADVERTENCIA",
          JOptionPane.WARNING_MESSAGE);
      }
    } else if (e.getActionCommand().equals("bi")) {
      /**
       * Si el boton oprimido es Instrucciones se le muestran las instrucciones al usuario.
       */
      JOptionPane.showOptionDialog(null,
        "INSTRUCCIONES:\n\n\t1.EL BALON DEBERA PASAR POR TODAS LAS COPAS PARA COMPLETAR EL JUEGO\n\t2.PARA EMPUJAR EL BALON MESSI DEBERA ESTAR EN UNA POSICION CONTIGUA AL BALON\n\t3.SI MESSI SE ENCUENTA CON CRISTIANO SE LE RESTARAN 5 PASOS A LOS RESTANTES\n\t4.SI MESSI SE ENCUENTRA CON SERGIO RAMOS PERDERA AUTOMATICAMENTE EL JUEGO\n\t5.EL MAXIMO DE MOVIMIENTOS PERMITIDO ES EL PRODUCTO DEL TAMAÑO X TAMAÑO EL CUAL ES DETERMINADO POR TI\n\t6.EL VALOR MAXIMO DE LAS DIMENSIONES ES DE 20 X 20 Y EL MINIMO ES DE 5 X 5\n\t ",
        "INSTRUCCIONES", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
    }
  }

}
