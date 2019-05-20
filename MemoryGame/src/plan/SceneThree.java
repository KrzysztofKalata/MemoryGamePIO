
    
package plan;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

public class SceneThree extends StackPane {

    public SceneThree() {
        Label difficultyLabel = new Label("Poziom Trudności");
        difficultyLabel.setFont(Font.font(50));
        difficultyLabel.setTranslateY(-200);

        Button easy = new Button("Łatwy");
        easy.setOnAction(Event -> SceneLib.easy());
        easy.setTranslateY(-75);


        Button medium = new Button("Średni");
        medium.setOnAction(Event -> SceneLib.medium());
        medium.setTranslateY(0);

        Button hard = new Button("Trudny");
        hard.setOnAction(Event -> SceneLib.hard());
        hard.setTranslateY(75);
        getChildren().addAll(easy, medium, hard, difficultyLabel);

    }
}
