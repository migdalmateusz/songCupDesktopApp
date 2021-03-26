package songcup;

import javafx.application.Application;
import javafx.stage.Stage;
import songcup.buildlogic.SongCupBuildLogic;
import songcup.problemdomain.SongStorage;
import songcup.spotifyapi.AuthorizationCodePKCEExample;
import songcup.spotifyapi.AuthorizationCodePKCEUriExample;
import songcup.spotifyapi.GetArtistsTopTracksExample;
import songcup.spotifyapi.PkceUtil;
import songcup.userinterface.PrimaryScene;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SongCupApplication extends Application {

    @Override
    public void start(Stage primaryStage) {


        GetArtistsTopTracksExample.getArtistsTopTracks_Sync();
        SongStorage.setSongMap(SongStorage.createMap());
        SongCupBuildLogic.setAllRounds(SongStorage.getNumberOfRounds(SongStorage.getSongMap()));
        new PrimaryScene(primaryStage);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
