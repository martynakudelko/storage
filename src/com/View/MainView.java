package com.View;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

    private ChoosePerson choosePerson;

    public MainView() {
        this.choosePerson = new ChoosePerson();
        this.setPreferredSize(new Dimension(1000, 800));
        this.setContentPane(choosePerson);
        this.pack();
        this.setVisible(true);
    }

    public ChoosePerson getChoosePerson() {
        return choosePerson;
    }

    public void setPreferredSize(Dimension preferredSize) {
        this.preferredSize = preferredSize;
    }
}


    /* wszystkie panele i eventy, jakie zrobie, zbiór wszystkich widokow metoda changePanel ktora przyjmuje panel i widok
    przekazuję element (po kliknięciu ktorego jest zmiana panelu) i panel docelowy i w tej klasie na elementcie jest
    listenera i przy kliknieciu do panelu serviceable i do widoku mainView ustawiam setCotentPane i na tym widku jest setContentPane

    this.pack





    */


