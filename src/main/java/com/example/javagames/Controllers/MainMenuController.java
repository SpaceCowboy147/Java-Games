package com.example.javagames.Controllers;

//import com.example.javagames.Games.WarGame;

import com.example.javagames.JavaGamesApplication;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainMenuController {

    @FXML
    private VBox buttonContainer;

    private Stage stage;
    private Scene scene;


    List<String> cardDeck = new ArrayList<>();
    String[] jpgCardImagePath;

    ArrayList<String> playerCards = new ArrayList<>();
    Random randomCard = new Random();
    public List<ImageView> imageViews = new ArrayList<>();

    @FXML
    private void onJavaGamesButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(JavaGamesApplication.class.getResource("game-menu.fxml"));
        Parent root = fxmlLoader.load();
        buttonContainer.getChildren().setAll(root);
    }

    @FXML
    private void onOptionsButtonClick(ActionEvent event) throws IOException {
        //TODO. add change background color options

    }

    @FXML
    private void onExitButtonClicked(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void onWarGameClicked(ActionEvent event) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(JavaGamesApplication.class.getResource("war-game.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(JavaGamesApplication.class.getResource("war-game.fxml"));

        Parent root = fxmlLoader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root, 600, 800);
        stage.setScene(scene1);
        stage.show();
    }

}














