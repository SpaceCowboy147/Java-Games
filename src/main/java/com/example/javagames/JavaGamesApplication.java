package com.example.javagames;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaGamesApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

            FXMLLoader fxmlLoader = new FXMLLoader(JavaGamesApplication.class.getResource("main-menu.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 800);
            stage.setTitle("Java Games");

            stage.setScene(scene);
            stage.show();

    }

    public static void main (String[]args){
        launch();
    }

}