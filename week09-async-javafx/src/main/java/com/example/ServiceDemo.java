
package com.example;

import javafx.application.Application;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ServiceDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label statusLabel = new Label("Ready");
        ProgressBar progressBar = new ProgressBar(0);
        progressBar.setPrefWidth(300);

        Button startButton = new Button("Start Service");
        Button cancelButton = new Button("Cancel");

        Service<Void> service = new Service<>() {

            @Override
            protected Task<Void> createTask() {

                return new Task<>() {

                    @Override
                    protected Void call() throws Exception {

                        for (int i = 1; i <= 10; i++) {

                            if (isCancelled()) {
                                break;
                            }

                            Thread.sleep(500);

                            updateProgress(i, 10);
                            updateMessage("Working... " + (i * 10) + "%");
                        }

                        return null;
                    }
                };
            }
        };

        progressBar.progressProperty().bind(service.progressProperty());
        statusLabel.textProperty().bind(service.messageProperty());

        startButton.setOnAction(e -> {
            service.reset();
            service.start();
        });

        cancelButton.setOnAction(e -> service.cancel());

        service.setOnSucceeded(e -> {
            statusLabel.textProperty().unbind();
            statusLabel.setText("Service Completed!");
        });

        service.setOnCancelled(e -> {
            statusLabel.textProperty().unbind();
            statusLabel.setText("Service Cancelled!");
        });

        VBox root = new VBox(20, startButton, cancelButton,
                progressBar, statusLabel);

        root.setStyle("-fx-padding: 25; -fx-alignment: center;");

        Scene scene = new Scene(root, 450, 250);

        primaryStage.setTitle("JavaFX Service Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

