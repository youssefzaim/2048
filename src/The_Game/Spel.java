package The_Game;

import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;

public class Spel {
    public int score;
    public int highScore;
    private int aantalVakjes;
    private Random random = new Random();
    private final int size = 4;
    private Tegel[][] tegels = new Tegel[size][size];

    public Spel() {
        this.aanmakenRaster();
        this.nieuweTegel();
        this.nieuweTegel();
        this.printRaster();
        this.isRasterVol();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public void swipe() {
        for (int i = 0; i < tegels.length; i++) {
            for (int j = 0; j < tegels.length; j++) {
                if (tegels[i][j].waarde != 0) {
                    if(tegels[i+1][j].waarde == tegels[i][j].waarde)
                }
            }
        }
    }


    public int som(Tegel tegel) {
        return tegel.waarde + tegel.getWaarde();
    }

    public int nieuweTegelWaarde() {
        int nieuw = (random.nextInt(2) + 1) * 2;
        return nieuw;
    }

    public boolean isRasterVol() {
        for (int i = 0; i < tegels.length; i++) {
            for (int j = 0; j < tegels.length; j++) {
                if (tegels[i][j].getWaarde() != 0)
                    return false;
            }
        }
        return true;
    }

    public void nieuweTegel() {
        Tegel tegel = new Tegel();

        tegel.setX(random.nextInt(4));
        tegel.setY(random.nextInt(4));

        tegel.setWaarde(nieuweTegelWaarde());

        tegels[tegel.getX()][tegel.getY()] = tegel;
    }

    private void aanmakenRaster() {
        for (int i = 0; i < tegels.length; i++) {
            for (int j = 0; j < tegels[i].length; j++) {
                tegels[i][j] = new Tegel();
            }
        }
    }

    public void printRaster() {
        for (int i = 0; i < tegels.length; i++) {
            for (int j = 0; j < tegels[i].length; j++) {
                if (tegels[i][j] != null) {
                    System.out.print(tegels[i][j].getWaarde() + " ");
                }
            }
            System.out.println();
        }
    }

    public void spelVerlaten() {

    }

    public void opnieuwBeginnen() {

    }

    public void verderSpelen() {

    }

    public boolean isGewonnen() {
        return true;
    }

    public boolean isVerloren() {
        return true;
    }

}

