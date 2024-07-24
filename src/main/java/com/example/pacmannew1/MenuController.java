package com.example.pacmannew1;
import Model.Game;
import Model.Player;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    public static Game game ;

    public static Button newExitBtn ;

    @FXML
    private Button Exit;

    @FXML
    private Label bestTimeLabel;

    @FXML
    private Label coinsLabel;

    @FXML
    private Label experienceLabel;

    @FXML
    private Label extraLabel;

    @FXML
    private Label firstPlayerLabel;

    @FXML
    private Label highscoreLabel;

    @FXML
    private Label levelLabel;

    @FXML
    private Button map1Btn;

    @FXML
    private Button map2Btn;

    @FXML
    private Button map3Btn;

    @FXML
    private Button map4Btn;

    @FXML
    private Button map5Btn;

    @FXML
    private Label nicknameLabel;

    @FXML
    private Label secondPlayerLabel;

    @FXML
    private Label thirdPlayerLabel;

    @FXML
    private Label usernameLabel;

    @FXML
    void Exit(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void logout(ActionEvent event) {
        try {
            Stage stage = (Stage) newExitBtn.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("PacManRegister-view.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreenExitHint("");
        //stage.setFullScreen(true);
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    @FXML
    void map1play(ActionEvent event) {
        try {
            Stage stage = (Stage) newExitBtn.getScene().getWindow();
            GameController controller = new GameController();
            GameController.game = game;
            GameOverController.mapUrl = "Game1-view.fxml" ;
            Parent root = FXMLLoader.load(getClass().getResource(GameOverController.mapUrl));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setFullScreenExitHint("");
            //stage.setFullScreen(true);
            controller.initialGame(scene);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void map2play(ActionEvent event) {
        try {
            Stage stage = (Stage) newExitBtn.getScene().getWindow();
            GameController controller = new GameController();
            GameController.game = game;
            GameOverController.mapUrl = "Game2-view.fxml" ;
            Parent root = FXMLLoader.load(getClass().getResource(GameOverController.mapUrl));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setFullScreenExitHint("");
            //stage.setFullScreen(true);
            controller.initialGame(scene);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void map3play(ActionEvent event) {
        try {
            Stage stage = (Stage) newExitBtn.getScene().getWindow();
            GameController controller = new GameController();
            GameController.game = game;
            GameOverController.mapUrl = "Game3-view.fxml" ;
            Parent root = FXMLLoader.load(getClass().getResource(GameOverController.mapUrl));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setFullScreenExitHint("");
            //stage.setFullScreen(true);
            controller.initialGame(scene);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void map4play(ActionEvent event) {
        try {
            Stage stage = (Stage) newExitBtn.getScene().getWindow();
            GameController controller = new GameController();
            GameController.game = game;
            GameOverController.mapUrl = "Game4-view.fxml" ;
            Parent root = FXMLLoader.load(getClass().getResource(GameOverController.mapUrl));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setFullScreenExitHint("");
            //stage.setFullScreen(true);
            controller.initialGame(scene);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void map5play(ActionEvent event) {
        try {
            Stage stage = (Stage) newExitBtn.getScene().getWindow();
            GameController controller = new GameController();
            GameController.game = game;
            GameOverController.mapUrl = "Game5-view.fxml" ;
            Parent root = FXMLLoader.load(getClass().getResource(GameOverController.mapUrl));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setFullScreenExitHint("");
            //stage.setFullScreen(true);
            controller.initialGame(scene);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
          usernameLabel.setText("name : " + game.player.username);
          nicknameLabel.setText("nickname : " + game.player.nickname);
             levelLabel.setText("level : " + game.player.level);
        experienceLabel.setText("experience : " + game.player.experience);
        highscoreLabel.setText("highScore : " + game.player.highScore);
        if(game.player.getBestTime() > 10000){
            bestTimeLabel.setText("best time : ");
        } else {
            bestTimeLabel.setText("best time : " + game.player.getBestTime());
        }
        coinsLabel.setText("coins : " + game.player.coins);
        extraLabel.setText("");

        if(Player.playerList.size()>0){
            Player firstPlayer = Player.getSortedPlayerListByBestTime().get(0);
            firstPlayerLabel.setText("name : " + firstPlayer.username + " lvl : " + firstPlayer.level + " time : " + printTime(firstPlayer.getBestTime()));
        }
        if(Player.playerList.size()>1){
            Player firstPlayer = Player.getSortedPlayerListByBestTime().get(1);
            secondPlayerLabel.setText("name : " + firstPlayer.username + " lvl : " + firstPlayer.level + " time : " + printTime(firstPlayer.getBestTime()));
        }
        if(Player.playerList.size()>2){
            Player firstPlayer = Player.getSortedPlayerListByBestTime().get(2);
            thirdPlayerLabel.setText("name : " + firstPlayer.username + " lvl : " + firstPlayer.level + " time : " + printTime(firstPlayer.getBestTime()));
        }

        newExitBtn = Exit ;
    }
    private static String printTime(int time){
        if(time > 10000){
            return "" ;
        } else {
            return String.valueOf(time) ;
        }
    }

}
