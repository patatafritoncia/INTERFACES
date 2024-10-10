/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces.ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author FP
 */
public class Ventana {

    JFrame frame = new JFrame(); // Objeto tipo JFrame 
    JPanel panel = new JPanel();
    JTextField cajaTexto = new JTextField(); //Objeto tipo JTextField, cuadro de texto  -- Esto en tema de capas queda por encima porque el prog le da mas prioridad
    JTextArea area = new JTextArea();

    public Ventana() { //Constructor ventana para el frame JFrame
        frame.setVisible(true); //Para que la ventana sea visible
        frame.setSize(700, 700); // Para elegir el tamaño de la pantalla
        frame.setTitle("Java Swing"); // Para añadirle un título a la ventana
        frame.setResizable(false); //para permitir o no cambiar el tamaño de la pantalla con ratón tipo arrastrando
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //Para poner pantalla completa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra el programa al darle a x DEFECTO

        /*frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // No hace nada al darle a la x
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // Minimiza al darle x
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Elimina la ventana al darle a la x*/
        frame.setLocation(500, 200); // Para cambiar la posicion inicial de la ventana RESPECTO A LA PANTALLA
        frame.getContentPane().setBackground(Color.red); //Para acceder al interior de la ventana o panel de la ventana

        // cuando construyes la ventana metes el resto de metodos, por ejemplo aqui llamamos a panel y no en principal
        Panel(); // construimos la entana con todo
        Etiqueta();//llamamos a etiqueta y la ponemos enla ventana
        CajaTexto();
        Boton();
        EtiquetaImagen();
        AreaTexto();
        BotonArea();
        FondoPantalla();
    }

    public void Panel() {
        panel.setBackground(Color.pink); // poner color a panel
        panel.setMaximumSize(new Dimension(700, 700)); //Tamaño maximo del panel
        panel.setMinimumSize(new Dimension(700, 700)); //Tamaño mínimo del panel

        //Para posicionar otros elementos en el panel. 
        /*panel.setLayout(new FlowLayout()); //alineamiento a la izquierda
        panel.setLayout(new BorderLayout()); //Cinco zonas: norte, sur, este, oeste y centro
        panel.setLayout(new GridLayout()); //una cuadricula predefinida
        panel.setLayout(new GridBagLayout()); //una cuadricula flixible
        panel.setLayout(new BoxLayout(panel, 0)); //por coordenadas*/
        panel.setLayout(null);// desactiva el layout por defecto 
        frame.add(panel); //para añadir unelemento a otro, en este caso panel sobre ventana
    }

    public void Etiqueta() { // Método para construir una etiqueta
        JLabel etiqueta = new JLabel();// construimos objeto tipo etiqueta
        panel.add(etiqueta); // añadimos la etiqueta al panel

        etiqueta.setText("Pistacho");
        etiqueta.setBounds(50, 60, 100, 50); // Para añadir coordenadas (2) y dimensiones (2) horizontal y luego vertical
        //etiqueta.setSize(50,50); // siponemos esto solo le da tamaño
        etiqueta.setOpaque(true);  // para que la etiqueta sea opaca, defecto transparente
        etiqueta.setForeground(Color.magenta); // cambiar color de letra
        etiqueta.setBackground(Color.YELLOW); // cambiar fondo de etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // para posicionar el texto 
        etiqueta.setFont(new Font("Consolas", Font.BOLD, 20));
    }

    public void CajaTexto() {
        panel.add(cajaTexto);
        cajaTexto.setBounds(160, 60, 280, 50);
        cajaTexto.setForeground(Color.black);
        cajaTexto.setBackground(Color.white);
        cajaTexto.setHorizontalAlignment(SwingConstants.LEFT);
        cajaTexto.setFont(new Font("Calibri", Font.BOLD, 25));
    }

    public void Boton() {
        JButton boton = new JButton(); //Objeto tipo JButton, boton
        panel.add(boton);
        boton.setBounds(50, 120, 390, 50);
        //boton.setText("ESO ES ASÍ");
        boton.setForeground(Color.black);
        boton.setBackground(Color.orange);
        boton.setFont(new Font("Ink Free", Font.BOLD, 25));

        ImageIcon imagen = new ImageIcon("Imagenes/gato.jpg");
        boton.setIcon(imagen);

        JLabel respuesta = new JLabel();
        panel.add(respuesta);

        ActionListener pulsar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                respuesta.setBounds(50, 180, 390, 50);
                respuesta.setText("Que salga la china!" + cajaTexto.getText());
                respuesta.setForeground(Color.black);
                respuesta.setBackground(Color.white);
                panel.add(respuesta);

                //throw new UnsupportedOperationException("Not supported yet."); // arroja excepciones por defecto
            }
        };  // acaba en punto y coma es raro

        cajaTexto.addActionListener(pulsar); // das a enter y sale el mensaje
        // boton.addActionListener(pulsar); // sale el mensaje cuando pulsas el botn
    }

    public void EtiquetaImagen() {
        // por defecto las imagenes tienen el tamaño predeterminado, para cambiarlo hay que hacerlo manualmente con los numerinchis
        //      JLabel etiquetaImagen = new JLabel(new ImageIcon("Imagenes/gato.jpg"));    //Añadir la imagen en el constructor

        // De forma fina, demure, chic, astetica y mindfull
        // Se genera la imagen y la etiqueta de forma independiente
        ImageIcon imagen = new ImageIcon("Imagenes/gato.jpg");
        JLabel etiquetaImagen = new JLabel(imagen);
        panel.add(etiquetaImagen);
        etiquetaImagen.setBounds(100, 180, 200, 200);
        etiquetaImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_DEFAULT)));
    }

    public void AreaTexto() {
        area.setBounds(50, 500, 400, 140);
        area.setBackground(Color.black);
        area.setForeground(Color.white);
        area.setFont(new Font("Arial", Font.BOLD, 12));

        panel.add(area);
    }
    // Permite introducir saltos de linea. Intro añade un salto de linea (\n), pero no activar el boton como un JTextField
    public void BotonArea() {
        JButton botonArea = new JButton();
        panel.add(botonArea);
        botonArea.setBounds(450, 500, 100, 140);
        //boton.setText("ESO ES ASÍ");
        botonArea.setForeground(Color.black);
        botonArea.setBackground(Color.orange);
        botonArea.setFont(new Font("Arial", Font.BOLD, 25));
        
        ActionListener pulsar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(area.getText());

            }
        };  // acaba en punto y coma es raro

        botonArea.addActionListener(pulsar); // das a enter y sale el mensaje
        // boton.addActionListener(pulsar); // sale el mensaje cuando pulsas el botn
    }

    public void FondoPantalla() {
        JLabel fondo = new JLabel();
        fondo.setBounds(0, 0, panel.getWidth(), panel.getHeight());
        fondo.setOpaque(true);
        fondo.setBackground(Color.cyan);
        ImageIcon imagen = new ImageIcon("Imagenes/gato.jpg");
        fondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT)));
        panel.add(fondo);
        panel.repaint();
    }

}
