/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemon;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class SavasMenusu extends JFrame implements ActionListener{
    
    
    
   
    int kazanan;
    int y1;
    int y2;
 
    
ImageIcon arkaplan=new ImageIcon(new ImageIcon("savasmenusu.jpg").getImage().getScaledInstance(1024, 768, Image.SCALE_SMOOTH));
JLabel savasMenusu=new JLabel(arkaplan);
JButton taraf1,taraf2;
JButton savas;
JButton devam;


public SavasMenusu(JButton kart1,JButton kart2,int sonuc)
{   
    
    
    super();
    
    taraf1=kart1;
    taraf2=kart2;
    
    y1=350;
    y2=350;
    
    devam=new JButton("DEVAM");
    devam.addActionListener(this);
    
    savas=new JButton("SAVAS");
    savas.addActionListener(this);
    
    devam.setBounds(400, 200, 100, 100);
    
    devam.setVisible(false);
    
    
    savas.setBounds(400, 200, 100, 100);
    
    taraf1.setBounds(200, 350, 100, 150);
    
    
    taraf2.setBounds(600, 350, 100, 150);
    
    savasMenusu.setBounds(0, 0, 1024, 768);
    
    kazanan=sonuc;
    
     
     
     
    
    
    
    
    add(taraf1);
    add(taraf2);
    add(savas);
    add(devam);
    add(savasMenusu);
    
    
    setSize(1024,768);
    setVisible(true);
    
   
}

    
    void ciz()
    {
        taraf1.setVisible(false);
        taraf2.setVisible(false);
        
        if(kazanan==1)
        {
            y1--;
            y2++;
        }
        
        else if(kazanan==2)
        {
            y2--;
            y1++;
        }
        
        taraf1.setLocation(200, y1);
        taraf2.setLocation(600, y2);
        
        taraf1.setVisible(true);
        taraf2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
           
        if(e.getActionCommand()=="SAVAS")
        { 
           
            int sayac=0;
            
            while(sayac<150)
            {   
                
                ciz();
                sayac++;
                
            }
            
          savas.setVisible(false);
          devam.setVisible(true);
        }
        
        if(e.getActionCommand()=="DEVAM")
        {
            setVisible(false);
            dispose();
        }
        
        
    }


}
