
package com.pokemon.game.views;

import com.pokemon.game.controller.Pokemon;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LoginMenu extends JPanel implements ActionListener{
    
    public JFrame screen;
    public Pokemon[] pack;
    public boolean hasUser;
    public String userName;
    public JButton oyuncuVsPcButton, pcVsPcButton;
    JLabel loginMenu;
    public LoginMenu(JFrame screen, Pokemon[] pack){
        super();
        this.screen = screen;
        this.pack = pack;
    }

    public void settingsBounds(){

        oyuncuVsPcButton.setBounds(141, 192, 305, 260);
        pcVsPcButton.setBounds(742,192,370,200);
        loginMenu.setBounds(0, 0, 1366, 768);

    }

    public void setBackGround(){
        userName ="Pc";
        oyuncuVsPcButton =new JButton("oyuncu vs pc",new ImageIcon("players/playerImage.png"));
        pcVsPcButton =new JButton("pc vs pc",new ImageIcon("players/pcImage.jpg"));
        loginMenu =new JLabel(new ImageIcon(new ImageIcon("menuViews/loginMenu.jpg").getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH)));
        setLayout(null);
    }

    public void addToScreen(){
        oyuncuVsPcButton.addActionListener(this);
        pcVsPcButton.addActionListener(this);

        add(oyuncuVsPcButton);
        add(pcVsPcButton);
        add(loginMenu);

        screen.add(this);
    }

    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getActionCommand().equalsIgnoreCase("oyuncu vs pc"))
        {
            hasUser =true;
            userName =JOptionPane.showInputDialog("Adinizi giriniz: ");
            setVisible(false);
        }
        
        else if(e.getActionCommand().equalsIgnoreCase("pc vs pc"))
        {
            hasUser =false;
            setVisible(false);
           
        }
        
        PlayMenu playMenu=new PlayMenu(pack, hasUser, screen, userName);
    }

    
    
}
