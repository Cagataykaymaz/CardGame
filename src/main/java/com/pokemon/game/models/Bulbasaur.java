/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokemon.game.models;

import com.pokemon.game.Pokemon;

import java.awt.image.BufferedImage;

public class Bulbasaur extends Pokemon {
    final private int pokemonHasarpuani=50;
    

    public Bulbasaur(){
        super();
    }
    
    public Bulbasaur(String name,String type,int id){
        super(name,type,id);
    }
    
    @Override
    public int hasarGoster() {
        return pokemonHasarpuani;
    }

    @Override
    public BufferedImage putImage(String name) {
        return super.putImage(name);
    }
}
