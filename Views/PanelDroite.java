
package com.phuc.swingmvc.Views;

import com.phuc.swingmvc.Models.EntiteCouleur;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author Phuc
 */
public class PanelDroite extends JFrame{
  
    private JSlider sliderR, sliderV, sliderB;
    private JPanel myPanel;
    private JLabel labelR, labelB, labelV;
    static final int MIN = 0;
    static final int MAX = 255;

    public PanelDroite(EntiteCouleur entiteCouleur) {
        super("Mes Sliders pour changer les couleurs");
        myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(6,2));
        
        sliderR = new JSlider(JSlider.HORIZONTAL,MIN,MAX,127);
        sliderB = new JSlider(JSlider.HORIZONTAL,MIN,MAX,127);
        sliderV = new JSlider(JSlider.HORIZONTAL,MIN,MAX,127);
        
        labelR = new JLabel("  0                                             Rouge"
                + "                                                        255");
        labelV = new JLabel("  0                                             Vert "
                + "                                                           255");
        labelB = new JLabel("  0                                             Bleu "
                + "                                                           255");
        
        add(myPanel, BorderLayout.CENTER);
        myPanel.add(labelR);
        myPanel.add(sliderR);
        myPanel.add(labelV);
        myPanel.add(sliderV);
        myPanel.add(labelB);
        myPanel.add(sliderB);
        
         
      // Les opérations essentielles pour l'affichage JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(560, 100);
        setVisible(true);
        
    }

    public JPanel getMyPanel() {
        return myPanel;
    }

    public JSlider getSliderR() {
        return sliderR;
    }

    public JSlider getSliderV() {
        return sliderV;
    }

    public JSlider getSliderB() {
        return sliderB;
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


    
}
