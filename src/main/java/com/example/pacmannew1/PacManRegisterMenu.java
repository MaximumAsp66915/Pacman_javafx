package com.example.pacmannew1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PacManRegisterMenu extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PacManRegisterMenu.class.getResource("PacManRegister-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("RegisterMenu");
        stage.setScene(scene);
        //stage.setFullScreen(true);
        stage.setFullScreenExitHint("");
        stage.show();
    }

    public static void main(String[] args) {

        //System.out.println("JavaFX version: " + System.getProperty("javafx.runtime.version"));
        launch();
    }
}
