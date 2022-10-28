package org.example.Composite;

import org.example.Observable.Observer;
import org.example.entities.Point;

public abstract class Figure implements Observer {

    private Point p;

    public Figure(Point p) {
        this.p = p;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }


    public abstract double getSurface();
    public abstract double getPerimetre();
    public abstract void dessiner();


}
