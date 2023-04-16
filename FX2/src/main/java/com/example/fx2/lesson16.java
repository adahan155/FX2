package com.example.fx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class lesson16 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Circle circle = new Circle(50);
        circle.setCenterX(100);
        circle.setCenterY(100);
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        circle.centerXProperty().bind(pane.heightProperty().divide(2));
        circle.centerYProperty().bind(pane.widthProperty().divide(2));

        Scene scene = new Scene(pane, 400, 400);
        stage.setTitle("Property 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
