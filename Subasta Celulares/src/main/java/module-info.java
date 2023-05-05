module com.example.subastacelulares {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.subastacelulares to javafx.fxml;
    exports com.example.subastacelulares;
}