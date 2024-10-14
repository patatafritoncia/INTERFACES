/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patricia_test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author patri
 */
public class Ventana_Emergente {

    JFrame frame2 = new JFrame();
    JPanel panel2, panel3;
    JButton btnFinalizar;
    JLabel pregunta1, pregunta2, pregunta3, pregunta4, pregunta5, pregunta6, pregunta7, pregunta8, pregunta9, pregunta10;

    // En el primer panel aparecen 5 opcions
    JRadioButton opcion1_1, opcion1_2, opcion1_3;
    JRadioButton opcion2_1, opcion2_2, opcion2_3;
    JRadioButton opcion3_1, opcion3_2, opcion3_3;
    JRadioButton opcion4_1, opcion4_2, opcion4_3;
    JRadioButton opcion5_1, opcion5_2, opcion5_3;

    // En el segundo panel aparecen otras 5 opcions
    JRadioButton opcion6_1, opcion6_2, opcion6_3;
    JRadioButton opcion7_1, opcion7_2, opcion7_3;
    JRadioButton opcion8_1, opcion8_2, opcion8_3;
    JRadioButton opcion9_1, opcion9_2, opcion9_3;
    JRadioButton opcion10_1, opcion10_2, opcion10_3;

    ButtonGroup grupo1, grupo2, grupo3, grupo4, grupo5, grupo6, grupo7, grupo8, grupo9, grupo10;
    JCheckBox check1;
    
    static int contador = 0;

    public Ventana_Emergente() {
        frame2.setVisible(true);
        frame2.setSize(950, 950);
        frame2.setTitle("Test de Taylor Swift");
        frame2.setResizable(false);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLocation(500, 50);
        frame2.getContentPane().setBackground(Color.red);

        Panel2();
        Preguntas1();
        JLabelPreguntas1();
        /*Radio1();
        Radio2();
        Radio3();
        Radio4();
        Radio5();
        Radio6();
        Radio7();
        Radio8();
        Radio9();
        Radio10();
        Check();*/
        BotonFinalizar();
        FondoPantalla2();

    }

    public void Panel2() {
        panel2 = new JPanel();
        panel2.setVisible(true);
        panel2.setBackground(Color.pink);
        panel2.setMaximumSize(new Dimension(950, 950));
        panel2.setMinimumSize(new Dimension(950, 950));
        panel2.setLayout(null);

        frame2.add(panel2);
    }

    public void Preguntas1() {
        Radio1();
        Radio2();
        Radio3();
        Radio4();
        Radio5();
        Radio6();
        Radio7();
        Radio8();
        Radio9();
        Radio10();
        Check();
    }

