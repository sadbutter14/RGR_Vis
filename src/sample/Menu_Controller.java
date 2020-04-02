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
import javafx.stage.Stage;

import javax.swing.*;


public class Menu_Controller {

    @FXML
    private Button add;

    @FXML
    private Button f68;

    @FXML
    private Button g68;

    @FXML
    private Button f911;

    @FXML
    private Button g911;

    @FXML
    private Button f1214;

    @FXML
    private Button g1214;

    @FXML
    private Button f1517;

    @FXML
    private Button g1517;

    @FXML
    void f_68() {
        f68.getScene().getWindow().hide();
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

    @FXML
    void g_68() {
        g68.getScene().getWindow().hide();
        DB_Handler db = new DB_Handler();
        String select = "SELECT description FROM Data WHERE age=68 AND category=2";
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

    @FXML
    void f_911() {
        f911.getScene().getWindow().hide();
        DB_Handler db = new DB_Handler();
        String select = "SELECT description FROM Data WHERE age=911 AND category=1";
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

    @FXML
    void g_911() {
        g911.getScene().getWindow().hide();
        DB_Handler db = new DB_Handler();
        String select = "SELECT description FROM Data WHERE age=911 AND category=2";
        try {
            Connection connection = db.getdbConnection();
            Statement PS = connection.createStatement();
            ResultSet rs = PS.executeQuery(select);
            while (rs.next()) {
                Data data = new Data();
                data.setDescription(rs.getString("description"));
                System.out.println(data);
                final JFrame names = new JFrame("ВЫВОД");
                names.add(new java.awt.TextArea("Возраст:\n\n9-11" + "\n\nОписание:\n\n" + data.getDescription(), 50, 100));
                names.setSize(1000, 900);
                names.setLayout(new FlowLayout(FlowLayout.CENTER));
                names.setVisible(true);
                names.setResizable(true);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void f_1214() {
        f1214.getScene().getWindow().hide();
        DB_Handler db = new DB_Handler();
        String select = "SELECT description FROM Data WHERE age=1214 AND category=1";
        try {
            Connection connection = db.getdbConnection();
            Statement PS = connection.createStatement();
            ResultSet rs = PS.executeQuery(select);
            while (rs.next()) {
                Data data = new Data();
                data.setDescription(rs.getString("description"));
                System.out.println(data);
                final JFrame names = new JFrame("ВЫВОД");
                names.add(new java.awt.TextArea("Возраст:\n\n12-14" + "\n\nОписание:\n\n" + data.getDescription(), 50, 100));
                names.setSize(1000, 900);
                names.setLayout(new FlowLayout(FlowLayout.CENTER));
                names.setVisible(true);
                names.setResizable(true);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void g_1214() {
        g1214.getScene().getWindow().hide();
        DB_Handler db = new DB_Handler();
        String select = "SELECT description FROM Data WHERE age=12-14 AND category=2";
        try {
            Connection connection = db.getdbConnection();
            Statement PS = connection.createStatement();
            ResultSet rs = PS.executeQuery(select);
            while (rs.next()) {
                Data data = new Data();
                data.setDescription(rs.getString("description"));
                System.out.println(data);
                final JFrame names = new JFrame("ВЫВОД");
                names.add(new java.awt.TextArea("Возраст:\n\n12-14" + "\n\nОписание:\n\n" + data.getDescription(), 50, 100));
                names.setSize(1000, 900);
                names.setLayout(new FlowLayout(FlowLayout.CENTER));
                names.setVisible(true);
                names.setResizable(true);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void f_1517() {
        f1517.getScene().getWindow().hide();
        DB_Handler db = new DB_Handler();
        String select = "SELECT description FROM Data WHERE age=1517 AND category=1";
        try {
            Connection connection = db.getdbConnection();
            Statement PS = connection.createStatement();
            ResultSet rs = PS.executeQuery(select);
            while (rs.next()) {
                Data data = new Data();
                data.setDescription(rs.getString("description"));
                System.out.println(data);
                final JFrame names = new JFrame("ВЫВОД");
                names.add(new java.awt.TextArea("Возраст:\n\n15-17" + "\n\nОписание:\n\n" + data.getDescription(), 50, 100));
                names.setSize(1000, 900);
                names.setLayout(new FlowLayout(FlowLayout.CENTER));
                names.setVisible(true);
                names.setResizable(true);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void g_1517() {
        g1517.getScene().getWindow().hide();
        DB_Handler db = new DB_Handler();
        String select = "SELECT description FROM Data WHERE age=1517 AND category=2";
        try {
            Connection connection = db.getdbConnection();
            Statement PS = connection.createStatement();
            ResultSet rs = PS.executeQuery(select);
            while (rs.next()) {
                Data data = new Data();
                data.setDescription(rs.getString("description"));
                System.out.println(data);
                final JFrame names = new JFrame("ВЫВОД");
                names.add(new java.awt.TextArea("Возраст:\n\n15-17" + "\n\nОписание:\n\n" + data.getDescription(), 50, 100));
                names.setSize(1000, 900);
                names.setLayout(new FlowLayout(FlowLayout.CENTER));
                names.setVisible(true);
                names.setResizable(true);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
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
