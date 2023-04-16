package com.example.fx2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class lesson18  extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        CheckBox checkBox1 =  new CheckBox("Yes");
        CheckBox checkBox2 = new CheckBox("No");
        Text text = new Text();
        pane.getChildren().addAll(checkBox1 , checkBox2, text);
        checkBox1.setLayoutX(20);
        checkBox1.setLayoutY(20);
        checkBox2.setLayoutX(20);
        checkBox2.setLayoutY(40);
        text.setX(20);
        text.setY(80);

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(checkBox1.isSelected() && !checkBox2.isSelected())
                    text.setText("Yes is Selected");
                else if(checkBox1.isSelected() && checkBox2.isSelected())
                    text.setText("Yes and No are selected");
                else if(checkBox1.isSelected() && checkBox2.isSelected())
                    text.setText("No is selected");
                else text.setText("Nothing is Selected");
            }
        };

        checkBox1.setOnAction(handler);
        checkBox2.setOnAction(handler);

        Scene scene = new Scene(pane, 400, 400);
        stage.setTitle("Checkbox");
        stage.setScene(scene);
        stage.show();

    }
}