    public void JLabelPreguntas1() {
        pregunta1 = new JLabel();
        pregunta2 = new JLabel();
        pregunta3 = new JLabel();
        pregunta4 = new JLabel();
        pregunta5 = new JLabel();

        panel2.add(pregunta1);
        panel2.add(pregunta2);
        panel2.add(pregunta3);
        panel2.add(pregunta4);
        panel2.add(pregunta5);

        pregunta1.setText("¿En qué año nació Taylor Swift?");
        pregunta1.setBounds(30, 10, 550, 50);
        pregunta1.setOpaque(false);
        pregunta1.setForeground(Color.BLACK);
        pregunta1.setHorizontalAlignment(SwingConstants.LEFT);
        pregunta1.setFont(new Font("Calibri", Font.BOLD, 15));

        pregunta2.setText("¿Cómo se llama su primer album?");
        pregunta2.setBounds(30, 130, 550, 50);
        pregunta2.setOpaque(false);
        pregunta2.setForeground(Color.BLACK);
        pregunta2.setHorizontalAlignment(SwingConstants.LEFT);
        pregunta2.setFont(new Font("Calibri", Font.BOLD, 15));

        pregunta3.setText("¿Qúe canción lanzó como sencillo en 2008 que la llevó al éxito?");
        pregunta3.setBounds(30, 250, 550, 50);
        pregunta3.setOpaque(false);
        pregunta3.setForeground(Color.BLACK);
        pregunta3.setHorizontalAlignment(SwingConstants.LEFT);
        pregunta3.setFont(new Font("Calibri", Font.BOLD, 15));

        pregunta4.setText("¿De qué álbum es la canción 'Blank Space'?");
        pregunta4.setBounds(30, 370, 550, 50);
        pregunta4.setOpaque(false);
        pregunta4.setForeground(Color.BLACK);
        pregunta4.setHorizontalAlignment(SwingConstants.LEFT);
        pregunta4.setFont(new Font("Calibri", Font.BOLD, 15));

        pregunta5.setText("¿Cuál es el nombre de la gira de su albúm 'Reputation'?");
        pregunta5.setBounds(30, 490, 550, 50);
        pregunta5.setOpaque(false);
        pregunta5.setForeground(Color.BLACK);
        pregunta5.setHorizontalAlignment(SwingConstants.LEFT);
        pregunta5.setFont(new Font("Calibri", Font.BOLD, 15));

        pregunta6 = new JLabel();
        pregunta7 = new JLabel();
        pregunta8 = new JLabel();
        pregunta9 = new JLabel();
        pregunta10 = new JLabel();

        panel2.add(pregunta6);
        panel2.add(pregunta7);
        panel2.add(pregunta8);
        panel2.add(pregunta9);
        panel2.add(pregunta10);

        pregunta6.setText("¿En qué película hizo un cameo Taylor Swift en 2010?");
        pregunta6.setBounds(30, 610, 550, 50);
        pregunta6.setOpaque(false);
        pregunta6.setForeground(Color.BLACK);
        pregunta6.setHorizontalAlignment(SwingConstants.LEFT);
        pregunta6.setFont(new Font("Calibri", Font.BOLD, 15));

        pregunta7.setText("¿Cuál es el género principal de su álbum Folklore?");
        pregunta7.setBounds(30, 730, 550, 50);
        pregunta7.setOpaque(false);
        pregunta7.setForeground(Color.BLACK);
        pregunta7.setHorizontalAlignment(SwingConstants.LEFT);
        pregunta7.setFont(new Font("Calibri", Font.BOLD, 15));

        pregunta8.setText("¿Cuál fue el primer álbum que Taylor regrabó en 2021?");
        pregunta8.setBounds(480, 370, 550, 50);
        pregunta8.setOpaque(false);
        pregunta8.setForeground(Color.BLACK);
        pregunta8.setHorizontalAlignment(SwingConstants.LEFT);
        pregunta8.setFont(new Font("Calibri", Font.BOLD, 15));

        pregunta9.setText("¿En qué ciudad nació Taylor Swift?");
        pregunta9.setBounds(480, 490, 550, 50);
        pregunta9.setOpaque(false);
        pregunta9.setForeground(Color.BLACK);
        pregunta9.setHorizontalAlignment(SwingConstants.LEFT);
        pregunta9.setFont(new Font("Calibri", Font.BOLD, 15));

        pregunta10.setText("¿Con quién colaboró Taylor en la canción 'Everything Has Changed'?");
        pregunta10.setBounds(480, 610, 550, 50);
        pregunta10.setOpaque(false);
        pregunta10.setForeground(Color.BLACK);
        pregunta10.setHorizontalAlignment(SwingConstants.LEFT);
        pregunta10.setFont(new Font("Calibri", Font.BOLD, 15));
    }

    public void JLabelPreguntas2() {
        pregunta6 = new JLabel();
        pregunta7 = new JLabel();
        pregunta8 = new JLabel();
        pregunta9 = new JLabel();
        pregunta10 = new JLabel();
    }

    public void Radio1() {
        grupo1 = new ButtonGroup();
        opcion1_1 = new JRadioButton();
        opcion1_2 = new JRadioButton();
        opcion1_3 = new JRadioButton();

        opcion1_1.setBounds(30, 50, 300, 30);
        opcion1_1.setText("1989");
        opcion1_1.setOpaque(false);
        opcion1_2.setBounds(30, 80, 300, 30);
        opcion1_2.setText("1991");
        opcion1_2.setOpaque(false);
        opcion1_3.setBounds(30, 110, 300, 30);
        opcion1_3.setText("1993");
        opcion1_3.setOpaque(false);

        grupo1.add(opcion1_1);
        grupo1.add(opcion1_2);
        grupo1.add(opcion1_3);

        panel2.add(opcion1_1);
        panel2.add(opcion1_2);
        panel2.add(opcion1_3);
    }

    public void Radio2() {
        grupo2 = new ButtonGroup();
        opcion2_1 = new JRadioButton();
        opcion2_2 = new JRadioButton();
        opcion2_3 = new JRadioButton();

        opcion2_1.setBounds(30, 170, 300, 30);
        opcion2_1.setText("Fearless");
        opcion2_1.setOpaque(false);
        opcion2_2.setBounds(30, 200, 300, 30);
        opcion2_2.setText("Taylor Swift");
        opcion2_2.setOpaque(false);
        opcion2_3.setBounds(30, 230, 300, 30);
        opcion2_3.setText("Speak Now");
        opcion2_3.setOpaque(false);

        grupo2.add(opcion2_1);
        grupo2.add(opcion2_2);
        grupo2.add(opcion2_3);

        panel2.add(opcion2_1);
        panel2.add(opcion2_2);
        panel2.add(opcion2_3);
    }

