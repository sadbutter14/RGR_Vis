package sample;

import DB_Classes.DB_Handler;
import DB_Classes.Data;
import javafx.fxml.FXML;

import java.awt.*;
import java.awt.Label;
import java.io.IOException;
import java.sql.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;


public class Menu_Controller {
    private String a;
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
            R68.getScene().getWindow().hide();
            DB_Handler db = new DB_Handler();
            String select = "SELECT description FROM Data WHERE age=68 AND category=1";
            try {
                Connection connection = db.getdbConnection();
                Statement PS = connection.createStatement();
                ResultSet rs = PS.executeQuery(select);
                while (rs.next()) {
                    Data data = new Data();
                    data.setDescription(rs.getString("description"));
                    System.out.println(data);
                    final JFrame names = new JFrame("ВЫВОД");
                    names.add(new java.awt.TextArea("Возраст:\n\n6-8" + "\n\nОписание:\n\n" + data.getDescription(), 50, 100));
                    names.setSize(1000, 900);
                    names.setLayout(new FlowLayout(FlowLayout.CENTER));
                    names.setVisible(true);
                    names.setResizable(true);
                }
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
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

//    @FXML
//    void confAct() {
//        conf.getScene().getWindow().hide();
//        final char dm = (char) 39;
//        DB_Handler db = new DB_Handler();
//        String select = "SELECT description FROM Data WHERE age=?";
//        try {
//            Connection connection = db.getdbConnection();
//            PreparedStatement PS = connection.prepareStatement(select);
//            PS.setString(1, dm + R68.getText() + dm);
//            ResultSet rs = PS.executeQuery(select);
//            while (rs.next()) {
//                Data data = new Data();
//                data.setDescription(rs.getString("description"));
//                System.out.println(data);
//                final JFrame names = new JFrame("ВЫВОД");
//                names.add(new java.awt.TextArea("Возраст:\n\n" + Get_a() + "\n\nОписание:\n\n" + data.getDescription(), 50, 100));
//                names.setSize(1000, 500);
//                names.setLayout(new FlowLayout(FlowLayout.CENTER));
//                names.setVisible(true);
//                names.setResizable(true);
//                break;
//            }
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

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
}
