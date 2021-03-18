package songcup.userinterface;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scena1 {

    private final Stage stage;
    private static final double WINDOW_Y = 500;
    private static final double WINDOW_X = 500;


    public Scena1(Stage stage) {
        this.stage = stage;
        initializeUserInterface();
    }

    private void initializeUserInterface() {

        Text text1 = new Text("Which song do you like more?");

        Button button1 = new Button("song one");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(WINDOW_X, WINDOW_Y);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(text1, 0, 0);
        gridPane.add(button1, 0, 2);

        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        gridPane.setStyle("-fx-background-color: BEIGE;");

        EventHandler<MouseEvent> eventHandler = e -> new Scena2(stage);

        button1.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);

        Scene scene = new Scene(gridPane);

        stage.setTitle("SONG SUP");

        stage.setScene(scene);

        stage.show();
    }
}
