package org.example;

import org.example.Composite.Cercle;
import org.example.Composite.Figure;
import org.example.Composite.GroupeFigure;
import org.example.Composite.Rectangle;
import org.example.Observable.Observer;
import org.example.Observable.Parametrage;
import org.example.Strategy.Dessin;
import org.example.Strategy.TraitementInterface;
import org.example.Strategy.TraitementInterfaceImpl1;
import org.example.Strategy.TraitementInterfaceImpl2;
import org.example.entities.Point;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*TraitementInterface t= new TraitementInterfaceImpl1();
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

        System.out.println("\n--------------------------------------");
        System.out.println("-------------Notify-------------------");
        List<Observer> observers=new ArrayList<>();
        Parametrage parametrage = new Parametrage(observers,12,54,87);
        observers.add(new Rectangle(new Point(8,9),4,10));
        parametrage.notifyObservers();*/

        System.out.println("\nCreation du figure 1");
        Figure figure1=new Cercle(new Point(10,10),70);
        System.out.println(figure1.getPerimetre());
        System.out.println(figure1.getSurface());
        figure1.dessiner();

        System.out.println("\nCreation du figure 1");
        Figure figure2=new Rectangle(new Point(5,5),12,56);
        System.out.println(figure2.getPerimetre());
        System.out.println(figure2.getSurface());
        figure2.dessiner();

        System.out.println("\nCreation du Groupe de figure");
        GroupeFigure groupeFigure=new GroupeFigure(new Point(0,0));
        groupeFigure.addFigure(figure1);
        groupeFigure.addFigure(figure2);

        System.out.println("\nLe paramétrage :");
        List<Observer> observers=new ArrayList<>();
        Parametrage parametrageObservale=new Parametrage(observers,11,12,13);
        parametrageObservale.addObserver(figure1);
        parametrageObservale.addObserver(figure2);
        parametrageObservale.setCouleurContour(900);
        figure1.dessiner();
        figure2.dessiner();

    }
}
