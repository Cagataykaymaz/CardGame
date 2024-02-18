/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokemon.game.models.pokemons;

import com.pokemon.game.controller.Pokemon;

import java.awt.image.BufferedImage;

public class Butterfree extends Pokemon {

    public Butterfree() {
        super();
    }

    public Butterfree(String name, String type, int id) {
        super(name, type, id);
    }

    @Override
    public int showDamage() {
        return 10;
    }

    @Override
    public BufferedImage putImage(String name) {
        return super.putImage(name);
    }



}
