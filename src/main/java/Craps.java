import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Craps extends Application{
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gameView.fxml"));
        stage.setTitle("Craps Game");
        HBox hbox = new HBox();
        stage.setScene(new Scene(hbox, 1200, 600));
        // create a input stream
        FileInputStream input = new FileInputStream("src/main/resources/Table-Layout.png");

        // create a image
        Image image = new Image(input);

        // create a background image
        BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background background = new Background(backgroundimage);
        hbox.setBackground(background);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
