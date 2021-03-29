package songcup;

import javafx.application.Application;
import javafx.stage.Stage;
import songcup.buildlogic.SongCupBuildLogic;
import songcup.problemdomain.SongStorage;
import songcup.userinterface.OpenWindow;

import java.io.IOException;

public class SongCupApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        SongStorage.setSongMap(SongStorage.createMap());
        SongCupBuildLogic.setAllRounds(SongStorage.getNumberOfRounds(SongStorage.getSongMap()));
        OpenWindow.setOpenWindow(primaryStage);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
