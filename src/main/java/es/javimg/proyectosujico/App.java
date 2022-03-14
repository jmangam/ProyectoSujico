package es.javimg.proyectosujico;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    BorderPane paneRoot;

    @Override
    public void start(Stage stage) {
        
        short tamXPantalla = 640;
        short tamYPantalla = 480;
        
        paneRoot = new BorderPane();
        var scene = new Scene(paneRoot, tamXPantalla, tamYPantalla);
        stage.setScene(scene);
        stage.show();
                
        
        Sujico sujico = new Sujico();
        Tablero tablero = new Tablero();
        
        sujico.mostrarTableroConsola();
        sujico.generarAleatorio();
        sujico.mostrarTableroCompleto();
        //sujico.mostrarSoluciones();
        sujico.tableroVisible();
        sujico.introducirDatos(2,2,2);
        sujico.mostrarTableroVisible();
        sujico.comprobacionDatos(2,2);
        sujico.comprobacionTablero();
        tablero.tablero(paneRoot);

        if (sujico.comprobacionTablero() == true) {
            System.out.println("Has completado tu tablero exitosamente"); 
        } else {
            System.out.println("Tu tablero no esta bien completado");
        }
    }

    public static void main(String[] args) {
        launch();
    }

}