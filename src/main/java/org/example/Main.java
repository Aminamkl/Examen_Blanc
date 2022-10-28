package org.example;

import org.example.Composite.Cercle;
import org.example.Composite.Rectangle;
import org.example.Strategy.Dessin;
import org.example.Strategy.TraitementInterface;
import org.example.Strategy.TraitementInterfaceImpl1;
import org.example.Strategy.TraitementInterfaceImpl2;
import org.example.entities.Point;

public class Main {
    public static void main(String[] args) {
        TraitementInterface t= new TraitementInterfaceImpl1();
        Dessin d = new Dessin(t);
        d.addFigure(new Cercle(new Point(1,2),4));
        d.addFigure(new Rectangle(new Point(2,3),3,5));
        d.traiter();
        d.afficherDessin();

        System.out.println("\n");

        TraitementInterface t2= new TraitementInterfaceImpl2();
        Dessin d2 = new Dessin(t2);
        d2.addFigure(new Cercle(new Point(5,4),7));
        d2.addFigure(new Rectangle(new Point(8,5),5,9));
        d2.traiter();
        d2.afficherDessin();
    }
}