    public void Radio3() {
        grupo3 = new ButtonGroup();
        opcion3_1 = new JRadioButton();
        opcion3_2 = new JRadioButton();
        opcion3_3 = new JRadioButton();

        opcion3_1.setBounds(30, 290, 300, 30);
        opcion3_1.setText("Love Story");
        opcion3_1.setOpaque(false);
        opcion3_2.setBounds(30, 320, 300, 30);
        opcion3_2.setText("You Belong with Me");
        opcion3_2.setOpaque(false);
        opcion3_3.setBounds(30, 350, 300, 30);
        opcion3_3.setText("Teardrops on My Guitar");
        opcion3_3.setOpaque(false);

        grupo3.add(opcion3_1);
        grupo3.add(opcion3_2);
        grupo3.add(opcion3_3);

        panel2.add(opcion3_1);
        panel2.add(opcion3_2);
        panel2.add(opcion3_3);
    }

    public void Radio4() {
        grupo4 = new ButtonGroup();
        opcion4_1 = new JRadioButton();
        opcion4_2 = new JRadioButton();
        opcion4_3 = new JRadioButton();

        opcion4_1.setBounds(30, 410, 300, 30);
        opcion4_1.setText("1989");
        opcion4_1.setOpaque(false);
        opcion4_2.setBounds(30, 440, 300, 30);
        opcion4_2.setText("Red");
        opcion4_2.setOpaque(false);
        opcion4_3.setBounds(30, 470, 300, 30);
        opcion4_3.setText("Reputation");
        opcion4_3.setOpaque(false);

        grupo4.add(opcion4_1);
        grupo4.add(opcion4_2);
        grupo4.add(opcion4_3);

        panel2.add(opcion4_1);
        panel2.add(opcion4_2);
        panel2.add(opcion4_3);
    }

    public void Radio5() {
        grupo5 = new ButtonGroup();
        opcion5_1 = new JRadioButton();
        opcion5_2 = new JRadioButton();
        opcion5_3 = new JRadioButton();

        opcion5_1.setBounds(30, 530, 300, 30);
        opcion5_1.setText("Red Tour");
        opcion5_1.setOpaque(false);
        opcion5_2.setBounds(30, 560, 300, 30);
        opcion5_2.setText("1989 World Tour");
        opcion5_2.setOpaque(false);
        opcion5_3.setBounds(30, 590, 300, 30);
        opcion5_3.setText("Reputation Stadium Tour");
        opcion5_3.setOpaque(false);

        grupo5.add(opcion5_1);
        grupo5.add(opcion5_2);
        grupo5.add(opcion5_3);

        panel2.add(opcion5_1);
        panel2.add(opcion5_2);
        panel2.add(opcion5_3);
    }

    public void Radio6() {
        grupo6 = new ButtonGroup();
        opcion6_1 = new JRadioButton();
        opcion6_2 = new JRadioButton();
        opcion6_3 = new JRadioButton();

        opcion6_1.setBounds(30, 650, 300, 30);
        opcion6_1.setText("Valentine's Day");
        opcion6_1.setOpaque(false);
        opcion6_2.setBounds(30, 680, 300, 30);
        opcion6_2.setText("The Hunger Games");
        opcion6_2.setOpaque(false);
        opcion6_3.setBounds(30, 710, 300, 30);
        opcion6_3.setText("Cats");
        opcion6_3.setOpaque(false);

        grupo6.add(opcion6_1);
        grupo6.add(opcion6_2);
        grupo6.add(opcion6_3);

        panel2.add(opcion6_1);
        panel2.add(opcion6_2);
        panel2.add(opcion6_3);
    }

    public void Radio7() {
        grupo7 = new ButtonGroup();
        opcion7_1 = new JRadioButton();
        opcion7_2 = new JRadioButton();
        opcion7_3 = new JRadioButton();

        opcion7_1.setBounds(30, 760, 300, 30);
        opcion7_1.setText("Country");
        opcion7_1.setOpaque(false);
        opcion7_2.setBounds(30, 790, 300, 30);
        opcion7_2.setText("Pop");
        opcion7_2.setOpaque(false);
        opcion7_3.setBounds(30, 820, 300, 30);
        opcion7_3.setText("Indie-folk");
        opcion7_3.setOpaque(false);

        grupo7.add(opcion7_1);
        grupo7.add(opcion7_2);
        grupo7.add(opcion7_3);

        panel2.add(opcion7_1);
        panel2.add(opcion7_2);
        panel2.add(opcion7_3);
    }

