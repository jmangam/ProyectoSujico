package es.javimg.proyectosujico;

import java.util.function.UnaryOperator;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
import javafx.scene.layout.Pane;
import javafx.util.converter.IntegerStringConverter;




public class Tablero{

Cuadrado cuadrado = new Cuadrado();
Circulo circulo = new Circulo();



    int x=100;
    int y=100;
    int xc=500;
    int yc=250;
    
    public void montarTablero(Pane paneRoot){ // metodo encargado de montar el tablero por pantalla
                   
        for(int x=0; x<300; x+=100) { //este for hace todos los cuadrados por pantalla
            for(int y=0; y<300; y+=100) {
                cuadrado.crearCuadrado(paneRoot, x, y);
            }
        }  
        
        for(int xc=100; xc<300; xc+=100) { // este for crea los circulos de las soluciones
            for(int yc=100; yc<300; yc+=100) {
                circulo.crearCirculo(paneRoot, xc, yc);
            }
        } 
        
    }
    
    public void rellenarTablero(Pane paneRoot,  Sujico sujico) { // este se encarga de añadir los valores del array al tablero
 
            
                    Label resultado0 = new Label (String.valueOf(sujico.soluciones[0]));
                    resultado0.setLayoutX(93);
                    resultado0.setLayoutY(90);
                    resultado0.setScaleX(3);
                    resultado0.setScaleY(3);
                    paneRoot.getChildren().add(resultado0);
        
                    Label resultado1 = new Label (String.valueOf(sujico.soluciones[1]));
                    resultado1.setLayoutX(195);
                    resultado1.setLayoutY(90);
                    resultado1.setScaleX(3);
                    resultado1.setScaleY(3);
                    paneRoot.getChildren().add(resultado1);
                    
                    Label resultado2 = new Label (String.valueOf(sujico.soluciones[2]));
                    resultado2.setLayoutX(93);
                    resultado2.setLayoutY(190);
                    resultado2.setScaleX(3);
                    resultado2.setScaleY(3);
                    paneRoot.getChildren().add(resultado2);
                    
                    Label resultado3 = new Label (String.valueOf(sujico.soluciones[3]));
                    resultado3.setLayoutX(195);
                    resultado3.setLayoutY(190);
                    resultado3.setScaleX(3);
                    resultado3.setScaleY(3);
                    paneRoot.getChildren().add(resultado3);
        
                    
                    
                    
                    
                    
                    
                    Label label01 = new Label (String.valueOf(sujico.tablerovisible[1][0]));
                    label01.setLayoutX(145);
                    label01.setLayoutY(40);
                    label01.setScaleX(5);
                    label01.setScaleY(5);
                    paneRoot.getChildren().add(label01);
                    
                    Label label02 = new Label (String.valueOf(sujico.tablerovisible[2][0]));
                    label02.setLayoutX(250);
                    label02.setLayoutY(40);
                    label02.setScaleX(5);
                    label02.setScaleY(5);
                    paneRoot.getChildren().add(label02);
                    
                    Label label03 = new Label (String.valueOf(sujico.tablerovisible[1][1]));
                    label03.setLayoutX(145);
                    label03.setLayoutY(140);
                    label03.setScaleX(5);
                    label03.setScaleY(5);
                    paneRoot.getChildren().add(label03);
                    
                    Label label04 = new Label (String.valueOf(sujico.tablerovisible[1][2]));
                    label04.setLayoutX(145);
                    label04.setLayoutY(245);
                    label04.setScaleX(5);
                    label04.setScaleY(5);
                    paneRoot.getChildren().add(label04);
    }
    public void generaImputs(Pane paneRoot,  Sujico sujico) {
    
    TextField textField = new TextField ();
    
    UnaryOperator<Change> integerFilter = change -> {
    String newText = change.getControlNewText();
    System.out.println("newText " + newText);
        if (newText.matches("-?([0-9]*)?")) {
            return change;
        }
            return null;
        };
    
    textField.setLayoutX(37);
    textField.setLayoutY(37);
    textField.setMaxWidth(40);
    textField.setMinWidth(40);
    textField.setMaxHeight(40);
    textField.setMinHeight(40);
    paneRoot.getChildren().add(textField);
    }


        
    
}