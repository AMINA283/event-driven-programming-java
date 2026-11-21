
package com.example.week08.javafx.bindings;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ReactiveFormApp extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Input fields
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");

        TextField emailField = new TextField();
        emailField.setPromptText("Enter your email");

        TextArea bioField = new TextArea();
        bioField.setPromptText("Write a short biography...");
        bioField.setPrefRowCount(4);

        // Character counter
        Label charCountLabel = new Label();

        charCountLabel.textProperty().bind(
                bioField.textProperty().length()
                        .asString()
                        .concat(" / 150 characters")
        );

        // Live preview
        Label previewLabel = new Label();

        previewLabel.textProperty().bind(
                Bindings.concat(
                        "Name: ", nameField.textProperty(),
                        "\nEmail: ", emailField.textProperty(),
                        "\nBio: ", bioField.textProperty()
                )
        );

        // Submit button
        Button submitButton = new Button("Submit Registration");

        // Disable button when details are invalid
        
submitButton.disableProperty().bind(
        Bindings.createBooleanBinding(
                () -> nameField.getText().isEmpty()
                        || emailField.getText().isEmpty()
                        || !emailField.getText().contains("@")
                        || bioField.getText().length() > 150,
                nameField.textProperty(),
                emailField.textProperty(),
                bioField.textProperty()
        )
);


        // Submit action
        submitButton.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Registration Successful");
            alert.setHeaderText("Welcome, " + nameField.getText() + "!");
            alert.setContentText("Your registration has been submitted.");
            alert.showAndWait();
        });

        // Form layout
        GridPane formGrid = new GridPane();
        formGrid.setHgap(10);
        formGrid.setVgap(12);

        formGrid.add(new Label("Full Name:"), 0, 0);
        formGrid.add(nameField, 1, 0);

        formGrid.add(new Label("Email:"), 0, 1);
        formGrid.add(emailField, 1, 1);

        formGrid.add(new Label("Biography:"), 0, 2);
        formGrid.add(bioField, 1, 2);

        formGrid.add(charCountLabel, 1, 3);

        Label previewHeading = new Label("Live Preview:");
        
        VBox root = new VBox(
                15,
                new Label("Registration Form"),
                formGrid,
                previewHeading,
                previewLabel,
                submitButton
        );

        root.setStyle("-fx-padding: 20;");

        Scene scene = new Scene(root, 550, 450);

        primaryStage.setTitle("Reactive Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

