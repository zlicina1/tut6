package ba.unsa.etf.rs.tuturijal2;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label prezime_labela;

    public void onClick(ActionEvent actionEvent) {
        System.out.println("Button otvoren");
        prezime_labela.getText();
    }
}
