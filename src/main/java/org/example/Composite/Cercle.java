package org.example.Composite;

import org.example.Observable.Observable;
import org.example.Observable.Parametrage;
import org.example.entities.Point;

import java.io.Serializable;


public class Cercle extends Figure {
    private double rayon;

    public Cercle(Point p, double rayon) {
        super(p);
        this.rayon = rayon;
    }


    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double getSurface() {
        return Math.PI*rayon*rayon;
    }


    @Override
    public double getPerimetre() {
        return 2*Math.PI*rayon;
    }

    @Override
    public void dessiner() {
        System.out.println("Rayon Cercle :"+rayon + " , Surface : "+getSurface()+" , Perimetre :" +getPerimetre());

    }

    @Override
    public void update(Observable o) {
        System.out.println(" Couleur Contour :"+((Parametrage) o).getCouleurContour()+"  Couleur Remplissage :"+((Parametrage) o).getCouleurRemplissage()+"Epaisseur Color"+
                ((Parametrage) o).getEpaisseur());
    }
}
