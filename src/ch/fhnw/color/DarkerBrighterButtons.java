package ch.fhnw.color;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class DarkerBrighterButtons extends VBox {
    public DarkerBrighterButtons() {
        Button btnBrighter = new Button("Brighter");
        Button btnDarker = new Button("Darker");

        getChildren().addAll(btnBrighter, btnDarker);
    }
}
