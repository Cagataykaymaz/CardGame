/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemon;



/**
 *
 * @author asus
 */
public class ─░nsanOyuncu extends Oyuncu {
    
    private int secim;
    pokemon kartListesi[];
    
    
    
    public ─░nsanOyuncu()
    {
        super();
        kartListesi=new pokemon[3];
    }
    
    public ─░nsanOyuncu(String oyuncuAd,int oyuncuId)
    {
        super(oyuncuAd,oyuncuId);
        kartListesi=new pokemon[3];
        
        
    }
    
    int get_secim()
    {
        return secim;
    }
    
    void set_secim(int secim)
    {
        this.secim=secim;
    }
    
    
    
  

    @Override
    void kartSecim(int secim) {
        
        this.secim=secim;
        
    }

    

   

    

    
    
    
}
