package ch.fhnw.color;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Parent pickerUi = new ColorPickerUI();
        Scene scene = new Scene(pickerUi,1000, 550);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}

