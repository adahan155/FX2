package com.example.fx2;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class lesson24 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();
        ScrollBar scrollBarV = new ScrollBar();
        scrollBarV.setOrientation(Orientation.VERTICAL);
        ScrollBar scrollBarH = new ScrollBar();

        Pane pane = new Pane();
        Text text = new Text("Map");
        text.setX(20);
        text.setY(20);
        pane.getChildren().add(text);

        borderPane.setCenter(pane);
        borderPane.setBottom(scrollBarH);
        borderPane.setRight(scrollBarV);

        text.xProperty().bind(scrollBarH.valueProperty());
        text.yProperty().bind(scrollBarH.valueProperty());

        Scene scene = new Scene(borderPane, 400, 400);
        stage.setTitle("ScrollBar");
        stage.setScene(scene);
        stage.show();

    }
}
