package Basis;

public class Przedmiot {

    private String objectName;
    private double objectVolume;

    public Przedmiot (String objectName, double objectVolume){
        this.objectName = objectName;
        this.objectVolume = objectVolume;
    }

    public String getObjectName(){
        return objectName;
    }

    public double setObjectName(){
        return this.objectVolume;
    }

    public double getObjectVolume(){
        return this.objectVolume;
    }

    public double setObjectVolume(){
        return this.objectVolume;
    }

    public String toString(){
        return objectName + ": " + objectVolume + "m^3";
    }

}
