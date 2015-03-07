package com.pragmatka;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ola on 2015-03-07.
 */
public class RamkaPrzyciskow extends JFrame{
    public static final int SZEROKOSC = 300;
    public static final int WYSOKOSC = 300;

    public RamkaPrzyciskow(){
        setTitle("Test przyciskow");
        setSize(SZEROKOSC, WYSOKOSC);
        /**Dołącz panel do ramki */

        PanelPrzyciskow panel = new PanelPrzyciskow();
        Container powZawartosc = getContentPane();
        powZawartosc.add(panel);
    }
}
