package ch.fhnw.color;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class ColorRadioGroup extends VBox {
    private final ColorMixerPM pm;

    public ColorRadioGroup(ColorMixerPM pm) {
        this.pm = pm;
        ToggleGroup toggleGroup = new ToggleGroup();

        RadioButton rb1 = new RadioButton("RED");
        RadioButton rb2 = new RadioButton("BLUE");
        RadioButton rb3 = new RadioButton("GREEN");
        RadioButton rb4 = new RadioButton("YELLOW");
        RadioButton rb5 = new RadioButton("CYAN");
        RadioButton rb6 = new RadioButton("ORANGE");
        RadioButton rb7 = new RadioButton("WHITE");
        RadioButton rb8 = new RadioButton("BLACK");

        rb1.setToggleGroup(toggleGroup);
        rb2.setToggleGroup(toggleGroup);
        rb3.setToggleGroup(toggleGroup);
        rb4.setToggleGroup(toggleGroup);
        rb5.setToggleGroup(toggleGroup);
        rb6.setToggleGroup(toggleGroup);
        rb7.setToggleGroup(toggleGroup);
        rb8.setToggleGroup(toggleGroup);

        toggleGroup.selectToggle(rb7);
        toggleGroup.selectedToggleProperty().addListener((observable, oldVal, newVal) -> {
            RadioButton chk = (RadioButton) toggleGroup.getSelectedToggle(); // Cast object to radio button
            String sel = chk.getText();
            pm.setSelectedRadio(sel);
        });

        getChildren().addAll(rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8);
    }
}
