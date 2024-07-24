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
import javafx.scene.input.KeyCode;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GameOverController implements Initializable {
    private static Stage previousStage;
    public static int coins ;
    public static int timer ;
    private static boolean flag = true;
    public static int totalCoinsInTheGame;
    private static Button newExitBtn ;
    public static String mapUrl ;

    private Media pacmanWin = new Media("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/media/pacmanWin.mp3");
    private MediaPlayer pacmanWinPlayer ;
    private Media pacmanLost = new Media("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/media/pacmanLost.mp3");
    private MediaPlayer pacmanLostPlayer ;

    public void playPacmanWin() {
        pacmanWinPlayer.stop();
        pacmanWinPlayer.play();
    }
    public void playPacmanLost() {
        pacmanLostPlayer.stop();
        pacmanLostPlayer.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pacmanWinPlayer = new MediaPlayer(pacmanWin);
        pacmanLostPlayer = new MediaPlayer(pacmanLost);

        score.setText("Score : " + coins*10);
        time.setText("Time : " + timer);
        newScore = score ;
        newExitBtn = Exit ;
        //totalCoinsInTheGame = coins ;                                 //To show win Menu
        if(totalCoinsInTheGame == coins){
            playPacmanWin();
            System.out.println("BestTime : "+ GameController.game.player.getBestTime() + " NewTime : " + timer);
            if(GameController.game.player.getBestTime() >= timer){
                GameOverText.setText("NewRecord!");
            } else {
                GameOverText.setText("Congrats!");
            }
        } else {
            playPacmanLost();
        }
    }

    public void initialGameOverMenu(Stage window){
        if(flag) {
            previousStage = window;
            flag = false;
        }
        try {
            Parent root = FXMLLoader.load(getClass().getResource("GameOver-view.fxml"));
            Scene scene = new Scene(root);
            previousStage.setScene(scene);
            previousStage.setFullScreenExitHint("");
            scene.addEventFilter(javafx.scene.input.KeyEvent.KEY_PRESSED, event -> {
            });
            scene.addPostLayoutPulseListener(new Runnable() {
                @Override
                public void run() {
                    newScore.setText("Score : " + coins*10);
                }
            });


        } catch (IOException e){
            e.printStackTrace();
        }
    }


    @FXML
    private Button Exit;

    @FXML
    private Label GameOverText;

    @FXML
    private Button menu;

    @FXML
    private Button restart;

    @FXML
    private Label score;
    private static Label newScore;

    @FXML
    private Label time;

    @FXML
    void Exit(ActionEvent event) {

    }

    @FXML
    void goOnMenu(ActionEvent event) {
        try {
            Stage stage = (Stage) newExitBtn.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Menu-view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setFullScreenExitHint("");
            //stage.setFullScreen(true);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void newGame(ActionEvent event) throws IOException {
        try {
            Stage stage = previousStage;
            GameController controller = new GameController();
            Parent root = FXMLLoader.load(getClass().getResource(mapUrl));
            Scene scene = new Scene(root);
            stage.setScene(scene);

            stage.setFullScreenExitHint("");
            controller.initialGame(scene);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
