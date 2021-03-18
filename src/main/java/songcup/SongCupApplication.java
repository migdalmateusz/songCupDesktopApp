package songcup;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import songcup.userinterface.Scena1;
//import songcup.buildlogic.SongCupBuildLogic;
//import songcup.userinterface.UserInterfaceImpl;

public class SongCupApplication extends Application {

    Stage window;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) {

        new Scena1(primaryStage);


//        window = primaryStage;
//
//        Label label1 = new Label("scena pierwsza");
//        Button buttonOne = new Button("idź do sceny drugiej");
//        buttonOne.setOnAction(e -> window.setScene(scene2));
//
//        VBox layout1 = new VBox(20);
//        layout1.getChildren().addAll(label1, buttonOne);
//        scene1 = new Scene(layout1, 200, 200);
//
//        VBox layout2 = new VBox(30);
//        scene2 = new Scene(layout2, 300, 300);
//
//        window.setScene(scene1);
//        window.setTitle("title");
//        window.show();
//        new UserInterfaceImpl(primaryStage);
//        SongCupBuildLogic.build(uiImpl);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
