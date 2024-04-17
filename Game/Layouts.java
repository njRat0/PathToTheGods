package PathToTheGods.Game;
import javax.swing.*;
//import javax.swing.plaf.ButtonUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Layout_MainMenu extends JPanel implements ActionListener{
    private Image imageOfStartButton = Toolkit.getDefaultToolkit().getImage("PathToTheGods\\Images\\Icons\\GameLogo.png");
    private Button startButton;
    private Button settingsButton;
    private Button exitButton;
    private Dimension center = new Dimension(Main.window.getWidth()/2, Main.window.getHeight()/2);

    public Layout_MainMenu(){
        setLayout(null);

        startButton = new Button("Start");
        settingsButton = new Button("Settings");
        exitButton = new Button("Exit");

        startButton.addActionListener(this);
        settingsButton.addActionListener(this);
        exitButton.addActionListener(this);

        //Setting StartButton
        startButton.setColor(new Color(0,0,0));
        startButton.setColorOver(new Color(78, 78, 78));
        startButton.setColorClick(new Color(140, 140, 140));
        startButton.setForeground(new Color(255,255,255));
        startButton.setSize(new Dimension(200,100));
        startButton.setPosition(new Dimension(center.width, center.height - 100));

        //Setting SettingButton
        settingsButton.setColor(new Color(0,0,0));
        settingsButton.setColorOver(new Color(78, 78, 78));
        settingsButton.setColorClick(new Color(140, 140, 140));
        settingsButton.setForeground(new Color(255,255,255));
        settingsButton.setSize(new Dimension(200,100));
        settingsButton.setPosition(center);
        
        //Setting ExitButton
        exitButton.setColor(new Color(0,0,0));
        exitButton.setColorOver(new Color(78, 78, 78));
        exitButton.setColorClick(new Color(140, 140, 140));
        exitButton.setForeground(new Color(255,255,255));
        exitButton.setSize(new Dimension(200,100));
        exitButton.setPosition(new Dimension(center.width, center.height + 100));


        this.add(startButton);
        this.add(settingsButton);
        this.add(exitButton);
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
