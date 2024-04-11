package PathToTheGods.Game;

import javax.swing.*;

import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends javax.swing.JFrame{ 
    public Image gameIcon = Toolkit.getDefaultToolkit().getImage("PathToTheGods\\Images\\Icons\\GameLogo.png");
      
    public Window(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setTitle("PathToTheGods");
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(gameIcon);
        setVisible(true);
    }

    public class Menu extends JPanel implements ActionListener{

        public Menu(){
            getContentPane().setBackground(Color.DARK_GRAY);
            JButton test = new JButton();
            test.setBounds(100, 100, 250, 100);
            test.addActionListener(this);
        }

        public void Open(){
            setVisible(true);
        }

        public void Close(){
            setVisible(false);
        }
        
        @Override
        public void actionPerfomed(ActionEvent e){

        }
    }

    
}
