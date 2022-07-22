
package com.phuc.swingmvc;

import com.phuc.swingmvc.Controllers.ControleurAffichage;
import com.phuc.swingmvc.Models.EntiteCouleur;
import com.phuc.swingmvc.Views.PanelDroite;
import com.phuc.swingmvc.Views.PanelGauche;
import javax.swing.SwingUtilities;

/**
 *
 * @author Phuc
 */
public class SwingMVC {
    
    public static void main(String[] args){
       run();
     }
     public static void run(){
         SwingUtilities.invokeLater(() -> {
        try {
            EntiteCouleur mymodel = new EntiteCouleur();
            PanelGauche viewG = new PanelGauche(mymodel);
            PanelDroite viewD = new PanelDroite(mymodel);
            ControleurAffichage controlView = new ControleurAffichage(viewD,viewG,mymodel);
            controlView.onInit();
        }
        catch (Exception e) {
        }
        });
     }
    
}
