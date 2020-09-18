package ch.fhnw.color;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorPickerUI extends HBox {
    public ColorPickerUI() {
        VBox left = new VBox();
        ColorSliders colorSliders = new ColorSliders();
        Rectangle colorField = new Rectangle(400, 50);
        colorField.setFill(Color.MAGENTA);
        colorField.setStroke(Color.BLACK);
        left.getChildren().addAll(colorSliders,colorField);

        VBox right = new VBox();
        HBox textFieldsContainer = new HBox();
        ColorTextFieldsHEX hexFields = new ColorTextFieldsHEX();
        ColorTextFieldsRGB rgbFields = new ColorTextFieldsRGB();
        textFieldsContainer.getChildren().addAll(rgbFields, hexFields);
        HBox bottomRightContainer = new HBox();
        DarkerBrighterButtons darkerBrighterButtons = new DarkerBrighterButtons();
        ColorRadioGroup radioGroup = new ColorRadioGroup();
        bottomRightContainer.getChildren().addAll(radioGroup,darkerBrighterButtons);
        right.getChildren().addAll(textFieldsContainer,bottomRightContainer);


        getChildren().addAll(left, right);
    }
}
