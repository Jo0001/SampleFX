package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Button btn;
    @FXML
    TextArea errorArea;

    public Controller(){
        //@FXML-Fields are not initialized
        System.out.println("Initiated Controller instance");
    }

    public void onBtnPress(ActionEvent buttonEvent){
        errorArea.setText("Pressed: " + btn.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //@FXML-Fields are initialized
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                onBtnPress(actionEvent);
            }
        });
    }
}
