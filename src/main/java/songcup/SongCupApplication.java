package songcup;

import com.wrapper.spotify.model_objects.specification.Track;
import javafx.application.Application;
import javafx.stage.Stage;
import songcup.buildlogic.SongCupBuildLogic;
import songcup.problemdomain.SongStorage;
import songcup.spotifyapi.GetArtistsTopTracksExample;
import songcup.userinterface.PrimaryScene;

public class SongCupApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        SongStorage.setSongMap(SongStorage.createMap());
        SongCupBuildLogic.setAllRounds(SongStorage.getNumberOfRounds(SongStorage.getSongMap()));
        new PrimaryScene(primaryStage);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
