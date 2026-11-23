
package com.university;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {

    private final IntegerProperty id;
    private final StringProperty regNumber;
    private final StringProperty firstName;
    private final StringProperty lastName;

    public Student(int id, String regNumber, String firstName, String lastName) {
        this.id = new SimpleIntegerProperty(id);
        this.regNumber = new SimpleStringProperty(regNumber);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public StringProperty regNumberProperty() {
        return regNumber;
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getRegNumber() {
        return regNumber.get();
    }
}
