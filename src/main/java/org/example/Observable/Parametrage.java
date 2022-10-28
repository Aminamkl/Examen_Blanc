package org.example.Observable;

import java.util.ArrayList;
import java.util.List;

public class Parametrage implements Observable{

    List<Observer> observers = new ArrayList<>();

    private int couleurContour;
    private int couleurRemplissage;
    private int epaisseur;


    public Parametrage(List<Observer> observers, int couleurContour, int couleurRemplissage, int epaisseur) {
        this.observers = observers;
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
        this.epaisseur = epaisseur;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(this);
        }
    }

    public int getCouleurContour() {
        return couleurContour;
    }

    public void setCouleurContour(int couleurContour) {
        this.couleurContour = couleurContour;
        notifyObservers();
    }

    public int getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public void setCouleurRemplissage(int couleurRemplissage) {

        this.couleurRemplissage = couleurRemplissage;
        notifyObservers();

    }

    public int getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(int epaisseur) {

        this.epaisseur = epaisseur;
        notifyObservers();

    }
}
