package ch.fhnw.color;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class ColorRadioGroup extends VBox {
    public ColorRadioGroup() {
        ToggleGroup toggleGroup = new ToggleGroup();

        RadioButton rb1 = new RadioButton("Red");
        RadioButton rb2 = new RadioButton("Blue");
        RadioButton rb3 = new RadioButton("Green");
        RadioButton rb4 = new RadioButton("Yellow");
        RadioButton rb5 = new RadioButton("cyan");
        RadioButton rb6 = new RadioButton("orange");
        RadioButton rb7 = new RadioButton("black");

        rb1.setToggleGroup(toggleGroup);
        rb2.setToggleGroup(toggleGroup);
        rb3.setToggleGroup(toggleGroup);
        rb4.setToggleGroup(toggleGroup);
        rb5.setToggleGroup(toggleGroup);
        rb6.setToggleGroup(toggleGroup);
        rb7.setToggleGroup(toggleGroup);

        toggleGroup.selectToggle(rb1);
        toggleGroup.selectedToggleProperty().addListener((observable, oldVal, newVal) -> System.out.println(newVal + " was selected"));

        getChildren().addAll(rb1, rb2, rb3, rb4, rb5, rb6, rb7);
    }
}
