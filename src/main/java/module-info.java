module com.example.labs6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labs6 to javafx.fxml;
    exports com.example.labs6;
}