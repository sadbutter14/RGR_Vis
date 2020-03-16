package sample;

import javafx.fxml.FXML;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


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
    private Button feature;

    @FXML
    private Button game;

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
    void onClickMethod1() {
        String x = B_68.getText();
        Set_a(x);
        System.out.println(Get_a());
        B_68.getScene().getWindow().hide();
        show_cat();
    }

    @FXML
    void onClickMethod2() {
        String x = B_911.getText();
        Set_a(x);
        System.out.println(Get_a());
        B_911.getScene().getWindow().hide();
        show_cat();
    }

    @FXML
    void onClickMethod3() {
        String x = B_1214.getText();
        Set_a(x);
        System.out.println(Get_a());
        B_1214.getScene().getWindow().hide();
        show_cat();
    }

    @FXML
    void onClickMethod4() {
        this.a = B_1517.getText();
        System.out.println(this.a);
        B_1517.getScene().getWindow().hide();
        show_cat();
    }
    @FXML
    void onClickMethod5() {
        add.getScene().getWindow().hide();
        show_add();
    }

    @FXML
    void onClick1(){
        String y = feature.getText();
        Set_f(y);
        feature.getScene().getWindow().hide();
        show_out_win(Get_a(), Get_f());
    }
    @FXML
    void onClick2(){
        String y = game.getText();
        Set_f(y);
        game.getScene().getWindow().hide();
        show_out_win(Get_a(), Get_f());
    }

//    @FXML
//    void initialize() {
//        B_68.setOnAction(actionEvent -> {
//            String x = B_68.getText();
//            Set_a(x);
//            B_68.getScene().getWindow().hide();
//            show_cat();
//        });
//        B_911.setOnAction(actionEvent -> {
//            String a = B_68.getText();
//            B_911.getScene().getWindow().hide();
//            show_cat();
//        });
//        B_1214.setOnAction(actionEvent -> {
//            String a = B_1214.getText();
//            B_1214.getScene().getWindow().hide();
//            show_cat();
//        });
//        B_1517.setOnAction(actionEvent -> {
//            String a = B_1517.getText();
//            B_1517.getScene().getWindow().hide();
//            show_cat();
//        });
//        add.setOnAction(actionEvent -> {
//            add.getScene().getWindow().hide();
//            show_add();
//        });
//    }

    public void show_cat() {
        FXMLLoader category = new FXMLLoader();
        category.setLocation(getClass().getResource("../fxmls/choose.fxml"));
        try {
            category.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = category.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root, 400, 500));
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
        stage.setScene(new Scene(root, 400, 500));
        stage.show();
        System.out.println(this.a);
        System.out.println(this.f);

        //TODO тут вызываем скулю на вывод
    }
}
