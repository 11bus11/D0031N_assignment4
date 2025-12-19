module com.uppg4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.uppg4 to javafx.fxml;
    exports com.uppg4;
}
