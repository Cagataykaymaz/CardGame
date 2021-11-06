/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author asus
 */
public class AnaFonksiyon  {
    
        
        
    public static void main(String[] args) {
        
        pokemon deste[]=new pokemon[10];
       
        Bulbasaur bulbasaur=new Bulbasaur("bulbasaur","cim",0);
        deste[0]=bulbasaur;
        
        Butterfree butterfree=new Butterfree("butterfree","hava",1);
        deste[1]=butterfree;
        
        Charmander charmander=new Charmander("charmander","ates",2);
        deste[2]=charmander;
        
        Jigglypuff jigglypuff=new Jigglypuff("jigglypuff","ses",3);
        deste[3]=jigglypuff;
        
        Meowth meowth=new Meowth("meowth","normal",4);
        deste[4]=meowth;
        
        Pikachu pikachu=new Pikachu("pikachu","elektrik",5);
        deste[5]=pikachu;
        
        Psyduck psyduck=new Psyduck("psyduck","su",6);
        deste[6]=psyduck;
        
        Snorlax snorlax=new Snorlax("snorlax","normal",7);
        deste[7]=snorlax;
        
        Squirtle squirtle=new Squirtle("squirtle","su",8);
        deste[8]=squirtle;
        
        Zubat zubat=new Zubat("zubat","hava",9);
        deste[9]=zubat;
        
        JFrame pencere=new JFrame();
        pencere.setVisible(true);
        GirisMenusu girisMenusu=new GirisMenusu(pencere,deste);
        pencere.setSize(1366,768);
        //pencere.add(girisMenusu);
 
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }

    
    
}
