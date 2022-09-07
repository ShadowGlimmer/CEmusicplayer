package com.example.cemusicplayer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PlayerController implements Initializable {

    private Stage stage;
    private Scene scene;
    private boolean paused = true;

    @FXML
    private Pane playPane;
    @FXML
    private Label songPlayingLabel, artistLabel, genreLabel;
    @FXML
    private Button playButton, nextButton, previousButton, continuousButton, loginButton;
    @FXML
    private Slider songVolumeSlider;
    @FXML
    private ProgressBar songProgressBar;


    public void EnterMusicPlayer(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("player-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void playSong(){
        if (paused){
            songPlayingLabel.setText("Playing");
            paused = false;
        }
        else {
            songPlayingLabel.setText("Paused");
            paused = true;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
