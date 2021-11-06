/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemon;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


/**
 *
 * @author asus
 */
public class Pikachu extends pokemon{
    
    final private int pokemonHasarpuani=40;
   
    

    public Pikachu()
    {
        super();
        try {
            set_resim(ImageIO.read(new File("Pikachu.png")));
        } catch (IOException ex) {
            Logger.getLogger(Pikachu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  
    }
    
    public Pikachu(String ad,String tip,int id)
    {
        super(ad,tip,id);
        
         try {
            set_resim(ImageIO.read(new File("Pikachu.png")));
        } catch (IOException ex) {
            Logger.getLogger(Pikachu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    int HasarGoster() {
      return pokemonHasarpuani;
    }
    
}
