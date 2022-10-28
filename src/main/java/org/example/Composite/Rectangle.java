package org.example.Composite;


import org.example.Observable.Observable;
import org.example.Observable.Parametrage;
import org.example.entities.Point;


public class Rectangle extends Figure {

    private double L;
    private double H;

    public Rectangle(Point p, double L , double H) {
        super(p);
        this.H=H;
        this.L=L;
    }

    public double getL() {
        return L;
    }

    public void setL(double l) {
        L = l;
    }

    public double getH() {
        return H;
    }

    public void setH(double h) {
        H = h;
    }

    @Override
    public double getSurface() {
        return L*H;
    }

    @Override
    public double getPerimetre() {
        return 2*(L+H);
    }

    @Override
    public void dessiner() {

        System.out.println("Rectangle avec Largeur et Hauteur => L : "+L+",H :"+H+"Perimetre :"+getPerimetre()+"surface :"+getSurface());

    }
    @Override
    public void update(Observable observable) {
        System.out.println(" Couleur Contour :"+((Parametrage) observable).getCouleurContour()+"  ,Couleur Remplissage : "+((Parametrage) observable).getCouleurRemplissage()+" ,Epaisseur Color"+
                ((Parametrage) observable).getEpaisseur());

    }
}
