package Basis;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Date;

public class Person {

    private String name;
    private String surname;
    private String pesel;
    private String adress;
    private String birthDate;
    private Date firstRentalDate;

    public Person (String name, String surname, String pesel, String adress, String birthDate, Date firstRentalDate){
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.adress = adress;
        this.birthDate = birthDate;
        this.firstRentalDate = firstRentalDate;
    }

    public String getPesel(){
        return this.pesel;
    }

    public String toString(){
        return "Imie: " + name +
                "\nNazwisko: " + surname +
                "\nPESEL: " + pesel;
                /*"\nAdres zamieszkania: " + adress +
                "\nData Urodzin: " + birthDate +
                "\nData pierwszego wynajmu: " + firstRentalDate +
                "\nLista wynajętych pomieszczeń: ";  widok coś w stylu moje konto */
    }

}
