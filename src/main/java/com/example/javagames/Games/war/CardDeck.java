package com.example.javagames.Games.war;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {

    List<String> cardDeck = new ArrayList<>();
    String[] jpgCardImagePath;

    @FXML
    ImageView playerCardDeck;
    @FXML
    ImageView aiCardDeck;

    public void getAllWarGameCards() {
        File cardImagePath = new File("C:\\Users\\dylan\\Documents\\GitHub\\JavaGames\\src\\main\\resources\\com\\example\\javagames\\cardImages");
        jpgCardImagePath = cardImagePath.list();
        assert jpgCardImagePath != null;
        Collections.addAll(cardDeck, jpgCardImagePath);
        cardDeck.remove("cardDeck-125x175.png");
        cardDeck.remove("black_joker-125x175.png");
        cardDeck.remove("red_joker-125x175.png");
    }




    }

