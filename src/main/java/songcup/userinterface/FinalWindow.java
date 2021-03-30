package songcup.userinterface;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import songcup.computationlogic.SongUtilities;

public class FinalWindow {

    @FXML
    private Label winner;

    @FXML
    private void initialize(){
        winner.setText(SongUtilities.getTitleSongOne());
    }


}
