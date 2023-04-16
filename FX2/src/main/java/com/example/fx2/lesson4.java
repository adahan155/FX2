package com.example.fx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class lesson4 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Circle circle= new Circle(50);
        //circle.setCenterX(100);
        //circle.setCenterY(100);
        circle.setFill(Color.BLUE);
        //circle.setStroke(Color.RED);
        //circle.setStrokeWidth(20);

        Text text = new Text("ABC");
        //text.setX(200);
        //text.setY(200);
        text.setFill(Color.BROWN);
        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
        text.setFont(font);

        Rectangle rectangle = new Rectangle(100,100,100,100);

        HBox pane = new HBox();
        pane.getChildren().add(circle);
        pane.getChildren().add(text);
        pane.getChildren().add(rectangle);


        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("HBox, Vbox, FlowPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}