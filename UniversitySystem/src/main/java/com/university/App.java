
package com.university;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private ScheduledExecutorService scheduler;

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/com/university/MainView.fxml")
        );

        Scene scene = new Scene(loader.load(), 900, 600);

        primaryStage.setTitle("University Management System");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Scheduled task: heartbeat every 5 seconds
        scheduler = Executors.newSingleThreadScheduledExecutor();

        scheduler.scheduleAtFixedRate(() -> {
            System.out.println(
                    "System Heartbeat: Checking for updates at "
                    + LocalDateTime.now()
            );
        }, 0, 5, TimeUnit.SECONDS);
    }

    @Override
    public void stop() {

        if (scheduler != null) {
            scheduler.shutdown();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

