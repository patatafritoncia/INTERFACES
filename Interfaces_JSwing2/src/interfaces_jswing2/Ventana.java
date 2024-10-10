package interfaces_jswing2;

import java.awt.*;
import javax.swing.*;

public class Ventana {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JRadioButton radioBtn = new JRadioButton();
    
    public Ventana(){
        frame.setVisible(true); 
        frame.setSize(700, 700); 
        frame.setTitle("Java Swing 2"); 
        frame.setResizable(false); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLocation(500, 200); 
        frame.getContentPane().setBackground(Color.red); 

        // cuando construyes la ventana metes el resto de metodos
        Panel(); 
        RadioButton();
        
    }
    
    public void Panel(){
        panel.setBackground(Color.red);
        panel.setMaximumSize(new Dimension(700, 700)); 
        panel.setMinimumSize(new Dimension(700, 700)); 
        panel.setLayout(null);
        frame.add(panel);
    }
    
    public void RadioButton(){
        panel.add(radioBtn);
        radioBtn.setBounds(50, 120, 390, 50);
        //boton.setText("ESO ES ASÍ");
        radioBtn.setForeground(Color.black);
        radioBtn.setBackground(Color.orange);
        radioBtn.setFont(new Font("Calibri", Font.BOLD, 25));
    }
}
