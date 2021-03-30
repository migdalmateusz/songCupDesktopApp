package songcup.userinterface;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import songcup.problemdomain.SongStorage;

import java.io.IOException;

public class OpenWindow {

    private static String artistId;

    public static String getArtistId() {
        return artistId;
    }

    @FXML
    private Button button;

    @FXML
    private TextField enterArtist;

    @FXML
    void initialize() {
    }

    @FXML
    private void setArtist() {
    }

    @FXML
    private void checkArtist() {
        String[] artistTable = enterArtist.getText().split("artist/");
        String[] artistTable2 = artistTable[1].split("\\?");
        artistId = artistTable2[0];
    }

    @FXML
    private void changeScene() {
        try {
            SongStorage.setSongMap(SongStorage.createMap());
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/SelectionWindow.fxml"));
            Parent parent = loader.load();
            ((Stage)button.getScene().getWindow()).setScene(new Scene(parent, 700, 700));
        } catch (IOException eox) {
            eox.printStackTrace();
        }
    }

    public static void setOpenWindow(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(OpenWindow.class.getResource("/OpenWindow.fxml"));
        Pane pane = loader.load();
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
}
