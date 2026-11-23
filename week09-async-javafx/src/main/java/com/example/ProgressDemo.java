
package com.example;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProgressDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label statusLabel = new Label("Ready");
        ProgressBar progressBar = new ProgressBar(0);
        progressBar.setPrefWidth(300);

        Button startButton = new Button("Start Download");

        startButton.setOnAction(e -> {

            startButton.setDisable(true);
            statusLabel.setText("Downloading...");

            Task<Void> task = new Task<>() {
                @Override
                protected Void call() throws Exception {

                    for (int i = 1; i <= 10; i++) {

                        Thread.sleep(500);

                        updateProgress(i, 10);
                        updateMessage("Downloaded " + (i * 10) + "%");
                    }

                    return null;
                }
            };

            progressBar.progressProperty().bind(task.progressProperty());
            statusLabel.textProperty().bind(task.messageProperty());

            task.setOnSucceeded(event -> {
                statusLabel.textProperty().unbind();
                progressBar.progressProperty().unbind();

                statusLabel.setText("Download Complete!");
                progressBar.setProgress(1);
                startButton.setDisable(false);
            });

            task.setOnFailed(event -> {
                statusLabel.textProperty().unbind();
                progressBar.progressProperty().unbind();

                statusLabel.setText("Download Failed!");
                startButton.setDisable(false);
            });

            Thread thread = new Thread(task);
            thread.setDaemon(true);
            thread.start();
        });

        VBox root = new VBox(20, startButton, progressBar, statusLabel);
        root.setStyle("-fx-padding: 25; -fx-alignment: center;");

        Scene scene = new Scene(root, 450, 220);

        primaryStage.setTitle("Progress Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

