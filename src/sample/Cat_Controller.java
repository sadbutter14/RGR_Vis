//package sample;
//
//import java.io.IOException;
//
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.stage.Stage;
//import sample.*;
//
//public class Cat_Controller extends Menu_Controller {
//    private String f;
//    public void Set_f(String x) {
//        this.f = x;
//    }
//
//    public String Get_f() {
//        return f;
//    }
//    @FXML
//    private Button feature;
//
//    @FXML
//    private Button game;
//
//    @FXML
//    void onClick1(){
//        String y = feature.getText();
//        Set_f(y);
//        feature.getScene().getWindow().hide();
//        show_out_win();
//    }
//    @FXML
//    void onClick2(){
//        String y = game.getText();
//        Set_f(y);
//        game.getScene().getWindow().hide();
//        show_out_win();
//    }
//
//    public void show_out_win() {
//        FXMLLoader out = new FXMLLoader();
//        out.setLocation(Cat_Controller.class.getResource("../fxmls/output.fxml"));
//        try {
//            out.load();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Parent root = out.getRoot();
//        Stage stage = new Stage();
//        stage.setScene(new Scene(root, 400, 500));
//        stage.show();
//
//        //TODO тут вызываем скулю на вывод
//    }
//}
