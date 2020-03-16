package sample;

import java.sql.SQLException;

import DB_Classes.DB_Handler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.*;

public class Input_Controller {

    public TextArea T_F;

    @FXML
    private TextField name_input;

    @FXML
    private TextField age_input;

    @FXML
    private TextField cat_input;

    @FXML
    private Button confirm;

    @FXML
    void initialize() {
        DB_Handler dbHandler = new DB_Handler();
        confirm.setOnAction(event -> {
            String new_name = name_input.getText().trim();
            String new_age = age_input.getText().trim();
            String new_cat = cat_input.getText().trim();
            String new_description = T_F.getText();
            try {
                dbHandler.insertIntoDB(new_age, new_cat, new_name, new_description);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            confirm.getScene().getWindow().hide();
        });
    }
}