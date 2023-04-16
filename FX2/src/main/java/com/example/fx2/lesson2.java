package com.example.fx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class lesson2 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();
        Text text = new Text("Dollar");
        javafx.scene.paint.Color color = new javafx.scene.paint.Color(1.0,0.,0, 1.0);
        text.setFill(color);
        text.setX(200);
        text.setY(200);
        pane.getChildren().add(text);

        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Color");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}