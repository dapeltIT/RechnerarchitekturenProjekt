module com.example.rechnerarchitekturenprojekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rechnerarchitekturenprojekt to javafx.fxml;
    exports com.example.rechnerarchitekturenprojekt;
}