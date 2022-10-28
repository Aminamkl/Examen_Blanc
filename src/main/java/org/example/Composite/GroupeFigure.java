package org.example.Composite;

import org.example.Observable.Observable;
import org.example.entities.Point;

import java.util.ArrayList;
import java.util.List;

public class GroupeFigure extends Figure {

    List<Figure> listFigures;

    public GroupeFigure(Point point) {
        super(point);
        listFigures = new ArrayList<>();
    }


    @Override
    public double getSurface() {
        return 0;
    }

    @Override
    public double getPerimetre() {
        return 0;
    }


    public void update(Observable o) {
        for(Figure f : listFigures){
           f.update(o);
        }
    }
    @Override
    public void dessiner() {
        for (Figure f: listFigures){
            f.dessiner();
        }

    }

}
