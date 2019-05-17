package controllers;

import javafx.fxml.FXML;
import plan.SceneLib;

public class MenuController {
    private MainController mainController;

    @FXML
    public void start() {
        SceneLib.switchtoThree();
    }

    public void tworcy() {
        SceneLib.switchtoFour();
    }

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
