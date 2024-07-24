package Model;

import com.example.pacmannew1.GameController;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import java.net.URL;
import java.util.ResourceBundle;

public class Game {
    public static Player player;


    public Game(Player player) {
        this.player = player;
    }
}


