/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokemon.game.controller;
import com.pokemon.game.models.pokemons.Bulbasaur;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class Pokemon {
    
    private BufferedImage image;
    private String pokemonName;
    private String pokemonType;
    private boolean usage;
    private int pokemonId;

    public Pokemon() {
    }
    
    public Pokemon(String pokemonName, String pokemonType, int pokemonId)
    {
        this.pokemonName=pokemonName;
        this.pokemonType =pokemonType;
        this.pokemonId=pokemonId;
        usage=false;
    }
    
    public String getPokemonName() {
       return pokemonName;
   }
    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    public boolean getUsage(){
        return usage;
    }
    
    public void setUsage(boolean usage)
    {
        this.usage=usage;
    }
    
    public int getPokemonId()
    {
        return pokemonId;
    }
    
    public void setPokemonId(int pokemonId)
    {
        this.pokemonId=pokemonId;
    }
    
    public BufferedImage getImage(){
        return image;
    }

    public void setImage(BufferedImage image){
        this.image =image;

    }
    public abstract int showDamage();

    public BufferedImage putImage(String name){
        try {
           this.image= ImageIO.read(new File("pokemons/"+name+".png"));
        } catch (IOException ex) {
            Logger.getLogger(Bulbasaur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return image;
    }

}
