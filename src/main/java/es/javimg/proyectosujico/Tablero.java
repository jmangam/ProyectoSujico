package es.javimg.proyectosujico;

import javafx.scene.layout.Pane;




public class Tablero{

Cuadrado cuadrado = new Cuadrado();
Circulo circulo = new Circulo();

    int x=100;
    int y=100;
    int xc=500;
    int yc=250;
    
    public void montarTablero(Pane paneRoot){
                   
        for(int x=0; x<300; x++) {
            x= x+100;
            System.out.println("x:" + x);
            for(int y=0; y<300; y++) {
                cuadrado.crearCuadrado(paneRoot, x, y);
                y= y+100;
                System.out.println("y:" + y);
            }
        }  
        
        for(int xc=100; xc<300; x++) {
            xc= xc+100;
            for(int yc=100; yc<300; y++) {
                circulo.crearCirculo(paneRoot, xc, yc);
                yc= yc+100;
            }
        } 
        
    }
    
}