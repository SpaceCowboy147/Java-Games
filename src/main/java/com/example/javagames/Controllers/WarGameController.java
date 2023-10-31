package com.example.javagames.Controllers;

import com.example.javagames.Games.war.CardDeck;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WarGameController {

    private Stage stage;
    private ImageView cardImage;
    List<String> cardDeck = new ArrayList<>();
    String[] jpgCardImagePath;

    ArrayList<String> playerCards = new ArrayList<>();

    Random randomCard = new Random();
    public List<ImageView> imageViews = new ArrayList<>();
    int aiCardValue;
    int playerCardValue;
    static int playerScore;
    static int aiScore;
    static int drawScore;



    @FXML
    ImageView playerCardDeck;
    @FXML
    ImageView playerSelectCard;
    @FXML
    ImageView aiCardDeck;
    @FXML
    ImageView aiSelectCard;
    @FXML
    ImageView mainDeck;

    @FXML
    Label playerScoreLabel;
    @FXML
    Label aiScoreLabel;
    @FXML
    Label drawScoreLabel;

    public void splitCardDeck(MouseEvent mouseEvent) throws IOException {
        File cardImagePath = new File("C:\\Users\\dylan\\Documents\\GitHub\\JavaGames\\src\\main\\resources\\com\\example\\javagames\\cardImages");
        jpgCardImagePath = cardImagePath.list();
        assert jpgCardImagePath != null;
        Collections.addAll(cardDeck, jpgCardImagePath);
        cardDeck.remove("cardDeck-125x175.png");
        cardDeck.remove("black_joker-125x175.png");
        cardDeck.remove("red_joker-125x175.png");

        String selectedCard = null;
        for (int i = cardDeck.size(); i > 0; i--) {
            if (playerCards.size() < 26) {
                int randomIndex = randomCard.nextInt(cardDeck.size());
                selectedCard = cardDeck.get(randomIndex);
                playerCards.add(selectedCard);
                cardDeck.remove(selectedCard);
            }

        }
        System.out.println(playerCards.size());
        System.out.println(cardDeck.size());
        mainDeck.setVisible(false);
        playerCardDeck.setVisible(true);
        aiCardDeck.setVisible(true);

    }

    public void onPlayerCardClicked(MouseEvent mouseEvent) throws IOException {
        String selectedCard = null;
        System.out.println(playerCards.size());
        for (int i = playerCards.size(); i >= 0; i--) {
            int randomIndex = randomCard.nextInt(playerCards.size());
            selectedCard = playerCards.get(randomIndex);
        }
        playerCards.remove(selectedCard);
        Image playerSelectCardImage = new Image("C:\\Users\\dylan\\Documents\\GitHub\\JavaGames\\src\\main\\resources\\com\\example\\javagames\\cardImages\\" + selectedCard);
        playerSelectCard.setImage(playerSelectCardImage);
        playerSelectCard.setVisible(true);


        String selectedAICard = null;
        for (int i = cardDeck.size(); i >= 0; i--) {
            int randomIndex = randomCard.nextInt(cardDeck.size());
            selectedAICard = cardDeck.get(randomIndex);
        }
        cardDeck.remove(selectedAICard);
        Image aiSelectCardImage = new Image("C:\\Users\\dylan\\Documents\\GitHub\\JavaGames\\src\\main\\resources\\com\\example\\javagames\\cardImages\\" + selectedAICard);
        aiSelectCard.setImage(aiSelectCardImage);
        aiCardDeck.setVisible(true);

        if (selectedCard.contains("2_of")) {
            playerCardValue = 2;
        } else if (selectedCard.contains("3_of")) {
            playerCardValue = 3;
        } else if (selectedCard.contains("4_of")) {
            playerCardValue = 4;
        } else if (selectedCard.contains("5_of")) {
            playerCardValue = 5;
        } else if (selectedCard.contains("6_of")) {
            playerCardValue = 6;
        } else if (selectedCard.contains("7_of")) {
            playerCardValue = 7;
        } else if (selectedCard.contains("8_of")) {
            playerCardValue = 8;
        } else if (selectedCard.contains("9_of")) {
            playerCardValue = 9;
        } else if (selectedCard.contains("10_of")) {
            playerCardValue = 10;
        } else if (selectedCard.contains("jack_of")) {
            playerCardValue = 11;
        } else if (selectedCard.contains("king_of")) {
            playerCardValue = 12;
        } else if (selectedCard.contains("queen_of")) {
            playerCardValue = 12;
        } else if (selectedCard.contains("ace_of")) {
            playerCardValue = 13;

        }


        assert selectedAICard != null;
        if (selectedAICard.contains("2_of")) {
            aiCardValue = 2;
        } else if (selectedAICard.contains("3_of")) {
            aiCardValue = 3;
        } else if (selectedAICard.contains("4_of")) {
            aiCardValue = 4;
        } else if (selectedAICard.contains("5_of")) {
            aiCardValue = 5;
        } else if (selectedAICard.contains("6_of")) {
            aiCardValue = 6;
        } else if (selectedAICard.contains("7_of")) {
            aiCardValue = 7;
        } else if (selectedAICard.contains("8_of")) {
            aiCardValue = 8;
        } else if (selectedAICard.contains("9_of")) {
            aiCardValue = 9;
        } else if (selectedAICard.contains("10_of")) {
            aiCardValue = 10;
        } else if (selectedAICard.contains("jack_of")) {
            aiCardValue = 11;
        } else if (selectedAICard.contains("king_of")) {
            aiCardValue = 12;
        } else if (selectedAICard.contains("queen_of")) {
            aiCardValue = 12;
        } else if (selectedAICard.contains("ace_of")) {
            aiCardValue = 13;
        }


        if (playerCardValue > aiCardValue) {
            playerScore++;
        } else if (playerCardValue < aiCardValue) {
            aiScore++;
        }
        if (playerCardValue == aiCardValue) {
            drawScore++;
        }
        playerScoreLabel.setText("Player Score:" + playerScore);
        aiScoreLabel.setText("AI Score:" + aiScore);
        drawScoreLabel.setText("Draw:" + drawScore);


       // int turns;


//        for (turns = playerCards.size(); turns > 0; turns--) {
//
//        }
//        if (turns == 0) {
//            if (playerScore < aiScore) {
//
//                System.out.println("You lost");
//
//            } else if (playerScore > aiScore) {
//
//                System.out.println("You won");
//
//            } else {
//
//                System.out.println("draw");
//            }
        }
    }





