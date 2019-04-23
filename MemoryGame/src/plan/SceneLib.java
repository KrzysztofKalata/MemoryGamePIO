package plan;

import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class SceneLib {
    private static Stage primary;
    private static Scene sceneOne = new Scene(new SceneOne().makeParent());
    private static Scene sceneTwo = new Scene(new SceneTwo(), 500, 500);

    public static void setPrimary(Stage primary) {
        SceneLib.primary = primary;
    }

    public static void switchtoOne() {
        sceneOne = new Scene(new SceneOne().makeParent());
        primary.setScene(sceneOne);
    }

    public static void switchtoTwo() {
        primary.setScene(sceneTwo);
    }

    public static void end() {
        primary.close();
    }

}