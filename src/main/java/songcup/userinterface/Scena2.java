package songcup.userinterface;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scena2 {
    private final Stage stage;
    private static final double WINDOW_Y = 500;
    private static final double WINDOW_X = 500;


    public Scena2(Stage stage) {
        this.stage = stage;
        initializeUserInterface();
    }

    private void initializeUserInterface() {

        Text text1 = new Text("Final song is");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(WINDOW_X, WINDOW_Y);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(text1, 0, 0);

        text1.setStyle("-fx-font: normal bold 20px 'serif' ");

        gridPane.setStyle("-fx-background-color: BEIGE;");

        Scene scene = new Scene(gridPane);

        stage.setTitle("SONG SUP");

        stage.setScene(scene);

        stage.show();
    }
}
