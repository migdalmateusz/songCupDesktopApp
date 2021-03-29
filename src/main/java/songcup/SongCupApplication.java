package songcup;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import songcup.buildlogic.SongCupBuildLogic;
import songcup.problemdomain.SongStorage;
import songcup.userinterface.OpenWindow;
import songcup.userinterface.PrimaryScene;

import java.io.IOException;

public class SongCupApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        SongStorage.setSongMap(SongStorage.createMap());
        SongCupBuildLogic.setAllRounds(SongStorage.getNumberOfRounds(SongStorage.getSongMap()));
//        new PrimaryScene(primaryStage);
//        new OpenWindow(primaryStage);

        Scene scene = new OpenWindow().setOpenWindowScene();
        primaryStage.setScene(scene);
        primaryStage.setTitle( "SongCup" );
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
