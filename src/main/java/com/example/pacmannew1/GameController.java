package com.example.pacmannew1;

import Model.Game;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;

public class GameController implements Initializable {

    @FXML
    private ImageView c0r0;

    @FXML
    private ImageView c0r1;

    @FXML
    private ImageView c0r10;

    @FXML
    private ImageView c0r11;

    @FXML
    private ImageView c0r2;

    @FXML
    private ImageView c0r3;

    @FXML
    private ImageView c0r4;

    @FXML
    private ImageView c0r5;

    @FXML
    private ImageView c0r6;

    @FXML
    private ImageView c0r7;

    @FXML
    private ImageView c0r8;

    @FXML
    private ImageView c0r9;

    @FXML
    private ImageView c10r0;

    @FXML
    private ImageView c10r1;

    @FXML
    private ImageView c10r10;

    @FXML
    private ImageView c10r11;

    @FXML
    private ImageView c10r2;

    @FXML
    private ImageView c10r3;

    @FXML
    private ImageView c10r4;

    @FXML
    private ImageView c10r5;

    @FXML
    private ImageView c10r6;

    @FXML
    private ImageView c10r7;

    @FXML
    private ImageView c10r8;

    @FXML
    private ImageView c10r9;

    @FXML
    private ImageView c11r0;

    @FXML
    private ImageView c11r1;

    @FXML
    private ImageView c11r10;

    @FXML
    private ImageView c11r11;

    @FXML
    private ImageView c11r2;

    @FXML
    private ImageView c11r3;

    @FXML
    private ImageView c11r4;

    @FXML
    private ImageView c11r5;

    @FXML
    private ImageView c11r6;

    @FXML
    private ImageView c11r7;

    @FXML
    private ImageView c11r8;

    @FXML
    private ImageView c11r9;

    @FXML
    private ImageView c12r0;

    @FXML
    private ImageView c12r1;

    @FXML
    private ImageView c12r10;

    @FXML
    private ImageView c12r11;

    @FXML
    private ImageView c12r2;

    @FXML
    private ImageView c12r3;

    @FXML
    private ImageView c12r4;

    @FXML
    private ImageView c12r5;

    @FXML
    private ImageView c12r6;

    @FXML
    private ImageView c12r7;

    @FXML
    private ImageView c12r8;

    @FXML
    private ImageView c12r9;

    @FXML
    private ImageView c13r0;

    @FXML
    private ImageView c13r1;

    @FXML
    private ImageView c13r10;

    @FXML
    private ImageView c13r11;

    @FXML
    private ImageView c13r2;

    @FXML
    private ImageView c13r3;

    @FXML
    private ImageView c13r4;

    @FXML
    private ImageView c13r5;

    @FXML
    private ImageView c13r6;

    @FXML
    private ImageView c13r7;

    @FXML
    private ImageView c13r8;

    @FXML
    private ImageView c13r9;

    @FXML
    private ImageView c14r0;

    @FXML
    private ImageView c14r1;

    @FXML
    private ImageView c14r10;

    @FXML
    private ImageView c14r11;

    @FXML
    private ImageView c14r2;

    @FXML
    private ImageView c14r3;

    @FXML
    private ImageView c14r4;

    @FXML
    private ImageView c14r5;

    @FXML
    private ImageView c14r6;

    @FXML
    private ImageView c14r7;

    @FXML
    private ImageView c14r8;

    @FXML
    private ImageView c14r9;

    @FXML
    private ImageView c15r0;

    @FXML
    private ImageView c15r1;

    @FXML
    private ImageView c15r10;

    @FXML
    private ImageView c15r11;

    @FXML
    private ImageView c15r2;

    @FXML
    private ImageView c15r3;

    @FXML
    private ImageView c15r4;

    @FXML
    private ImageView c15r5;

    @FXML
    private ImageView c15r6;

    @FXML
    private ImageView c15r7;

    @FXML
    private ImageView c15r8;

    @FXML
    private ImageView c15r9;

    @FXML
    private ImageView c16r0;

    @FXML
    private ImageView c16r1;

    @FXML
    private ImageView c16r10;

    @FXML
    private ImageView c16r11;

    @FXML
    private ImageView c16r2;

    @FXML
    private ImageView c16r3;

    @FXML
    private ImageView c16r4;

    @FXML
    private ImageView c16r5;

    @FXML
    private ImageView c16r6;

    @FXML
    private ImageView c16r7;

    @FXML
    private ImageView c16r8;

    @FXML
    private ImageView c16r9;

    @FXML
    private ImageView c17r0;

    @FXML
    private ImageView c17r1;

    @FXML
    private ImageView c17r10;

    @FXML
    private ImageView c17r11;

    @FXML
    private ImageView c17r2;

    @FXML
    private ImageView c17r3;

    @FXML
    private ImageView c17r4;

    @FXML
    private ImageView c17r5;

    @FXML
    private ImageView c17r6;

    @FXML
    private ImageView c17r7;

    @FXML
    private ImageView c17r8;

    @FXML
    private ImageView c17r9;

    @FXML
    private ImageView c18r0;

    @FXML
    private ImageView c18r1;

    @FXML
    private ImageView c18r10;

    @FXML
    private ImageView c18r11;

    @FXML
    private ImageView c18r2;

    @FXML
    private ImageView c18r3;

    @FXML
    private ImageView c18r4;

    @FXML
    private ImageView c18r5;

    @FXML
    private ImageView c18r6;

    @FXML
    private ImageView c18r7;

    @FXML
    private ImageView c18r8;

    @FXML
    private ImageView c18r9;

    @FXML
    private ImageView c19r0;

    @FXML
    private ImageView c19r1;

    @FXML
    private ImageView c19r10;

    @FXML
    private ImageView c19r11;

    @FXML
    private ImageView c19r2;

    @FXML
    private ImageView c19r3;

    @FXML
    private ImageView c19r4;

    @FXML
    private ImageView c19r5;

    @FXML
    private ImageView c19r6;

    @FXML
    private ImageView c19r7;

    @FXML
    private ImageView c19r8;

    @FXML
    private ImageView c19r9;

    @FXML
    private ImageView c1r0;

    @FXML
    private ImageView c1r1;

    @FXML
    private ImageView c1r10;

    @FXML
    private ImageView c1r11;

    @FXML
    private ImageView c1r2;

    @FXML
    private ImageView c1r3;

    @FXML
    private ImageView c1r4;

    @FXML
    private ImageView c1r5;

    @FXML
    private ImageView c1r6;

    @FXML
    private ImageView c1r7;

    @FXML
    private ImageView c1r8;

    @FXML
    private ImageView c1r9;

    @FXML
    private ImageView c20r0;

    @FXML
    private ImageView c20r1;

    @FXML
    private ImageView c20r10;

