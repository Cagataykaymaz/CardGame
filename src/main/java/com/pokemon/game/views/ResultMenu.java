/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokemon.game.views;

import com.pokemon.game.models.players.PcPlayer;
import com.pokemon.game.models.players.UserPlayer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author asus
 */
public class ResultMenu extends JPanel {
    
    JLabel kazanan;
    JLabel puan;
    
    
    public ResultMenu(PcPlayer oyuncu1, UserPlayer Oyuncu2, PcPlayer oyuncu2, boolean oyuncuVarmi, JFrame pencere)
    {
        if(oyuncuVarmi==true)
        {
            if(Oyuncu2.getPlayerScore()>oyuncu1.getPlayerScore())
            {
                kazanan =new JLabel("Kazanan :"+Oyuncu2.getPlayerName());
                puan=new JLabel("Puan :"+Oyuncu2.getPlayerScore());
            }
            
            else if(oyuncu1.getPlayerScore()>Oyuncu2.getPlayerScore())
            {
                kazanan =new JLabel("Kazanan :"+oyuncu1.getPlayerName()+"1");
                puan=new JLabel("Puan :"+oyuncu1.getPlayerScore());
            }
        }
        
        else
        {
            
            if(oyuncu2.getPlayerScore()>oyuncu1.getPlayerScore())
            {
                kazanan =new JLabel("Kazanan :"+oyuncu2.getPlayerName()+"2");
                puan=new JLabel("Puan :"+oyuncu2.getPlayerScore());
            }
            
            else if(oyuncu1.getPlayerScore()>oyuncu2.getPlayerScore())
            {
                kazanan =new JLabel("Kazanan :"+oyuncu1.getPlayerName()+"1");
                puan=new JLabel("Puan :"+oyuncu1.getPlayerScore());
            }
        }
        
        kazanan.setBounds(240, 100, 100, 100);
        puan.setBounds(240, 200, 100, 100);
        
        
        add(kazanan);
        add(puan);
        
        setVisible(true);
        pencere.setSize(480,240);
        
        pencere.add(this);
    }
    
}
