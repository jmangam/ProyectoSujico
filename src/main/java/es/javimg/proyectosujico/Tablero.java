package es.javimg.proyectosujico;

import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Tablero{

    public void tablero(BorderPane paneRoot){
    Rectangle cuadrado = new Rectangle(); 
    cuadrado.setWidth(100);
    cuadrado.setHeight(100);
    cuadrado.setX(0);
    cuadrado.setY(0);
    cuadrado.setFill(Color.GREEN);
    cuadrado.setStroke(Color.BLACK);
    paneRoot.getChildren().add(cuadrado);
    }

}