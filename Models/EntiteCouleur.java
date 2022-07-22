
package com.phuc.swingmvc.Models;

import java.awt.Color;

/**
 *
 * @author Phuc
 */
public class EntiteCouleur {
    private int rouge, vert, bleu;
    private Color color;

    public EntiteCouleur() {
    }
    

    public Color getColor() {
        return color;
    }

    public void setColor() {
        this.color = new Color(rouge,vert,bleu);
    }

    public int getRouge() {
        return rouge;
    }

    public void setRouge(int rouge) {
        this.rouge = rouge;
    }

    public int getVert() {
        return vert;
    }

    public void setVert(int vert) {
        this.vert = vert;
    }

    public int getBleu() {
        return bleu;
    }

    public void setBleu(int bleu) {
        this.bleu = bleu;
    }

    
}