    public void Radio8() {
        grupo8 = new ButtonGroup();
        opcion8_1 = new JRadioButton();
        opcion8_2 = new JRadioButton();
        opcion8_3 = new JRadioButton();

        opcion8_1.setBounds(480, 410, 300, 30);
        opcion8_1.setText("Red");
        opcion8_1.setOpaque(false);
        opcion8_2.setBounds(480, 440, 300, 30);
        opcion8_2.setText("Fearless");
        opcion8_2.setOpaque(false);
        opcion8_3.setBounds(480, 470, 300, 30);
        opcion8_3.setText("Speak Now");
        opcion8_3.setOpaque(false);

        grupo8.add(opcion8_1);
        grupo8.add(opcion8_2);
        grupo8.add(opcion8_3);

        panel2.add(opcion8_1);
        panel2.add(opcion8_2);
        panel2.add(opcion8_3);
    }

    public void Radio9() {
        grupo9 = new ButtonGroup();
        opcion9_1 = new JRadioButton();
        opcion9_2 = new JRadioButton();
        opcion9_3 = new JRadioButton();

        opcion9_1.setBounds(480, 530, 300, 30);
        opcion9_1.setText("Nashville");
        opcion9_1.setOpaque(false);
        opcion9_2.setBounds(480, 560, 300, 30);
        opcion9_2.setText("Los Ángeles");
        opcion9_2.setOpaque(false);
        opcion9_3.setBounds(480, 590, 300, 30);
        opcion9_3.setText("Reading");
        opcion9_3.setOpaque(false);

        grupo9.add(opcion9_1);
        grupo9.add(opcion9_2);
        grupo9.add(opcion9_3);

        panel2.add(opcion9_1);
        panel2.add(opcion9_2);
        panel2.add(opcion9_3);
    }

    public void Radio10() {
        grupo10 = new ButtonGroup();
        opcion10_1 = new JRadioButton();
        opcion10_2 = new JRadioButton();
        opcion10_3 = new JRadioButton();

        opcion10_1.setBounds(480, 650, 300, 30);
        opcion10_1.setText("Ed Sheeran");
        opcion10_1.setOpaque(false);
        opcion10_2.setBounds(480, 680, 300, 30);
        opcion10_2.setText("Shawn Mendes");
        opcion10_2.setOpaque(false);
        opcion10_3.setBounds(480, 710, 300, 30);
        opcion10_3.setText("Justin Timberlake");
        opcion10_3.setOpaque(false);

        grupo10.add(opcion10_1);
        grupo10.add(opcion10_2);
        grupo10.add(opcion10_3);

        panel2.add(opcion10_1);
        panel2.add(opcion10_2);
        panel2.add(opcion10_3);
    }

    public void Check() {
        check1 = new JCheckBox();
        check1.setBounds(500, 850, 200, 50);
        check1.setText("Quiero entregar el examen");
        check1.setOpaque(false);
        check1.setFont(new Font("Calibri", Font.BOLD, 15));

        panel2.add(check1);
    }

    public void BotonFinalizar() {
        btnFinalizar = new JButton();
        btnFinalizar.setBounds(700, 850, 200, 50);
        btnFinalizar.setText("Finalizar");
        btnFinalizar.setForeground(Color.black);
        btnFinalizar.setBackground(Color.white);
        btnFinalizar.setFont(new Font("Calibri", Font.BOLD, 25));
        btnFinalizar.setEnabled(false);

        panel2.add(btnFinalizar);

        // Añadir un ItemListener para detectar cuando se selecciona
        check1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (check1.isSelected()) {
                    btnFinalizar.setEnabled(true); // Habilitar el botón si el checkbox está marcado
                } else {
                    btnFinalizar.setEnabled(false); // Deshabilitarlo si se desmarca
                }
            }
        });

        ActionListener seleccion = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (opcion1_1.isSelected()) {
                    contador++;
                }
                if (opcion2_2.isSelected()) {
                    contador++;
                }
                if (opcion3_1.isSelected()) {
                    contador++;
                }
                if (opcion4_1.isSelected()) {
                    contador++;
                }
                if (opcion5_3.isSelected()) {
                    contador++;
                }
                if (opcion6_1.isSelected()) {
                    contador++;
                }
                if (opcion7_3.isSelected()) {
                    contador++;
                }
                if (opcion8_2.isSelected()) {
                    contador++;
                }
                if (opcion9_3.isSelected()) {
                    contador++;
                }
                if (opcion10_1.isSelected()) {
                    contador++;
                }
                
                frame2.dispose();
                Ventana ventana1 = new Ventana();
                ventana1.MostrarResultado();
            }
        };

        btnFinalizar.addActionListener(seleccion);
    }

    public void FondoPantalla2() {
        JLabel fondo2 = new JLabel();
        fondo2.setBounds(0, 0, 950, 950);
        fondo2.setOpaque(true);
        ImageIcon imagen2 = new ImageIcon("imagenes/fondoTaylor2.png");
        fondo2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(fondo2.getWidth(), fondo2.getHeight(), Image.SCALE_DEFAULT)));

        panel2.add(fondo2);
        panel2.repaint();
    }

}
