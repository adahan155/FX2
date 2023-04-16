package com.example.fx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class lesson7 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Circle circle= new Circle(50);
        circle.setCenterX(100);
        circle.setCenterY(100);

        Pane pane = new Pane();
        pane.getChildren().add(circle);


        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Circle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}