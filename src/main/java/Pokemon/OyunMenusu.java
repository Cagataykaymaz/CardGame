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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class OyunMenusu extends JPanel implements ActionListener{
    
    JFrame pencere;
    boolean oyuncuVarmi;
    pokemon deste[];
    String oyuncuAdi;
    PcOyuncu oyuncu1=new PcOyuncu();
    İnsanOyuncu Oyuncu2=new İnsanOyuncu();
    PcOyuncu oyuncu2=new PcOyuncu();
    boolean kullanim1[]=new boolean[3];
    boolean kullanim2[]=new boolean[3];
    int kartSayisi=10;
    int oyuncu1Zafer=0;
    int kazanan;
    int oyuncu2Zafer=0;
    int dagitim1;
    int dagitim2;
    
    
    
    int kartkontrol=0;
    
    
    
   
    
    JLabel oyunMenusu,oyuncu1ad,oyuncu2ad,birinciAd,ikinciAd;
    JTextField birinciSkor,ikinciSkor;
    JButton oyuncu1kart1,oyuncu1kart2,oyuncu1kart3,oyuncu2kart1,oyuncu2kart2,oyuncu2kart3,kartlar;
    JButton gizli11,gizli12,gizli13;
    JButton devam=new JButton("DEVAM");
    ImageIcon resim11,resim12,resim13,resim21,resim22,resim23;
    ImageIcon arkaplan=new ImageIcon(new ImageIcon("oyunmenusu.jpg").getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH));
    ImageIcon resimKartlar=new ImageIcon("DESTE.png");
    ImageIcon gizliResim=new ImageIcon("GİZLİ.png");
    
    
    public OyunMenusu(pokemon deste[],boolean oyuncuVarmi,JFrame pencere,String oyuncuAdi)
    {   
        super();
        
        
        
        this.deste=deste;
        this.oyuncuVarmi=oyuncuVarmi;
        this.pencere=pencere;
        this.oyuncuAdi=oyuncuAdi;
        
        
        
        kullanim1[0]=true;
        kullanim1[1]=true;
        kullanim1[2]=true;
        
        kullanim2[0]=true;
        kullanim2[1]=true;
        kullanim2[2]=true;
        
        oyuncu1.set_oyuncuAd("Pc");
        oyuncu1.set_oyuncuId(0);
        
       birinciAd=new JLabel(oyuncu1.get_oyuncuAd());
       birinciAd.setBounds(300, 50, 20, 20);
       
       
        
       oyunMenusu=new JLabel(arkaplan);
       oyunMenusu.setBounds(0,0,1366,768);
       
       kartlar=new JButton(resimKartlar);
       kartlar.setBounds(678, 50, 100, 150);
       
       gizli11=new JButton(gizliResim);
       gizli11.setBounds(200, 100, 100, 150);
       
       gizli12=new JButton(gizliResim);
       gizli12.setBounds(200, 300, 100, 150);
       
       gizli13=new JButton(gizliResim);
       gizli13.setBounds(200, 500, 100, 150);
        
        
        
        
        birinciSkor=new JTextField(Integer.toString(oyuncu1.get_oyuncuSkor()));
        birinciSkor.setBounds(150, 25, 20, 20);
        
        
        
        int desteYeri;
        int kartsayisi=0;
        
        while(kartsayisi<3)
        {
            desteYeri=(int) ((Math.random() * ((9 - 0) + 1)));
            
            if(deste[desteYeri].get_kullanim()==false)
            {
                oyuncu1.kartListesi[kartsayisi]=deste[desteYeri];
                deste[desteYeri].set_kullanim(true);
                
                kartsayisi++;
            }
            
            
        }
        
            resim11=new ImageIcon(oyuncu1.kartListesi[0].get_resim());
            resim12=new ImageIcon(oyuncu1.kartListesi[1].get_resim());
            resim13=new ImageIcon(oyuncu1.kartListesi[2].get_resim());
            
            oyuncu1kart1=new JButton(resim11);
            oyuncu1kart2=new JButton(resim12);
            oyuncu1kart3=new JButton(resim13);
            
            oyuncu1kart1.setBounds(200,100,100,150);
            oyuncu1kart2.setBounds(200,300,100,150);
            oyuncu1kart3.setBounds(200,500,100,150);
        
        
        
        if(oyuncuVarmi==true)
        {   
            kartsayisi=0;
            Oyuncu2.set_oyuncuAd(oyuncuAdi);
            Oyuncu2.set_oyuncuId(1);
            
            while(kartsayisi<3)
            {
                desteYeri=(int) ((Math.random() * ((9 - 0) + 1)));
                
                if(deste[desteYeri].get_kullanim()==false)
                {
                    Oyuncu2.kartListesi[kartsayisi]=deste[desteYeri];
                    deste[desteYeri].set_kullanim(true);
                    kartsayisi++;
                }
            }
            
            resim21=new ImageIcon(Oyuncu2.kartListesi[0].get_resim());
            resim22=new ImageIcon(Oyuncu2.kartListesi[1].get_resim());
            resim23=new ImageIcon(Oyuncu2.kartListesi[2].get_resim());
            
            oyuncu2kart1=new JButton("1",resim21);
            oyuncu2kart2=new JButton("2",resim22);
            oyuncu2kart3=new JButton("3",resim23);
            
            oyuncu2kart1.addActionListener(this);
            oyuncu2kart2.addActionListener(this);
            oyuncu2kart3.addActionListener(this);
            
            oyuncu2kart1.setBounds(1166,100,100,150);
            oyuncu2kart2.setBounds(1166,300,100,150);
            oyuncu2kart3.setBounds(1166,500,100,150);
            
            ikinciAd=new JLabel(Oyuncu2.get_oyuncuAd());
            ikinciSkor=new JTextField(Integer.toString(Oyuncu2.get_oyuncuSkor()));
        }
        
        else if(oyuncuVarmi==false)
        {
            kartsayisi=0;
            oyuncu2.set_oyuncuAd(oyuncuAdi);
            oyuncu2.set_oyuncuId(1);
            
            devam.setBounds(678, 500, 100, 100);
            devam.addActionListener(this);
            add(devam);
            
            while(kartsayisi<3)
            {
                desteYeri=(int) ((Math.random() * ((9 - 0) + 1)));
                
                if(deste[desteYeri].get_kullanim()==false)
                {
                    oyuncu2.kartListesi[kartsayisi]=deste[desteYeri];
                    deste[desteYeri].set_kullanim(true);
                    kartsayisi++;
                }
            }
            
            resim21=new ImageIcon(oyuncu2.kartListesi[0].get_resim());
            resim22=new ImageIcon(oyuncu2.kartListesi[1].get_resim());
            resim23=new ImageIcon(oyuncu2.kartListesi[2].get_resim());
            
            oyuncu2kart1=new JButton(resim21);
            oyuncu2kart2=new JButton(resim22);
            oyuncu2kart3=new JButton(resim23);
            
            oyuncu2kart1.setBounds(1166,100,100,150);
            oyuncu2kart2.setBounds(1166,300,100,150);
            oyuncu2kart3.setBounds(1166,500,100,150);
            
            ikinciAd=new JLabel(oyuncu2.get_oyuncuAd());
            ikinciSkor=new JTextField(Integer.toString(oyuncu2.get_oyuncuSkor()));
        }
        
        ikinciAd.setBounds(1066, 50, 100, 20);
        ikinciSkor.setBounds(1216,25,20,20);
        
        
        
        
        
        
        
        
        setLayout(null);
        
        oyunMenusu=new JLabel(arkaplan);
        oyunMenusu.setBounds(0,0,1366,768);
        
        
        add(kartlar);
        add(birinciAd);
        add(ikinciAd);
        add(ikinciSkor);
        add(birinciSkor);
        //add(gizli11);
        //add(gizli12);
        //add(gizli13);
        add(oyuncu1kart1);
        add(oyuncu1kart2);
        add(oyuncu1kart3);
        add(oyuncu2kart1);
        add(oyuncu2kart2);
        add(oyuncu2kart3);
        add(oyunMenusu);
        
       
       
        
        
        
        pencere.add(this);
        
  
        
       
    }
    
    int Karsilastir()
    {
        int sonuc=0;
        JButton taraf1=new JButton();
        JButton taraf2=new JButton();
        
        
        if(oyuncu1.get_secim()==0)
        {
            taraf1=oyuncu1kart1;
        }
        
        else if(oyuncu1.get_secim()==1)
        {
            taraf1=oyuncu1kart2;
        }
        
        else if(oyuncu1.get_secim()==2)
        {
            taraf1=oyuncu1kart3;
        }
        
        if(oyuncuVarmi==true)
        {
            if(Oyuncu2.get_secim()==0)
            {
                taraf2=oyuncu2kart1;
            }
            
            else if(Oyuncu2.get_secim()==1)
            {
                taraf2=oyuncu2kart2;
            }
            
            else if(Oyuncu2.get_secim()==2)
            {
                taraf2=oyuncu2kart3;
            }
            
            
            if(oyuncu1.kartListesi[oyuncu1.get_secim()].HasarGoster()>Oyuncu2.kartListesi[Oyuncu2.get_secim()].HasarGoster())
            {
                sonuc=1;
            }
            
            else if(oyuncu1.kartListesi[oyuncu1.get_secim()].HasarGoster()<Oyuncu2.kartListesi[Oyuncu2.get_secim()].HasarGoster())
            {
                sonuc=2;
            }
            
        
    }
        
        else if(oyuncuVarmi==false)
        {
            if(oyuncu2.get_secim()==0)
            {
                taraf2=oyuncu2kart1;
            }
            
            else if(oyuncu2.get_secim()==1)
            {
                taraf2=oyuncu2kart2;
            }
            
            else if(oyuncu2.get_secim()==2)
            {
                taraf2=oyuncu2kart3;
            }
            
            if(oyuncu1.kartListesi[oyuncu1.get_secim()].HasarGoster()>oyuncu2.kartListesi[oyuncu2.get_secim()].HasarGoster())
            {
                sonuc=1;
            }
            
            else if(oyuncu1.kartListesi[oyuncu1.get_secim()].HasarGoster()<oyuncu2.kartListesi[oyuncu2.get_secim()].HasarGoster())
            {
                sonuc=2;
            }
        }
        
        SavasMenusu savasPenceresi=new SavasMenusu(taraf1,taraf2,sonuc);
        
        
         
        
        
        return sonuc;
    }
    
    
    void Dagit()
    {
        dagitim1=(int) ((Math.random() * ((9 - 0) + 1)));
        
        if(deste[dagitim1].get_kullanim()==true)
        {
            while(deste[dagitim1].get_kullanim()==true)
            {
                 dagitim1=(int) ((Math.random() * ((9 - 0) + 1)));
            }
            
            
        }
        
        deste[dagitim1].set_kullanim(true);
        
        oyuncu1.kartListesi[oyuncu1.get_secim()]=deste[dagitim1];
        
        
        
        dagitim2=(int) ((Math.random() * ((9 - 0) + 1)));
        
        if(deste[dagitim2].get_kullanim()==true)
        {
            while(deste[dagitim2].get_kullanim()==true)
            {
                dagitim2= dagitim2=(int) ((Math.random() * ((9 - 0) + 1)));
            }
            
            deste[dagitim2].set_kullanim(true);
        }
        deste[dagitim2].set_kullanim(true);
        
        if(oyuncuVarmi==true)
        {
            Oyuncu2.kartListesi[Oyuncu2.get_secim()]=deste[dagitim2];
        }
        
        else if(oyuncuVarmi==false)
        {
            oyuncu2.kartListesi[oyuncu2.get_secim()]=deste[dagitim2];
        }
        
        
    }
    
    void yerlestir()
    {   
        remove(oyunMenusu);
        
       if(kartSayisi>6)
       {
           
           if(oyuncu1.get_secim()==0)
           {    
               remove(oyuncu1kart1);
               resim11=new ImageIcon(oyuncu1.kartListesi[0].get_resim());
               oyuncu1kart1=new JButton(resim11);
               oyuncu1kart1.setBounds(200, 100, 100, 150);
               add(oyuncu1kart1);
           }
           
           else if(oyuncu1.get_secim()==1)
           {
               remove(oyuncu1kart2);
               resim12=new ImageIcon(oyuncu1.kartListesi[1].get_resim());
               oyuncu1kart2=new JButton(resim12);
               oyuncu1kart2.setBounds(200, 300, 100, 150);
               add(oyuncu1kart2);
           }
           
           else if(oyuncu1.get_secim()==2)
           {
               remove(oyuncu1kart3);
               resim13=new ImageIcon(oyuncu1.kartListesi[2].get_resim());
               oyuncu1kart3=new JButton(resim13);
               oyuncu1kart3.setBounds(200,500, 100, 150);
               add(oyuncu1kart3);
           }
           
           if(oyuncuVarmi==true)
           {
               if(Oyuncu2.get_secim()==0)
               {
                   remove(oyuncu2kart1);
                   resim21=new ImageIcon(Oyuncu2.kartListesi[0].get_resim());
                   oyuncu2kart1=new JButton("1",resim21);
                   oyuncu2kart1.addActionListener(this);
                   oyuncu2kart1.setBounds(1166, 100, 100, 150);
                   add(oyuncu2kart1);
               }
               
               else if(Oyuncu2.get_secim()==1)
               {
                   remove(oyuncu2kart2);
                   resim22=new ImageIcon(Oyuncu2.kartListesi[1].get_resim());
                   oyuncu2kart2=new JButton("2",resim22);
                   oyuncu2kart2.addActionListener(this);
                   oyuncu2kart2.setBounds(1166, 300, 100, 150);
                   add(oyuncu2kart2);
               }
               
               else if(Oyuncu2.get_secim()==2)
               {
                   remove(oyuncu2kart3);
                   resim23=new ImageIcon(Oyuncu2.kartListesi[2].get_resim());
                   oyuncu2kart3=new JButton("3",resim23);
                   oyuncu2kart3.addActionListener(this);
                   oyuncu2kart3.setBounds(1166, 500, 100, 150);
                   add(oyuncu2kart3);
               }
           }
           
           else if(oyuncuVarmi==false)
           {
                if(oyuncu2.get_secim()==0)
               {
                   remove(oyuncu2kart1);
                   resim21=new ImageIcon(oyuncu2.kartListesi[0].get_resim());
                   oyuncu2kart1=new JButton(resim21);
                   oyuncu2kart1.setBounds(1166, 100, 100, 150);
                   add(oyuncu2kart1);
               }
               
               else if(oyuncu2.get_secim()==1)
               {
                   remove(oyuncu2kart2);
                   resim22=new ImageIcon(oyuncu2.kartListesi[1].get_resim());
                   oyuncu2kart2=new JButton(resim22);
                   oyuncu2kart2.setBounds(1166, 300, 100, 150);
                   add(oyuncu2kart2);
               }
               
               else if(oyuncu2.get_secim()==2)
               {
                   remove(oyuncu2kart3);
                   resim23=new ImageIcon(oyuncu2.kartListesi[2].get_resim());
                   oyuncu2kart3=new JButton(resim23);
                   oyuncu2kart3.setBounds(1166, 500, 100, 150);
                   add(oyuncu2kart3);
               }
           }
           
           
       }
       
       else if(kartSayisi<=6)
       {
           if(kartkontrol!=1)
           {
               remove(kartlar);
               kartkontrol=0;
           }
           
           if(oyuncu1.get_secim()==0)
           {
               remove(oyuncu1kart1);
           }
           
           else if(oyuncu1.get_secim()==1)
           {
               remove(oyuncu1kart2);
           }
           
           else if(oyuncu1.get_secim()==2)
           {
               remove(oyuncu1kart3);
           }
           
           if(oyuncuVarmi==true)
           {
               if(Oyuncu2.get_secim()==0)
               {
                   remove(oyuncu2kart1);
               }
               
               else if(Oyuncu2.get_secim()==1)
               {
                   remove(oyuncu2kart2);
               }
               
               else  if(Oyuncu2.get_secim()==2)
               {
                   remove(oyuncu2kart3);
               }
           }
           
           else if(oyuncuVarmi==false)
           {
               if(oyuncu2.get_secim()==0)
               {
                   remove(oyuncu2kart1);
               }
               
               else if(oyuncu2.get_secim()==1)
               {
                   remove(oyuncu2kart2);
               }
               
               else if(oyuncu2.get_secim()==2)
               {
                   remove(oyuncu2kart3);
               }
           }
       }
       
       remove(birinciSkor);
       
       birinciSkor=new JTextField(Integer.toString(oyuncu1.get_oyuncuSkor()));
       birinciSkor.setBounds(150, 25, 20, 20);
       add(birinciSkor);
       
       
       remove(ikinciSkor);
       
       if(oyuncuVarmi==true)
       {
        ikinciSkor=new JTextField(Integer.toString(Oyuncu2.get_oyuncuSkor()));
        ikinciSkor.setBounds(1216,25,20,20);
        add(ikinciSkor);
       }
       
       else if(oyuncuVarmi==false)
       {
        ikinciSkor=new JTextField(Integer.toString(oyuncu2.get_oyuncuSkor()));
        ikinciSkor.setBounds(1216,25,20,20);
        add(ikinciSkor);
       }
       
     add(oyunMenusu);
       
       
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {   
       
       
        if(kartSayisi<=6)
        {
            oyuncu1.kartSecim(1);
            
            while(kullanim1[oyuncu1.get_secim()]==false)
            {
                oyuncu1.kartSecim(1);
            }
            
            kullanim1[oyuncu1.get_secim()]=false;
        }
        
        else if(kartSayisi>6)
        {
            oyuncu1.kartSecim(1);
        }
        
        
        
        if(oyuncuVarmi==true)
        {
            if(e.getActionCommand()=="1")
            {
                Oyuncu2.kartSecim(0);
            }
            
            else if(e.getActionCommand()=="2")
            {
                Oyuncu2.kartSecim(1);
            }
            
            else if(e.getActionCommand()=="3")
            {
                Oyuncu2.kartSecim(2);
            }
            
        }
        
        else if(oyuncuVarmi==false)
        {
            
            
            if(kartSayisi<=6)
        {
            oyuncu2.kartSecim(1);
            
            while(kullanim2[oyuncu2.get_secim()]==false)
            {
                oyuncu2.kartSecim(1);
            }
            
            kullanim2[oyuncu2.get_secim()]=false;
        }
        
        else if(kartSayisi>6)
        {
            oyuncu2.kartSecim(1);
        }
            
            
        }
        
        kazanan=Karsilastir();
       
        if(kazanan==1)
        {
            oyuncu1Zafer++;
            
            oyuncu1.set_oyuncuSkor(oyuncu1Zafer*5);
            
        }
        
        else if(kazanan==2)
        {
            oyuncu2Zafer++;
            
            if(oyuncuVarmi==true)
            {
                Oyuncu2.set_oyuncuSkor(oyuncu2Zafer*5);
            }
            
            else if(oyuncuVarmi==false)
            {
                oyuncu2.set_oyuncuSkor(oyuncu2Zafer*5);
            }
        }
        
        
        System.out.println("1.oyuncunun karti:"+oyuncu1.kartListesi[oyuncu1.get_secim()]);
        
        if(oyuncuVarmi==true)
        {
            System.out.println("2.oyuncunun karti:"+Oyuncu2.kartListesi[Oyuncu2.get_secim()]);
        }
        
        else if(oyuncuVarmi==false)
        {
            System.out.println("2.oyuncunun karti:"+oyuncu2.kartListesi[oyuncu2.get_secim()]);
        }
        
        System.out.println("Kazanan:"+kazanan);
        
        System.out.println("\n\n");
        
        
        
        
        
        if(kartSayisi>6)
        Dagit();
        
        yerlestir();
        
        kartSayisi-=2;
        
       
        
        
        if(kartSayisi==0)
        {   
            setVisible(false);
            SonucMenusu sonucMenusu=new SonucMenusu(oyuncu1,Oyuncu2,oyuncu2,oyuncuVarmi,pencere);
            
        }
        
       
      
    }
    

    
    
    
}
