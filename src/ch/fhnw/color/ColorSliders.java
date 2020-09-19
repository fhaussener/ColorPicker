package ch.fhnw.color;

import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class ColorSliders extends VBox {

    private final ColorMixerPM pm;
    private Slider slider1;
    private Slider slider2;
    private Slider slider3;

    public ColorSliders(ColorMixerPM pm) {
        this.pm = pm;

        initializeControls();
        setupBindings();
    }

    private void initializeControls() {
        slider1 = new Slider(0.0, 255, 0);
        slider2 = new Slider(0.0, 255, 0);
        slider3 = new Slider(0.0, 255, 0);
        getChildren().addAll(slider1,slider2, slider3);
    }

    private void setupBindings(){
        slider1.valueProperty().bindBidirectional(pm.redProperty());
        slider2.valueProperty().bindBidirectional(pm.greenProperty());
        slider3.valueProperty().bindBidirectional(pm.blueProperty());
    }
}
