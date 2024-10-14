/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patricia_test;

/**
 *
 * @author patri
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author FP
 */
public class Ventana {

    JFrame frame = new JFrame();
    JPanel panel;
    JButton btnEmpezar;
    JLabel resultado;

    public Ventana() {
        frame.setVisible(true);
        frame.setSize(800, 800);
        frame.setTitle("Test de Taylor Swift");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(500, 50);
        frame.getContentPane().setBackground(Color.red);

        Panel();
        BotonEmpezar();
        Resultado();
        FondoPantalla();
        MostrarResultado();

    }

    public void Panel() {
        panel = new JPanel();
        panel.setBackground(Color.pink);
        panel.setMaximumSize(new Dimension(800, 800));
        panel.setMinimumSize(new Dimension(800, 800));
        panel.setLayout(null);
        frame.add(panel);
    }
    
    public void Resultado (){
        resultado = new JLabel();
        
        resultado.setText("Resultado: " + Ventana_Emergente.contador + " /10");
        resultado.setBounds(300, 300, 200, 50);
        resultado.setOpaque(false);
        resultado.setForeground(Color.BLACK);
        resultado.setHorizontalAlignment(SwingConstants.LEFT);
        resultado.setFont(new Font("Calibri", Font.BOLD, 20));
        
        panel.add(resultado);
    }

    // Botón comenzar test
    public void BotonEmpezar() {
        btnEmpezar = new JButton();
        btnEmpezar.setBounds(300, 200, 200, 50);
        btnEmpezar.setText("Empezar Test");
        btnEmpezar.setForeground(Color.black);
        btnEmpezar.setBackground(Color.white);
        btnEmpezar.setFont(new Font("Calibri", Font.BOLD, 25));

        panel.add(btnEmpezar);
        
        btnEmpezar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana_Emergente ventanaE = new Ventana_Emergente();
                
            }
        });

    }
    
    public void FondoPantalla(){
        JLabel fondo = new JLabel();
        fondo.setBounds(0, 0, panel.getWidth(), panel.getHeight());
        fondo.setOpaque(true);
        ImageIcon imagen = new ImageIcon("imagenes/fondoTaylor.png");
        fondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT)));
        panel.add(fondo);

        panel.repaint();
    }
    
    public void MostrarResultado(){
        JLabel fondo = new JLabel();
        FondoPantalla();
        ImageIcon imagen = new ImageIcon("imagenes/fondoTaylor.png");
        fondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT)));
        frame.setVisible(true);
        frame.repaint();
        //resultado.setText("Resultado: " + Ventana_Emergente.contador + " /10");
    }

}
