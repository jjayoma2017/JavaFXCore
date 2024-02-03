module mavenfx {
    requires javafx.controls;
    requires  javafx.fxml;

    opens com.jtj.mavenfx to javafx.fxml;
    exports com.jtj.mavenfx;
}