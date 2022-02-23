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
        sujico.mostrarTableroConsola();
        sujico.generarAleatorio();
        sujico.mostrarTableroCompleto();
    }

    public static void main(String[] args) {
        launch();
    }

}