package es.javimg.proyectosujico;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;


public class Sujico {
    
    short tamXTablero;
    short tamYTablero;
    char[][] tablero;
    
    static final char JUGADOR1 = '1';
    static final char JUGADOR2 = '2';
    final char VACIO = '.';
    boolean finPartida = false;
    
     public Sujico() {  
        tamXTablero = 3;
        tamYTablero = 3;
        tablero = new char[tamXTablero][tamYTablero];
        for(int x=0; x<tamXTablero; x++) {
            for(int y=0; y<tamYTablero; y++) {
                tablero[x][y] = VACIO;
            }
        }
    }

    
    public void mostrarTableroConsola() {
        for(int y=0; y<tamYTablero; y++) {
            for(int x=0; x<tamXTablero; x++) {
                System.out.print(tablero[x][y]);
            }
            System.out.println();
        }    
        System.out.println();
    }
    
       
        int numeros[][]=new int[3][3];
        
        public void generarAleatorio() {
            for(int x=0;x<3;x++) {
                for (int y=0;y<3;y++) {
                numeros[x][y] = (int) (Math.random()*9+1);
                //System.out.print(numeros[x][y]);
                }
            }
        }
        
        public void mostrarTableroCompleto() {
        for(int y=0; y<3; y++) {
            for(int x=0; x<3; x++) {
                System.out.print(numeros[x][y]);
            }
            System.out.println();
        }    
        System.out.println();
        }
    
    }

