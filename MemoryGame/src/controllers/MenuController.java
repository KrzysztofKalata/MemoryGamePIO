package controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import plan.SceneLib;

public class MenuController {
    private MainController mainController;
    @FXML
    private Pane Pane;

    @FXML
    public void start() {
        SceneLib.switchtoThree();
    }

    @FXML
    public void tworcy() {
        SceneLib.switchtoFour();
    }

    @FXML
    public void wyjscie() {
        SceneLib.end();
    }

    public MainController getMainController() {
        return mainController;
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

}
