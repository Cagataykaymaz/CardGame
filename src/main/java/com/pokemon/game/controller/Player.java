/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokemon.game.controller;

public abstract class Player {
    
    private int playerId;
    private int playerScore;
    private String playerName;
    
    public Player()
    {
        playerId =-1;
        playerScore =0;
        playerName =null;
        
    }
    
    public Player(String playerName, int playerId)
    {   
        playerScore =0;
        this.playerName = playerName;
        this.playerId = playerId;
    }

    public int getPlayerId()
    {
        return playerId;
    }
    
    public void setPlayerId(int playerId)
    {
        this.playerId = playerId;
    }
    
    public int getPlayerScore()
    {
        return playerScore;
    }
    
    public void setPlayerScore(int playerScore)
    {
        this.playerScore = playerScore;
    }
    
    public String getPlayerName()
    {
        return playerName;
    }
    
    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }
    
    public abstract void kartSecim(int deger);
}
