package es.javimg.proyectosujico;

import java.util.Arrays;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;




public class Tablero{

Cuadrado cuadrado = new Cuadrado();
Circulo circulo = new Circulo();



    int x=100;
    int y=100;
    int xc=500;
    int yc=250;
    
    public void montarTablero(Pane paneRoot){ // metodo encargado de montar el tablero por pantalla
                   
        for(int x=0; x<300; x+=100) { //este for hace todos los cuadrados por pantalla
            for(int y=0; y<300; y+=100) {
                cuadrado.crearCuadrado(paneRoot, x, y);
            }
        }  
        
        for(int xc=100; xc<300; xc+=100) { // este for crea los circulos de las soluciones
            for(int yc=100; yc<300; yc+=100) {
                circulo.crearCirculo(paneRoot, xc, yc);
            }
        } 
        
    }
    
    public void rellenarTablero(Pane paneRoot,  Sujico sujico) { // este se encarga de añadir los valores del array al tablero
        int X=50;
        int Y=50;
            for(int x=0;x<3;x++) {
                for (int y=0;y<3;y++) {
                    Label label00 = new Label (String.valueOf(sujico.tablerovisible[x][y]));
                    label00.setLayoutX(X+=50);
                    label00.setLayoutY(Y+=50);
                    paneRoot.getChildren().add(label00);
                }
            }

        
    }
}