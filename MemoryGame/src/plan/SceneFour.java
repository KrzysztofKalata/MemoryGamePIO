package plan;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneFour extends StackPane {

    private Scene scene;

    public SceneFour() {

        VBox vbox = new VBox();
        StackPane stackPane = new StackPane();

        Button backButton = new Button("Menu");

        ImageView imageView = new ImageView();
        Image image = new Image("img/Twórcy.png");
        imageView.setImage(image);

        backButton.setFont(Font.font(40));
        backButton.setOnAction(event -> switchToMenu());
        backButton.setFont(new Font("Jokerman", 30));

        stackPane.getChildren().add(backButton);
        vbox.getChildren().addAll(imageView, stackPane);
        getChildren().addAll(vbox);
    }

    public void switchToMenu() {
        Parent parent = null;
        try {
            parent = FXMLLoader.load(this.getClass().getResource("/FXML/MenuScreen.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(parent);

        Stage window = (Stage) getScene().getWindow();
        window.setScene(scene);
        window.centerOnScreen();
        window.show();
    }

}
