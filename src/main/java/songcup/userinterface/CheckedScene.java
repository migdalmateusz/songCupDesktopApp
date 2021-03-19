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
import songcup.computationlogic.Scores;

public class CheckedScene {

    private final Stage stage;
    private static final double WINDOW_Y = 500;
    private static final double WINDOW_X = 500;


    public CheckedScene(Stage stage) {
        this.stage = stage;
        initializeUserInterface();
    }

    private void initializeUserInterface() {

        Text text1 = new Text("Which song do you like more?");

        Button button1 = new Button("Heroes");
        Button button2 = new Button("Rebel Rebel");
        Button button3 = new Button("NEXT");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(WINDOW_X, WINDOW_Y);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(text1, 1, 0);
        gridPane.add(button1, 0, 1);
        gridPane.add(button2, 3, 1);
        gridPane.add(button3, 2, 2);

        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        button3.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        gridPane.setStyle("-fx-background-color: BEIGE;");

        EventHandler<MouseEvent> eventHandlerHeroes = e -> Scores.addHeroesScore();
        button1.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandlerHeroes);

        EventHandler<MouseEvent> eventHandlerRebel = e -> Scores.addRebelScore();
        button2.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandlerRebel);

        EventHandler<MouseEvent> eventHandlerNext = e -> new FinalScene(stage);
        button3.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandlerNext);

        Scene scene = new Scene(gridPane);

        stage.setTitle("SONG SUP");

        stage.setScene(scene);

        stage.show();
    }
}
