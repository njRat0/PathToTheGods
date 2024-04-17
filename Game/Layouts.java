package PathToTheGods.Game;
import javax.swing.*;
//import javax.swing.plaf.ButtonUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Layout_MainMenu extends JPanel implements ActionListener{
    //private Image imageOfStartButton = Toolkit.getDefaultToolkit().getImage("PathToTheGods\\Images\\Icons\\GameLogo.png");
    private Button startButton;
    private Button settingsButton;
    private Button exitButton;
    private Dimension center = new Dimension(Main.window.getWidth()/2, Main.window.getHeight()/2);

    public Layout_MainMenu(){
        setLayout(null);
        setBackground(new Color(45,45,45));

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
        startButton.setBorderColor(new Color(235,235,235));

        //Setting SettingButton
        settingsButton.setColor(new Color(0,0,0));
        settingsButton.setColorOver(new Color(78, 78, 78));
        settingsButton.setColorClick(new Color(140, 140, 140));
        settingsButton.setForeground(new Color(255,255,255));
        settingsButton.setSize(new Dimension(200,100));
        settingsButton.setPosition(center);
        settingsButton.setBorderColor(new Color(235,235,235));
        
        //Setting ExitButton
        exitButton.setColor(new Color(0,0,0));
        exitButton.setColorOver(new Color(78, 78, 78));
        exitButton.setColorClick(new Color(140, 140, 140));
        exitButton.setForeground(new Color(255,255,255));
        exitButton.setSize(new Dimension(200,100));
        exitButton.setPosition(new Dimension(center.width, center.height + 100));
        exitButton.setBorderColor(new Color(235,235,235));


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
    private Dimension center = new Dimension(Main.window.getWidth()/2, Main.window.getHeight()/2);
    private Dimension sizeOfWindow = new Dimension(Main.window.getWidth(), Main.window.getHeight());

    public Layout_Settings(){
        setLayout(null);
        setBackground(new Color(45,45,45));
        
        txt = new JTextArea("Settings");
        backButton = new Button("back");

        //Setting BackButton
        backButton.setColor(new Color(0,0,0));
        backButton.setColorOver(new Color(78, 78, 78));
        backButton.setColorClick(new Color(140, 140, 140));
        backButton.setForeground(new Color(255,255,255));
        backButton.setSize(new Dimension(200,100));
        backButton.setPosition(new Dimension(center.width, sizeOfWindow.height - 100));
        backButton.setBorderColor(new Color(235,235,235));

        //Setting textArea
        txt.setBounds(center.width - 100, sizeOfWindow.height, center.width + 100, sizeOfWindow.height + 100);;
        txt.setSelectedTextColor(new Color(255,255,255));
        txt.setPreferredSize(new Dimension(200, 100));
        txt.setVisible(true);

        backButton.addActionListener(this);

        this.add(txt, BorderLayout.NORTH);
        this.add(backButton);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton){
            Main.window.ChangeLayout("MainMenu");
        }     
    }
}
