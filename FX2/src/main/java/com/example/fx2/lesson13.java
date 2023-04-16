package com.example.fx2;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.IOException;

public class lesson13 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();
        Image image = new Image(new FileInputStream("C:\\Users\\User\\FX2\\src\\main\\java\\com\\example\\fx2\\2.jpg.png"));
        ImageView imageView = new ImageView(image);
        pane.getChildren().add(imageView);

        FadeTransition ft = new FadeTransition(Duration.millis(3000), imageView);
        ft.setFromValue(1.0);
        ft.setCycleCount(Animation.INDEFINITE);
        ft.setToValue(0.0);
        ft.setAutoReverse(true);
        ft.play();

        Scene scene = new Scene(pane, 400, 400);
        stage.setTitle("Fade Transition");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}