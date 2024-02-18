/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokemon.game.main;

import com.pokemon.game.controller.Pokemon;
import com.pokemon.game.models.pokemons.*;
import com.pokemon.game.views.LoginMenu;

import javax.swing.JFrame;
public class Main {

    public static void main(String[] args) {

        Pokemon[] pack = new Pokemon[10];

        Pokemon bulbasaur = new Bulbasaur("Bulbasaur", "cim", 0);
        pack[0] = bulbasaur;

        Pokemon butterfree = new Butterfree("Butterfree", "hava", 1);
        pack[1] = butterfree;

        Pokemon charmander = new Charmander("Charmander", "ates", 2);
        pack[2] = charmander;

        Pokemon jigglypuff = new Jigglypuff("Jigglypuff", "ses", 3);
        pack[3] = jigglypuff;

        Pokemon meowth = new Meowth("Meowth", "normal", 4);
        pack[4] = meowth;

        Pokemon pikachu = new Pikachu("Pikachu", "elektrik", 5);
        pack[5] = pikachu;

        Pokemon psyduck = new Psyduck("Psyduck", "su", 6);
        pack[6] = psyduck;

        Pokemon snorlax = new Snorlax("Snorlax", "normal", 7);
        pack[7] = snorlax;

        Pokemon squirtle = new Squirtle("Squirtle", "su", 8);
        pack[8] = squirtle;

        Pokemon zubat = new Zubat("Zubat", "hava", 9);
        pack[9] = zubat;

        for(Pokemon pokemon: pack){
            pokemon.putImage(pokemon.getPokemonName());
        }

        JFrame screen = new JFrame();
        screen.setVisible(true);
        LoginMenu loginMenu = new LoginMenu(screen, pack);
        loginMenu.setBackGround();
        loginMenu.settingsBounds();
        loginMenu.addToScreen();
        screen.setSize(1920, 768);

        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}