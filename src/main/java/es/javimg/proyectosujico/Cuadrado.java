package es.javimg.proyectosujico;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;


public class Cuadrado{


 int y;
 int x;
 
    public void crearCuadrado(Pane paneRoot, int x, int y){

        Rectangle casilla = new Rectangle(); 
        casilla.setWidth(100);
        casilla.setHeight(100);
        casilla.setX(x);
        casilla.setY(y);
        casilla.setFill(Color.WHITE);
        casilla.setStroke(Color.BLACK);
        paneRoot.getChildren().add(casilla);
    }
    

}
