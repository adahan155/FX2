package com.example.fx2;

import javafx.application.Application;
import javafx.event.EventHandler;;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class lesson11 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();
        Text text = new Text("Life is beautiful");
        text.setX(200);
        text.setY(200);
        text.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                text.setX(mouseEvent.getX());
                text.setX(mouseEvent.getX());
            }
        });

        pane.getChildren().add(text);
        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Text class");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}