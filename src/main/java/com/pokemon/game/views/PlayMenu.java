/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokemon.game.views;

import com.pokemon.game.controller.Pokemon;
import com.pokemon.game.models.players.PcPlayer;
import com.pokemon.game.models.players.UserPlayer;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PlayMenu extends JPanel implements ActionListener {

    JFrame pencere;
    boolean oyuncuVarmi;
    Pokemon[] deste;
    String oyuncuAdi;
    PcPlayer oyuncu1 = new PcPlayer();
    UserPlayer Oyuncu2 = new UserPlayer();
    PcPlayer oyuncu2 = new PcPlayer();
    boolean[] kullanim1 = new boolean[3];
    boolean[] kullanim2 = new boolean[3];
    int kartSayisi = 10;
    int oyuncu1Zafer = 0;
    int kazanan;
    int oyuncu2Zafer = 0;
    int dagitim1;
    int dagitim2;
    int kartkontrol = 0;


    JLabel oyunMenusu, birinciAd, ikinciAd;
    JTextField birinciSkor, ikinciSkor;
    JButton oyuncu1kart1, oyuncu1kart2, oyuncu1kart3, oyuncu2kart1, oyuncu2kart2, oyuncu2kart3, kartlar;
    JButton gizli1, gizli2, gizli3;
    JButton devam = new JButton("DEVAM");

    public PlayMenu(Pokemon[] deste, boolean oyuncuVarmi, JFrame pencere, String oyuncuAdi) {
        super();

        this.deste = deste;
        this.oyuncuVarmi = oyuncuVarmi;
        this.pencere = pencere;
        this.oyuncuAdi = oyuncuAdi;


        kullanim1[0] = true;
        kullanim1[1] = true;
        kullanim1[2] = true;

        kullanim2[0] = true;
        kullanim2[1] = true;
        kullanim2[2] = true;

        setFirstPlayer();
        setPngFile();

        int desteYeri;
        int kartsayisi = 0;

        while (kartsayisi < 3) {
            desteYeri = (int) ((Math.random() * ((9) + 1)));

            if (!deste[desteYeri].getUsage()) {
                oyuncu1.cardList[kartsayisi] = deste[desteYeri];
                deste[desteYeri].setUsage(true);

                kartsayisi++;
            }


        }

       setBoundsFirstPlayer();


        if (oyuncuVarmi) {
            kartsayisi = 0;

           setSecondPlayer();
            while (kartsayisi < 3) {
                desteYeri = (int) ((Math.random() * ((9) + 1)));

                if (!deste[desteYeri].getUsage()) {
                    Oyuncu2.cardList[kartsayisi] = deste[desteYeri];
                    deste[desteYeri].setUsage(true);
                    kartsayisi++;
                }
            }

            setBoundsSecondPlayer();

        } else {
            kartsayisi = 0;
            oyuncu2.setPlayerName(oyuncuAdi);
            oyuncu2.setPlayerId(1);

            devam.setBounds(678, 500, 100, 100);
            devam.addActionListener(this);
            add(devam);

            while (kartsayisi < 3) {
                desteYeri = (int) ((Math.random() * ((9) + 1)));

                if (!deste[desteYeri].getUsage()) {
                    oyuncu2.cardList[kartsayisi] = deste[desteYeri];
                    deste[desteYeri].setUsage(true);
                    kartsayisi++;
                }
            }
            setBoundsSecondPlayer();

            ikinciAd = new JLabel(oyuncu2.getPlayerName());
            ikinciSkor = new JTextField(Integer.toString(oyuncu2.getPlayerScore()));
        }

        ikinciAd.setBounds(1066, 50, 100, 20);
        ikinciSkor.setBounds(1216, 25, 20, 20);


        setLayout(null);

        oyunMenusu = new JLabel(new ImageIcon(new ImageIcon("menuViews/playMenu.jpg").getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH)));
        oyunMenusu.setBounds(0, 0, 1366, 768);


        add(kartlar);
        add(birinciAd);
        add(ikinciAd);
        add(ikinciSkor);
        add(birinciSkor);
        add(oyuncu1kart1);
        add(oyuncu1kart2);
        add(oyuncu1kart3);
        add(oyuncu2kart1);
        add(oyuncu2kart2);
        add(oyuncu2kart3);
        add(oyunMenusu);


        pencere.add(this);


    }

    int Karsilastir() {
        int sonuc = 0;
        JButton taraf1 = new JButton();
        JButton taraf2 = new JButton();


        if (oyuncu1.getSelection() == 0) {
            taraf1 = oyuncu1kart1;
        } else if (oyuncu1.getSelection() == 1) {
            taraf1 = oyuncu1kart2;
        } else if (oyuncu1.getSelection() == 2) {
            taraf1 = oyuncu1kart3;
        }

        if (oyuncuVarmi) {
            if (Oyuncu2.getSelection() == 0) {
                taraf2 = oyuncu2kart1;
            } else if (Oyuncu2.getSelection() == 1) {
                taraf2 = oyuncu2kart2;
            } else if (Oyuncu2.getSelection() == 2) {
                taraf2 = oyuncu2kart3;
            }


            if (oyuncu1.cardList[oyuncu1.getSelection()].showDamage() > Oyuncu2.cardList[Oyuncu2.getSelection()].showDamage()) {
                sonuc = 1;
            } else if (oyuncu1.cardList[oyuncu1.getSelection()].showDamage() < Oyuncu2.cardList[Oyuncu2.getSelection()].showDamage()) {
                sonuc = 2;
            }


        } else {
            if (oyuncu2.getSelection() == 0) {
                taraf2 = oyuncu2kart1;
            } else if (oyuncu2.getSelection() == 1) {
                taraf2 = oyuncu2kart2;
            } else if (oyuncu2.getSelection() == 2) {
                taraf2 = oyuncu2kart3;
            }

            if (oyuncu1.cardList[oyuncu1.getSelection()].showDamage() > oyuncu2.cardList[oyuncu2.getSelection()].showDamage()) {
                sonuc = 1;
            } else if (oyuncu1.cardList[oyuncu1.getSelection()].showDamage() < oyuncu2.cardList[oyuncu2.getSelection()].showDamage()) {
                sonuc = 2;
            }
        }

        FightMenu savasPenceresi = new FightMenu(taraf1, taraf2, sonuc);

        return sonuc;
    }


    void Dagit() {
        dagitim1 = (int) ((Math.random() * ((9) + 1)));

        if (deste[dagitim1].getUsage()) {
            while (deste[dagitim1].getUsage()) {
                dagitim1 = (int) ((Math.random() * ((9) + 1)));
            }


        }

        deste[dagitim1].setUsage(true);

        oyuncu1.cardList[oyuncu1.getSelection()] = deste[dagitim1];


        dagitim2 = (int) ((Math.random() * ((9) + 1)));

        if (deste[dagitim2].getUsage()) {
            while (deste[dagitim2].getUsage()) {
                dagitim2 = (int) ((Math.random() * ((9) + 1)));
            }

            deste[dagitim2].setUsage(true);
        }
        deste[dagitim2].setUsage(true);

        if (oyuncuVarmi) {
            Oyuncu2.cardList[Oyuncu2.getSelection()] = deste[dagitim2];
        } else {
            oyuncu2.cardList[oyuncu2.getSelection()] = deste[dagitim2];
        }


    }

    void yerlestir() {
        remove(oyunMenusu);

        if (kartSayisi > 6) {

            if (oyuncu1.getSelection() == 0) {
                remove(oyuncu1kart1);
                oyuncu1kart1 = new JButton( new ImageIcon(oyuncu1.cardList[0].getImage()));
                oyuncu1kart1.setBounds(200, 100, 100, 150);
                add(oyuncu1kart1);
            } else if (oyuncu1.getSelection() == 1) {
                remove(oyuncu1kart2);
                oyuncu1kart2 = new JButton(new ImageIcon(oyuncu1.cardList[1].getImage()));
                oyuncu1kart2.setBounds(200, 300, 100, 150);
                add(oyuncu1kart2);
            } else if (oyuncu1.getSelection() == 2) {
                remove(oyuncu1kart3);
                oyuncu1kart3 = new JButton(new ImageIcon(oyuncu1.cardList[2].getImage()));
                oyuncu1kart3.setBounds(200, 500, 100, 150);
                add(oyuncu1kart3);
            }

            if (oyuncuVarmi) {
                if (Oyuncu2.getSelection() == 0) {
                    remove(oyuncu2kart1);
                    oyuncu2kart1 = new JButton("1", new ImageIcon(Oyuncu2.cardList[0].getImage()));
                    oyuncu2kart1.addActionListener(this);
                    oyuncu2kart1.setBounds(1166, 100, 100, 150);
                    add(oyuncu2kart1);
                } else if (Oyuncu2.getSelection() == 1) {
                    remove(oyuncu2kart2);
                    oyuncu2kart2 = new JButton("2",  new ImageIcon(Oyuncu2.cardList[1].getImage()));
                    oyuncu2kart2.addActionListener(this);
                    oyuncu2kart2.setBounds(1166, 300, 100, 150);
                    add(oyuncu2kart2);
                } else if (Oyuncu2.getSelection() == 2) {
                    remove(oyuncu2kart3);
                    oyuncu2kart3 = new JButton("3", new ImageIcon(Oyuncu2.cardList[2].getImage()));
                    oyuncu2kart3.addActionListener(this);
                    oyuncu2kart3.setBounds(1166, 500, 100, 150);
                    add(oyuncu2kart3);
                }
            } else {
                if (oyuncu2.getSelection() == 0) {
                    remove(oyuncu2kart1);
                    oyuncu2kart1 = new JButton(new ImageIcon(oyuncu2.cardList[0].getImage()));
                    oyuncu2kart1.setBounds(1166, 100, 100, 150);
                    add(oyuncu2kart1);
                } else if (oyuncu2.getSelection() == 1) {
                    remove(oyuncu2kart2);
                    oyuncu2kart2 = new JButton(new ImageIcon(oyuncu2.cardList[1].getImage()));
                    oyuncu2kart2.setBounds(1166, 300, 100, 150);
                    add(oyuncu2kart2);
                } else if (oyuncu2.getSelection() == 2) {
                    remove(oyuncu2kart3);
                    oyuncu2kart3 = new JButton(new ImageIcon(oyuncu2.cardList[2].getImage()));
                    oyuncu2kart3.setBounds(1166, 500, 100, 150);
                    add(oyuncu2kart3);
                }
            }


        } else {
            if (kartkontrol != 1) {
                remove(kartlar);
                kartkontrol = 0;
            }

            if (oyuncu1.getSelection() == 0) {
                remove(oyuncu1kart1);
            } else if (oyuncu1.getSelection() == 1) {
                remove(oyuncu1kart2);
            } else if (oyuncu1.getSelection() == 2) {
                remove(oyuncu1kart3);
            }

            if (oyuncuVarmi) {
                if (Oyuncu2.getSelection() == 0) {
                    remove(oyuncu2kart1);
                } else if (Oyuncu2.getSelection() == 1) {
                    remove(oyuncu2kart2);
                } else if (Oyuncu2.getSelection() == 2) {
                    remove(oyuncu2kart3);
                }
            } else {
                if (oyuncu2.getSelection() == 0) {
                    remove(oyuncu2kart1);
                } else if (oyuncu2.getSelection() == 1) {
                    remove(oyuncu2kart2);
                } else if (oyuncu2.getSelection() == 2) {
                    remove(oyuncu2kart3);
                }
            }
        }

        remove(birinciSkor);

        birinciSkor = new JTextField(Integer.toString(oyuncu1.getPlayerScore()));
        birinciSkor.setBounds(150, 25, 20, 20);
        add(birinciSkor);


        remove(ikinciSkor);

        if (oyuncuVarmi) {
            ikinciSkor = new JTextField(Integer.toString(Oyuncu2.getPlayerScore()));
            ikinciSkor.setBounds(1216, 25, 20, 20);
            add(ikinciSkor);
        } else {
            ikinciSkor = new JTextField(Integer.toString(oyuncu2.getPlayerScore()));
            ikinciSkor.setBounds(1216, 25, 20, 20);
            add(ikinciSkor);
        }

        add(oyunMenusu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (kartSayisi <= 6) {
            oyuncu1.cardSelection(1);

            while (!kullanim1[oyuncu1.getSelection()]) {
                oyuncu1.cardSelection(1);
            }

            kullanim1[oyuncu1.getSelection()] = false;
        } else {
            oyuncu1.cardSelection(1);
        }


        if (oyuncuVarmi) {
            if (e.getActionCommand().equalsIgnoreCase("1")) {
                Oyuncu2.cardSelection(0);
            } else if (e.getActionCommand().equalsIgnoreCase("2")) {
                Oyuncu2.cardSelection(1);
            } else if (e.getActionCommand().equalsIgnoreCase("3")) {
                Oyuncu2.cardSelection(2);
            }

        } else {


            if (kartSayisi <= 6) {
                oyuncu2.cardSelection(1);

                while (!kullanim2[oyuncu2.getSelection()]) {
                    oyuncu2.cardSelection(1);
                }

                kullanim2[oyuncu2.getSelection()] = false;
            } else {
                oyuncu2.cardSelection(1);
            }


        }

        kazanan = Karsilastir();

        if (kazanan == 1) {
            oyuncu1Zafer++;

            oyuncu1.setPlayerScore(oyuncu1Zafer * 5);

        } else if (kazanan == 2) {
            oyuncu2Zafer++;

            if (oyuncuVarmi) {
                Oyuncu2.setPlayerScore(oyuncu2Zafer * 5);
            } else {
                oyuncu2.setPlayerScore(oyuncu2Zafer * 5);
            }
        }


        System.out.println("1.oyuncunun karti:" + oyuncu1.cardList[oyuncu1.getSelection()]);

        if (oyuncuVarmi) {
            System.out.println("2.oyuncunun karti:" + Oyuncu2.cardList[Oyuncu2.getSelection()]);
        } else {
            System.out.println("2.oyuncunun karti:" + oyuncu2.cardList[oyuncu2.getSelection()]);
        }

        System.out.println("Kazanan:" + kazanan);

        System.out.println("\n\n");


        if (kartSayisi > 6)
            Dagit();

        yerlestir();

        kartSayisi -= 2;


        if (kartSayisi == 0) {
            setVisible(false);
            ResultMenu resultMenu = new ResultMenu(oyuncu1, Oyuncu2, oyuncu2, oyuncuVarmi, pencere);

        }


    }

    public void setFirstPlayer(){
        oyuncu1.setPlayerName("Pc");
        oyuncu1.setPlayerId(0);

        birinciAd = new JLabel(oyuncu1.getPlayerName());
        birinciAd.setBounds(300, 50, 20, 20);

        birinciSkor = new JTextField(Integer.toString(oyuncu1.getPlayerScore()));
        birinciSkor.setBounds(150, 25, 20, 20);
    }
    public void setSecondPlayer(){
        Oyuncu2.setPlayerName(oyuncuAdi);
        Oyuncu2.setPlayerId(1);
        ikinciAd = new JLabel(Oyuncu2.getPlayerName());
        ikinciSkor = new JTextField(Integer.toString(Oyuncu2.getPlayerScore()));

    }

    public void setBoundsFirstPlayer(){
        oyuncu1kart1 = new JButton(new ImageIcon(oyuncu1.cardList[0].getImage()));
        oyuncu1kart2 = new JButton(new ImageIcon(oyuncu1.cardList[1].getImage()));
        oyuncu1kart3 = new JButton(new ImageIcon(oyuncu1.cardList[2].getImage()));

        oyuncu1kart1.setBounds(200, 100, 100, 150);
        oyuncu1kart2.setBounds(200, 300, 100, 150);
        oyuncu1kart3.setBounds(200, 500, 100, 150);
    }

    public void setBoundsSecondPlayer(){
        oyuncu2kart1 = new JButton("1", new ImageIcon(Oyuncu2.cardList[0].getImage()));
        oyuncu2kart2 = new JButton("2", new ImageIcon(Oyuncu2.cardList[1].getImage()));
        oyuncu2kart3 = new JButton("3", new ImageIcon(Oyuncu2.cardList[2].getImage()));

        oyuncu2kart1.addActionListener(this);
        oyuncu2kart2.addActionListener(this);
        oyuncu2kart3.addActionListener(this);

        oyuncu2kart1.setBounds(1166, 100, 100, 150);
        oyuncu2kart2.setBounds(1166, 300, 100, 150);
        oyuncu2kart3.setBounds(1166, 500, 100, 150);


    }

    public void setPngFile(){
        oyunMenusu = new JLabel(new ImageIcon(new ImageIcon("menuViews/playMenu.jpg").getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH)));
        oyunMenusu.setBounds(0, 0, 1366, 768);

        kartlar = new JButton(new ImageIcon("DESTE.png"));
        kartlar.setBounds(678, 50, 100, 150);

        gizli1 = new JButton(new ImageIcon("GİZLİ.png"));
        gizli1.setBounds(200, 100, 100, 150);

        gizli2 = new JButton(new ImageIcon("GİZLİ.png"));
        gizli2.setBounds(200, 300, 100, 150);

        gizli3 = new JButton(new ImageIcon("GİZLİ.png"));
        gizli3.setBounds(200, 500, 100, 150);
    }


}
