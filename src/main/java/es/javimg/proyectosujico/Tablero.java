package es.javimg.proyectosujico;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;




public class Tablero{

Cuadrado cuadrado = new Cuadrado();
Circulo circulo = new Circulo();



    int x=100;
    int y=100;
    int xc=500;
    int yc=250;
    
    public void montarTablero(Pane paneRoot){
                   
        for(int x=0; x<300; x+=100) {
            for(int y=0; y<300; y+=100) {
                cuadrado.crearCuadrado(paneRoot, x, y);
            }
        }  
        
        for(int xc=100; xc<300; xc+=100) {
            for(int yc=100; yc<300; yc+=100) {
                circulo.crearCirculo(paneRoot, xc, yc);
            }
        } 
        
    }
    
    public void rellenarTablero(Pane paneRoot) {
        
            for(int x=0;x<3;x++) {
                for (int y=0;y<3;y++) {
                    Label label = new Label(numeros[x][y]);
                }
            }

        
    }
}