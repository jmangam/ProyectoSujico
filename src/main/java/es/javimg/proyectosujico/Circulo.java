package es.javimg.proyectosujico;

import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;


public class Circulo{


 
 
    public void crearCirculo(Pane paneRoot, int xc, int yc){ //metodo que crea el circulo para el tablero

        Circle solucion = new Circle(); 
        solucion.setCenterX(xc);
        solucion.setCenterY(yc);
        solucion.setRadius(35);
        solucion.setFill(Color.WHITE);
        solucion.setStroke(Color.BLACK);
        paneRoot.getChildren().add(solucion);
    }
    

}