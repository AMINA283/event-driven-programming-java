
package com.university;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.concurrent.Task;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentController {

    @FXML
    private TextField regField;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private Button saveButton;

    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> colReg;

    @FXML
    private TableColumn<Student, String> colFirst;

    @FXML
    private TableColumn<Student, String> colLast;

    @FXML
    private Label statusLabel;

    private final ObservableList<Student> studentList =
            FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        colReg.setCellValueFactory(
                new PropertyValueFactory<>("regNumber"));

        colFirst.setCellValueFactory(
                new PropertyValueFactory<>("firstName"));

        colLast.setCellValueFactory(
                new PropertyValueFactory<>("lastName"));

        studentTable.setItems(studentList);

        saveButton.disableProperty().bind(
                regField.textProperty().isEmpty()
                .or(firstNameField.textProperty().isEmpty())
                .or(lastNameField.textProperty().isEmpty())
        );

        loadStudents();
    }

    @FXML
    private void handleSaveStudent() {

        String reg = regField.getText().trim();
        String first = firstNameField.getText().trim();
        String last = lastNameField.getText().trim();

        Task<Void> saveTask = new Task<>() {

            @Override
            protected Void call() throws Exception {

                String sql = "INSERT INTO students "
                        + "(registration_number, first_name, last_name, email) "
                        + "VALUES (?, ?, ?, ?)";

                try (Connection conn = DatabaseUtil.getConnection();
                     PreparedStatement stmt = conn.prepareStatement(sql)) {

                    stmt.setString(1, reg);
                    stmt.setString(2, first);
                    stmt.setString(3, last);
                    stmt.setString(4, reg + "@university.edu");

                    stmt.executeUpdate();
                }

                return null;
            }
        };

        saveTask.setOnRunning(event ->
                statusLabel.setText("Saving student..."));

        saveTask.setOnSucceeded(event -> {

            statusLabel.setText("Student saved successfully!");

            regField.clear();
            firstNameField.clear();
            lastNameField.clear();

            loadStudents();
        });

        saveTask.setOnFailed(event -> {

            Throwable error = saveTask.getException();

            statusLabel.setText(
                    "Error saving student: " + error.getMessage());
        });

        Thread thread = new Thread(saveTask);
        thread.setDaemon(true);
        thread.start();
    }

    private void loadStudents() {

        LoadStudentsTask loadTask = new LoadStudentsTask();

        loadTask.setOnSucceeded(event -> {

            studentList.setAll(loadTask.getValue());

            statusLabel.setText(
                    "Students loaded: " + studentList.size());
        });

        loadTask.setOnFailed(event -> {

            statusLabel.setText(
                    "Error loading students: "
                    + loadTask.getException().getMessage());
        });

        Thread thread = new Thread(loadTask);
        thread.setDaemon(true);
        thread.start();
    }
}

