package songcup.userinterface;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class ListenScene {

    public static void display () {

        Stage window = new Stage();

        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=lXgkuM2NhYI");

        VBox root = new VBox();
        root.getChildren().addAll(webView);

        Scene scene = new Scene(root, 500, 500);

        window.setTitle("SONG SUP");

        window.setScene(scene);

        window.show();

    }





    private void initializeUserInterface() {

    }
}
