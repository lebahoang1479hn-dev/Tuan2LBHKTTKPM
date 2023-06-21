package com.example.tuan2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private Button btnLuu;

    @FXML
    private TextField txtCMND;

    @FXML
    private TextField txtDC;

    @FXML
    private TextField txtMa;

    @FXML
    private TextField txtName;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnLuu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                System.out.println(txtMa.getText());
                System.out.println(txtName.getText());
                System.out.println(txtCMND.getText());
                System.out.println(txtDC.getText());
            }
        });
    }
}