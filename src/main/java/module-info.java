module com.example.pacmannew1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;


    opens com.example.pacmannew1 to javafx.fxml;
    exports com.example.pacmannew1;
}