

package com.mycompany.week06_javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LayoutDemo extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("Student Dashboard");
        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        HBox header = new HBox(title);
        header.setAlignment(Pos.CENTER);
        header.setPadding(new Insets(20));
        header.setStyle("-fx-background-color: lightblue;");

        Label welcome = new Label("Welcome to your Dashboard!");
        welcome.setStyle("-fx-font-size: 20px;");

        Label description = new Label("Manage your student activities here.");

        VBox content = new VBox(15, welcome, description);
        content.setAlignment(Pos.CENTER);
        content.setPadding(new Insets(20));

        Button profileButton = new Button("My Profile");
        Button coursesButton = new Button("My Courses");
        Button settingsButton = new Button("Settings");

        VBox sidebar = new VBox(15,
                profileButton,
                coursesButton,
                settingsButton);

        sidebar.setPadding(new Insets(20));
        sidebar.setAlignment(Pos.TOP_CENTER);
        sidebar.setStyle("-fx-background-color: #eeeeee;");

        BorderPane root = new BorderPane();
        root.setTop(header);
        root.setLeft(sidebar);
        root.setCenter(content);

        Scene scene = new Scene(root, 700, 450);

        stage.setTitle("Student Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

