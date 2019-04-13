

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class JavaApplication2 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/mainStackPane.fxml"));
        StackPane StackPane = loader.load();
        Scene scene = new Scene(StackPane, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Memories");
        stage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
