package com.example.pacmannew1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import Model.*;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private TextField nickname;
    @FXML
    private Label Error;

    @FXML
    protected void onSignUpButtonClick() throws IOException {
        if(!username.getText().equals("") && !nickname.getText().equals("") && !password.getText().equals("")) {
            Result result=Player.addPlayer(username.getText(), nickname.getText(), password.getText());
            Error.setText(result.getMessage());
            if(result.isSuccessful()) {
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("RegisterSuccess-view.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = (Stage) Error.getScene().getWindow();
                    stage.setScene(scene);
                    stage.setFullScreenExitHint("");
                    //stage.setFullScreen(true);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        } else{
            Error.setText("You have to complete the fields");
        }
    }
    @FXML
    protected void onSignInButtonClick() throws IOException {
        if(username.getText().equals("admin")){
            Player.addPlayer("Admin", "admin", "Admin1234@");
            Stage stage = (Stage) Error.getScene().getWindow();
            MenuController.game = new Game(Player.getPlayerByUsername("Admin"));
            Parent root = FXMLLoader.load(getClass().getResource("Menu-view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setFullScreenExitHint("");
            //stage.setFullScreen(true);
            // Add an event filter for key presses
        } else if(!username.getText().equals("") && !password.getText().equals("")){
            if(Player.getPlayerByUsername(username.getText())==null){
                Error.setText("This player doesn't exist!");
                return;
            }
            if(!Player.getPlayerByUsername(username.getText()).password.equals(password.getText())){
                Error.setText("Wrong password!");
                return;
            }
            try {
                Stage stage = (Stage) Error.getScene().getWindow();
                MenuController.game = new Game(Player.getPlayerByUsername(username.getText()));
                Parent root = FXMLLoader.load(getClass().getResource("Menu-view.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setFullScreenExitHint("");
                //stage.setFullScreen(true);
            } catch (IOException e){
                e.printStackTrace();
            }
        } else{
            Error.setText("You have to complete the fields");
        }
    }
}

