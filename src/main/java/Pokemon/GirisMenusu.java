/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemon;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author asus
 */
public class GirisMenusu extends JPanel implements ActionListener{
    
    JFrame pencere;
    pokemon deste[];
    boolean oyuncuVarmi;
    
    
    String oyuncuAdi;
    JButton oyuncuVsPc;
    JButton pcVsPc;
    JLabel girisMenusu;
    ImageIcon oyuncuvspc=new ImageIcon("oyuncuResim.png");
    ImageIcon pcvspc=new ImageIcon("bilgisayarResim.jpg");
    ImageIcon arkaplan=new ImageIcon(new ImageIcon("girismenuResim.jpg").getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH));
    
    public GirisMenusu(JFrame pencere,pokemon deste[])
    {
        super();
        this.pencere=pencere;
        this.deste=deste;
        
        
        oyuncuAdi="Pc";
        oyuncuVsPc=new JButton("oyuncu vs pc",oyuncuvspc);
        pcVsPc=new JButton("pc vs pc",pcvspc);
        girisMenusu=new JLabel(arkaplan);
        setLayout(null);
        
        
        
        oyuncuVsPc.setBounds(141, 192, 305, 260);
        pcVsPc.setBounds(742,192,370,200);
        girisMenusu.setBounds(0, 0, 1366, 768);
        
        
        
        
       oyuncuVsPc.addActionListener(this);
       pcVsPc.addActionListener(this);
        
        add(oyuncuVsPc);
        add(pcVsPc);
        add(girisMenusu);
        
        pencere.add(this);
        
        
        
        
        
        
    }
    

    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getActionCommand()=="oyuncu vs pc")
        {
            oyuncuVarmi=true;
            oyuncuAdi=JOptionPane.showInputDialog("Adinizi giriniz ?");
            setVisible(false);
            
            
            
            
        }
        
        else if(e.getActionCommand()=="pc vs pc")
        {
            oyuncuVarmi=false;
            setVisible(false);
           
        }
        
        OyunMenusu yertutma=new OyunMenusu(deste,oyuncuVarmi,pencere,oyuncuAdi);
       
       
    }

    
    
}
