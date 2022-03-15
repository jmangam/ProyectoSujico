package es.javimg.proyectosujico;


import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Cuadrado{
    
    public void crearCuadrado(BorderPane paneRoot){
        Rectangle casilla = new Rectangle(); 
        casilla.setWidth(100);
        casilla.setHeight(100);
        casilla.setX(0);
        casilla.setY(0);
        casilla.setFill(Color.GREEN);
        casilla.setStroke(Color.BLACK);
        paneRoot.getChildren().add(casilla);
    }
    
    public void montarTablero(){
                   
        for(int y=0; y<3; y++) {
            for(int x=0; x<3; x++) {
                this.crearCuadrado(BorderPane paneRoot);
            }
            System.out.println();
        }    
        System.out.println();
    }
    
}
