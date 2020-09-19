package ch.fhnw.color;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        ColorMixerPM pm = new ColorMixerPM();
        Parent pickerUi = new ColorPickerUI(pm);
        Scene scene = new Scene(pickerUi,600, 400);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}

