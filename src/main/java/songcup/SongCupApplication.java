package songcup;

import javafx.application.Application;
import javafx.stage.Stage;
import songcup.userinterface.OpenWindow;

import java.io.IOException;

public class SongCupApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        OpenWindow.setOpenWindow(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
