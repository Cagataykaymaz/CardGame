/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokemon.game.models.players;

import com.pokemon.game.controller.Player;
import com.pokemon.game.controller.Pokemon;
public class PcPlayer extends Player {
    
    
    private int selection;
    public Pokemon[] cardList;
    
    public PcPlayer()
    {
        super();
        cardList =new Pokemon[3];
    }
    
    public PcPlayer(String playerName, int playerId)
    {
        super(playerName,playerId);
        cardList =new Pokemon[3];
    }
    
    public int getSelection()
    {
        return selection;
    }
    
    void setSelection(int selection)
    {
        this.selection =selection;
    }
    
    @Override
    public void cardSelection(int cardValue) {
        this.selection =(int) ((Math.random() * ((2 - 0) + 1)));
    }
}
