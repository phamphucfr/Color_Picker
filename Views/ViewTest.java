
package com.phuc.swingmvc.Views;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Phuc
 */
public class ViewTest extends JFrame{
        private JTextField champText;
        private JPanel myPanel;
        private JLabel label;
    
        public ViewTest(){
        super(" Vue2 non abonnée");
        myPanel = new JPanel();
        label = new JLabel("Pas d'abonnement à Terminal");
        
        add(myPanel, BorderLayout.CENTER);
        myPanel.setLayout(new GridLayout(1,2,0,10));
        myPanel.add(label);

        // Les opérations essentielles pour l'affichage JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,100);
        setLocation(610, 200);
        setVisible(true);
    }

    public JTextField getChampText() {
        return champText;
    }

    public JPanel getMyPanel() {
        return myPanel;
    }

    public JLabel getLabel() {
        return label;
    }
}
