package songcup;

import javafx.application.Application;
import javafx.stage.Stage;
import songcup.buildlogic.SongCupBuildLogic;
import songcup.userinterface.PrimaryScene;

public class SongCupApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        new PrimaryScene(primaryStage);


    }

    public static void main(String[] args) {
        launch(args);
    }
}
