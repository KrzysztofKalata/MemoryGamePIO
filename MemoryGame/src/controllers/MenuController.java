/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javafx.fxml.FXML;
import plan.SceneLib;

public class MenuController {
	private MainController mainController;

	@FXML
	public void start() {
		SceneLib.switchtoOne();
	}

	public void tworcy() {

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
