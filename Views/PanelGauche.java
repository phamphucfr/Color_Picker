
package com.phuc.swingmvc.Views;

import com.phuc.swingmvc.Models.EntiteCouleur;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Phuc
 */
public class PanelGauche extends JFrame{
    private JTextField champTextR, champTextB, champTextV, champTextHex;
    private JPanel northPanel, centerPanel;
    private JLabel labelR, labelB, labelV, labelHex;
    private EntiteCouleur entiteCouleur;
        
    public PanelGauche(EntiteCouleur entiteCouleur){
        super(" Composition de couleur personalisée ");
        this.entiteCouleur = entiteCouleur;
        northPanel = new JPanel();
        centerPanel = new JPanel();
        
        labelR = new JLabel("Valeur du Rouge: ");
        champTextR = new JTextField(10);
        labelB = new JLabel("Valeur du Bleu: ");
        champTextB = new JTextField(10);
        labelV = new JLabel("Valeur du Vert: ");
        champTextV = new JTextField(10);
        labelHex = new JLabel("Valeur en HexaDécimal: ");
        champTextHex = new JTextField(10);
        
        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        northPanel.setLayout(new GridLayout(8,2));
        centerPanel.setLayout(new GridLayout(1,1));
        northPanel.add(labelR);
        northPanel.add(champTextR);
        northPanel.add(labelV);
        northPanel.add(champTextV);
        northPanel.add(labelB);
        northPanel.add(champTextB);
        northPanel.add(labelHex);
        northPanel.add(champTextHex);
        
        // Basic operations to get a JFrame display
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,550);
        setLocation(50, 100);
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        g.setColor(entiteCouleur.getColor());
        
        String hexR = String.format("%02X", entiteCouleur.getRouge());
        String hexV = String.format("%02X", entiteCouleur.getVert());
        String hexB = String.format("%02X", entiteCouleur.getBleu());

        champTextHex.setText("#0x"+hexR+hexV+hexB);
        g.fillRect(50, 200, 400, 300);

    }


    public JTextField getChampTextR() {
        return champTextR;
    }

    public JTextField getChampTextB() {
        return champTextB;
    }

    public JTextField getChampTextV() {
        return champTextV;
    }

    public JLabel getLabelR() {
        return labelR;
    }

    public JLabel getLabelB() {
        return labelB;
    }

    public JLabel getLabelV() {
        return labelV;
    }

    public JPanel getNorthPanel() {
        return northPanel;
    }

    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public EntiteCouleur getModel() {
        return entiteCouleur;
    }
    
    public PanelGauche refresh(){
        return this;
    }

    public JTextField getChampTextHex() {
        return champTextHex;
    }

    public void setChampTextHex(JTextField champTextHex) {
        this.champTextHex = champTextHex;
    }

    public JLabel getLabelHex() {
        return labelHex;
    }

    public void setLabelHex(JLabel labelHex) {
        this.labelHex = labelHex;
    }
    
}
