package com.View;

import Basis.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ChoosePerson extends JPanel {

    /* pola wszystkie elementy w widoku, gettery dla dwoch wartosci, w konstruktorze definiuje caly wyglad okna
    *
    * do Jpanelu odwoluje sie przez this. w konstruktorze */

    private JComboBox users; // tablica obiektow osoby
    private JButton logIn;

    public ChoosePerson() {
        users = new JComboBox();
        logIn = new JButton("Zaloguj");
    }

    public JComboBox getUsers(){
        return users;
    }

    public class Login {

        private MainView view;

        public Login(Person[] users) {
            view = new MainView();

            for (int i = 0; i < users.length; i++) {
                view.getChoosePerson().getUsers().addItem(users[i]);
            }
        }

        public void loginUser() {
            //TU TWORZYSZ ACTIONLISTENERA
            view.getChoosePerson.getLogIn().addActionListener(new ActionListener(){

            });
        }
    }



   // this.add //i zmienne, ktore przechowuja JComboBox i JButton

}
