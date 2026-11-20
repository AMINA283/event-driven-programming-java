
package com.example.week07.javafx.events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DragDropDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label dragLabel = new Label("Drag Me!");
        dragLabel.setStyle(
            "-fx-font-size: 18px;"
            + "-fx-padding: 15;"
            + "-fx-background-color: lightblue;"
        );

        Rectangle dropTarget = new Rectangle(200, 120);
        dropTarget.setFill(Color.LIGHTGRAY);
        dropTarget.setStroke(Color.BLACK);

        Label statusLabel = new Label("Drag the label into the rectangle");

        VBox root = new VBox(20, dragLabel, dropTarget, statusLabel);
        root.setStyle("-fx-padding: 25; -fx-alignment: center;");

        // Start dragging
        dragLabel.setOnDragDetected(e -> {
            ClipboardContent content = new ClipboardContent();
            content.putString("Hello from Drag and Drop!");

            dragLabel.startDragAndDrop(TransferMode.MOVE)
                     .setContent(content);

            e.consume();
        });

        // Allow the rectangle to receive the dragged content
        dropTarget.setOnDragOver(e -> {
            if (e.getGestureSource() != dropTarget
                    && e.getDragboard().hasString()) {
                e.acceptTransferModes(TransferMode.MOVE);
            }

            e.consume();
        });

        // Highlight the rectangle when the label enters it
        dropTarget.setOnDragEntered(e -> {
            if (e.getDragboard().hasString()) {
                dropTarget.setFill(Color.LIGHTGREEN);
            }

            e.consume();
        });

        // Restore the rectangle's colour when the drag leaves
        dropTarget.setOnDragExited(e -> {
            dropTarget.setFill(Color.LIGHTGRAY);
            e.consume();
        });

        // Complete the drop
        dropTarget.setOnDragDropped(e -> {
            boolean success = false;

            if (e.getDragboard().hasString()) {
                statusLabel.setText("Dropped successfully!");
                success = true;
            }

            e.setDropCompleted(success);
            e.consume();
        });

        Scene scene = new Scene(root, 450, 400);

        primaryStage.setTitle("JavaFX Drag and Drop");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

