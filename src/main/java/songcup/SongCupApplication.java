package songcup;

import javafx.application.Application;
import javafx.stage.Stage;
import songcup.buildlogic.SongCupBuildLogic;
import songcup.userinterface.UserInterfaceImpl;

public class SongCupApplication extends Application {

    @Override
    public void start(Stage primaryStage)  {

        UserInterfaceImpl uiImpl = new UserInterfaceImpl(primaryStage);
        SongCupBuildLogic.build(uiImpl);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
