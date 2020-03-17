package sample;

import javafx.fxml.FXML;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class Menu_Controller {
    @FXML
    private String a;
    @FXML
    private String f;

    public void Set_f(String y) {
        this.f = y;
    }

    public String Get_f() {
        return this.f;
    }

    public void Set_a(String x) {
        this.a = x;
    }

    public String Get_a() {
        return this.a;
    }

    @FXML
    private TextField out_age;

    @FXML
    private TextArea out_des;

    @FXML
    private RadioButton R68;

    @FXML
    RadioButton R911;

    @FXML
    private RadioButton R1214;

    @FXML
    private RadioButton R1517;

    @FXML
    private Button add;

    @FXML
    private Button conf;

    @FXML
    private CheckBox feature;

    @FXML
    private CheckBox game;

    @FXML
    void RB() {
        if (R68.isSelected()) {
            this.a = R68.getText();
            if (feature.isSelected())
                this.f = feature.getText().toLowerCase();
            else if (game.isSelected())
                this.f = game.getText().toLowerCase();
        }
        if (R911.isSelected()) {
            this.a = R911.getText();
            if (feature.isSelected())
                this.f = feature.getText().toLowerCase();
            else if (game.isSelected())
                this.f = game.getText().toLowerCase();
        }
        if (R1214.isSelected()) {
            this.a = R1214.getText();
            if (feature.isSelected())
                this.f = feature.getText().toLowerCase();
            else if (game.isSelected())
                this.f = game.getText().toLowerCase();
        }
        if (R1517.isSelected()) {
            this.a = R1517.getText();
            if (feature.isSelected())
                this.f = feature.getText().toLowerCase();
            else if (game.isSelected())
                this.f = game.getText().toLowerCase();
        }
    }

    @FXML
    void confAct(){
        conf.getScene().getWindow().hide();
        show_out_win(Get_a(), Get_f());
    }

    @FXML
    void onClickMethod() {
        add.getScene().getWindow().hide();
        show_add();
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
        stage.setResizable(false);
        stage.setScene(new Scene(root, 400, 500));
        stage.show();
    }

    public void show_out_win(String age, String cat) {
        FXMLLoader out = new FXMLLoader();
        out.setLocation(getClass().getResource("../fxmls/output.fxml"));
        try {
            out.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = out.getRoot();
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(new Scene(root, 400, 500));
        stage.show();
        System.out.println(Get_a());
        System.out.println(Get_f());

        //TODO тут вызываем скулю на вывод
    }
}
