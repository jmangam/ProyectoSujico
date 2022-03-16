package es.javimg.proyectosujico;

import javafx.scene.layout.Pane;




public class Tablero{

Cuadrado cuadrado = new Cuadrado();

    int x=100;
    int y=100;
    
    public void montarTablero(Pane paneRoot){
                   
        for(int x=0; x<400; x++) {
            y= y+100;
            System.out.println("x:" + x);
            for(int Y=0; Y<3; Y++) {
                cuadrado.crearCuadrado(paneRoot, x, y);
                x= x+100;
                System.out.println("y:" + y);
            }
            System.out.println();
        }    
        System.out.println();
    }
    
}