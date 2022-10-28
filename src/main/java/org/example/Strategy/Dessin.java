package org.example.Strategy;

import org.example.Composite.Figure;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
    List<Figure> figures ;
    TraitementInterface traitInterface;

    public Dessin(TraitementInterface traitementInterface) {
         figures = new ArrayList<>();
        traitInterface = traitementInterface;
    }

    public void traiter(){
         traitInterface.traiter();
    }

    public void addFigure(Figure f){
        figures.add(f);
    }
    public void removeFigure(Figure f){
        figures.remove(f);
    }
    public void afficherDessin(){
        for(Figure f:figures){
            f.dessiner();
        }
    }
    public void serialiser(){
        System.out.println("serialiser le dessin dans un fichier binaire ");
    }
}
