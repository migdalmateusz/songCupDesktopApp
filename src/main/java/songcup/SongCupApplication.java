package songcup;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import songcup.userinterface.Scena1;
//import songcup.buildlogic.SongCupBuildLogic;
//import songcup.userinterface.UserInterfaceImpl;

public class SongCupApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        new Scena1(primaryStage);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
