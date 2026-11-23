
package com.university;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class MainController {

    @FXML
    private StackPane centerPane;

    @FXML
    public void initialize() {
        showDashboard();
    }

    @FXML
    private void showDashboard() {

        Label welcomeLabel = new Label(
                "Welcome to the University Management System!\n\n"
                + "Manage student records easily."
        );

        welcomeLabel.setStyle(
                "-fx-font-size: 22px;"
                + "-fx-font-weight: bold;"
                + "-fx-text-alignment: center;"
        );

        centerPane.getChildren().setAll(welcomeLabel);
    }

    @FXML
    private void showStudents() {

        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(
                            "/com/university/StudentView.fxml"
                    )
            );

            Parent studentView = loader.load();

            centerPane.getChildren().setAll(studentView);

        } catch (IOException e) {

            e.printStackTrace();

            centerPane.getChildren().setAll(
                    new Label("Error loading Students screen: "
                            + e.getMessage())
            );
        }
    }
}

