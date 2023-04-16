package com.example.fx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class lesson9 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Circle circle= new Circle(50);
        circle.setFill(Color.BLUE);

        Text text = new Text("ABC");
        text.setFill(Color.BROWN);
        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
        text.setFont(font);

        Rectangle rectangle = new Rectangle(100,100,100,100);

        BorderPane borderPane = new BorderPane();
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(circle);
        stackPane.getChildren().add(text);
        borderPane.setCenter(stackPane);


        Scene scene = new Scene(borderPane, 320, 240);
        stage.setTitle("BorderPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}