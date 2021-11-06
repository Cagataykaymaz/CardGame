/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemon;

public abstract class Oyuncu {
    
    private int oyuncuId;
    private int oyuncuSkor;
    private String oyuncuAd;
    
    public Oyuncu()
    {
        oyuncuId=-1;
        oyuncuSkor=0;
        oyuncuAd=null;
        
    }
    
    public Oyuncu(String oyuncuAd,int oyuncuId)
    {   
        oyuncuSkor=0;
        this.oyuncuAd=oyuncuAd;
        this.oyuncuId=oyuncuId;
    }
    
    int get_oyuncuId()
    {
        return oyuncuId;
    }
    
    void set_oyuncuId(int oyuncuId)
    {
        this.oyuncuId=oyuncuId;
    }
    
    int get_oyuncuSkor()
    {
        return oyuncuSkor;
    }
    
    void set_oyuncuSkor(int oyuncuSkor)
    {
        this.oyuncuSkor=oyuncuSkor;
    }
    
    String get_oyuncuAd()
    {
        return oyuncuAd;
    }
    
    void set_oyuncuAd(String oyuncuAd)
    {
        this.oyuncuAd=oyuncuAd;
    }
    
    abstract void kartSecim(int deger);
}
