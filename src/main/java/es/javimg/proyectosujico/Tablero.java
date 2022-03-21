package es.javimg.proyectosujico;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;




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
    
    TextField hueco1 = new TextField ();
    
    Font fuente=new Font("SansSerif", 29);
    
    hueco1.setLayoutX(20);
    hueco1.setLayoutY(20);
    hueco1.setMaxWidth(50);
    hueco1.setMinWidth(50);
    hueco1.setMaxHeight(50);
    hueco1.setMinHeight(50);
    hueco1.setFont(fuente);
    
    TextField hueco2 = new TextField ();
    
    hueco2.setLayoutX(20);
    hueco2.setLayoutY(127);
    hueco2.setMaxWidth(50);
    hueco2.setMinWidth(50);
    hueco2.setMaxHeight(50);
    hueco2.setMinHeight(50);
    hueco2.setFont(fuente);
    
    TextField hueco3 = new TextField ();
      
    hueco3.setLayoutX(227);
    hueco3.setLayoutY(127);
    hueco3.setMaxWidth(50);
    hueco3.setMinWidth(50);
    hueco3.setMaxHeight(50);
    hueco3.setMinHeight(50);
    hueco3.setFont(fuente);
    
    TextField hueco4 = new TextField ();
       
    hueco4.setLayoutX(20);
    hueco4.setLayoutY(227);
    hueco4.setMaxWidth(50);
    hueco4.setMinWidth(50);
    hueco4.setMaxHeight(50);
    hueco4.setMinHeight(50);
    hueco4.setFont(fuente);
    
    TextField hueco5 = new TextField ();
    
    hueco5.setLayoutX(227);
    hueco5.setLayoutY(227);
    hueco5.setMaxWidth(50);
    hueco5.setMinWidth(50);
    hueco5.setMaxHeight(50);
    hueco5.setMinHeight(50);
    hueco5.setFont(fuente);
    
    paneRoot.getChildren().add(hueco1);
    paneRoot.getChildren().add(hueco2);
    paneRoot.getChildren().add(hueco3);
    paneRoot.getChildren().add(hueco4);
    paneRoot.getChildren().add(hueco5);
    
    

     Button comprobar = new Button("comprobar");
     comprobar.setLayoutX(335);
     comprobar.setLayoutY(20);
     paneRoot.getChildren().add(comprobar);

     
    comprobar.setOnAction(new EventHandler() {
        @Override
        public void handle(Event event) {
            int num1 = Integer.parseInt( hueco1.getText());
            int num2 = Integer.parseInt( hueco2.getText());
            int num3 = Integer.parseInt( hueco3.getText());
            int num4 = Integer.parseInt( hueco4.getText());
            int num5 = Integer.parseInt( hueco5.getText());
            
            Label resul = new Label ();
            resul.setText("Enhorabuena,  has conseguido completar el tablero");
            resul.setLayoutX(20);
            resul.setLayoutY(320);
            Label resul1 = new Label ();
            resul1.setText("Lo siento, algun numero esta mal colocado");
            resul1.setLayoutX(20);
            resul1.setLayoutY(320);
            
            if( num1 == sujico.numeros [0][0] && num2 == sujico.numeros [0][1] && num3 == sujico.numeros [2][1] && num4 == sujico.numeros [0][2] && num5 == sujico.numeros [2][2] ){
                    resul1.setVisible(false);
                    paneRoot.getChildren().add(resul);
                    paneRoot.getChildren().add(resul1);
                    
            }else {
                    resul.setVisible(false);
                    paneRoot.getChildren().add(resul);  
                    paneRoot.getChildren().add(resul1);   
                            } 
            

        }
    });
}
 

        
    
}