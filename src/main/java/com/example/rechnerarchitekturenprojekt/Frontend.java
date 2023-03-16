package com.example.rechnerarchitekturenprojekt;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Frontend extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid = new GridPane();
        HBox buttons = new HBox();

        Button startGameButton = new Button("Spiel starten");
        buttons.getChildren().add(startGameButton);
        buttons.setAlignment(Pos.CENTER);

        BorderPane pane = new BorderPane();
        pane.setTop(grid);
        pane.setBottom(buttons);

        Scene scene = new Scene(pane, 320, 240);

        stage.setTitle("Spiel");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}