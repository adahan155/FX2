package com.example.fx2;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class lesson25 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();
        Slider sliderH = new Slider();
        Slider sliderV = new Slider();
        sliderH.setValue(100);
        sliderV.setMax(100);
        sliderH.setValue(0);
        sliderV.setValue(0);
        sliderH.setShowTickLabels(true);
        sliderV.setShowTickLabels(true);
        sliderH.setShowTickMarks(true);
        sliderV.setShowTickMarks(true);
        sliderV.setOrientation(Orientation.VERTICAL);

        Pane pane = new Pane();
        Text text = new Text("Map");
        text.setX(20);
        text.setY(20);
        pane.getChildren().add(text);

        text.xProperty().bind(sliderH.valueProperty().multiply(4));
        text.yProperty().bind(sliderV.valueProperty().multiply(4));

        borderPane.setCenter(pane);
        borderPane.setBottom(sliderH);
        borderPane.setRight(sliderV);

        Scene scene = new Scene(borderPane, 400, 400);
        stage.setTitle("ScrollBar");
        stage.setScene(scene);
        stage.show();

    }
}
