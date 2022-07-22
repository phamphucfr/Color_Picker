
package com.phuc.swingmvc.Controllers;

import com.phuc.swingmvc.Models.EntiteCouleur;
import com.phuc.swingmvc.Views.PanelDroite;
import com.phuc.swingmvc.Views.PanelGauche;
import java.awt.Graphics;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Phuc
 */
public class ControleurAffichage {
    private PanelGauche viewG;
    private PanelDroite viewD;
    private EntiteCouleur model;


    public ControleurAffichage(PanelDroite viewD,PanelGauche viewG, EntiteCouleur model) {
        this.viewG = viewG; 
        this.model = model;
        this.viewD = viewD;
    }

   
    public void onInit(){
    
        viewD.getSliderR().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int rouge = viewD.getSliderR().getValue();
                model.setRouge(rouge);
                viewG.getChampTextR().setText(String.valueOf(rouge));
                model.setColor();
                viewG.repaint();
            }
        });
        viewD.getSliderV().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int vert = viewD.getSliderV().getValue();
                model.setVert(vert);
                viewG.getChampTextV().setText(String.valueOf(vert));
                model.setColor();
                viewG.repaint();
            }
        });
        viewD.getSliderB().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int bleu = viewD.getSliderB().getValue();
                model.setBleu(bleu);
                viewG.getChampTextB().setText(String.valueOf(bleu));
                model.setColor();
                viewG.repaint();
            }
        });
      
        
    }
    
    
}
