package sample;

import javafx.fxml.FXML;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Menu_Controller {
    @FXML
    private Button add;

    @FXML
    private Button B_68;

    @FXML
    private Button B_911;

    @FXML
    private Button B_1214;

    @FXML
    private Button B_1517;

    @FXML
    void initialize() {
        B_68.setOnAction(actionEvent -> {
            String a = "6-8";
            B_68.getScene().getWindow().hide();
            show_cat();
        });
        B_911.setOnAction(actionEvent -> {
            String a = "9-11";
            B_911.getScene().getWindow().hide();
            show_cat();
        });
        B_1214.setOnAction(actionEvent -> {
            String a = "12-14";
            B_1214.getScene().getWindow().hide();
            show_cat();
        });
        B_1517.setOnAction(actionEvent -> {
            String a = "15-17";
            B_1517.getScene().getWindow().hide();
            show_cat();
        });
        add.setOnAction(actionEvent -> {
            add.getScene().getWindow().hide();
            show_add();
        });
    }

    private void show_cat() {
        FXMLLoader category = new FXMLLoader();
        category.setLocation(getClass().getResource("../fxmls/choose.fxml"));
        try {
            category.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = category.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
    private void show_add() {
        FXMLLoader category = new FXMLLoader();
        category.setLocation(getClass().getResource("../fxmls/input.fxml"));
        try {
            category.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = category.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
}