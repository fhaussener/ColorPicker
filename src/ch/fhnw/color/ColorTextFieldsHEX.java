package ch.fhnw.color;

import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ColorTextFieldsHEX extends VBox {
    public ColorTextFieldsHEX() {
        TextField txtField1 = new TextField ();
        TextField txtField2 = new TextField ();
        TextField txtField3 = new TextField ();
        getChildren().addAll(txtField1,txtField2, txtField3);
    }
}
