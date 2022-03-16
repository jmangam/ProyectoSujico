package es.javimg.proyectosujico;

import javafx.scene.layout.Pane;




public class Tablero{

Cuadrado cuadrado = new Cuadrado();

    int x=100;
    int y=100;
    
    public void montarTablero(Pane paneRoot){
                   
        for(int x=0; x<300; x++) {
            x= x+100;
            System.out.println("x:" + x);
            for(int y=0; y<300; y++) {
                cuadrado.crearCuadrado(paneRoot, x, y);
                y= y+100;
                System.out.println("y:" + y);
            }
            System.out.println();
        }    
        System.out.println();
    }
    
}