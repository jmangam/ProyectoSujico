package es.javimg.proyectosujico;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {



    @Override
    public void start(Stage stage) {
        
        Pane paneRoot = new Pane();  //creacion de ventana con sus dimensiones y su nombre
        Scene scene = new Scene(paneRoot, 450, 450);
        stage.setScene(scene);
        stage.setTitle("JuegoJavi");
        stage.show();      
        
        Sujico sujico = new Sujico();
        Tablero tablero = new Tablero();
        
        sujico.generarAleatorio();
        sujico.mostrarTableroCompleto();
        sujico.mostrarSoluciones();
        sujico.tableroVisible();
        sujico.introducirDatos(2,2,2); //parametros para añadir numero al lugar al que pertenece //primer digito x//segundo digito y//tercer digito numero que quiero meter
        sujico.mostrarTableroVisible();
        sujico.comprobacionDatos(2,2);
        sujico.comprobacionTablero();
        tablero.montarTablero(paneRoot);
        tablero.rellenarTablero(paneRoot, sujico);

        if (sujico.comprobacionTablero() == true) { // if que determina si el tablero fue bien completado o no
            System.out.println("Has completado tu tablero exitosamente"); 
        } else {
            System.out.println("Tu tablero no esta bien completado");
        }
    }

    public static void main(String[] args) {
        launch();
    }

}