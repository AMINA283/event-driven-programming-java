
package com.example.week08.javafx.bindings;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class BidirectionalDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label sliderLabel = new Label("Adjust the slider:");

        Slider slider = new Slider(0, 100, 50);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);

        Label ageLabel = new Label("Enter your age:");

        TextField ageField = new TextField("50");

        // Bidirectional binding
        ageField.textProperty().bindBidirectional(
                slider.valueProperty(),
                new NumberStringConverter()
        );

        VBox root = new VBox(15,
                sliderLabel,
                slider,
                ageLabel,
                ageField
        );

        root.setStyle("-fx-padding: 20;");

        Scene scene = new Scene(root, 400, 250);

        primaryStage.setTitle("Bidirectional Binding Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

