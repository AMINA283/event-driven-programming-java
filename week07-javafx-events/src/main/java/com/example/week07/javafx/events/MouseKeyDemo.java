
package com.example.week07.javafx.events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseKeyDemo extends Application {

    private static final double STEP = 15;

    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();

        Circle circle = new Circle(200, 150, 25);
        circle.setFill(Color.BLUE);

        Text coordinates = new Text(20, 30, "Move your mouse around");

        root.getChildren().addAll(circle, coordinates);

        root.setOnMouseMoved((MouseEvent e) -> {
            coordinates.setText(
                "Mouse X: " + (int) e.getX()
                + " | Mouse Y: " + (int) e.getY()
            );
        });

        root.setOnKeyPressed(e -> {

            if (e.getCode() == KeyCode.UP) {
                circle.setCenterY(circle.getCenterY() - STEP);
            } else if (e.getCode() == KeyCode.DOWN) {
                circle.setCenterY(circle.getCenterY() + STEP);
            } else if (e.getCode() == KeyCode.LEFT) {
                circle.setCenterX(circle.getCenterX() - STEP);
            } else if (e.getCode() == KeyCode.RIGHT) {
                circle.setCenterX(circle.getCenterX() + STEP);
            }
        });

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Mouse and Key Events");
        primaryStage.setScene(scene);
        primaryStage.show();

        root.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

