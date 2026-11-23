
package com.example;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TaskDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label statusLabel = new Label("Ready");
        Button startButton = new Button("Start Background Task");

        startButton.setOnAction(e -> {

            startButton.setDisable(true);
            statusLabel.setText("Processing in background...");

            Task<Void> task = new Task<>() {
                @Override
                protected Void call() throws Exception {

                    // Simulate a long-running operation
                    Thread.sleep(5000);

                    return null;
                }
            };

            task.setOnSucceeded(event -> {
                statusLabel.setText("Done! UI remained responsive.");
                startButton.setDisable(false);
            });

            task.setOnFailed(event -> {
                statusLabel.setText("Task failed!");
                startButton.setDisable(false);
            });

            Thread backgroundThread = new Thread(task);
            backgroundThread.setDaemon(true);
            backgroundThread.start();
        });

        VBox root = new VBox(20, startButton, statusLabel);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Background Task Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

