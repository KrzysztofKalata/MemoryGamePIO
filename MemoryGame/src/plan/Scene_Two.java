package plan;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

public class Scene_Two extends StackPane {

	public Scene_Two() {

		Label wygrana = new Label("Victory");
		wygrana.setFont(Font.font(50));

		Button bbButton = new Button("Play again");
		bbButton.setOnAction(Event -> SceneLib.switchtoOne());
		bbButton.setTranslateY(200);
		getChildren().addAll(bbButton, wygrana);

	}
}
