
package com.example.week07.javafx.events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CustomEventDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label titleLabel = new Label("Login Application");

        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter your username");

        Button loginButton = new Button("Login");

        Label welcomeLabel = new Label("Please login to continue.");

        VBox root = new VBox(
                15,
                titleLabel,
                usernameField,
                loginButton,
                welcomeLabel
        );

        root.setStyle(
                "-fx-padding: 30;"
                + "-fx-alignment: center;"
        );

        // Listen for the custom login success event
        root.addEventHandler(
                LoginSuccessEvent.LOGIN_SUCCESS,
                event -> {
                    welcomeLabel.setText(
                            "Welcome, " + usernameField.getText() + "!"
                    );

                    usernameField.clear();
                    System.out.println("Custom login event received!");
                }
        );

        // Fire the custom event when Login is clicked
        loginButton.setOnAction(event -> {
            if (!usernameField.getText().trim().isEmpty()) {
                root.fireEvent(new LoginSuccessEvent());
            } else {
                welcomeLabel.setText("Please enter your username.");
            }
        });

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Custom JavaFX Events");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

