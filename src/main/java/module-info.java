module org.example.colorchooserchallenge {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.colorchooserchallenge to javafx.fxml;
    exports org.example.colorchooserchallenge;
}