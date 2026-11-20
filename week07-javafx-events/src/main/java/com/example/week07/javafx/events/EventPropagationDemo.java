
package com.example.week07.javafx.events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class EventPropagationDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label logLabel = new Label("Click the button...");
        Button btn = new Button("Click Me!");
        logLabel.setOnMouseClicked(e -> {
    System.out.println("LABEL: Label was clicked!");
});
        logLabel.setOnMouseClicked(e -> {
    System.out.println("LABEL: Label was clicked!");
});

        VBox root = new VBox(20, logLabel, btn);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        // Capturing phase
        root.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
            System.out.println("1. FILTER: Root intercepted the click!");
        });

        // Button handler
        btn.setOnMouseClicked(e -> {
            System.out.println("2. BUTTON: Button was clicked!");
            logLabel.setText("Button was clicked!");
        });

        // Bubbling phase
        root.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
    System.out.println("1. FILTER: Root intercepted the click!");
});
          
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Event Propagation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


