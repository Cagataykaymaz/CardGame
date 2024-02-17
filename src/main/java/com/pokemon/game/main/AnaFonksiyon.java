/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokemon.game.main;

import com.pokemon.game.Pokemon;
import com.pokemon.game.models.*;
import com.pokemon.game.views.LoginMenu;

import javax.swing.JFrame;
public class AnaFonksiyon {

    public static void main(String[] args) {

        Pokemon[] deste = new Pokemon[10];

        Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur", "cim", 0);
        bulbasaur.putImage("Bulbasaur");
        deste[0] = bulbasaur;

        Butterfree butterfree = new Butterfree("Butterfree", "hava", 1);
        butterfree.putImage("Butterfree");
        deste[1] = butterfree;

        Charmander charmander = new Charmander("Charmander", "ates", 2);
        charmander.putImage("Charmander");
        deste[2] = charmander;

        Jigglypuff jigglypuff = new Jigglypuff("Jigglypuff", "ses", 3);
        jigglypuff.putImage("Jigglypuff");
        deste[3] = jigglypuff;

        Meowth meowth = new Meowth("Meowth", "normal", 4);
        meowth.putImage("Meowth");
        deste[4] = meowth;

        Pikachu pikachu = new Pikachu("Pikachu", "elektrik", 5);
        pikachu.putImage("Pikachu");
        deste[5] = pikachu;

        Psyduck psyduck = new Psyduck("Psyduck", "su", 6);
        psyduck.putImage("Psyduck");
        deste[6] = psyduck;

        Snorlax snorlax = new Snorlax("Snorlax", "normal", 7);
        snorlax.putImage("Snorlax");
        deste[7] = snorlax;

        Squirtle squirtle = new Squirtle("Squirtle", "su", 8);
        squirtle.putImage("Squirtle");
        deste[8] = squirtle;

        Zubat zubat = new Zubat("Zubat", "hava", 9);
        zubat.putImage("Zubat");
        deste[9] = zubat;

        JFrame pencere = new JFrame();
        pencere.setVisible(true);
        LoginMenu loginMenu = new LoginMenu(pencere, deste);
        loginMenu.setBackGround();
        loginMenu.settingsBounds();
        loginMenu.addToScreen();
        pencere.setSize(1366, 768);

        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}