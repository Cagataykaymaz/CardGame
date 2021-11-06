/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemon;


import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;



public abstract class pokemon {
    
    private BufferedImage resim;
    private String pokemonAd;
    private String pokemonTip;
    private boolean kullanim;
    private int pokemonId;
    
    public pokemon()
    {
        pokemonAd=null;
        pokemonTip=null;
        pokemonId=-1;
        kullanim=false;
    }
    
    public pokemon(String pokemonAd,String pokemonTip,int pokemonId)
    {
        this.pokemonAd=pokemonAd;
        this.pokemonTip=pokemonTip;
        this.pokemonId=pokemonId;
        kullanim=false;
    }
    
    String get_pokemonAd()
    {
        return pokemonAd;
    }
    
    void set_pokemonAd(String ad)
    {
        pokemonAd=ad;
    }
    
    String get_pokemonTip()
    {
        return pokemonTip;
    }
    
    void set_pokemonTip(String tip)
    {
        pokemonTip=tip;
    }
    
    boolean get_kullanim()
    {
        return kullanim;
    }
    
    void set_kullanim(boolean deger)
    {
        kullanim=deger;
    }
    
    int get_pokemonId()
    {
        return pokemonId;
    }
    
    void set_pokemonId(int pokemonId)
    {
        this.pokemonId=pokemonId;
    }
    
    BufferedImage get_resim()
    {
        return resim;
    }
    
    void set_resim(BufferedImage resim)
    {
        this.resim=resim;
    }
    
    
    abstract int HasarGoster();
    
    
    
}
