package com.example.cemusicplayer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class PlayerController implements Initializable {

    @FXML
    private Pane playPane;
    @FXML
    private Label songPlayingLabel, artistLabel, genreLabel;
    @FXML
    private Button playButton, nextButton, previousButton, continuousButton;
    @FXML
    private Slider songVolumeSlider;
    @FXML
    private ProgressBar songProgressBar;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}