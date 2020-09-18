package ch.fhnw.color;

import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ColorSliders extends VBox {

    public ColorSliders() {
        Slider slider1 = new Slider();
        Slider slider2 = new Slider();
        Slider slider3 = new Slider();

        getChildren().addAll(slider1,slider2, slider3);
    }
}
