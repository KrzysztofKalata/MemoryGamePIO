package plan;

import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class SceneLib {
    private static Stage primary;
    private static Scene sceneOne = new Scene(new SceneOne().makeParent());
    private static Scene sceneTwo = new Scene(new SceneTwo(), 500, 500);
    private static Scene sceneThree = new Scene(new SceneThree(), 500, 500);
    private static Scene sceneFour = new Scene(new SceneFour(), 750, 600);


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

    public static void switchtoThree() {
        primary.setScene(sceneThree);
    }

    public static void switchtoFour() {
        primary.setScene(sceneFour);
    }

    public static void end() {
        primary.close();
    }

    public static void setNumberOfPairs(int x) { // ???????????
        SceneOne.numberOfPairs = x;

    }

    public static void easy() {
        SceneLib.setNumberOfPairs(5);
        SceneLib.switchtoOne();
    }

    public static void medium() {

        SceneLib.setNumberOfPairs(10);
        SceneLib.switchtoOne();
    }

    public static void hard() {
        SceneLib.setNumberOfPairs(15);
        SceneLib.switchtoOne();
    }


}
