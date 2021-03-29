package songcup.userinterface;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class OpenWindow {

    private Scene scene;

    @FXML
    private Button button;

    @FXML
    void initialize() {
        button.setOnAction(e -> System.out.println("LOLOL"));
    }


    public Scene setOpenWindowScene() {
        FXMLLoader loader = new FXMLLoader(OpenWindow.class.getResource("/OpenWindow.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        scene = new Scene(pane);
        return scene;
    }
}