/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;

/**
 *
 * @author bloxo
 */
public class MenuController {
    private  MainController mainController;
    
    @FXML
    public  void start(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/Start.fxml"));
        GridPane gridPane = null;
        try {
            gridPane = loader.load();
        } catch (IOException e) {
        }
        mainController.setScreen(gridPane);
    }
    public void tworcy(){
        
    }
    public void wyjscie(){
        
    }

    public MainController getMainController() {
        return mainController;
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
    
}
