module com.mycompany.week06.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.mycompany.week06_javafx;
    opens com.mycompany.week06_javafx to javafx.fxml;
}
