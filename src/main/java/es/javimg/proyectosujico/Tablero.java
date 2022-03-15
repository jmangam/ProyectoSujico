package es.javimg.proyectosujico;

import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;



public class Tablero{

Cuadrado cuadrado = new Cuadrado();

    public void tablero(BorderPane paneRoot){
    cuadrado.crearCuadrado(paneRoot);
    }

}