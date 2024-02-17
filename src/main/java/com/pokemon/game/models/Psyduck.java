/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokemon.game.models;

import com.pokemon.game.Pokemon;

import java.awt.image.BufferedImage;

public class Psyduck extends Pokemon {

    final private int pokemonHasarpuani = 20;

    public Psyduck() {
        super();


    }

    public Psyduck(String ad, String tip, int id) {
        super(ad, tip, id);
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
