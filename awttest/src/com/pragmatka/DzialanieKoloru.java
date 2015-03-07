package com.pragmatka;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.text.StyleConstants.setBackground;

/**
 * Created by Ola on 2015-03-07.
 */
/** Sluchacz zmieniający kolor tła panelu */

public class DzialanieKoloru implements ActionListener{
    private Color kolorTla;

    public DzialanieKoloru(Color k) {
        kolorTla = k;
    }

    public  void  actionPerformed(ActionEvent zdarzenie){
        setBackground(kolorTla);
        repaint();
    }
}
