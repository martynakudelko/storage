package Basis;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private long storageID;
    private double storageVolume;
    private Person tentant;
    private boolean toRent;
    private List<Przedmiot> przedmioty;

    public Storage(double storageVolume, Person tentant, boolean toRent) {
        this.storageID = this.generateRandId();
        this.storageVolume = storageVolume;
        this.tentant = tentant;
        this.toRent = toRent;
        this.przedmioty = new ArrayList<Przedmiot>();
    }

    public static long generateRandId() {
        long randId = System.currentTimeMillis();

        return randId;
    }


    public double getStorageVolume() {
        return this.storageVolume;
    }

    public Person getTentant() {
        return this.tentant;
    }

    public void setToRent(boolean toRent) {
        this.toRent = toRent;
    }

    public String toString() {
        return "ID SCHOWKA: " + storageID +
                "\n OBJĘTOŚĆ SCHOWKA: " + storageVolume +
                "\n WYNAJMUJĄCY: " + tentant +
                "\n DO WYNAJĘCIA: " + toRent;


    }

    public void addItem(Przedmiot przedmiot) {
        przedmioty.add(przedmiot);
    }
}

    /*public void rentMe(){



        return
    }

    public void quitRental(){




        return
    }
}


    Storage ma: mieć powierzchnię, ID, być możliwe (lub nie) do wynajęcia,*/




