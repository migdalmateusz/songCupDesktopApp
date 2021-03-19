package songcup;

import javafx.application.Application;
import javafx.stage.Stage;
import songcup.userinterface.CheckedScene;

public class SongCupApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        new CheckedScene(primaryStage);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
