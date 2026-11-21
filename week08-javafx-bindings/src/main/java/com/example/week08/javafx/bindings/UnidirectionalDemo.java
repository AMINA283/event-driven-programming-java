
package com.example.week08.javafx.bindings;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UnidirectionalDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label instructionLabel = new Label("Enter your name:");

        TextField nameField = new TextField();

        Label greetingLabel = new Label();

        greetingLabel.textProperty().bind(
                nameField.textProperty().concat(", welcome!")
        );

        VBox root = new VBox(15,
                instructionLabel,
                nameField,
                greetingLabel
        );

        Scene scene = new Scene(root, 350, 200);

        primaryStage.setTitle("Unidirectional Binding Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

