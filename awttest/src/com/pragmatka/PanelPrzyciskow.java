package com.pragmatka;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ola on 2015-03-07.
 * Panel zawierajacy trzy przyciski
 */
public class PanelPrzyciskow extends JPanel{
    public PanelPrzyciskow() {
        /** Skonstruuktuj przycisk */

        JButton przyciskZolty = new JButton("Zolty");
        JButton przyciskBlue = new JButton("Blue");
        JButton przyciskRed = new JButton("Red");

        /** Dołącz przyciski do panelu  */

        add(przyciskZolty);
        add(przyciskBlue);
        add(przyciskRed);

        /** Skonstruktuj działania przycisków */

        DzialanieKoloru dzilanieZoltego = new DzialanieKoloru(Color.YELLOW);
        DzialanieKoloru dzilanieBlue = new DzialanieKoloru(Color.BLUE);
        DzialanieKoloru dzilanieRed = new DzialanieKoloru(Color.RED);





    }
}
