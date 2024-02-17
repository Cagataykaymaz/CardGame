/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokemon.game.models;

import com.pokemon.game.controller.Player;
import com.pokemon.game.Pokemon;

public class UserPlayer extends Player {
    
    private int secim;
    public Pokemon[] kartListesi;
    
    
    
    public UserPlayer()
    {
        super();
        kartListesi=new Pokemon[3];
    }
    
    public UserPlayer(String oyuncuAd, int oyuncuId)
    {
        super(oyuncuAd,oyuncuId);
        kartListesi=new Pokemon[3];
        
        
    }
    
    public int get_secim()
    {
        return secim;
    }
    
    void set_secim(int secim)
    {
        this.secim=secim;
    }

    @Override
    public void kartSecim(int secim) {
        
        this.secim=secim;
        
    }
    
}