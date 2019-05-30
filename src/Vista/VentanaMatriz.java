package Vista;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

  /**
   * @param tamX Tamaño de la matriz (X*X)
   * @param datos Objeto de la clase datos, Panel que contiene la informacion del juego
   * @param tor Cantidad de tormentosos
   * @param let Cantidad de letales
   * @param obj Cantidad de objetivos
   * @param vp Ventana principal, con el fin de volverla a mostrar posteriormente
   * @param mur Cantidad de muros
   */
  public VentanaMatriz(int tamX, Datos datos, int tor, int let, int obj, VentanaPrincipal vp, int mur) {

    ayudas = new Ayudas(); /**Se crea un objeto de Ayudas, que mostrara los pasos restantes y la cantidad de objetivos obtenidos*/
    this.vp = vp;
    x = tamX;
    t = tor;
    l = let;
    o = obj;
    m = mur;
    matriz = new Matriz(x, t, l, o, this, vp, m); /**Crea un objeto de matriz, que contiene tamaño, cant. tormentosos, cant. letales, cant. objetivos, ventana matriz, ventana principal y cantidad de muros.*/
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
/**
 *  Se agregan los actionListener
 */
    ayudas.getInstrucciones().addActionListener(e);
    ayudas.getReintentar().addActionListener(e);
    ayudas.getAyuda().addActionListener(e);

    /**
     * Se agregan keyListeners con el fin de solucionar algunos problemas
     */
    ayudas.getInstrucciones().addKeyListener(matriz);
    ayudas.getReintentar().addKeyListener(matriz);
    ayudas.getAyuda().addKeyListener(matriz);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand() == "i") {
      /**
       * Si el boton presionado es instrucciones Quita 5 pasos como penalizacion
       */
      UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
        "Cooper Black", Font.BOLD, 10)));
      int input = JOptionPane.showOptionDialog(null,
        ".: RECUERDA QUE AL VER LAS INSTRUCCIONES SE TE RESTARAN 5 PASOS DE LOS RESTANTES :.\n"
          + "                                                 ¿DESEAR VER LAS INSTRUCCIONES?",
        "IMPORTANTE", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
      if (input == JOptionPane.YES_OPTION) {
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
          "Cooper Black", Font.BOLD, 10)));
        int restarpasos = matriz.getPasos();
        matriz.setPasos(restarpasos - 5);
        JOptionPane.showOptionDialog(null,
          "INSTRUCCIONES:\n\n\t1.EL BALON DEBERA PASAR POR TODAS LAS COPAS PARA COMPLETAR EL JUEGO\n\t2.PARA EMPUJAR EL BALON MESSI DEBERA ESTAR EN UNA POSICION CONTIGUA AL BALON\n\t 3.SÍ MESSI SE ENCUENTA CON CRISTIANO SE LE RESTARAN 5 PASOS A LOS RESTANTES\n\t4.SI MESSI SE ENCUENTRA CON SERGIO RAMOS PERDERA AUTOMATICAMENTE EL JUEGO\n\t5.EL MAXIMO DE MOVIMIENTOS PERMITIDO ES EL PRODUCTO ENTRE LAS FILAS Y COLUMNAS LAS CUALES SON DETERMINADAS POR TI\n\t6.EL VALOR MAXIMO DE LAS DIMENSIONES ES DE 20 X 20 Y EL MINIMO ES DE 5 X 5\n\t7. SI EN EL RECORRIDO MESSI PASA POR EN MEDIO DE DOS CARLOS SANCHEZ OBTENDRA UNA PENALIZACION EQUIVALENTE A LA SUMA DE LAS \n\tCOORDENADAS DE LA POSICIÓN EN DONDE SE ENCUENTRE LA CUAL SERA RESTADA DE LOS PASOS RESTANTES.\n\t ",
          "INSTRUCCIONES", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
      }

    } else if (e.getActionCommand() == "r") {
      /**
       * Si el boton presionado es volver a jugar se muestra nuevamente la ventana principal
       */
      setVisible(false);
      vp.setVisible(true);

    } else if (e.getActionCommand() == "a") {
      /**
       * Si el boton es bonus se le regalan 10 pasos a cambio de un muro invisible
       */
      UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
        "Cooper Black", Font.BOLD, 10)));
      int input = JOptionPane.showOptionDialog(null,
        ".: SI DESAEAS UTILIZAR EL BONUS TE DAREMOS 10 PASOS MAS, PERO TE AÑADIREMOS UN MURO INVISIBLE:.\n"
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