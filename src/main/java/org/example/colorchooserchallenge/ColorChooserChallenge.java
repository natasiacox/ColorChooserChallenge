package org.example.colorchooserchallenge;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ColorChooserChallenge extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ColorChooserChallenge.class.getResource("ColorChooserChallenge.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 375, 300);
        stage.setTitle("ColorChooser Challenge");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}