package ch.fhnw.color;

import javafx.beans.property.*;
import javafx.scene.paint.Color;


public class ColorMixerPM {
    private final IntegerProperty red = new SimpleIntegerProperty();
    private final IntegerProperty green = new SimpleIntegerProperty();
    private final IntegerProperty blue = new SimpleIntegerProperty();

    private final IntegerProperty selectedRadio = new SimpleIntegerProperty();

    public void setMixedColor(Color mixedColor) {
        this.mixedColor.set(mixedColor);
    }

    public int checkRadioMatch(Color mixedColor) {
        int r = (int) (255 * mixedColor.getRed());
        int g = (int) (255 * mixedColor.getGreen());
        int b = (int) (255 * mixedColor.getBlue());

        int matchIndex = 0;
        for (PredefinedColors color : PredefinedColors.values()) {
            if (r == color.getR() && g == color.getG() && b == color.getB()) {
                matchIndex = color.ordinal();
            }
        }
        return matchIndex;
    }

    private final ObjectProperty<Color> mixedColor = new SimpleObjectProperty<>();

    public ColorMixerPM() {
        red.addListener((observable, oldValue, newValue) -> {
            setMixedColor(javafx.scene.paint.Color.rgb(getRed(), getGreen(), getBlue()));
        });

        blue.addListener((observable, oldValue, newValue) -> {
            setMixedColor(javafx.scene.paint.Color.rgb(getRed(), getGreen(), getBlue()));
        });

        green.addListener((observable, oldValue, newValue) -> {
            setMixedColor(javafx.scene.paint.Color.rgb(getRed(), getGreen(), getBlue()));
        });


        mixedColor.addListener((observable, oldValue, newValue) -> {
            int match = checkRadioMatch(newValue);
            setSelectedRadio(match);
        });


        selectedRadio.addListener((observable, oldValue, newValue) -> {
            PredefinedColors color = PredefinedColors.values()[(int) newValue];
            setMixedColor(javafx.scene.paint.Color.rgb(color.getR(), color.getG(), color.getB()));
        });

    }

    public IntegerProperty selectedRadioProperty() {
        return selectedRadio;
    }
    public int getSelectedRadio() {
        return selectedRadio.get();
    }

    public void setSelectedRadio(int selectedRadio) {
        this.selectedRadio.set(selectedRadio);
    }

    public void setSelectedRadio(String selectedRadio) {
        int matchIndex = 0;
        for (PredefinedColors color : PredefinedColors.values()) {
            if(color.name() == selectedRadio){
                matchIndex = color.ordinal();
            }
        }

        this.selectedRadio.set(matchIndex);
    }

    public int getRed() {
        return red.get();
    }

    public IntegerProperty redProperty() {
        return red;
    }

    public void setRed(int red) {
        this.red.set(red);
    }

    public int getGreen() {
        return green.get();
    }

    public IntegerProperty greenProperty() {
        return green;
    }

    public void setGreen(int green) {
        this.green.set(green);
    }

    public int getBlue() {
        return blue.get();
    }

    public IntegerProperty blueProperty() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue.set(blue);
    }

    public Color getMixedColor() {
        return mixedColor.get();
    }

    public ObjectProperty<Color> mixedColorProperty() {
        return mixedColor;
    }
}
