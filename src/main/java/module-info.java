module com.example.tuan2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tuan2 to javafx.fxml;
    exports com.example.tuan2;
}