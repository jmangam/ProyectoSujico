package es.javimg.proyectosujico;


public class Sujico {
    
    short tamXTablero;
    short tamYTablero;
    char[][] tablero;
    
    static final char JUGADOR1 = '1';
    static final char JUGADOR2 = '2';
    final char VACIO = '.';
    boolean finPartida = false;
    boolean repetido = false;
    int solucion1;
    int solucion2;
    int solucion3;
    int solucion4;
    
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
        int numero = 0;
        boolean comprobacion = true;
        
        
        public void generarAleatorio() {
            for(int x=0;x<3;x++) {
                for (int y=0;y<3;y++) {
                    comprobacion = true;
                    while ( comprobacion == true ) {
                        numero = (int) (Math.random()*9+1);
                        comprobacion = this.comprobacionRepetidos(numero);
                        numeros [x][y] = numero;

                    }
                
                //numeros[x][y] = (int) (Math.random()*9+1);
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
    
        public boolean comprobacionRepetidos(int numero) {
            for(int y=0; y<3; y++) {
                for(int x=0; x<3; x++) {
                    if( numero == numeros[x][y] ) {
                        return true;
                    }
                }    
            }
            return false;
        }
        
        public void soluciones() {
            int[] soluciones = new int[4];
            
            soluciones[0] = numeros[0][0] + numeros[1][0] + numeros[0][1] + numeros[1][1];
            soluciones[1] = numeros[1][0] + numeros[2][0] + numeros[1][1] + numeros[2][1];
            soluciones[2] = numeros[0][1] + numeros[1][1] + numeros[0][2] + numeros[1][2];
            soluciones[3] = numeros[1][1] + numeros[2][1] + numeros[1][2] + numeros[2][2];
            
            System.out.println(soluciones[0]);
            System.out.println(soluciones[1]);
            System.out.println(soluciones[2]);
            System.out.println(soluciones[3]);

        }
    }
        

       