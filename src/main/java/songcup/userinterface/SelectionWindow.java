package songcup.userinterface;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import songcup.buildlogic.SongCupBuildLogic;
import songcup.computationlogic.SongUtilities;
import songcup.problemdomain.SongStorage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class SelectionWindow {

    @FXML
    public Button listenSongOne;

    @FXML
    public Button listenSongTwo;

    @FXML
    private Button buttonSongOne;

    @FXML
    private Button buttonSongTwo;

    @FXML
    private Button buttonNext;


    @FXML
    void initialize() {
        SongCupBuildLogic.countAndCheck();
        buttonSongOne.setText(SongUtilities.getTitleSongOne());
        buttonSongTwo.setText(SongUtilities.getTitleSongTwo());
    }

    @FXML
    private void addPointSongOne() {
        SongUtilities.setPointOne();
    }

    @FXML
    private void addPointSongTwo() {
        SongUtilities.setPointTwo();
    }

    @FXML
    private void listenSongOne() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI(SongUtilities.getVideoSongOne()));
    }

    @FXML
    private void listenSongTwo() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI(SongUtilities.getVideoSongTwo()));
    }

    @FXML
    private void changeToNextWindow() {
        if (SongCupBuildLogic.getMatch()==6) {
            try {
                SongUtilities.addPlaylist(2);
                SongStorage.setSongMap(SongUtilities.createFinalMap());
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/FinalWindow.fxml"));
                Parent parent = loader.load();
                ((Stage) buttonNext.getScene().getWindow()).setScene(new Scene(parent, 700, 700));

            } catch (IOException eox) {
                eox.printStackTrace();
            }
        } else {
            try {
                SongCupBuildLogic.increaseMatch();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/SelectionWindow.fxml"));
                Parent parent = loader.load();
                ((Stage) buttonNext.getScene().getWindow()).setScene(new Scene(parent, 700, 700));

            } catch (IOException eox) {
                eox.printStackTrace();
            }
        }
    }
}
