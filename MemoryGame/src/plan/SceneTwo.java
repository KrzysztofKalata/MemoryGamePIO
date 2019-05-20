package plan;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

public class SceneTwo extends StackPane {

    public SceneTwo() {

        Label victoryLabel = new Label("Zwycięstwo");
        victoryLabel.setFont(Font.font(50));
         victoryLabel.setFont(new Font("Jokerman", 30));

        Button bbButton = new Button("Zagraj ponownie");
        bbButton.setOnAction(Event -> SceneLib.switchtoOne());
        bbButton.setTranslateY(100);
         bbButton.setFont(new Font("Jokerman", 30));

        Button quit = new Button("Wyjście");
        quit.setOnAction(Event -> SceneLib.end());
        quit.setTranslateY(200);
         quit.setFont(new Font("Jokerman", 30));


        getChildren().addAll(bbButton, quit, victoryLabel);

    }
}
