package songcup.userinterface;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UserInterfaceImpl implements IUserInterfaceContract.View, EventHandler<KeyEvent> {

    private final Stage stage;
    private final Group root;

    private static final double WINDOW_Y = 500;
    private static final double WINDOW_X = 500;

    private static final Color WINDOW_BACKGROUND_COLOR = Color.rgb(100, 50, 100);

    public UserInterfaceImpl(Stage stage) {
        this.stage = stage;
        this.root = new Group();
        initializeUserInterface();
    }

    private void initializeUserInterface() {
        drawBackground(root);
        stage.show();
    }

    private void drawBackground(Group root) {
        Scene scene = new Scene(root, WINDOW_X, WINDOW_Y);
        scene.setFill(WINDOW_BACKGROUND_COLOR);
        stage.setScene(scene);
    }

    @Override
    public void handle(KeyEvent keyEvent) {

    }
}