package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Main extends Application {
    static final FXMLLoader loader = new FXMLLoader();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Controller controller = loader.getController();
        loader.setController(controller);
        Parent root = loader.load(getClass().getResource("mainUI.fxml"));
        primaryStage.setTitle("Title");
        Scene s = new Scene(root, 800, 500);
        primaryStage.setScene(s);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(Main.class);
    }
}