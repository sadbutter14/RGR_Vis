package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Cat_Controller extends Menu_Controller{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button feature;

    @FXML
    private Button game;

    @FXML
    void initialize() {
        feature.setOnAction(actionEvent -> {
            String f = "особенности";
            feature.getScene().getWindow().hide();
            show_out_win();
        });
        game.setOnAction(actionEvent -> {
            String f = "игры";
            game.getScene().getWindow().hide();
            show_out_win();
        });
    }
    private void show_out_win() {
        FXMLLoader out = new FXMLLoader();
        out.setLocation(getClass().getResource("../fxmls/output.fxml"));
        try {
            out.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = out.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root, 400, 500));
        stage.show();
    }
}
