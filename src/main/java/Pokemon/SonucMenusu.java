/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author asus
 */
public class SonucMenusu extends JPanel {
    
    JLabel kazanan;
    JLabel puan;
    
    
    public SonucMenusu(PcOyuncu oyuncu1,İnsanOyuncu Oyuncu2,PcOyuncu oyuncu2,boolean oyuncuVarmi,JFrame pencere)
    {
        if(oyuncuVarmi==true)
        {
            if(Oyuncu2.get_oyuncuSkor()>oyuncu1.get_oyuncuSkor())
            {
                kazanan =new JLabel("Kazanan :"+Oyuncu2.get_oyuncuAd());
                puan=new JLabel("Puan :"+Oyuncu2.get_oyuncuSkor());
            }
            
            else if(oyuncu1.get_oyuncuSkor()>Oyuncu2.get_oyuncuSkor())
            {
                kazanan =new JLabel("Kazanan :"+oyuncu1.get_oyuncuAd()+"1");
                puan=new JLabel("Puan :"+oyuncu1.get_oyuncuSkor());
            }
        }
        
        else if(oyuncuVarmi==false)
        {
            
            if(oyuncu2.get_oyuncuSkor()>oyuncu1.get_oyuncuSkor())
            {
                kazanan =new JLabel("Kazanan :"+oyuncu2.get_oyuncuAd()+"2");
                puan=new JLabel("Puan :"+oyuncu2.get_oyuncuSkor());
            }
            
            else if(oyuncu1.get_oyuncuSkor()>oyuncu2.get_oyuncuSkor())
            {
                kazanan =new JLabel("Kazanan :"+oyuncu1.get_oyuncuAd()+"1");
                puan=new JLabel("Puan :"+oyuncu1.get_oyuncuSkor());
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
