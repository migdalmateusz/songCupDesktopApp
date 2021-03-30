package songcup.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class OpenWindow {

    @FXML
    private Button button;

    @FXML
    void initialize() {
    }

    @FXML
    private void changeScene(ActionEvent event) {
        try {
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
