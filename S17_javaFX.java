//Q1
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class ColorChange extends Application {
    public void start(Stage stage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 300);

        scene.setOnKeyPressed((KeyEvent e) -> {
            if (e.isControlDown() && e.isAltDown()
                    && e.getCode() == KeyCode.O) {
                pane.setBackground(
                    new javafx.scene.layout.Background(
                        new javafx.scene.layout.BackgroundFill(
                            Color.ORANGE, null, null)));
            }
        });
        stage.setTitle("Background Color Change");
        stage.setScene(scene);
        stage.show();
        pane.requestFocus();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

//Q2

export function add(a, b) {
    return a + b;
}
export function subtract(a, b) {
    return a - b;
}
export function multiply(a, b) {
    return a * b;
}
export function divide(a, b) {
    return a / b;
}