    @FXML
    private ImageView c20r11;

    @FXML
    private ImageView c20r2;

    @FXML
    private ImageView c20r3;

    @FXML
    private ImageView c20r4;

    @FXML
    private ImageView c20r5;

    @FXML
    private ImageView c20r6;

    @FXML
    private ImageView c20r7;

    @FXML
    private ImageView c20r8;

    @FXML
    private ImageView c20r9;

    @FXML
    private ImageView c21r0;

    @FXML
    private ImageView c21r1;

    @FXML
    private ImageView c21r10;

    @FXML
    private ImageView c21r11;

    @FXML
    private ImageView c21r2;

    @FXML
    private ImageView c21r3;

    @FXML
    private ImageView c21r4;

    @FXML
    private ImageView c21r5;

    @FXML
    private ImageView c21r6;

    @FXML
    private ImageView c21r7;

    @FXML
    private ImageView c21r8;

    @FXML
    private ImageView c21r9;

    @FXML
    private ImageView c22r0;

    @FXML
    private ImageView c22r1;

    @FXML
    private ImageView c22r10;

    @FXML
    private ImageView c22r11;

    @FXML
    private ImageView c22r2;

    @FXML
    private ImageView c22r3;

    @FXML
    private ImageView c22r4;

    @FXML
    private ImageView c22r5;

    @FXML
    private ImageView c22r6;

    @FXML
    private ImageView c22r7;

    @FXML
    private ImageView c22r8;

    @FXML
    private ImageView c22r9;

    @FXML
    private ImageView c23r0;

    @FXML
    private ImageView c23r1;

    @FXML
    private ImageView c23r10;

    @FXML
    private ImageView c23r11;

    @FXML
    private ImageView c23r2;

    @FXML
    private ImageView c23r3;

    @FXML
    private ImageView c23r4;

    @FXML
    private ImageView c23r5;

    @FXML
    private ImageView c23r6;

    @FXML
    private ImageView c23r7;

    @FXML
    private ImageView c23r8;

    @FXML
    private ImageView c23r9;

    @FXML
    private ImageView c24r0;

    @FXML
    private ImageView c24r1;

    @FXML
    private ImageView c24r10;

    @FXML
    private ImageView c24r11;

    @FXML
    private ImageView c24r2;

    @FXML
    private ImageView c24r3;

    @FXML
    private ImageView c24r4;

    @FXML
    private ImageView c24r5;

    @FXML
    private ImageView c24r6;

    @FXML
    private ImageView c24r7;

    @FXML
    private ImageView c24r8;

    @FXML
    private ImageView c24r9;

    @FXML
    private ImageView c2r0;

    @FXML
    private ImageView c2r1;

    @FXML
    private ImageView c2r10;

    @FXML
    private ImageView c2r11;

    @FXML
    private ImageView c2r2;

    @FXML
    private ImageView c2r3;

    @FXML
    private ImageView c2r4;

    @FXML
    private ImageView c2r5;

    @FXML
    private ImageView c2r6;

    @FXML
    private ImageView c2r7;

    @FXML
    private ImageView c2r8;

    @FXML
    private ImageView c2r9;

    @FXML
    private ImageView c3r0;

    @FXML
    private ImageView c3r1;

    @FXML
    private ImageView c3r10;

    @FXML
    private ImageView c3r11;

    @FXML
    private ImageView c3r2;

    @FXML
    private ImageView c3r3;

    @FXML
    private ImageView c3r4;

    @FXML
    private ImageView c3r5;

    @FXML
    private ImageView c3r6;

    @FXML
    private ImageView c3r7;

    @FXML
    private ImageView c3r8;

    @FXML
    private ImageView c3r9;

    @FXML
    private ImageView c4r0;

    @FXML
    private ImageView c4r1;

    @FXML
    private ImageView c4r10;

    @FXML
    private ImageView c4r11;

    @FXML
    private ImageView c4r2;

    @FXML
    private ImageView c4r3;

    @FXML
    private ImageView c4r4;

    @FXML
    private ImageView c4r5;

    @FXML
    private ImageView c4r6;

    @FXML
    private ImageView c4r7;

    @FXML
    private ImageView c4r8;

    @FXML
    private ImageView c4r9;

    @FXML
    private ImageView c5r0;

    @FXML
    private ImageView c5r1;

    @FXML
    private ImageView c5r10;

    @FXML
    private ImageView c5r11;

    @FXML
    private ImageView c5r2;

    @FXML
    private ImageView c5r3;

    @FXML
    private ImageView c5r4;

    @FXML
    private ImageView c5r5;

    @FXML
    private ImageView c5r6;

    @FXML
    private ImageView c5r7;

    @FXML
    private ImageView c5r8;

    @FXML
    private ImageView c5r9;

    @FXML
    private ImageView c6r0;

    @FXML
    private ImageView c6r1;

    @FXML
    private ImageView c6r10;

    @FXML
    private ImageView c6r11;

    @FXML
    private ImageView c6r2;

    @FXML
    private ImageView c6r3;

    @FXML
    private ImageView c6r4;

    @FXML
    private ImageView c6r5;

    @FXML
    private ImageView c6r6;

    @FXML
    private ImageView c6r7;

    @FXML
    private ImageView c6r8;

    @FXML
    private ImageView c6r9;

    @FXML
    private ImageView c7r0;

    @FXML
    private ImageView c7r1;

    @FXML
    private ImageView c7r10;

    @FXML
    private ImageView c7r11;

    @FXML
    private ImageView c7r2;

    @FXML
    private ImageView c7r3;

    @FXML
    private ImageView c7r4;

    @FXML
    private ImageView c7r5;

    @FXML
    private ImageView c7r6;

    @FXML
    private ImageView c7r7;

    @FXML
    private ImageView c7r8;

    @FXML
    private ImageView c7r9;

    @FXML
    private ImageView c8r0;

    @FXML
    private ImageView c8r1;

    @FXML
    private ImageView c8r10;

    @FXML
    private ImageView c8r11;

    @FXML
    private ImageView c8r2;

    @FXML
    private ImageView c8r3;

    @FXML
    private ImageView c8r4;

    @FXML
    private ImageView c8r5;

    @FXML
    private ImageView c8r6;

    @FXML
    private ImageView c8r7;

    @FXML
    private ImageView c8r8;

    @FXML
    private ImageView c8r9;

    @FXML
    private ImageView c9r0;

    @FXML
    private ImageView c9r1;

    @FXML
    private ImageView c9r10;

    @FXML
    private ImageView c9r11;

    @FXML
    private ImageView c9r2;

    @FXML
    private ImageView c9r3;

    @FXML
    private ImageView c9r4;

    @FXML
    private ImageView c9r5;

    @FXML
    private ImageView c9r6;

