package plan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) { int id;
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/mainStackPane.fxml"));
        StackPane StackPane = loader.load();
        Scene scene = new Scene(StackPane, 600, 400);
        primaryStage.setTitle("Memory Game");
        primaryStage.setScene(scene);
        SceneLib.setPrimary(primaryStage);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

}
