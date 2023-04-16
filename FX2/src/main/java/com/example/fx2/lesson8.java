package com.example.fx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class lesson8 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Circle circle= new Circle(50);
        circle.setFill(Color.BLUE);

        Text text = new Text("ABC");
        text.setFill(Color.BROWN);
        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
        text.setFont(font);

        Rectangle rectangle = new Rectangle(100,100,100,100);

        javafx.scene.layout.GridPane pane = new javafx.scene.layout.GridPane();
        pane.add(circle,0,0);
        pane.add(text,1,0);
        pane.add(rectangle,0,1);


        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("GridPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}