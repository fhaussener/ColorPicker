package ch.fhnw.color;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorPickerUI extends HBox {
    private final ColorMixerPM pm;

    public ColorPickerUI(ColorMixerPM pm) {
        this.pm = pm;

        VBox left = new VBox();
        ColorSliders colorSliders = new ColorSliders(pm);
        Rectangle colorField = new Rectangle(400, 50);
        colorField.setStroke(Color.BLACK);
        colorField.fillProperty().bind(pm.mixedColorProperty());
        left.getChildren().addAll(colorSliders, colorField);

        VBox right = new VBox();
        // top right: input fields for rgb and hex
        HBox textFieldsContainer = new HBox();
        ColorTextFieldsHEX hexFields = new ColorTextFieldsHEX();
        ColorTextFieldsRGB rgbFields = new ColorTextFieldsRGB(pm);
        textFieldsContainer.getChildren().addAll(rgbFields, hexFields);

        //bottom right: darkerbtns and radiogroup
        HBox bottomRightContainer = new HBox();
        DarkerBrighterButtons darkerBrighterButtons = new DarkerBrighterButtons();
        ColorRadioGroup radioGroup = new ColorRadioGroup(pm);
        bottomRightContainer.getChildren().addAll(radioGroup, darkerBrighterButtons);
        right.getChildren().addAll(textFieldsContainer, bottomRightContainer);


        getChildren().addAll(left, right);
    }
}
