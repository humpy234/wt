//Q1

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.geometry.Insets;
import javafx.stage.Stage;
public class ColorButtons extends Application {
    public void start(Stage stage) {
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        Button red = new Button("Red");
        Button green = new Button("Green");
        Button blue = new Button("Blue");
        red.setOnAction(e -> root.setBackground(
            new Background(new BackgroundFill(Color.RED, null, null))));
        green.setOnAction(e -> root.setBackground(
            new Background(new BackgroundFill(Color.GREEN, null, null))));
        blue.setOnAction(e -> root.setBackground(
            new Background(new BackgroundFill(Color.BLUE, null, null))));
        root.getChildren().addAll(red, green, blue);
        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Color Buttons");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
//Q2
const http = require('http');
const server = http.createServer((req, res) => {
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.end('<h1>Welcome to Node.js Server!</h1>');
});
server.listen(3000, () => {
    console.log('Server running at http://localhost:3000');
});

