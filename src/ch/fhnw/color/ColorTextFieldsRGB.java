package ch.fhnw.color;

import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class ColorTextFieldsRGB extends VBox {
    private final ColorMixerPM pm;

    TextField txtField1;
    TextField txtField2;
    TextField txtField3;

    public ColorTextFieldsRGB(ColorMixerPM pm) {
        this.pm = pm;
        initializeControls();
        setupBindings();
        // setupValueChangedListeners();
    }

    private void initializeControls() {
        txtField1 = new TextField();
        txtField2 = new TextField();
        txtField3 = new TextField();
        getChildren().addAll(txtField1, txtField2, txtField3);
    }

    private void setupBindings() {
        txtField1.textProperty().bindBidirectional(pm.redProperty(), new NumberStringConverter());
        txtField2.textProperty().bindBidirectional(pm.greenProperty(), new NumberStringConverter());
        txtField3.textProperty().bindBidirectional(pm.blueProperty(), new NumberStringConverter());
    }

}
