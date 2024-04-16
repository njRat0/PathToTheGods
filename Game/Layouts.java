package PathToTheGods.Game;
import javax.swing.*;
//import javax.swing.plaf.ButtonUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Layout_MainMenu extends JPanel implements ActionListener{
    private Button startButton;
    private Button settingsButton;
    private Button exitButton;
    private Button test;

    public Layout_MainMenu(){
        startButton = new Button("Start");
        settingsButton = new Button("Settings");
        exitButton = new Button("Exit");
        test = new Button("FUCK");
        test.setImage("PathToTheGods\\Images\\Icons\\GameLogo.png");

        startButton.addActionListener(this);
        settingsButton.addActionListener(this);
        exitButton.addActionListener(this);

        startButton.setColor(new Color(0,0,0));
        startButton.setColorOver(new Color(78, 78, 78));
        startButton.setColorClick(new Color(140, 140, 140));
        startButton.setForeground(new Color(255,255,255));
        startButton.setSize(new Dimension(100,100));
        startButton.setPosition(new Dimension(400, 233));

        settingsButton.setSize(new Dimension(700,332));
        settingsButton.setPosition(new Dimension(400, 100));

        //startButton.setBackground(getBackground().black);
        //startButton.setUI(ButtonUI);
        //startButton.setBounds(0,0,500,500);
        
        this.add(test);
        this.add(startButton);
        this.add(settingsButton);
        this.add(exitButton);
        setLayout(null);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == settingsButton){
            Main.window.ChangeLayout("Settings");
        }
        else if(e.getSource() == exitButton){
            Main.ExitOfGame();
        }
    }
}

class Layout_Settings extends JPanel implements ActionListener{
    private JTextArea txt;
    private Button backButton;

    public Layout_Settings(){
        txt = new JTextArea("Settings");
        backButton = new Button("back");

        backButton.addActionListener(this);

        this.add(txt, BorderLayout.CENTER);
        this.add(backButton);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton){
            Main.window.ChangeLayout("MainMenu");
        }     
    }
}
