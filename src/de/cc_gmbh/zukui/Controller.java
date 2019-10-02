package de.cc_gmbh.zukui;

import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private PersoModel persoModel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        persoModel = new PersoModel();
    }

    public void openPerso() {
        Label secondLabel = new Label("I'm a Label on new Window");

        StackPane secondaryLayout = new StackPane();
        secondaryLayout.getChildren().add(secondLabel);

        Scene secondScene = new Scene(secondaryLayout, 230, 100);

        // New window (Stage)
        Stage newWindow = new Stage();
        newWindow.setTitle("Second Stage");
        newWindow.setScene(secondScene);

        newWindow.show();
    }
}