    @FXML
    private ImageView c9r7;

    @FXML
    private ImageView c9r8;

    @FXML
    private ImageView c9r9;

    @FXML
    private GridPane field;
    @FXML
    private Button press;
    @FXML
    private Label coinsLabel;

    @FXML
    private Label timerLabel;

    @FXML
    private ImageView firstHeart;

    @FXML
    private ImageView secondHeart;

    @FXML
    private ImageView thirdHeart;

    @FXML
    void Exit(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void back(ActionEvent event) {
        if(gameStarted){
            saveDataAndResetTheGame();
            try {
                Stage stage = (Stage) newCoinsLabel.getScene().getWindow();
                GameController controller = new GameController();
                Parent root = FXMLLoader.load(getClass().getResource(GameOverController.mapUrl));
                Scene scene = new Scene(root);
                stage.setScene(scene);

                stage.setFullScreenExitHint("");
                controller.initialGame(scene);
            } catch (IOException e){
                e.printStackTrace();
            }
        } else {
            try {
                Stage stage = (Stage) newCoinsLabel.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("Menu-view.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setFullScreenExitHint("");
                //stage.setFullScreen(true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static Label newCoinsLabel;
    private static Label newTimerLabel;

    private static ImageView nfirstHeart ;
    private static ImageView nsecondHeart ;
    private static ImageView nthirdHeart ;

    static ImageView [][] cells = new ImageView[12][21];

    public static Scene scene ;
    private Image pacmanU = new Image("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/img/pacmanU.png");
    private Image pacmanD = new Image("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/img/pacmanD.png");
    private Image pacmanR = new Image("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/img/pacmanR.png");
    private Image pacmanL = new Image("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/img/pacmanL.png");
    private Image wall = new Image("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/img/wall.png");
    private Image voidCell = new Image("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/img/void.png");
    private Image coin = new Image("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/img/coin.png");
    private Image superCoin = new Image("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/img/superCoin.png");
    private Image heart = new Image("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/img/heart.png");

    private Image ghostR = new Image("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/img/ghostR.png");
    private String ghostRCellTypeNew;
    private String ghostRCellTypeOld = coin.getUrl();
    private Image ghostB = new Image("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/img/ghostB.png");
    private String ghostBCellTypeNew;
    private String ghostBCellTypeOld = coin.getUrl();
    private Image ghostO = new Image("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/img/ghostO.png");
    private String ghostOCellTypeNew;
    private String ghostOCellTypeOld = coin.getUrl();
    private Image ghostP = new Image("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/img/ghostP.png");
    private String ghostPCellTypeNew;
    private String ghostPCellTypeOld = coin.getUrl();


    private Media pacmanEat = new Media("file:/C:/Users/Asus/IdeaProjects/Pac-Man-new-1/target/classes/com/example/pacmannew1/media/pacmanEat.mp3");
    private MediaPlayer pacmanEatPlayer ;

    public void playPacmanEat() {
        pacmanEatPlayer.stop();
        pacmanEatPlayer.play();
    }

    private static double pacmanSpeedX = 0;
    private static double pacmanSpeedY = 3;

    private static double ghostRSpeedX = 0;
    private static double ghostRSpeedY = 3;

    private static double ghostBSpeedX = 0;
    private static double ghostBSpeedY = 3;

    private static double ghostOSpeedX = 0;
    private static double ghostOSpeedY = -3;

    private static double ghostPSpeedX = 0;
    private static double ghostPSpeedY = -3;

    private final int GAME_TICK = 350;

    public static int coinsCollected = 0 ;
    public static Button newPress ;
    private final double PACMAN_MAX_SPEED = 3;
    private static boolean gameStarted = false;
    public static Game game;
    public static int totalCoins = 0 ;
    private static int diedCounter = 0 ;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        coinsLabel.setText("Coins : 0");
        newCoinsLabel = coinsLabel;
        timerLabel.setText("Timer : 0");
        newTimerLabel = timerLabel;
        nfirstHeart = firstHeart ;
        nsecondHeart = secondHeart ;
        nthirdHeart = thirdHeart ;
        newPress = press ;


    }

    public void initialGame(Scene scene){
        pacmanEatPlayer = new MediaPlayer(pacmanEat);


        this.scene = scene;
        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            if (event.getCode() == KeyCode.RIGHT || event.getCode() == KeyCode.D) {
                pacmanR();
            } else if (event.getCode() == KeyCode.UP || event.getCode() == KeyCode.W) {
                pacmanU();
            } else if (event.getCode() == KeyCode.LEFT || event.getCode() == KeyCode.A) {
                pacmanL();
            } else if (event.getCode() == KeyCode.DOWN || event.getCode() == KeyCode.S) {
                pacmanD();
            }
        });
        scene.addPostLayoutPulseListener(new Runnable() {

            @Override
            public void run() {
                if(gameStarted) {
                    try {
                        Thread.sleep(GAME_TICK); // Delay for 1 second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    movePacman();
                        moveGhostR();
                        moveGhostB();
                        moveGhostO();
                        moveGhostP();
                        drawHeart();
//                    System.out.println("ghostRSpeedX : " + ghostRSpeedX + " ghostRSpeedY : " + ghostRSpeedY + "ghostBSpeedX : " + ghostBSpeedX + " ghostBSpeedY : " + ghostBSpeedY + "ghostOSpeedX : " + ghostOSpeedX + " ghostOSpeedY : " + ghostOSpeedY +"ghostPSpeedX : " + ghostPSpeedX + " ghostPSpeedY : " + ghostPSpeedY );
//                    System.out.println(" GhostRX : " + getGhostRByCoordinates().x + " GhostRY : " + getGhostRByCoordinates().y + " GhostOX : " + getGhostOByCoordinates().x + " GhostOY : " + getGhostOByCoordinates().y);
                }
            }
        });
    }

    private ImageView getPacman(){
        for(int i=0 ; i<21 ; i++) {
            for(int j=0 ; j<12 ; j++) {
                if(cells[j][i].getImage().getUrl().equals(pacmanR.getUrl()) ||
                        cells[j][i].getImage().getUrl().equals(pacmanU.getUrl()) ||
                        cells[j][i].getImage().getUrl().equals(pacmanD.getUrl()) ||
                        cells[j][i].getImage().getUrl().equals(pacmanL.getUrl())){
                    return cells[j][i];
                }
            }
        }
        died();
        return getPacman();
    }



    private class coordinates{
        int x ;
        int y ;
        coordinates(int x , int y){
            this.x = x ;
            this.y = y ;
        }
    }
    private coordinates getPacmanByCoordinates(){
        for(int i=0 ; i<21 ; i++) {
            for(int j=0 ; j<12 ; j++) {
                if(cells[j][i].getImage().getUrl().equals(pacmanR.getUrl()) ||
                        cells[j][i].getImage().getUrl().equals(pacmanU.getUrl()) ||
                        cells[j][i].getImage().getUrl().equals(pacmanD.getUrl()) ||
                        cells[j][i].getImage().getUrl().equals(pacmanL.getUrl())){
                    return new coordinates(j , i);
                }
            }
        }
        died();
        return getGhostPByCoordinates();
    }

    private void movePacman(){
        int tempX = getPacmanByCoordinates().x;
        int tempY = getPacmanByCoordinates().y;
        if(!((tempX == 5 && tempY == 20) || (tempX == 5 && tempY == 0)) && isThatAGhost(tempX, tempY, pacmanSpeedX, pacmanSpeedY)){
            died();
        } else {
            if (!(!((tempX == 5 && tempY == 20) || (tempX == 5 && tempY == 0)) && isThatAWall(tempX, tempY, pacmanSpeedX, pacmanSpeedY))) {
                cells[tempX][tempY].setImage(voidCell);
                if (pacmanSpeedX > 0 && pacmanSpeedY == 0) {
                    if (tempX == 5 && tempY == 20) {
                        cells[5][0].setImage(pacmanR);
                    } else {
                        if (cells[tempX][tempY + 1].getImage().getUrl().equals(coin.getUrl())) {
                            playPacmanEat();
                            coinsCollected++;
                        } else if (cells[tempX][tempY + 1].getImage().getUrl().equals(superCoin.getUrl())) {
                            playPacmanEat();
                            coinsCollected+=5;
                        }
                        cells[tempX][tempY + 1].setImage(pacmanR);
                    }
                } else if (pacmanSpeedX < 0 && pacmanSpeedY == 0) {
                    if (tempX == 5 && tempY == 0) {
                        cells[5][20].setImage(pacmanL);
                    } else {
                        if (cells[tempX][tempY - 1].getImage().getUrl().equals(coin.getUrl())) {
                            playPacmanEat();
                            coinsCollected++;
                        } else if (cells[tempX][tempY - 1].getImage().getUrl().equals(superCoin.getUrl())) {
                            playPacmanEat();
                            coinsCollected+=5;
                        }
                        cells[tempX][tempY - 1].setImage(pacmanL);
                    }
                } else if (pacmanSpeedY > 0 && pacmanSpeedX == 0) {
                    if (cells[tempX - 1][tempY].getImage().getUrl().equals(coin.getUrl())) {
                        playPacmanEat();
                        coinsCollected++;
                    } else if (cells[tempX - 1][tempY].getImage().getUrl().equals(superCoin.getUrl())) {
                        playPacmanEat();
                        coinsCollected+=5;
                    }
                    cells[tempX - 1][tempY].setImage(pacmanU);
                } else if (pacmanSpeedY < 0 && pacmanSpeedX == 0) {
                    if (cells[tempX + 1][tempY].getImage().getUrl().equals(coin.getUrl())) {
                        playPacmanEat();
                        coinsCollected++;
                    } else if (cells[tempX + 1][tempY].getImage().getUrl().equals(superCoin.getUrl())) {
                        playPacmanEat();
                        coinsCollected+=5;
                    }
                    cells[tempX + 1][tempY].setImage(pacmanD);
                }
            }
        }
        if(newCoinsLabel!=null && newTimerLabel!=null){
            newCoinsLabel.setText("Coins : " + coinsCollected);
            newTimerLabel.setText("Timer : " + (int)(Timer.getElapsedTime()/1000));
        }
        if(coinsCollected == totalCoins){
            gameOver();
        }
    }
    private void pacmanR(){
        getPacman().setImage(pacmanR);
        pacmanSpeedX=3;
        pacmanSpeedY=0;
    }
    private void pacmanL(){
        getPacman().setImage(pacmanL);
        pacmanSpeedX=-3;
        pacmanSpeedY=0;
    }
    private void pacmanU(){
        getPacman().setImage(pacmanU);
        pacmanSpeedX=0;
        pacmanSpeedY=3;
    }
    private void pacmanD(){
        getPacman().setImage(pacmanD);
        pacmanSpeedX=0;
        pacmanSpeedY=-3;
    }


    private boolean isThatAWall(int X , int Y, double speedX , double speedY){
        if(speedX>0 && speedY==0) {
            return cells[X][Y + 1].getImage().getUrl().equals(wall.getUrl());
        }
        if(speedX<0 && speedY==0) {
            return cells[X][Y - 1].getImage().getUrl().equals(wall.getUrl());
        }
        if(speedY>0 && speedX==0){
            return cells[X - 1][Y].getImage().getUrl().equals(wall.getUrl());
        }
        if(speedY<0 && speedX==0) {
            return cells[X + 1][Y].getImage().getUrl().equals(wall.getUrl());
        }
        return true;
    }

    private boolean isThatAGhost(int X , int Y, double speedX , double speedY){
        if(speedX>0 && speedY==0) {
            return cells[X][Y + 1].getImage().equals(ghostR) || cells[X][Y + 1].getImage().equals(ghostB) || cells[X][Y + 1].getImage().equals(ghostO) || cells[X][Y + 1].getImage().equals(ghostP);
        }
        if(speedX<0 && speedY==0) {
            return cells[X][Y - 1].getImage().equals(ghostR) || cells[X][Y - 1].getImage().equals(ghostB) || cells[X][Y - 1].getImage().equals(ghostO) || cells[X][Y - 1].getImage().equals(ghostP);
        }
        if(speedY>0 && speedX==0){
            return cells[X - 1][Y].getImage().equals(ghostR) || cells[X - 1][Y].getImage().equals(ghostB) || cells[X - 1][Y].getImage().equals(ghostO) || cells[X - 1][Y].getImage().equals(ghostP);
        }
        if(speedY<0 && speedX==0) {
            return cells[X + 1][Y].getImage().equals(ghostR) || cells[X + 1][Y].getImage().equals(ghostB) || cells[X + 1][Y].getImage().equals(ghostO) || cells[X + 1][Y].getImage().equals(ghostP);
        }
        return false;
    }
    private boolean isThatAPacman(int X , int Y, double speedX , double speedY){
        if(speedX>0 && speedY==0) {
            return cells[X][Y + 1].getImage().equals(pacmanR) || cells[X][Y + 1].getImage().equals(pacmanL) || cells[X][Y + 1].getImage().equals(pacmanU) || cells[X][Y + 1].getImage().equals(pacmanD);
        }
        if(speedX<0 && speedY==0) {
            return cells[X][Y - 1].getImage().equals(pacmanR) || cells[X][Y - 1].getImage().equals(pacmanL) || cells[X][Y - 1].getImage().equals(pacmanU) || cells[X][Y - 1].getImage().equals(pacmanD);
        }
        if(speedY>0 && speedX==0){
            return cells[X - 1][Y].getImage().equals(pacmanR) || cells[X - 1][Y].getImage().equals(pacmanL) || cells[X - 1][Y].getImage().equals(pacmanU) || cells[X - 1][Y].getImage().equals(pacmanD);
        }
        if(speedY<0 && speedX==0) {
            return cells[X + 1][Y].getImage().equals(pacmanR) || cells[X + 1][Y].getImage().equals(pacmanL) || cells[X + 1][Y].getImage().equals(pacmanU) || cells[X + 1][Y].getImage().equals(pacmanD);
        }
        return false;
    }

    private boolean isThatAnInvalidPlaceForAGhostToBe(int X , int Y, double speedX , double speedY){
        if(speedX>0 && speedY==0) {
            if((X == 9 && Y + 1 == 10) || (X == 5 && Y + 1 == 0) || (X == 5 && Y + 1 == 20)){
                System.out.println("EEEEEEEEEEEEEEEEEEEEEEEE55555555");
                return true;
            }
        } else if(speedX<0 && speedY==0) {
            if((X == 9 && Y - 1 == 10) || (X == 5 && Y - 1 == 0) || (X == 5 && Y - 1 == 20)){
                System.out.println("EEEEEEEEEEEEEEEEEEEEEEE55555555");
                return true;
            }
        } else if(speedY>0 && speedX==0){
            if((X - 1 == 9 && Y == 10) || (X - 1 == 5 && Y == 0) || (X - 1 == 5 && Y == 20)){
                System.out.println("EEEEEEEEEEEEEEEEEEEEEEEE55555555");
                return true;
            }
        } else if(speedY<0 && speedX==0) {
            if((X + 1 == 9 && Y == 10) || (X + 1 == 5 && Y == 0) || (X + 1 == 5 && Y == 20)){
                System.out.println("EEEEEEEEEEEEEEEEEEEEEEEE55555555");
                return true;
            }
        }
        return false;
    }

    //////////////////////////////////////////////////////////
    private void moveGhostR(){
        int tempX = getGhostRByCoordinates().x;
        int tempY = getGhostRByCoordinates().y;

        if (isThatAWall(tempX, tempY, ghostRSpeedX, ghostRSpeedY) || isThatAGhost(tempX, tempY, ghostRSpeedX, ghostRSpeedY)) {
            changeSpeedGhostR();
        }
        if(isThatAPacman(tempX,tempY,ghostRSpeedX,ghostRSpeedY)){
            died();
        } else {
            if (ghostRSpeedX > 0 && ghostRSpeedY == 0) {
                ghostRCellTypeNew = cells[tempX][tempY + 1].getImage().getUrl();
                cells[tempX][tempY + 1].setImage(ghostR);
                if (ghostRCellTypeOld != null) {
                    Image imageTemp = new Image(ghostRCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostRCellTypeOld = ghostRCellTypeNew ;
            } else if (ghostRSpeedX < 0 && ghostRSpeedY == 0) {
                ghostRCellTypeNew = cells[tempX][tempY - 1].getImage().getUrl();
                cells[tempX][tempY - 1].setImage(ghostR);
                if (ghostRCellTypeOld != null) {
                    Image imageTemp = new Image(ghostRCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostRCellTypeOld = ghostRCellTypeNew ;
            } else if (ghostRSpeedY > 0 && ghostRSpeedX == 0) {
                ghostRCellTypeNew = cells[tempX - 1][tempY].getImage().getUrl();
                cells[tempX - 1][tempY].setImage(ghostR);
                if (ghostRCellTypeOld != null) {
                    Image imageTemp = new Image(ghostRCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostRCellTypeOld = ghostRCellTypeNew ;
            } else if (ghostRSpeedY < 0 && ghostRSpeedX == 0) {
                ghostRCellTypeNew = cells[tempX + 1][tempY].getImage().getUrl();
                cells[tempX + 1][tempY].setImage(ghostR);
                if (ghostRCellTypeOld != null) {
                    Image imageTemp = new Image(ghostRCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostRCellTypeOld = ghostRCellTypeNew ;
            }
        }
    }
    private void changeSpeedGhostR(){
        double tempSpeedX = ghostRSpeedX;
        int tempCounter = 0;
        while(true) {
            tempCounter++;
            int randomNum = ThreadLocalRandom.current().nextInt(1, 5); // Inclusive range [1, 4]
            if (randomNum == 1) {
                ghostRSpeedX = 3;
                ghostRSpeedY = 0;
            } else if (randomNum == 2) {
                ghostRSpeedX = -3;
                ghostRSpeedY = 0;
            } else if (randomNum == 3) {
                ghostRSpeedX = 0;
                ghostRSpeedY = 3;
            } else if (randomNum == 4) {
                ghostRSpeedX = 0;
                ghostRSpeedY = -3;
            }
            if(!isThatAnInvalidPlaceForAGhostToBe(getGhostRByCoordinates().x , getGhostRByCoordinates().y , ghostRSpeedX , ghostRSpeedY) && (((tempSpeedX!=0 && ghostRSpeedX==0) || (tempSpeedX==0 && ghostRSpeedX!=0) || tempCounter>10) && !isThatAWall(getGhostRByCoordinates().x , getGhostRByCoordinates().y , ghostRSpeedX , ghostRSpeedY)  && !isThatAGhost(getGhostRByCoordinates().x , getGhostRByCoordinates().y , ghostRSpeedX , ghostRSpeedY))){
                break;
            }
            if(tempCounter>100  && !isThatAnInvalidPlaceForAGhostToBe(getGhostRByCoordinates().x , getGhostRByCoordinates().y , ghostRSpeedX , ghostRSpeedY)){
                ghostRSpeedX = 0 ;
                ghostRSpeedY = 0 ;
                System.out.println("EEEEEEEEEEEEE");
                break;
            }
        }
    }
    private coordinates getGhostRByCoordinates(){
        for(int i=0 ; i<21 ; i++) {
            for(int j=0 ; j<12 ; j++) {
                if(cells[j][i].getImage().getUrl().equals(ghostR.getUrl())){
                    return new coordinates(j , i);
                }
            }
        }
        return null;
    }

    ///////////////////////////////////////////////////////////////////////////////

    private void moveGhostB(){
        int tempX = getGhostBByCoordinates().x;
        int tempY = getGhostBByCoordinates().y;

        if (isThatAWall(tempX, tempY, ghostBSpeedX, ghostBSpeedY) || isThatAGhost(tempX, tempY, ghostBSpeedX, ghostBSpeedY)) {
            changeSpeedGhostB();
        }
        if(isThatAPacman(tempX,tempY,ghostBSpeedX,ghostBSpeedY)){
            died();
        } else {
            if (ghostBSpeedX > 0 && ghostBSpeedY == 0) {
                ghostBCellTypeNew = cells[tempX][tempY + 1].getImage().getUrl();
                cells[tempX][tempY + 1].setImage(ghostB);
                if (ghostBCellTypeOld != null) {
                    Image imageTemp = new Image(ghostBCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostBCellTypeOld = ghostBCellTypeNew ;
            } else if (ghostBSpeedX < 0 && ghostBSpeedY == 0) {
                ghostBCellTypeNew = cells[tempX][tempY - 1].getImage().getUrl();
                cells[tempX][tempY - 1].setImage(ghostB);
                if (ghostBCellTypeOld != null) {
                    Image imageTemp = new Image(ghostBCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostBCellTypeOld = ghostBCellTypeNew ;
            } else if (ghostBSpeedY > 0 && ghostBSpeedX == 0) {
                ghostBCellTypeNew = cells[tempX - 1][tempY].getImage().getUrl();
                cells[tempX - 1][tempY].setImage(ghostB);
                if (ghostBCellTypeOld != null) {
                    Image imageTemp = new Image(ghostBCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostBCellTypeOld = ghostBCellTypeNew ;
            } else if (ghostBSpeedY < 0 && ghostBSpeedX == 0) {
                ghostBCellTypeNew = cells[tempX + 1][tempY].getImage().getUrl();
                cells[tempX + 1][tempY].setImage(ghostB);
                if (ghostBCellTypeOld != null) {
                    Image imageTemp = new Image(ghostBCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostBCellTypeOld = ghostBCellTypeNew ;
            }
        }
    }
    private void changeSpeedGhostB(){
        double tempSpeedX = ghostBSpeedX;
        int tempCounter = 0;
        while(true) {
            tempCounter++;
            int randomNum = ThreadLocalRandom.current().nextInt(1, 5); // Inclusive range [1, 4]
            if (randomNum == 1) {
                ghostBSpeedX = 3;
                ghostBSpeedY = 0;
            } else if (randomNum == 2) {
                ghostBSpeedX = -3;
                ghostBSpeedY = 0;
            } else if (randomNum == 3) {
                ghostBSpeedX = 0;
                ghostBSpeedY = 3;
            } else if (randomNum == 4) {
                ghostBSpeedX = 0;
                ghostBSpeedY = -3;
            }
            if(!isThatAnInvalidPlaceForAGhostToBe(getGhostBByCoordinates().x , getGhostBByCoordinates().y , ghostBSpeedX , ghostBSpeedY) && (((tempSpeedX!=0 && ghostBSpeedX==0) || (tempSpeedX==0 && ghostBSpeedX!=0) || tempCounter>10) && !isThatAWall(getGhostBByCoordinates().x , getGhostBByCoordinates().y , ghostBSpeedX , ghostBSpeedY) && !isThatAGhost(getGhostBByCoordinates().x , getGhostBByCoordinates().y , ghostBSpeedX , ghostBSpeedY))){
                break;
            }
            if(tempCounter>100 && !isThatAnInvalidPlaceForAGhostToBe(getGhostBByCoordinates().x , getGhostBByCoordinates().y , ghostBSpeedX , ghostBSpeedY)){
                ghostBSpeedX = 0 ;
                ghostBSpeedY = 0 ;
                System.out.println("EEEEEEEEEEEEE");
                break;
            }
        }
    }
    private coordinates getGhostBByCoordinates(){
        for(int i=0 ; i<21 ; i++) {
            for(int j=0 ; j<12 ; j++) {
                if(cells[j][i].getImage().getUrl().equals(ghostB.getUrl())){
                    return new coordinates(j , i);
                }
            }
        }
        return null;
    }

    ////////////////////////////////////////////////////////////////////////////////

    private void moveGhostO(){
        int tempX = getGhostOByCoordinates().x;
        int tempY = getGhostOByCoordinates().y;

        if (isThatAWall(tempX, tempY, ghostOSpeedX, ghostOSpeedY) || isThatAGhost(tempX, tempY, ghostOSpeedX, ghostOSpeedY)) {
            changeSpeedGhostO();
        }
        if(isThatAPacman(tempX,tempY,ghostOSpeedX,ghostOSpeedY)){
            died();
        } else {
            if (ghostOSpeedX > 0 && ghostOSpeedY == 0) {
                ghostOCellTypeNew = cells[tempX][tempY + 1].getImage().getUrl();
                cells[tempX][tempY + 1].setImage(ghostO);
                if (ghostOCellTypeOld != null) {
                    Image imageTemp = new Image(ghostOCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostOCellTypeOld = ghostOCellTypeNew ;
            } else if (ghostOSpeedX < 0 && ghostOSpeedY == 0) {
                ghostOCellTypeNew = cells[tempX][tempY - 1].getImage().getUrl();
                cells[tempX][tempY - 1].setImage(ghostO);
                if (ghostOCellTypeOld != null) {
                    Image imageTemp = new Image(ghostOCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostOCellTypeOld = ghostOCellTypeNew ;
            } else if (ghostOSpeedY > 0 && ghostOSpeedX == 0) {
                ghostOCellTypeNew = cells[tempX - 1][tempY].getImage().getUrl();
                cells[tempX - 1][tempY].setImage(ghostO);
                if (ghostOCellTypeOld != null) {
                    Image imageTemp = new Image(ghostOCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostOCellTypeOld = ghostOCellTypeNew ;
            } else if (ghostOSpeedY < 0 && ghostOSpeedX == 0) {
                ghostOCellTypeNew = cells[tempX + 1][tempY].getImage().getUrl();
                cells[tempX + 1][tempY].setImage(ghostO);
                if (ghostOCellTypeOld != null) {
                    Image imageTemp = new Image(ghostOCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostOCellTypeOld = ghostOCellTypeNew ;
            }
        }
    }
    private void changeSpeedGhostO(){
        double tempSpeedX = ghostOSpeedX;
        int tempCounter = 0;
        while(true) {
            tempCounter++;
            int randomNum = ThreadLocalRandom.current().nextInt(1, 5); // Inclusive range [1, 4]
            if (randomNum == 1) {
                ghostOSpeedX = 3;
                ghostOSpeedY = 0;
            } else if (randomNum == 2) {
                ghostOSpeedX = -3;
                ghostOSpeedY = 0;
            } else if (randomNum == 3) {
                ghostOSpeedX = 0;
                ghostOSpeedY = 3;
            } else if (randomNum == 4) {
                ghostOSpeedX = 0;
                ghostOSpeedY = -3;
            }
            if(!isThatAnInvalidPlaceForAGhostToBe(getGhostOByCoordinates().x , getGhostOByCoordinates().y , ghostOSpeedX , ghostOSpeedY) && (((tempSpeedX!=0 && ghostOSpeedX==0) || (tempSpeedX==0 && ghostOSpeedX!=0) || tempCounter>10) && !isThatAWall(getGhostOByCoordinates().x , getGhostOByCoordinates().y , ghostOSpeedX , ghostOSpeedY)) && !isThatAGhost(getGhostOByCoordinates().x , getGhostOByCoordinates().y , ghostOSpeedX , ghostOSpeedY)){
                break;
            }
            if(tempCounter>100 && !isThatAnInvalidPlaceForAGhostToBe(getGhostOByCoordinates().x , getGhostOByCoordinates().y , ghostOSpeedX , ghostOSpeedY)){
                ghostOSpeedX = 0 ;
                ghostOSpeedY = 0 ;
                System.out.println("EEEEEEEEEEEEE");

                break;
            }
        }
    }
    private coordinates getGhostOByCoordinates(){
        for(int i=0 ; i<21 ; i++) {
            for(int j=0 ; j<12 ; j++) {
                if(cells[j][i].getImage().getUrl().equals(ghostO.getUrl())){
                    return new coordinates(j , i);
                }
            }
        }
        return null;
    }

    ////////////////////////////////////////////////////////////////////////////////

    private void moveGhostP(){
        int tempX = getGhostPByCoordinates().x;
        int tempY = getGhostPByCoordinates().y;

        if (isThatAWall(tempX, tempY, ghostPSpeedX, ghostPSpeedY) || isThatAGhost(tempX, tempY, ghostPSpeedX, ghostPSpeedY)) {
            changeSpeedGhostP();
        }
        if(isThatAPacman(tempX,tempY,ghostPSpeedX,ghostPSpeedY)){
            died();
        } else {
            if (ghostPSpeedX > 0 && ghostPSpeedY == 0) {
                ghostPCellTypeNew = cells[tempX][tempY + 1].getImage().getUrl();
                cells[tempX][tempY + 1].setImage(ghostP);
                if (ghostPCellTypeOld != null) {
                    Image imageTemp = new Image(ghostPCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostPCellTypeOld = ghostPCellTypeNew ;
            } else if (ghostPSpeedX < 0 && ghostPSpeedY == 0) {
                ghostPCellTypeNew = cells[tempX][tempY - 1].getImage().getUrl();
                cells[tempX][tempY - 1].setImage(ghostP);
                if (ghostPCellTypeOld != null) {
                    Image imageTemp = new Image(ghostPCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostPCellTypeOld = ghostPCellTypeNew ;
            } else if (ghostPSpeedY > 0 && ghostPSpeedX == 0) {
                ghostPCellTypeNew = cells[tempX - 1][tempY].getImage().getUrl();
                cells[tempX - 1][tempY].setImage(ghostP);
                if (ghostPCellTypeOld != null) {
                    Image imageTemp = new Image(ghostPCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostPCellTypeOld = ghostPCellTypeNew ;
            } else if (ghostPSpeedY < 0 && ghostPSpeedX == 0) {
                ghostPCellTypeNew = cells[tempX + 1][tempY].getImage().getUrl();
                cells[tempX + 1][tempY].setImage(ghostP);
                if (ghostPCellTypeOld != null) {
                    Image imageTemp = new Image(ghostPCellTypeOld);
                    cells[tempX][tempY].setImage(imageTemp);
                }
                ghostPCellTypeOld = ghostPCellTypeNew ;
            }
        }
    }
    private void changeSpeedGhostP(){
        double tempSpeedX = ghostPSpeedX;
        int tempCounter = 0;
        while(true) {
            tempCounter++;
            int randomNum = ThreadLocalRandom.current().nextInt(1, 5); // Inclusive range [1, 4]
            if (randomNum == 1) {
                ghostPSpeedX = 3;
                ghostPSpeedY = 0;
            } else if (randomNum == 2) {
                ghostPSpeedX = -3;
                ghostPSpeedY = 0;
            } else if (randomNum == 3) {
                ghostPSpeedX = 0;
                ghostPSpeedY = 3;
            } else if (randomNum == 4) {
                ghostPSpeedX = 0;
                ghostPSpeedY = -3;
            }
            if(!isThatAnInvalidPlaceForAGhostToBe(getGhostPByCoordinates().x , getGhostPByCoordinates().y , ghostPSpeedX , ghostPSpeedY) && (((tempSpeedX!=0 && ghostPSpeedX==0) || (tempSpeedX==0 && ghostPSpeedX!=0) || tempCounter>10) && !isThatAWall(getGhostPByCoordinates().x , getGhostPByCoordinates().y , ghostPSpeedX , ghostPSpeedY) && !isThatAGhost(getGhostPByCoordinates().x , getGhostPByCoordinates().y , ghostPSpeedX , ghostPSpeedY))){
                break;
            }
            if(tempCounter>100 && !isThatAnInvalidPlaceForAGhostToBe(getGhostPByCoordinates().x , getGhostPByCoordinates().y , ghostPSpeedX , ghostPSpeedY)){
                ghostPSpeedX = 0 ;
                ghostPSpeedY = 0 ;
                System.out.println("EEEEEEEEEEEEE");

                break;
            }
        }
    }
    private coordinates getGhostPByCoordinates(){
        for(int i=0 ; i<21 ; i++) {
            for(int j=0 ; j<12 ; j++) {
                if(cells[j][i].getImage().getUrl().equals(ghostP.getUrl())){
                    return new coordinates(j , i);
                }
            }
        }
        return null;
    }

    ////////////////////////////////////////////////////////////////////////////////
    public ImageView[][] test(ImageView[][] temp){
        temp = new ImageView[][]{{c0r0, c1r0, c2r0, c3r0, c4r0, c5r0, c6r0, c7r0, c8r0, c9r0, c10r0, c11r0, c12r0, c13r0, c14r0, c15r0, c16r0, c17r0, c18r0, c19r0, c20r0},
                {c0r1, c1r1, c2r1, c3r1, c4r1, c5r1, c6r1, c7r1, c8r1, c9r1, c10r1, c11r1, c12r1, c13r1, c14r1, c15r1, c16r1, c17r1, c18r1, c19r1, c20r1},
                {c0r2, c1r2, c2r2, c3r2, c4r2, c5r2, c6r2, c7r2, c8r2, c9r2, c10r2, c11r2, c12r2, c13r2, c14r2, c15r2, c16r2, c17r2, c18r2, c19r2, c20r2},
                {c0r3, c1r3, c2r3, c3r3, c4r3, c5r3, c6r3, c7r3, c8r3, c9r3, c10r3, c11r3, c12r3, c13r3, c14r3, c15r3, c16r3, c17r3, c18r3, c19r3, c20r3},
                {c0r4, c1r4, c2r4, c3r4, c4r4, c5r4, c6r4, c7r4, c8r4, c9r4, c10r4, c11r4, c12r4, c13r4, c14r4, c15r4, c16r4, c17r4, c18r4, c19r4, c20r4},
                {c0r5, c1r5, c2r5, c3r5, c4r5, c5r5, c6r5, c7r5, c8r5, c9r5, c10r5, c11r5, c12r5, c13r5, c14r5, c15r5, c16r5, c17r5, c18r5, c19r5, c20r5},
                {c0r6, c1r6, c2r6, c3r6, c4r6, c5r6, c6r6, c7r6, c8r6, c9r6, c10r6, c11r6, c12r6, c13r6, c14r6, c15r6, c16r6, c17r6, c18r6, c19r6, c20r6},
                {c0r7, c1r7, c2r7, c3r7, c4r7, c5r7, c6r7, c7r7, c8r7, c9r7, c10r7, c11r7, c12r7, c13r7, c14r7, c15r7, c16r7, c17r7, c18r7, c19r7, c20r7},
                {c0r8, c1r8, c2r8, c3r8, c4r8, c5r8, c6r8, c7r8, c8r8, c9r8, c10r8, c11r8, c12r8, c13r8, c14r8, c15r8, c16r8, c17r8, c18r8, c19r8, c20r8},
                {c0r9, c1r9, c2r9, c3r9, c4r9, c5r9, c6r9, c7r9, c8r9, c9r9, c10r9, c11r9, c12r9, c13r9, c14r9, c15r9, c16r9, c17r9, c18r9, c19r9, c20r9},
                {c0r10, c1r10, c2r10, c3r10, c4r10, c5r10, c6r10, c7r10, c8r10, c9r10, c10r10, c11r10, c12r10, c13r10, c14r10, c15r10, c16r10, c17r10, c18r10, c19r10, c20r10},
                {c0r11, c1r11, c2r11, c3r11, c4r11, c5r11, c6r11, c7r11, c8r11, c9r11, c10r11, c11r11, c12r11, c13r11, c14r11, c15r11, c16r11, c17r11, c18r11, c19r11, c20r11}};

        for(int i=0 ; i<21 ; i++){
            for(int j=0 ; j<12 ;j++){
                this.cells[j][i]=temp[j][i];
            }
        }
        return temp;
    }
    @FXML
    public void onPress(){
        newPress.setDisable(true);
        cells = test(cells);

        coinsCollected = 0;
        totalCoins = 0;
        diedCounter = 0;
        pacmanSpeedX = 0;
        pacmanSpeedY = 3;
        ghostRSpeedX = 0;
        ghostRSpeedY = 3;
        ghostBSpeedX = 0;
        ghostBSpeedY = 3;
        ghostOSpeedX = 0;
        ghostOSpeedY = -3;
        ghostPSpeedX = 0;
        ghostPSpeedY = -3;

        cells[9][10].setImage(pacmanU);
        cells[5][11].setImage(ghostR);
        cells[5][9].setImage(ghostB);
        cells[6][11].setImage(ghostO);
        cells[6][9].setImage(ghostP);

        firstHeart.setImage(heart);
        secondHeart.setImage(heart);
        thirdHeart.setImage(heart);
        boolean broken = false ;
        for(int i=1 ; i<20 ; i++) {
            for(int j=1 ; j<11 ; j++) {
                if(cells[j][i].getImage().getUrl().equals(voidCell.getUrl())){
                    int randomNum = ThreadLocalRandom.current().nextInt(1, 11); // Inclusive range [1, 10]
                    if(randomNum == 1){
                        cells[j][i].setImage(superCoin);
                        totalCoins+=5;
                    } else {
                        cells[j][i].setImage(coin);
                        totalCoins++;
                    }
//                    if(totalCoins>2){
//                         broken = true ;
//                        break;
//                    }
                }
            }
            if(broken){
                break;
            }
        }
        totalCoins+=4;
        gameStarted = true;
        Timer.start();
        Timer.setPacmanTime();
        Timer.setGhostTime();
    }

    private void died(){
        diedCounter++;

        if(diedCounter>=3){
            gameOver();
            return;
        }
        pacmanSpeedX = 0;
        pacmanSpeedY = 3;
        getPacman().setImage(voidCell);
        cells[9][10].setImage(pacmanU);
    }
    private void drawHeart(){
        if(diedCounter==0 || diedCounter>3){
            nfirstHeart.setImage(heart);
            nsecondHeart.setImage(heart);
            nthirdHeart.setImage(heart);
        } else if(diedCounter==1){
            nfirstHeart.setImage(null);
            nsecondHeart.setImage(heart);
            nthirdHeart.setImage(heart);
        } else if(diedCounter==2){
            nfirstHeart.setImage(null);
            nsecondHeart.setImage(null);
            nthirdHeart.setImage(heart);
        } else if(diedCounter==3){
            nfirstHeart.setImage(null);
            nsecondHeart.setImage(null);
            nthirdHeart.setImage(null);
        }
    }

    private void gameOver(){
        saveDataAndResetTheGame();
        ////Initialize new gameOverMenu
        GameOverController gameOverController = new GameOverController();
        Stage stage = (Stage) newCoinsLabel.getScene().getWindow();
        gameOverController.initialGameOverMenu(stage);


        System.out.println("coins2 : " + GameOverController.coins);
    }
    private void saveDataAndResetTheGame(){
        System.out.println("coins0 : " + coinsCollected);
        GameOverController.timer = (int) (Timer.getElapsedTime()/1000);
        GameOverController.coins = coinsCollected;
        GameOverController.totalCoinsInTheGame = totalCoins ;
        System.out.println("coins1 : " + GameOverController.coins);
        if(coinsCollected == totalCoins) {
            game.player.gameOverUpdate(coinsCollected, (coinsCollected * 10), GameOverController.timer);
        } else {
            game.player.gameOverUpdate(coinsCollected, (coinsCollected * 10), Integer.MAX_VALUE);
        }
        newPress.setDisable(false);
        gameStarted = false ;

    }





    public static class Timer {
        private static long startTime;
        private static long pacmanTime;
        private static long ghostTime;
        public static void start() {
            startTime = System.currentTimeMillis();
        }
        public static void setPacmanTime(){pacmanTime = System.currentTimeMillis();}
        public static void setGhostTime(){ghostTime = System.currentTimeMillis();}

        public static long getElapsedTime() {
            long currentTime = System.currentTimeMillis();
            return currentTime - startTime;
        }

        public static long getPacmanTime() {
            long currentTime = System.currentTimeMillis();
            return currentTime - pacmanTime;
        }
        public static long getGhostTime() {
            long currentTime = System.currentTimeMillis();
            return currentTime - ghostTime;
        }
    }

}
