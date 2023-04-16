package com.example.fx2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class lesson10 extends Application {
    private Circle circle;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Circle circle = new Circle(50);
        circle.setFill(Color.BLUE);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(circle);

        Button button = new Button("Change");
        StackPane stackPane2 = new StackPane();
        stackPane2.getChildren().add(button);
        button.setOnAction(new ButtonListener());

        BorderPane pane = new BorderPane();
        pane.setCenter(stackPane);
        pane.setBottom(stackPane2);

        Scene scene = new Scene(pane, 400, 400);
        stage.setTitle("Button");
        stage.setScene(scene);
        stage.show();
    }

    class ButtonListener implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent activeEvent) {
            if(circle.getRadius() == 0) circle.setRadius(100);
            else {
                circle.setRadius(circle.getRadius() - 10);
            }

        }
    }
}
