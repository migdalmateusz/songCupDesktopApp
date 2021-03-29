package songcup.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import songcup.buildlogic.SongCupBuildLogic;
import songcup.computationlogic.SongUtilities;

import java.io.IOException;

public class SelectionWindow {

    @FXML
    private Button buttonSongOne;

    @FXML
    private Button buttonSongTwo;

    @FXML
    void initialize() {
        buttonSongOne.setText(SongUtilities.getTitleSongOne());
        buttonSongTwo.setText(SongUtilities.getTitleSongTwo());
    }

    @FXML
    private void addPointSongOne(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/SelectionWindow.fxml"));
            Parent parent = loader.load();
            SongCupBuildLogic.increaseMatch();
            ((Stage)buttonSongOne.getScene().getWindow()).setScene(new Scene(parent, 700, 700));
        } catch (IOException eox) {
            eox.printStackTrace();
        }
    }

    @FXML
    private void addPointSongTwo(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/SelectionWindow.fxml"));
            Parent parent = loader.load();
            SongCupBuildLogic.increaseMatch();
            ((Stage)buttonSongTwo.getScene().getWindow()).setScene(new Scene(parent, 700, 700));
        } catch (IOException eox) {
            eox.printStackTrace();
        }
    }


    public Scene setSelectionWindowScene() {
        FXMLLoader loader = new FXMLLoader(OpenWindow.class.getResource("/SelectionWindow.fxml"));
        buttonSongOne.setText(SongUtilities.getTitleSongOne());
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Scene(pane);
    }
}
