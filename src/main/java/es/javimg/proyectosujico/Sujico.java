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
    int[] soluciones = new int[4];
    int tablerovisible[][] = new int[3][3];
    int numero1;
    int numero2;
    int numero3;
    int contador;  
    
        int numeros[][]=new int[3][3];
        int numero = 0;
        boolean comprobacion = true;
        
        
        public void generarAleatorio() { //generamos numero aleatorio del 1 al 9
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
        
        public void mostrarTableroCompleto() { // muestra el tablero con todos sus digitos
        for(int y=0; y<3; y++) {
            for(int x=0; x<3; x++) {
                System.out.print(numeros[x][y]);
            }
            System.out.println();
        }    
        System.out.println();
        }
    
        public boolean comprobacionRepetidos(int numero) { // vamos comprobando que el numero que nos genera el metodo de arriba no este repetido
            for(int y=0; y<3; y++) {
                for(int x=0; x<3; x++) {
                    if( numero == numeros[x][y] ) {
                        return true;
                    }
                }    
            }
            return false;
        }
        
        public void generarSoluciones() { // genera las soluciones del juego
            
            soluciones[0] = numeros[0][0] + numeros[1][0] + numeros[0][1] + numeros[1][1];
            soluciones[1] = numeros[1][0] + numeros[2][0] + numeros[1][1] + numeros[2][1];
            soluciones[2] = numeros[0][1] + numeros[1][1] + numeros[0][2] + numeros[1][2];
            soluciones[3] = numeros[1][1] + numeros[2][1] + numeros[1][2] + numeros[2][2];
            

        }
        
        public void mostrarSoluciones() { //muestra las soluciones que calculamos arriba
            
            System.out.println(soluciones[0]);
            System.out.println(soluciones[1]);
            System.out.println(soluciones[2]);
            System.out.println(soluciones[3]);
            
        }
        
        public void tableroVisible() { //genera lo que el usuario vera al comenzar el juego

            tablerovisible [1][0] =  numeros [1][0];
            tablerovisible [2][0] =  numeros [2][0];
            tablerovisible [1][1] =  numeros [1][1];
            tablerovisible [1][2] =  numeros [1][2];
            
        }
        public void mostrarTableroVisible() { //genera lo que el usuario vera al comenzar el juego
            
            for(int y=0; y<3; y++) {
                for(int x=0; x<3; x++) {
                    System.out.print(tablerovisible[x][y]);
                }
                System.out.println();
            }    
            System.out.println();
            
        }
        
        
        public void introducirDatos(int x, int y, int numero) { // añade al array que ve el usuario el numero que se le añada por valores
            
            tablerovisible [x][y] = numero;
        }
        
        public void comprobacionDatos(int x, int y) { // esto es una comprobacion de si el numero colocado esta bien colocado o no
            
            if(tablerovisible [x][y] == numeros [x][y]) {
               System.out.println("El numero que has seleccionado es correcto en la casilla correspondiente");
            } else {
               System.out.println("El numero que has seleccionado  no es correcto en la casilla correspondiente");
            }
        }
        
        public boolean comprobacionTablero() { //en este metodo vamos comprobando si los numeros han sido colocados correctamente

            for(int y=0; y<3; y++) {
                for(int x=0; x<3; x++) {
                    if(tablerovisible [x][y] == numeros [x][y]){
                    contador++;   
                    }
                }                  
            }  
            
            if(contador == 9){ // cada vez que un numero haya sido acertado suma 1 el contador, como son 9 numeros cuando llege a nueve habras ganado
                return true; 
            } else {
                return false;
            }
        }
    }
        

       