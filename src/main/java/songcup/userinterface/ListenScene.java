package songcup.userinterface;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class ListenScene {

    public static void display (String video) {

        Stage window = new Stage();

        Button button1 = new Button("CLOSE");

        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();
        engine.load(video);

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(500, 500);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(button1, 0, 1);
        gridPane.add(webView, 0, 2);

        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        gridPane.setStyle("-fx-background-color: BEIGE;");

        EventHandler<MouseEvent> eventHandlerClose = e -> closeWindow(webView, window);
        button1.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandlerClose);


        Scene scene = new Scene(gridPane);

        window.setTitle("SONG SUP");

        window.setScene(scene);

        window.show();

    }

    private static void closeWindow(WebView webView, Stage window) {
        webView.getEngine().load(null);
        window.close();
    }
}
