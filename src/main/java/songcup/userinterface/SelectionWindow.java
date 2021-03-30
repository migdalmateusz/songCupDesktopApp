package songcup.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import songcup.buildlogic.SongCupBuildLogic;
import songcup.computationlogic.SongUtilities;
import songcup.problemdomain.SongStorage;

import java.io.IOException;

public class SelectionWindow {

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
    private void addPointSongOne(ActionEvent event) {
        SongUtilities.setPointOne();
    }

    @FXML
    private void addPointSongTwo(ActionEvent event) {
        SongUtilities.setPointTwo();
    }

    @FXML
    private void changeToNextWindow(ActionEvent event) {
        if (SongCupBuildLogic.getMatch()==6) {
            try {
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
