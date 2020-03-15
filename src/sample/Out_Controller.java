package sample;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import DB_Classes.DB_Handler;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Out_Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField out_age;

    @FXML
    private TextArea out_des;

    @FXML
    void initialize() {
//        DB_Handler dbHandler = new DB_Handler();
//        try {
//            dbHandler.takeFromDB();
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    });
    }
}
